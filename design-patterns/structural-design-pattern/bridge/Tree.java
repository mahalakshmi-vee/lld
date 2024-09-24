package pac;

public class Tree extends LivingThings {
	public Tree(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
	}

	@Override
	public void breatheProcess() {
		this.getBreatheImplementor().breatheProcess();
	}
}
