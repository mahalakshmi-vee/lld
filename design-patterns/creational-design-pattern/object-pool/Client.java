package pac;

import java.sql.SQLException;

public class Client {
	public static void main(String[] args) throws SQLException {
		DBConnectionPoolManager poolManager = DBConnectionPoolManager.getInstance();

		DBConnection connection1 = poolManager.getDBConnection();
		DBConnection connection2 = poolManager.getDBConnection();
		DBConnection connection3 = poolManager.getDBConnection();
		DBConnection connection4 = poolManager.getDBConnection();
		DBConnection connection5 = poolManager.getDBConnection();
		DBConnection connection6 = poolManager.getDBConnection();
		DBConnection connection7 = poolManager.getDBConnection();
		poolManager.releaseConnection(connection6);
		connection7 = poolManager.getDBConnection();
	}
}
