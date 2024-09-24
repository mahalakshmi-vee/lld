package pac;

public class Fish extends LivingThings {
	public Fish(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
	}

	@Override
	public void breatheProcess() {
		this.getBreatheImplementor().breatheProcess();
	}
}
