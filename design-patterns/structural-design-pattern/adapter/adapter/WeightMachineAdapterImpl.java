package adapter;

import adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
	private WeightMachine weightMachine;

	public WeightMachineAdapterImpl(WeightMachine weightMachine) {
		this.weightMachine = weightMachine;
	}

	@Override
	public double getWeightInKg() {
		double weightInPound = weightMachine.getWeightInPound();

		// covert it to KGs.
		double weightInKg = weightInPound * .45;
		return weightInKg;
	}
}
