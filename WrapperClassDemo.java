package wrapperClass;

public class WrapperClassDemo {
	public static void main(String[] args) {
		Integer integerObj = new Integer("5005");
		System.out.println(integerObj);
		
		Byte byteObj = new Byte((byte) 5);
		System.out.println(byteObj);
		
		Float floatObj = new Float("20.541f");
		System.out.println(floatObj);
		
		Short shortObj = new Short("2");
		System.out.println(shortObj);
		
		Long longObj = new Long("656548565");
		System.out.println(longObj);
		
		Double doubleObj = new Double(20465.2541);
		System.out.println(doubleObj);
		
		Character charObj = new Character('p');
		System.out.println(charObj);
		
		Boolean boolObj = new Boolean(true);
		System.out.println(boolObj);
	}

}
