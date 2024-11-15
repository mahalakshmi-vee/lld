package interpreter;

public class BinaryNonTerminalExpression implements AbstractExpression {
	private AbstractExpression leftExpression;
	private AbstractExpression rightExpression;
	private char operator;

	public BinaryNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression,
			char operator) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
		this.operator = operator;
	}

	@Override
	public int interpret(Context context) {
		switch (operator) {
		case '+':
			return leftExpression.interpret(context) + rightExpression.interpret(context);
		case '-':
			return leftExpression.interpret(context) - leftExpression.interpret(context);
		case '*':
			return leftExpression.interpret(context) * rightExpression.interpret(context);
		default:
			break;
		}
		return -1;
	}
}
