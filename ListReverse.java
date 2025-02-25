package collectionsInJava;
import java.util.ArrayList;
import java.util.List;
public class ListReverse {
	public static void main(String[] args) {
		List arr = new ArrayList();
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		arr.add(16);
		System.out.println(arr);
		int start = 0, end = arr.size()-1;
		Object temp = 0;
		while(start < end) {
			temp = arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end, temp);
			start++; end--;
		}
		System.out.println(arr);
	}
}
