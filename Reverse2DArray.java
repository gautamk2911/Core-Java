package twoDimensionalArray;

public class Reverse2DArray {
	public static void main(String[] args) {
		int[][] twoDarray = {{10, 20, 30, 40}, {70, 80, 90, 66},{45,85,96,74}};
		System.out.println("Before Reversal :");
        for(int i=0;i<twoDarray.length;i++) {
        	for(int j = 0;j<twoDarray[i].length;j++) {
        		System.out.print(twoDarray[i][j]+"  ");
        	}
        	System.out.println();
        }
        System.out.println("After Reversal: ");
        int row = 2; 
        int[][] newArr = new int[3][4];
       
        for(int[] i : twoDarray) {
        	int col = i.length-1;
        	for(int j : i) {
        		newArr[row][col] = j;
        		System.out.print(twoDarray[row][col]+"  ");
        		col--;
        	}
        	row--;
        	System.out.println();
        }
        
	}
}
