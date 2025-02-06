package methodChainingPackage;

public class MethodWithoutChaining {
	int a,b;
	public MethodWithoutChaining setA(int a) {
		this.a = a;
		return null;
	}
	public MethodWithoutChaining setB(int b) {
		this.b= b;
		return null;
	}
	public void display() {
		System.out.println("a: "+a+"\nb:"+b);
		
	}
	public static void main(String[] args) {
		MethodWithoutChaining obj = new MethodWithoutChaining();
		obj.setA(10);
		obj.setB(50);
		obj.display();
	}

}
