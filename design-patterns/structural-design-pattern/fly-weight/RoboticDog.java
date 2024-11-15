package pac;

public class RoboticDog implements IRobot {
	private String type;
	private Sprites sprites;

	public RoboticDog(String type, Sprites sprites) {
		this.type = type;
		this.sprites = sprites;
	}

	public String getType() {
		return type;
	}

	public Sprites getSprites() {
		return sprites;
	}

	@Override
	public void display(int x, int y) {
		// use the Robotic Dog sprites object
		// and X and Y ordinates to render the image.
	}

}
