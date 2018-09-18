
/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question. 
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    public Employee(String name, int age, Gender gender, double salary) {
    	this.name = name;
    	this.age = age;
    	this.gender = gender;
    	this.salary = salary;
    }

    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }

    public int getAge(){
    	return age;
    }
    public void setAge(int age){
    	this.age = age;
    }

    public Gender getGender(){
    	return gender;
    }
    public void setGender(Gender gender){
    	this.gender = gender;
    }

    public double getSalary(){
    	return salary;
    }
    public void setSalary(double salary){
    	this.salary = salary;
    }

    public void raiseSalary(double byPercent){
    	this.salary = salary * byPercent;
    }
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
    	double tax;
    	double s = employee.getSalary();

        if(s <= 8900){
        	tax = 6.2/100 * s;
        }else{
        	tax = 6.2/100 * 106800;
        }

    	System.out.println("The social security tax of this employee is: " + tax);

        return tax;
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
    	double cover;
    	double a = employee.getAge();
    	double s = employee.getSalary();

    	if(a < 35){
    		cover = 3*s/100;
    	}else if(a >= 35 && a <= 50){
    		cover = 4*s/100;
    	}else if(a > 50 && a < 60){
    		cover = 5*s/100;
    	}else{
    		cover = 6*s/100;
    	}

    	System.out.println("The contribution for insurance converage of this employee is: " + cover);

    	return cover;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
    	double s1 = e1.getSalary();
    	double s2 = e2.getSalary();
    	double s3 = e3.getSalary();

    	String n1 = e1.getName();
    	String n2 = e2.getName();
    	String n3 = e3.getName();

        if(s1 > s2){
        	String temp = n1;
        	n1 = n2;
        	n2 = temp;
        }

        if(s1 > s3){
        	String temp = n1;
        	n1 = n3;
        	n3 = temp;
        }

        if(s2 > s3){
        	String temp = n2;
        	n2 = n3;
        	n3 = temp;
        }

        System.out.println(n1 + " " + n2 + " " + n3);
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
        employee.raiseSalary(300/100);
    }


    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /**
     * Because the method only swaps the properties of the two local varibles (x, y),
     * but can not swap those of the instance variables(a, b).
     */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        //Employee temp = x;
        //x = y;
        //y = temp;

		String nameTemp = x.getName();
    	int ageTemp = x.getAge();
    	Gender genderTemp = x.getGender();
   		double salaryTemp = x.getSalary();

   		x.setName(y.getName());
   		x.setAge(y.getAge());
   		x.setGender(y.getGender());
   		x.setSalary(y.getSalary());

   		y.setName(nameTemp);
   		y.setAge(ageTemp);
   		y.setGender(genderTemp);
   		y.setSalary(salaryTemp); 
    }
}
