package memento;

public class Client {
	public static void main(String[] args) {
		ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();

		ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(5, 10);

		ConfigurationMemento snapshot1 = configurationOriginator.createMemento();
		configurationCareTaker.addMemento(snapshot1);
		
		configurationOriginator.setHeighth(7);
		configurationOriginator.setWidth(12);
		
		ConfigurationMemento snapshot2 = configurationOriginator.createMemento();
		configurationCareTaker.addMemento(snapshot2);
		
		configurationOriginator.setHeighth(9);
		configurationOriginator.setWidth(14);
		
		ConfigurationMemento restoredConfigurationMemento = configurationCareTaker.undo();
		configurationOriginator.restoreConfigurationMemento(restoredConfigurationMemento);
		
		System.out.println("Height: "+configurationOriginator.getHeight());
		System.out.println("Width: "+configurationOriginator.getWidth());
	}
}
