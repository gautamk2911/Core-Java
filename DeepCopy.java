//Deep copy stores copies of the object’s value.
package arraysInJava;

public class DeepCopy {

	public static void main(String[] args) {
		int[]sourceArr = {10,20,30,40};
		int[] destinationArr = new int[4];
		for(int index = 0;index<sourceArr.length;index++) {
			//deep copy
			destinationArr[index]=sourceArr[index];
			for(int ele:destinationArr) {
			System.out.println(ele);
			}
			
			
		}
		
	}

}
