package pac;

public class Number implements Expression{
	private int number;
	public Number(int number) {
		this.number = number;
	}
	@Override
	public int evaluate() {
		
		return number;
	}
}
