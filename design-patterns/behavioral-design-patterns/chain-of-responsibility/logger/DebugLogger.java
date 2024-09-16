package logger;

public class DebugLogger implements Logger {
	private LoggerType loggerType = LoggerType.DEBUG;
	private Logger logger;

	public DebugLogger(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void log(String message, LoggerType loggerType) {
		if (loggerType == this.loggerType) {
			System.out.println("Debug: " + message);
		} else {
			logger.log(message, loggerType);
		}
	}
}
