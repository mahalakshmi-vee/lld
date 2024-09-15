package state;

import java.util.List;

import main.VendingMachine;
import models.Coin;
import models.Item;

public class SelectionState implements State {
	public SelectionState() {
		System.out.println("Currently vending machine in an selection state");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
		return;
	}

	@Override
	public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {

		throw new Exception("You can not insert coin in an selection state");
	}

	@Override
	public void clickOnSelectProductButton(VendingMachine vendingMachine) {
		return;
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int itemCode) throws Exception {
		// 1. get the item of this code number.
		Item item = vendingMachine.getInventory().getItem(itemCode).getItem();

		// 2. total amount paid by user.
		int paidByUser = 0;
		for (Coin coin : vendingMachine.getCoinList()) {
			paidByUser += coin.getValue();
		}

		if (paidByUser < item.getPrice()) {
			System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice()
					+ " and you paid: " + paidByUser);
			refundFullMoney(vendingMachine);
			throw new Exception("Insufficient amount");
		} else if (paidByUser >= item.getPrice()) {

			if (paidByUser > item.getPrice()) {
				getChange(paidByUser - item.getPrice());
			}

			vendingMachine.setState(new DispenseState());
			vendingMachine.getState().dispenseProduct(vendingMachine, itemCode);
		}
	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine, int itemCode) throws Exception {

		throw new Exception("Product can not be dispensed in an selection state");
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
		// actual logic should be to return the COINs in the dispense tray, but for
		// simplicity i am just returning the amount to be refunded.
		System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
		return returnExtraMoney;
	}

}
