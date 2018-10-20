public class DessertShoppe{
	static final double TAX_RATE = 6.5;
	static final String STORE_NAME = "M & M Dessert Shoppe";
	static final int MAX_ITEM_NAME_SIZE = 25;
	static final int COST_WIDTH = 6;

	public static String cents2dollarsAndCents(int cents){
		String s = ""; 
      
     	if (cents < 0){ 
     		s += "-"; 
     		cents *= -1; 
     	} 
     
     	int dollars = cents / 100; 
    	cents = cents % 100; 
     
     	if(dollars > 0){ 
      		s += dollars;
      	} 
     
    	s += "."; 
       
     	if(cents < 10){ 
      		s += "0"; 
      	}
       
    	s += cents; 
     
     	return s; 
	}
}