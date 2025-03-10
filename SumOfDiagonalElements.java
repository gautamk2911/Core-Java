package twoDimensionalArray;

import java.util.Scanner;

public class SumOfDiagonalElements {

	// TODO Auto-generated method stub

	public static int sumOfDiagonals(int[][] matrix, int n) {
		int primarySum = 0, secondarySum = 0;

		for (int i = 0; i < n; i++) {
			primarySum += matrix[i][i]; // Primary diagonal (row = col)
			secondarySum += matrix[i][n - i - 1]; // Secondary diagonal (row + col = n - 1)
		}

		// If matrix size is odd, subtract the middle element (counted twice)
		if (n % 2 == 1) {
			secondarySum -= matrix[n / 2][n / 2];
		}

		return primarySum + secondarySum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter matrix size (n x n): ");
		int n = scanner.nextInt();

		int[][] matrix = new int[n][n];
		System.out.println("Enter matrix elements:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		int sum = sumOfDiagonals(matrix, n);
		System.out.println("Sum of diagonals: " + sum);

		scanner.close();
	}

}
