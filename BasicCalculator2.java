package conditionals;

public class BasicCalculator2 {
	public static void main(String[] args) {
		
		int a = 10, b = 23;
		char op  = '+';
		switch(op) {
			case '+' : 
				addition(a,b);
				break;
			case '-':
				subtraction(a,b);
				break;
			case '*':
				multiplication(a,b);
				break;
			case '/':
				division(a,b);
		}
		
	}
	static void addition(double a, double b) {
		System.out.println("result : " + (a+b));
	}
	static void subtraction(double a, double b) {
		System.out.println("result : " + (a-b));
	}
	static void multiplication(double a, double b) {
		System.out.println("result : " + (a*b));
	}
	static void division(double a, double b) {
		System.out.println("result : " + (a/b));
	}
}
