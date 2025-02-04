package conditionals;

public class NestedSwitch {
	public static void main(String[] args) {
		int a = 459;
		int b = 789;
		switch(a) {
		case 456:
			System.out.println("Inside 456.");
			break;
		default :
			System.out.println("Inside Default.");
			switch(b) {
			case 789:
				System.out.println("Inside 789.");
				break;
			}
			break;
		}
}}

