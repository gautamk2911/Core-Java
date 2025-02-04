package conditionals;

import java.util.Scanner;

public class BasicCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operation = 0;
		while(operation != 5) {
			System.out.print("Enter num 1: ");
			double n1 = sc.nextDouble();
			System.out.print("Enter num 2: ");
			double n2= sc.nextDouble();
			System.out.println("1. addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Enter operation number: ");
			operation = sc.nextInt();
			double result;
			switch(operation) {
				case 1:
					System.out.println("Result: "+ n1+n2);
					break;
				case 2:
					System.out.println("Result: "+ (n1-n2));
					break;
				case 3:
					System.out.println("Result: "+ n1*n2);
					break;
				case 4:
					if(n2>0)
						System.out.println("Result: "+ n1/n2);
					else
						System.out.println("Invalid Input");;
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid input");
			}
		}
	}
}