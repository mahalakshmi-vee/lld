package state;

import java.util.List;

import main.VendingMachine;
import models.Coin;

public class DispenseState implements State {
	public DispenseState() {
		System.out.println("Currently vending machine in an dispense state");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine vendingMachine) {

		return;
	}

	@Override
	public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {

		throw new Exception("You can not insert coin in an dispense state");
	}

	@Override
	public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {

		throw new Exception("You can not click select product button in an dispense state");
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int itemCode) throws Exception {

		throw new Exception("You can not choose product in an dispense state");
	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine, int itemCode) throws Exception {
		System.out.println("Item with code " + itemCode + " is dispensed in the product dispense tray");
		vendingMachine.getInventory().getItem(itemCode).setSoldOut(true);
		vendingMachine.setState(new IdleState(vendingMachine));
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine vendingMachine) {

		return null;
	}

	@Override
	public double getChange(double returnExtraMoney) {

		return 0;
	}

}
