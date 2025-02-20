package stringsInJava;

public class CustomizedImutableClass {

	public static void main(String[] args) {
		 CustomisedClass s = new  CustomisedClass("xyz");
		 System.out.println("Customized class:: " + s.getstr());
		
	}

}

final class CustomisedClass{
	private final String str;
	
	public CustomisedClass(String str) {
		this.str=str;
	}
	public String getstr(){
		return str;
	}
}