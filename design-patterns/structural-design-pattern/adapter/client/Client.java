package client;

import adaptee.WeightMachineForBabies;
import adapter.WeightMachineAdapter;
import adapter.WeightMachineAdapterImpl;

public class Client {
	public static void main(String[] args) {
		WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
		System.out.println(weightMachineAdapter.getWeightInKg());
	}
}
