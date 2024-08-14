package microsoft_oa;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConn {
	private static DbConn dbConn = null;

	private DbConn() {
	}

	public static DbConn getInstance() {
		if (dbConn != null)
			return dbConn;
		Lock lock = new ReentrantLock();
		lock.lock();
		if (dbConn == null)
			dbConn = new DbConn();
		lock.unlock();
		return dbConn;
	}

	public void connect() {

	}
}
