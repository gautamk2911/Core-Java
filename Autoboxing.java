package wrapperClass;

public class Autoboxing {
	public static void main(String[] args) {
		int a = 10;
		Integer intObj1 = new Integer(a); //not apprieciated bcz it aint a convention
		Integer intObj2 = a; // Autoboxing
		System.out.println("Autoboxing value: "+intObj2);
		Float floatObj = 123.32f;
		
		
		int b = intObj2; //Unbloxing
		System.out.println("Unboxing value: "+b);
		float f = floatObj; //unbloxing
		
		double d = 123.45;
        Double doubleObj = d;
        double e = doubleObj; 
        System.out.println("Double: Autoboxing - " + doubleObj + ", Unboxing - " + e);
        
        char c = 'A';
        Character charObj = c;
        char h = charObj;
        System.out.println("Character: Autoboxing - " + charObj + ", Unboxing - " + h);

       
        byte x = 100;
        Byte byteObj = x;
        byte y = byteObj;

        
        short s = 50;
        Short shortObj = s; 
        short t = shortObj; 

       
        long l = 123456789L;
        Long longObj = l; 
        long m = longObj; 

        
        boolean bool = true;
        Boolean boolObj = bool; 
        boolean n = boolObj;
				
	}

}
