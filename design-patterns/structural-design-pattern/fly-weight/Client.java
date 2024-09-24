package pac;

public class Client {
	public static void main(String[] args) {
		IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
		humanoidRobot1.display(1, 2);
		
		IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
		humanoidRobot2.display(10, 30);
		
		IRobot roboticDog1 = RoboticFactory.createRobot("ROBOTICDOG");
		roboticDog1.display(2, 9);
		
		IRobot roboticDog2 = RoboticFactory.createRobot("ROBOTICDOG");
		roboticDog2.display(12, 45);
	}
}
