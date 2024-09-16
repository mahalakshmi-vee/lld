package logger;

public class ErrorLogger implements Logger {
	private LoggerType loggerType = LoggerType.ERROR;
	private Logger logger;

	public ErrorLogger(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void log(String message, LoggerType loggerType) {
		if (loggerType == this.loggerType) {
			System.out.println("Error: "+message);
		} else {
			logger.log(message, loggerType);
		}
	}
}
