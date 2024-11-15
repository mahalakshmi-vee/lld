package memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
	private List<ConfigurationMemento> history = new ArrayList<>();

	public void addMemento(ConfigurationMemento configurationMemento) {
		history.add(configurationMemento);
	}

	public ConfigurationMemento undo() {
		if (history.isEmpty())
			return null;

		int lastMementoIndex = history.size() - 1;
		ConfigurationMemento lastMemento = history.get(lastMementoIndex);
		history.remove(lastMementoIndex);
		return lastMemento;
	}
}
