package command;

import invoker.AirConditioner;

public class TurnOnACCommand implements Command {
	private AirConditioner ac;

	public TurnOnACCommand(AirConditioner ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		ac.turnOn();
	}

	@Override
	public void undo() {
		ac.turnOff();
	}
}
