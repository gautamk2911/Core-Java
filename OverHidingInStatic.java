package methodOverloading;

// Method Overloading in static is called as "Method OverHiding".

public class OverHidingInStatic {
	static void add(int a) {
		System.out.println("Integer method");
	}
	static void add(float a) {
		System.out.println("Float method");
	}
	public static void main(String[] args) {
		add(203.23f)
	}

}
