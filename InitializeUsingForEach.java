package arraysInJava;

public class InitializeUsingForEach {
	public static void main(String[] args) {
		int arr[] = new int[9];
		int count = 0;
		int value = 45;
		for(int i : arr) {
			arr[count] = value;
			count++;
			value++;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
