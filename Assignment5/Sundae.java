public class Sundae extends IceCream{
	String iceCreamName;
	int iceCreamCost;
	private String toppingName;
	private int toppingCost;

	public Sundae(String iceCreamName, int iceCreamCost, String toppingName, int toppingCost){
		super(iceCreamName, iceCreamCost + toppingCost);
		this.toppingName = toppingName;
		this.toppingCost = toppingCost;
	}

	public int getCost(){
		//int cost = super.cost;
		return cost;
	}

	public String toString(){
		String s = toppingName + " Sundae with\n";
		return s + String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s" + "%" + DessertShoppe.COST_WIDTH + "s", getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	}
}