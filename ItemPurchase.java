//We are purchasing different type of Items
public class ItemPurchase {
	String itemName;
	String itemType;
	int itemUnit;
	double pricePerUnit;
	public ItemPurchase(String itemName, String itemType, int itemUnit, double pricePerUnit) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemUnit = itemUnit;
		this.pricePerUnit = pricePerUnit;
	}
	
	//Calculating total price 
	public double getItemTotalPrice() {
		return itemUnit*pricePerUnit;
	}
}
