package pac;

public abstract class LivingThings {
	private BreatheImplementor breatheImplementor;

	public LivingThings(BreatheImplementor breatheImpmentor) {
		this.breatheImplementor = breatheImpmentor;
	}

	public abstract void breatheProcess();

	public BreatheImplementor getBreatheImplementor() {
		
		return breatheImplementor;
	}
}
