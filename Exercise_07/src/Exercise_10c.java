import java.util.Scanner;

public class Exercise_10c {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the matrix: ");
		int n = input.nextInt(); // matrix size
		input.close();
		int matrix[][] = new int[n][n];
		int sum = 1;

		for (int i = n - 1; i > 0; i--) {
			for (int k = i, l = 0; k < n; k++, l++) {
				matrix[k][l] = sum;
				sum++;
			}
		}
		for (int j = 0; j < n; j++) {
			for (int k = j, l = 0; k < n; k++, l++) {
				matrix[l][k] = sum;
				sum++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}