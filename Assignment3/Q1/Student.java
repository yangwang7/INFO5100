public class Student{
	String name;
	int id;

	Student(String name, int id){
		this.name = name;
		this.id = id;
	}

	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}

	public String toString(){
		return getName() + " " + getId();
	}
}