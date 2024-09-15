package main;

import models.Item;
import models.ItemShelf;
import models.ItemType;

public class Inventory {
	private ItemShelf[] itemShelfArray;

	public Inventory(int inventoryCount) {
		itemShelfArray = new ItemShelf[inventoryCount];
	}

	public void fillUpInventory() {
		int itemCode = 101;
		for (int i = 0; i < itemShelfArray.length; i++) {
			Item item = new Item();
			if (i >= 0 && i < 3) {
				item.setItemType(ItemType.COKE);
				item.setPrice(10);
			} else if (i >= 3 && i < 6) {
				item.setItemType(ItemType.SODA);
				item.setPrice(20);
			} else if (i >= 6 && i < 9) {
				item.setItemType(ItemType.JUICE);
				item.setPrice(30);
			}
			ItemShelf itemShelf = new ItemShelf();
			itemShelf.setItem(item);
			itemShelf.setSoldOut(false);
			itemShelf.setItemCode(itemCode);
			itemCode++;
			itemShelfArray[i] = itemShelf;
		}
	}

	public void printInventory() {
		for (int i = 0; i < itemShelfArray.length; i++) {
			Item item = itemShelfArray[i].getItem();
			System.out.println("Code: " + itemShelfArray[i].getItemCode() + " Name: " + item.getItemType() + " Price: "
					+ item.getPrice() + " isAvailable: " + !itemShelfArray[i].isSoldOut());
		}
	}

	public void addInventory(Item item, int itemCode) throws Exception {
		for (int i = 0; i < itemShelfArray.length; i++) {
			if (itemShelfArray[i].getItemCode() == itemCode) {
				if (!itemShelfArray[i].isSoldOut()) {
					itemShelfArray[i].setItem(item);
				}
			} else {
				throw new Exception("already item is present, you can not add item here");
			}
		}
	}

	public ItemShelf getItem(int itemCode) throws Exception {
		for (ItemShelf itemShelf : itemShelfArray) {
			if (itemShelf.getItemCode() == itemCode) {
				return itemShelf;
			}
		}
		throw new Exception("Please enter valid item code");
	}
}
