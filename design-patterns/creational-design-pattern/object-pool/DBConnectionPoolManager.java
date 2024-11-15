package pac;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
	List<DBConnection> freeConnectionsInPool = new ArrayList<DBConnection>();
	List<DBConnection> connectionsCurrentlyInUse = new ArrayList<DBConnection>();
	int INITIAL_POOL_SIZE = 3;
	int MAX_POOL_SIZE = 6;
	private static DBConnectionPoolManager dbConnectionPoolManager = null;

	private DBConnectionPoolManager() throws SQLException {
		for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
			freeConnectionsInPool.add(new DBConnection());
		}
	}

	public static DBConnectionPoolManager getInstance() throws SQLException {
		if (dbConnectionPoolManager != null)
			return dbConnectionPoolManager;

		synchronized (DBConnectionPoolManager.class) {
			if (dbConnectionPoolManager == null) {
				dbConnectionPoolManager = new DBConnectionPoolManager();
			}
		}
		return dbConnectionPoolManager;
	}

	public synchronized DBConnection getDBConnection() throws SQLException {
		if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() < MAX_POOL_SIZE) {
			freeConnectionsInPool.add(new DBConnection());
			System.out.println("creating new connection and putting into the pool, free pool size: "
					+ freeConnectionsInPool.size());
		} else if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() >= MAX_POOL_SIZE) {
			System.out.println("can not create new DBConnection, as max limit reached");
			return null;
		}
		DBConnection dbConnection = freeConnectionsInPool.remove(freeConnectionsInPool.size() - 1);
		connectionsCurrentlyInUse.add(dbConnection);
		System.out.println("adding db connection into use pool, size: " + connectionsCurrentlyInUse.size());
		return dbConnection;
	}

	public synchronized void releaseConnection(DBConnection dbConnection) {
		if (dbConnection == null)
			return;

		connectionsCurrentlyInUse.remove(dbConnection);
		System.out.println("removing db connection from use pool, size" + connectionsCurrentlyInUse.size());
		freeConnectionsInPool.add(dbConnection);
		System.out.println("adding db connection into free pool, size" + freeConnectionsInPool.size());
	}
}
