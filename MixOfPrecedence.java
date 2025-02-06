package methodOverloading;
//gives error

public class MixOfPrecedence {
	public void addition(double d, int b) {
		System.out.println("inside first addition.");
	}
	public void addition(int d, double b) {
		System.out.println("inside second addition.");
	}
	public static void main(String[] args) {
		MixOfPrecedence obj = new MixOfPrecedence();
		obj.addition(10, 10); 
	}
		//this will give error
		// as compiler gets confused
		// it wont call anyone of the method either.
}
