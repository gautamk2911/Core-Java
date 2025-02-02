package arraysInJava;

public class InitializationOfArray {
	public static void main(String[] args) {
		int arr[] = {12,63,65,45,85}; //way 1 to initialize array.
		int newArr[] = new int[] {56,82,22,6}; // way 2 to initialize array.
		int[] newArr2 = new int[] {45,65}; //way 3
		
		int size = arr.length; //return the number of elements in the array.
		for(int i = 0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nSize : " + size);
	}
}
