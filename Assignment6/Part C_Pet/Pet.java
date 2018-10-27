public class Pet{
	private String petNmae;
	private String ownerName;
	private String color;

	protected int sex;

	public static final int MALE = 0;
	public static final int FEMALE = 1;
	public static final int SPAYED = 2;
	public static final int NEUTERED = 3;

	//Constructor
	public Pet (String name, String ownerName, String color){
		this.petNmae = name;
		this.ownerName = ownerName;
		this.color = color;
	} 

	public String getPetName(){
		return petNmae;
	} 

	public String getOwnerName(){
		return ownerName;
	} 

	public String getColor(){
		return color;
	}

	public void setSex(int sexid){
		this.sex = sexid;
	} 

	// Should return the string equivalent of the gender, e.g the string "MALE" etc.
	public String getSex(){
		if(sex == 0){
			return "Male";
		}else if(sex == 1){
			return "Female";
		}else if(sex == 2){
			return "Sprayed";
		}else if(sex == 3){
			return "Neutered";
		}else{
			return "Sex Error";
		}
	}  

	// Should return the name, owner’s name, age, color, and gender (use getSex()); 
	public String toString(){
		return getPetName() + " owned by " + getOwnerName() + "\n"
			   + "Color: " + getColor() + "\n"
			   + "Sex: " + getSex();
	} 
}