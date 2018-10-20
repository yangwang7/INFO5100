public class Candy extends DessertItem{
	String name;
	private double weight;
	private int pricePerPound;

	public Candy(String name, double weight, int pricePerPound){
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}

	public int getCost(){
		int cost = (int) Math.round(weight * pricePerPound);
		return cost;
	}

	public String toString(){
		String s = "";
		s = String.valueOf(weight) + " lbs. @ " + String.valueOf(pricePerPound) + " /lb.\n";
		return s + String.format("%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s" + "%" + DessertShoppe.COST_WIDTH + "s", getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	}
}