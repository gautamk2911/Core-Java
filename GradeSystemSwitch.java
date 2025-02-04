package conditionals;

public class GradeSystemSwitch {
	public static void main(String[] args) {
		String grade = "";
		int marks = 80;
		
		switch(marks >= 90) {
		case true:
			grade = "O";
			break;
		default: switch(marks>=80) {
		case true:
			grade = "A+";
			break;
		default: switch(marks>=70) {
		case true:
			grade = "A";
			break;
		default: switch(marks>=60) {
			case true:
			grade = "B";
			break;
		default: switch(marks>=50) {
			case true:
				grade = "C";
				break;
			default :
				switch(marks >= 35) {
				case true: 
					grade = "D";
					break;
				default : 
					switch(marks<35) {
					case true: 
						grade = "F";
						break;
						default: System.out.println("iinvalid input.");
					}
				}
			}
		}
	}
}
}
		System.out.println("Final grade : "+grade);
}}

