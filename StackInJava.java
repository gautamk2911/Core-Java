package collectionsInJava;

import java.util.Iterator;
import java.util.Stack;

public class StackInJava {
	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.add(true);
		obj.add(50.6f);
		obj.add(78.45d);
		obj.add("Hello");
		obj.add(false);
		obj.add(78.2f);
		obj.add(12.65d);
		obj.add("world");
		
		System.out.println(obj);
		
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"  ");
		}
		System.out.println();
		System.out.println(obj.capacity()); //10 as it belongs inside vector
		obj.ensureCapacity(20);
		System.out.println(obj.capacity());
		
		System.out.println(obj.getFirst());
		System.out.println(obj.get(3));
		System.out.println();
		
		System.out.println(obj.peek());
	}
}
