package basicCodes;

public class FibonacciIteration {
	public static void main(String[] args) {
		int a=0, b = 1;
		int lim = 10;
		System.out.print
		(a+" "+b+" ");
		for(int i=0;i<lim;i++) {
			int res = a+b;
			System.out.print(res+" ");
			a=b;
			b=res;
		}
	}

}