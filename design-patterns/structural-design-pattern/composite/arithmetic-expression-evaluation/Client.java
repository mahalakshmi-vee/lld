package pac;

public class Client {
	public static void main(String[] args) {
		Expression two = new Number(2);
		Expression one = new Number(1);
		Expression seven = new Number(7);
		Expression addExpression = new ArithmeticExpression(ArithmeticOperationType.ADD, one, seven);
		Expression parentExpression = new ArithmeticExpression(ArithmeticOperationType.MULTIPLY, two, addExpression);
		System.out.println(parentExpression.evaluate());
	}
}
