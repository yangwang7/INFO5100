public class Test{
	public static void main(String[] args){
		Student s1 = new Student("Amy", 1);
		Student s2 = new Student("Ben", 2);
		Student s3 = new Student("Cathy", 3);
		Student s4 = new Student("Daniel", 4);
		Student s5 = new Student("E", 5);
		Student s6 = new Student("F", 6);
		Student s7 = new Student("G", 7);
		Student s8 = new Student("H", 8);
		Student s9 = new Student("I", 9);
		Student s10 = new Student("J", 10);
		Student s11 = new Student("K", 11);

		Course c = new Course("INFO5100");
		c.registerStudent(s1);
		c.registerStudent(s2);
		c.registerStudent(s3);
		c.registerStudent(s4);
		c.registerStudent(s5);
		c.registerStudent(s6);
		c.registerStudent(s7);
		//c.registerStudent(s8);
		//c.registerStudent(s9);
		//c.registerStudent(s10);
		c.getStudents();
		//c.registerStudent(s11);

		System.out.println(c.students[0]);
		System.out.println(c.students[1]);
		System.out.println(c.students[2]);
		System.out.println(c.students[3]);
		System.out.println(c.students[4]);
		System.out.println(c.students[5]);
		System.out.println(c.students[6]);
		System.out.println(c.students[7]);
		System.out.println(c.students[8]);
		System.out.println(c.students[9]);

		System.out.println(c.getNumberOfStudent());
	}
}