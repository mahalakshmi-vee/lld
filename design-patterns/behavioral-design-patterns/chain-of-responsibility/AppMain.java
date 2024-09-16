package logger;

public class AppMain {
	public static void main(String[] args) {
		LogProcessor errorLogProcessor = new ErrorLogProcessor(null);
		LogProcessor debugLogProcessor = new DebugLogProcessor(errorLogProcessor);
		LogProcessor inforLogProcessor = new InfoLogProcessor(debugLogProcessor);
		LogProcessor logProcessor = inforLogProcessor;

		logProcessor.log("need to debug this", LogProcessor.DEBUG);
		logProcessor.log("just for info.", LogProcessor.INFO);
		logProcessor.log("exception happens", LogProcessor.ERROR);
	}
}
