package pac;

public class Dog extends LivingThings {
	public Dog(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
	}

	@Override
	public void breatheProcess() {
		this.getBreatheImplementor().breatheProcess();
	}
}