package pac;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
	private static Map<String, IRobot> roboticObjectCache = new HashMap<String, IRobot>();

	public static IRobot createRobot(String robotType) {
		if (roboticObjectCache.containsKey(robotType)) {
			return roboticObjectCache.get(robotType);
		} else {
			if (robotType.equals("HUMANOID")) {
				Sprites humaoidSprite = new Sprites();
				IRobot humanoidObject = new HumanoidRobot(robotType, humaoidSprite);
				roboticObjectCache.put(robotType, humanoidObject);
				return humanoidObject;
			} else if (robotType.equals("ROBOTICDOG")) {
				Sprites roboticDogSprite = new Sprites();
				IRobot roboticDogObject = new RoboticDog(robotType, roboticDogSprite);
				roboticObjectCache.put(robotType, roboticDogObject);
				return roboticDogObject;
			}
		}
		return null;
	}
}
