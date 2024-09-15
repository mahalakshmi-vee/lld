package main;

import java.util.List;

import models.Coin;
import state.State;

public class VendingMachine {
	private State state;
	private List<Coin> coinList;
	private Inventory inventory;

	public State getState() {

		return state;
	}

	public void setState(State state) {

		this.state = state;
	}

	public List<Coin> getCoinList() {

		return coinList;
	}

	public void setCoinList(List<Coin> coinList) {

		this.coinList = coinList;
	}

	public Inventory getInventory() {

		return inventory;
	}

	public void setInventory(Inventory inventory) {

		this.inventory = inventory;
	}
}
