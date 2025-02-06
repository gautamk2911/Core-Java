package methodOverloading;

public class MixOfPrecedence2 {
	public void addition(double d, int b) {
		System.out.println("Double called");
	}
	public void addition(Object d, Object b) {
		System.out.println("Object called");
	}
	public static void main(String[] args) {
		MixOfPrecedence2.class obj = new MixOfPrecedence2();
		obj.addition(new Integer(10),new Integer(10));  // calls object
		obj.addition(10,20); // calls double
	}
}
