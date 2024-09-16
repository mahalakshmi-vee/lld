package logger;

public class InfoLogProcessor extends LogProcessor {

	public InfoLogProcessor(LogProcessor logProcessor) {
		super(logProcessor);
	}

	@Override
	public void log(String message, int logLevel) {
		if (logLevel == INFO) {
			System.out.println("Info: " + message);
		} else {
			super.log(message, logLevel);
		}
	}
}
