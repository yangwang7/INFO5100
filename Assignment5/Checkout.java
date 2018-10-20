import java.util.*;

public class Checkout{
	int numberOfItems;
	//int totalCost = 0;
	//int totalTax;

	Vector<DessertItem> v;

	public Checkout(){
		this.v = new Vector<DessertItem>();
	}

	public int numberOfItems(){
		numberOfItems = v.size();
		return numberOfItems;
	}

	public void enterItem(DessertItem item){
		v.add(item);
	}

	public void clear(){
		v.clear();
	}

	public int totalCost(){
		int totalCost = 0;
		for(DessertItem dessert : v){
			 totalCost += dessert.getCost();
		}
		//for(int i = 0; i < v.size(); i++){
		//	totalCost += v.get(i).getCost();
		//}
		return totalCost;
	}

	public int totalTax(){
		int totalTax = (int) Math.round(totalCost() * DessertShoppe.TAX_RATE /100);
		return totalTax;
	}

	public String toString(){
		String s = "      " + DessertShoppe.STORE_NAME + "\n" ; 
        s += "      --------------------\n\n"; 
        for(DessertItem dessert : v){
            s += dessert.toString() + "\n"; 
         } 
        s += "\n"; 
         
        s += String.format ( "%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s" + "%" + DessertShoppe.COST_WIDTH + "s" , "Tax" ,   DessertShoppe.cents2dollarsAndCents ( totalTax ())); 
        s += "\n"; 
        s += String.format ( "%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s" + "%" + DessertShoppe.COST_WIDTH + "s" , "Total Cost" , DessertShoppe.cents2dollarsAndCents ( totalCost () + totalTax ())); 
        s += "\n"; 
         
        return  s; 
	}
}