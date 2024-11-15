package receiver;

import java.util.Stack;

import command.Command;

public class RemoteControl {
	private Stack<Command> commands = new Stack<>();
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		if (command != null) {
			command.execute();
			commands.push(command);
		}
	}

	public void undo() {
		if (!commands.empty()) {
			Command command = commands.peek();
			command.undo();
		}
	}
}
