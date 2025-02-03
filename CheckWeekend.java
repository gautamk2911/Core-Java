package conditionals;

public class CheckWeekend {
	public static void main(String[] args) {
		String day = "Saturday";
		switch(day) {
			case ("Saturday"):{
				System.out.println("Weekend day.");
				break;
			}
			case "Sunday":{
				System.out.println("Weekend day.");
				break;
			}
			default:{
				System.out.println("Not a Weekend day.");
			}
		}
		
	
	}
}
