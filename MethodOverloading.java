package methodOverloading;

public class MethodOverloading {
	
	void addition(int a, int b) {//different datatype, same quanitity
		System.out.println("First method");
	}
	void addition(double a, double b) {//different datatype, same quanitity
		System.out.println("Second method");
	}
	void addition(int a, int b, int c) { //all same datatypes addition
		System.out.println("Third method");
	}
	void addition(double a, int b, int c) { //different sequence of datatype
		System.out.println("Fourth method");
	}
	void addition(int a, double b, double c) { //different sequence of datatype
		System.out.println("Fifth method");
	}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.addition(5, 95);
		obj.addition(0.25, 6.75);
		obj.addition(20, 60, 50);
		obj.addition(20.5,60,45);
		obj.addition(20,60.3,45.2);
		}
}
