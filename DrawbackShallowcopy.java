package arraysInJava;

public class DrawbackShallowcopy {

	public static void main(String[] args) {
		int [] sourceArr = {10,20,30};
		int [] destinationArr = sourceArr;
		
		destinationArr[0] = 250;
		for(int index = 0; index<sourceArr.length;index++) {
			System.out.println("value: "+sourceArr[index]);
			
		}
		
	}

}
