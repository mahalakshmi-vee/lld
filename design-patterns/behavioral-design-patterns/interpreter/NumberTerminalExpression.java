package interpreter;

public class NumberTerminalExpression implements AbstractExpression {
	private String stringVal;

	public NumberTerminalExpression(String strVal) {
		this.stringVal = strVal;
	}

	@Override
	public int interpret(Context context) {

		return context.get(stringVal);
	}
}
