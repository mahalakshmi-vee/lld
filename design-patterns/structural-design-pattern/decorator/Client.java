package pac;

public class Client {
	public static void main(String[] args) {
		BasePizza basePizza = new Mushroom(new ExtraCheese(new VegDelight()));
		System.out.println(basePizza.cost());
	}
}
