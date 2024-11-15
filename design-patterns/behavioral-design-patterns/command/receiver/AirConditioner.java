package invoker;

public class AirConditioner {
	private boolean turnOn = false;
	private int temperature = 0;

	public void turnOn() {
		turnOn = true;
		System.out.println("AC is ON");
	}

	public void turnOff() {
		turnOn = false;
		System.out.println("AC is OFF");
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public boolean isTurnOn() {
		return turnOn;
	}

	public int getTemperature() {
		return temperature;
	}

}
