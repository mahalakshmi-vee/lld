package logger;

public class DebugLogProcessor extends LogProcessor {
	public DebugLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
	}

	@Override
	public void log(String message, int logLevel) {
		if (logLevel == DEBUG) {
			System.out.println("Debug: " + message);
		} else {
			super.log(message, logLevel);
		}
	}
}
