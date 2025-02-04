package conditionals;

public class InterestRateCalculations {
	public static void main(String[] args) {
		double age=18;
		double income = 122200000;
		char gender = 'F';
		
		if(age>=18) {
			if(income>=500000) {
				if(gender == 'M' || gender == 'm') {
					System.out.println("Rate of Interest : 7.5");
				} else if(gender == 'F'|| gender == 'f') {
						System.out.println("Rate of Interest : 7");
				} else {
						System.out.println("Invalid Input.");
					}
				}
			} else {
				System.out.println("Not eligible.");
			}
		} else {
			System.out.println("Not Eligible.");
		}
		
	}
}
