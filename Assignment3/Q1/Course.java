public class Course{
	String name;
	int numberOfStudent = 0;
	Student[] students = new Student[10];

	Course(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
	public int getNumberOfStudent(){
        for(Student s : students){
        	if(s != null){
        		numberOfStudent++;
        	}
        }
		return numberOfStudent;
	}

	public void registerStudent(Student student){
		int i = 0;

		if(isFull() == false){
        	for(Student s : students){
        		if(s != null){
        			i++;
        		}
        	}
			students[i] = student;
			System.out.println("Registration succeeds.");
		}else{
			System.out.println("This Course is full.");
		}
	}

	public void getStudents(){
	  for(Student s : students){
        	if(s != null){
        		System.out.println(s.toString());
        	}
        }
	}

	public boolean isFull(){
		int i = 0;

        for(Student s : students){
        	if(s != null){
        		i++;
        	}
        }

		if(i > 10){
			return true;
		}else{
			return false;
		}
	}

}