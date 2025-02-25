package collectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsArrayList {

	public static void main(String[] args) {
		List arraylistobj = new ArrayList();
		arraylistobj.add(10);
		arraylistobj.add(20);
		arraylistobj.add("test");
		arraylistobj.add('N');
		System.out.println(arraylistobj);
		
		//traversal using for loop.
		for(int i=0;i<arraylistobj.size();i++) {
			System.out.print(arraylistobj.get(i)+" ");
		}
		System.out.println();
		//traversal using for each loop.
		for(Object element : arraylistobj) {
			System.out.print(element+" ");
		}
		System.out.println();
		//traversal using while loop
		Iterator itr = arraylistobj.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		//remove element at index.
		arraylistobj.remove(2);
		System.out.println(arraylistobj);
		
		
	}

}