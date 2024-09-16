package logger;

public class ErrorLogProcessor extends LogProcessor {
	public ErrorLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}

	@Override
	public void log(String message, int logLevel) {
		if (logLevel == ERROR) {
			System.out.println("Error: " + message);
		} else {
			super.log(message, logLevel);
		}
	}
}
