package methodOverloading;
// byte -> short -> int -> long -> float ->double
//char -> int
public class OverloadingPrecedence {
	public void addition(double d, double b) {
		System.out.println("inside double addition.");
	}
	public void addition(long a, long b) {
		System.out.println("inside long addition");
	}
	public static void main(String[] args) {
		OverloadingPrecedence obj = new OverloadingPrecedence();
		obj.addition(50, 62);
	}

}
