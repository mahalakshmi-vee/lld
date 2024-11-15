package pac;

public class Client {
	public static void main(String[] args) {
		GUIFactory guiFactory;
		String os = "mac";

		if (os.equals("windows")) {
			guiFactory = new WindowsFactory();
		} else {
			guiFactory = new MacFactory();
		}

		Application application = new Application(guiFactory);
		application.paint();
	}
}
