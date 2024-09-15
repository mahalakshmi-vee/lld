package main;

import models.Coin;
import state.IdleState;

public class AppMain {
	public static void main(String[] args) {
		try {
			Inventory inventory = new Inventory(9);
			inventory.fillUpInventory();
			inventory.printInventory();

			VendingMachine vendingMachine = new VendingMachine();
			vendingMachine.setInventory(inventory);
			vendingMachine.setState(new IdleState(vendingMachine));

			// Positive flow.
			vendingMachine.getState().clickOnInsertCoinButton(vendingMachine);
			vendingMachine.getState().insertCoin(vendingMachine, Coin.QUARTER);
			vendingMachine.getState().clickOnSelectProductButton(vendingMachine);
			vendingMachine.getState().chooseProduct(vendingMachine, 101);
		} catch (Exception e) {

		}
	}
}
