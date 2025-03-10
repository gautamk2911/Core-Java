package collectionsInJava;

import java.util.Iterator;
import java.util.Vector;

public class VectorsInJava {
	public static void main(String[] args) {
		Vector vectObj = new Vector();
		vectObj.add(123); //add() is synchronised in nature.
		vectObj.add(234);
		vectObj.add(345);
		vectObj.add(true);
		vectObj.add("Hello");
		System.out.println(vectObj);
		
		//traversal
		Iterator itr  = vectObj.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		//duplicate objects.
		vectObj.add(true);
		System.out.println(vectObj);
		
		System.out.println("Capacity: "+vectObj.capacity());
		
		vectObj.ensureCapacity(20);
		System.out.println("Capacity: "+vectObj.capacity());
		
	}
}
