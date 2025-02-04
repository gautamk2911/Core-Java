package conditionals;

public class CalculatorUsingEnhancedSwitch {
	public static void main(String[] args) {
		int a = 50;
		int b = 56;
		char operation = '/';
		double result = switch(operation) {
			case '+' ->{
				yield addition(a,b);
			}
			case '*' ->{
				yield multiplication(a,b);
			}
			case '-' ->{
				yield subtraction(a,b);
			}
			case '/'->{
				if(b!=0)
					yield division(a,b);
				else
					yield 0;
			}
			default->{
				System.out.println("Invalid Choice.");
				yield 0;
			}
		};
		if(result != 0)
			System.out.println("Result : "+result);
		else
			System.out.println("Invalid Inputs");
	}
	static double addition(double a, double b) {
		return a+b;
	}
	static double subtraction(double a, double b) {
		return a+b;
	}
	static double multiplication(double a, double b) {
		return a*b;
	}
	static double division(double a, double b) {
		return a/b;
	}
	
}
