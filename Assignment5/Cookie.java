public class Cookie extends DessertItem{
	String name;
	private int number;
	private int pricePerDouzen;

	public Cookie(String name, int number, int pricePerDouzen){
		super(name);
		this.number = number;
		this.pricePerDouzen = pricePerDouzen;
	}

	public int getCost(){
		int cost = (int) Math.round(number * pricePerDouzen /12);
		return cost;
	}

	public String toString(){
		String s = "";
		s = String.valueOf(number) + " @ " + String.valueOf(pricePerDouzen) + " /dz.\n";
		return s + String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s" + "%" + DessertShoppe.COST_WIDTH + "s", getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	}
}