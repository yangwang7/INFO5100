public class IceCream extends DessertItem{
	String name;
	int cost;

	public IceCream(String name, int cost){
		super(name);
		this.cost = cost;
	}

	public int getCost(){
		return cost;
	}
	
	public String toString(){
		return String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s" + "%" + DessertShoppe.COST_WIDTH + "s", getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	}
}