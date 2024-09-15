package state;

import java.util.ArrayList;
import java.util.List;

import main.VendingMachine;
import models.Coin;

public class IdleState implements State {

	public IdleState(VendingMachine vendingMachine) {
		System.out.println("Currently vending machine in an idle state");
		vendingMachine.setCoinList(new ArrayList<>());
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine vendingMachine) {

		vendingMachine.setState(new HasMoneyState());
	}

	@Override
	public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {

		throw new Exception("First you need to click on insert coin button");
	}

	@Override
	public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {

		throw new Exception("You can not insert coin in an idle state");
	}

	@Override
	public void chooseProduct(VendingMachine vendingMachine, int itemCode) throws Exception {

		throw new Exception("You can not choose product in an idle state");
	}

	@Override
	public void dispenseProduct(VendingMachine vendingMachine, int itemCode) throws Exception {

		throw new Exception("Product can not be dispensed in an idle state");
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
