package state;

import java.util.List;

import main.VendingMachine;
import models.Coin;

public interface State {
	void clickOnInsertCoinButton(VendingMachine vendingMachine);

	void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

	void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception;

	void chooseProduct(VendingMachine vendingMachine, int itemCode) throws Exception;

	void dispenseProduct(VendingMachine vendingMachine, int itemCode) throws Exception;

	List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

	double getChange(double returnExtraMoney) throws Exception;
}
