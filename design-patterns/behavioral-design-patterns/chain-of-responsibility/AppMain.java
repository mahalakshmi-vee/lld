package logger;

public class AppMain {
	public static void main(String[] args) {
		Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

		logger.log("Info", LoggerType.INFO);
		logger.log("Error", LoggerType.ERROR);
		logger.log("Debug", LoggerType.DEBUG);
	}
}
