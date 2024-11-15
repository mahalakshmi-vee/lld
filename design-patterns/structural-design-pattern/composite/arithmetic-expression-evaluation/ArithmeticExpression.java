package pac;

public class ArithmeticExpression implements Expression {
	private ArithmeticOperationType operation;
	private Expression leftExpression;
	private Expression rightExpression;

	public ArithmeticExpression(ArithmeticOperationType operation, Expression leftExpression,
			Expression rightExpression) {
		this.operation = operation;
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public int evaluate() {
		switch (operation) {
		case ADD: {
			return leftExpression.evaluate() + rightExpression.evaluate();
		}
		case SUBTRACT: {
			return leftExpression.evaluate() - rightExpression.evaluate();
		}
		case MULTIPLY: {
			return leftExpression.evaluate() * rightExpression.evaluate();
		}
		case DIVISION: {
			return leftExpression.evaluate() / rightExpression.evaluate();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
	}

}
