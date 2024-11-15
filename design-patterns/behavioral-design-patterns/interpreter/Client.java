package interpreter;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.put("a", 10);
		context.put("b", 5);
		context.put("c", 8);
		context.put("d", 16);

		AbstractExpression expression2 = new BinaryNonTerminalExpression(
				new BinaryNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"),
						'*'),
				new BinaryNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d"),
						'*'),
				'+');
		int result = expression2.interpret(context);
		System.out.println("Result: " + result);
	}
}
