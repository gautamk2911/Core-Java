package conditionals;

public class DefaultPositionInSwitch {
	DefaultPositionInSwitch obj = new DefaultPositionInSwitch();
	public static void main(String[] args) {
		long num = 1; // long in not supported in java's switch.
		switch(num) {
			case 1:
				System.out.println("inside 1.");
				break;
			default:
				System.out.println("inside default.");
		}
	}
}
