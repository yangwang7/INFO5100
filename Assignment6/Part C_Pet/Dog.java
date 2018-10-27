public class Dog extends Pet implements Boardable{
	private String size;
	public int startMonth, startDay, startYear;
	public int endMonth, endDay, endYear;

	public Dog(String name, String ownerName, String color, String size){
		super(name, ownerName, color);
		this.size = size;
	} 

	// returns the string hairLength 
	public String getSize(){
		return size;
	} 

	/* method that returns a String that    
   	   identifies the pet as Cat and returns a complete description of the cat,
   	   including the values stored in the Pet parent class.*/
	public String toString(){
		return "DOG:" + "\n" + super.toString() + "\n" + "Size: " + getSize();
	} 

	public void setBoardStart(int month, int day, int year){
		this.startMonth = month;
		this.startDay = day;
		this.startYear = year;
	}

	public void setBoardEnd(int month, int day, int year){
		this.endMonth = month;
		this.endDay = day;
		this.endYear = year;
	}

	public boolean boarding(int month, int day, int year){
		if(startMonth <= month && month <= endMonth && 1 <= month && month <=12){
			if(startDay <= day && day <= endDay && 1 <= day && day <= 31){
				if(startYear <= year && year <= endYear && 1000 <= year && year <= 9999){
					return true;
				}
			}
		}
		return false;
	} 
}