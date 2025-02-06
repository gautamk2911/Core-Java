package methodChainingPackage;
public class MethodWithChaining {
	int a,b;
	public MethodWithChaining setA(int a) {
		this.a = a; // Assign the provided value to the instance variable 'a'
		return this; // returning 'this' enables chaining
	}
	public MethodWithChaining setB(int b) {
		this.b= b; // Assign the provided value to the instance variable 'b'
		return this; // returning 'this' enables chaining
	}
	//display() method to display the values of instance variables : a and b
	public void display() {
		System.out.println("a: "+a+"\nb:"+b);
	}
	public static void main(String[] args) {
		new MethodWithChaining().setA(10).setB(20).display();
	}
}