package pac;

public class HumanoidRobot implements IRobot {
	private String type;
	private Sprites sprites;

	public HumanoidRobot(String type, Sprites sprites) {
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
		//use the humanoid sprites object
		// and X and Y ordinates to render the image.
	}

}
