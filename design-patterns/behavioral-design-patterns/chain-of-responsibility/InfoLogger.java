package logger;

public class InfoLogger implements Logger {
	private LoggerType loggerType = LoggerType.INFO;
	private Logger logger;

	public InfoLogger(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void log(String message, LoggerType loggerType) {
		if (loggerType == this.loggerType) {
			System.out.println("Info: " + message);
		} else {
			logger.log(message, loggerType);
		}
	}
}
