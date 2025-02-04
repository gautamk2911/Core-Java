package conditionals;

public class EnhancedSwitchCase {

	public static void main(String[] args) {
		int a = 10;
		switch(a) {
//		case 10:
		case 10 ->  {                  //( -> indicate the lambda expression)
			System.out.println("inside the 10");
			break;
		}
//		case 20:
		case 20->{
			System.out.println("Inside the 20");
			break;
		}
//			default:
			default ->
				System.out.println("Inside the default");
		}

	}

}