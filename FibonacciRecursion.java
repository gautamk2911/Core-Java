package basicCodes;

public class FibonacciRecursion {
	
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibonacci(n) + fibonacci(n-1);
	}
	
	
	public static void main(String[] args) {
		int n = 10;
		for(int i=0;i<n;i++) {
			System.out.print(fibonacci(n)+" ");
		}
	}

}
