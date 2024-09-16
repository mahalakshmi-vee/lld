package logger;

public abstract class LogProcessor {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	private LogProcessor nextLogProcessor;

	public LogProcessor(LogProcessor logProcessor) {
		this.nextLogProcessor = logProcessor;
	}

	public void log(String message, int logLevel) {
		if (nextLogProcessor != null) {
			nextLogProcessor.log(message, logLevel);
		}
	}
}
