package collectionsInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.add("hello");
		obj.add(12);
		obj.add(45);
		obj.add(null);
		obj.add(78);
		obj.add(true);
		System.out.println(obj);
		
		//traversal
		// method 1
		for(int i=0;i<obj.size();i++) {
			System.out.print(obj.get(i)+" ");
		}
		System.out.println();
		// method 2
		for(Object ele : obj) {
			System.out.print(ele + " ");
		}
		System.out.println();
		// method 3
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
	}
}
