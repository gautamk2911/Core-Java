package javaOperators;

public class TernaryOperator {
	public static void main(String[] args) {
		int a=55,b=1004,c=5000;
		
		
		int max = a>b?a:b>c?b:c; //this will produce wrong output.
		System.out.println("Max value amongst the three is: "+max);
		
		int max2 = (a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println("Max value amongst the three is: "+max2);
	}

}
