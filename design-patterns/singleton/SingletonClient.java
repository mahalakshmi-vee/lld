package microsoft_oa;

public class SingletonClient {
	public static void main(String[] args) {
		// Singleton Design Pattern.
		DbConn dbConn = DbConn.getInstance();
		dbConn.connect();

		DatabaseConn databaseConn = DatabaseConn.INSTANCE;
		databaseConn.connect();
	}
}
