package pac;

public class ShapeFactory {
	public static Shape getShape(String input) {
		switch (input) {
		case "CIRCLE": {
			return new Circle();
		}
		case "RECTANGLE": {
			return new Rectangle();
		}
		default: {
			return null;
		}
		}
	}
}
