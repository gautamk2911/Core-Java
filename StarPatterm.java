package starPatterns;

import java.util.Iterator;

public class StarPatterm {
	public static void main(String[] args) {
		// ****
		for(int i = 1; i <= 4; i++) {
			System.out.print("* ");
		}
		System.out.println("\n");
		
		/* ****
		    ****
		    ****
		 */
		for(int j = 1;j<=4;j++) {
			for(int i = 1; i <= 4; i++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n");
		/*
		 1 2 3 4
		 2 3 4 5
		 3 4 5 6
		 4 5 6 7
		 */
		for(int i = 1;i<=4;i++) {
			for(int j = 1;j<=4;j++) {
				int k = i+j-1;
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		/*
		 1 2 3 4
		 2 3 4 1
		 3 4 1 2
		 4 1 2 3
		 */
		for(int i=1;i<=4;i++) {
			for(int j = 1;j<=4;j++) {
				int k =i+j-1;
				if(k>4) {
					k=k-4;
				}
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		/*
		 j ->
	   i * * * *
	   | *       *
		 *       *
		 * * * *
		 */
		for(int i=1;i<=4;i++) {
			for (int j = 1; j <= 4; j++) {
				if(i==1 || i==4 || j ==1||j==4) {
					System.out.print("* ");
				} else {
					System.out.print("   "); //3 spaces
				}
			}
			System.out.println();
		}
	}
}
