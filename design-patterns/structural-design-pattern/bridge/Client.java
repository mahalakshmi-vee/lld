package pac;

public class Client {
	public static void main(String[] args) {
		LivingThings fishObject = new Fish(new WaterBreatheImplementation());
		fishObject.breatheProcess();

		LivingThings treeObject = new Tree(new TreeBreatheImplementation());
		treeObject.breatheProcess();
	}
}
