public class testDog{
	public static void main(String[] args) {
		Dog d = new Dog("Spot", "Susan", "white", "medium");
		d.setSex(2);
		System.out.println(d);
		d.setBoardStart(1, 1, 1000);
		d.setBoardEnd(12, 31, 9999);
		System.out.println(d.boarding(2,15,2001));
		System.out.println(d.boarding(2,3,200));
	}
}