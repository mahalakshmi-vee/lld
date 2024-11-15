package memento;

public class ConfigurationMemento {
	private int height;
	private int width;

	public ConfigurationMemento(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
}
