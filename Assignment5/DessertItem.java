public abstract class DessertItem{
	protected String name;

	public DessertItem(){}

	public DessertItem(String name){
		this.name = name;
	}

	public final String getName(){
		return name;
	}

	public abstract int getCost();

	public String toString(){
		return String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s" + "%" + DessertShoppe.COST_WIDTH + "s", getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	}
}