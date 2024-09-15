package state;

import java.util.List;

import main.VendingMachine;
import models.Coin;

public class HasMoneyState implements State {

	public HasMoneyState() {
		System.out.println("Currently vending machine in an has money state");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertCoin(VendingMachine vendingMachine, Coin coin) {
		System.out.println("Accepted the coin");
		vendingMachine.getCoinList().add(coin);
	}

	@Override
	public void clickOnSelectProductButton(VendingMachine vendingMachine) {

		vendingMachine.setState(new SelectionState());
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int itemCode) throws Exception {

		throw new Exception("You need to click on start product selection button first");
	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine, int itemCode) throws Exception {

		throw new Exception("Product can not be dispensed in an has money state");
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
		System.out.println("Returned the full amount back in Coin Dispense tray");
		List<Coin> coinList = vendingMachine.getCoinList();
		vendingMachine.setState(new IdleState(vendingMachine));
		return coinList;
	}

	@Override
	public double getChange(double returnExtraMoney) {

		return 0;
	}

}
