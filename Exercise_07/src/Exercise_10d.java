import java.util.Scanner;


public class Exercise_10d {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the matrix: ");
		int n = input.nextInt(); // matrix size
		input.close();
		int matrix[][] = new int[n][n];
		int sum = 1;
		for (int i = n - 1, j = 0; i > 0; i--, j++) {
			for (int k = j; k < i; k++) {
				matrix[k][j] = sum++;
			}
			for (int k = j; k < i; k++) {
				matrix[i][k] = sum++;
			}
			for (int k = i; k > j; k--) {
				matrix[k][i] = sum++;
			}
			for (int k = i; k > j; k--) {
				matrix[j][k] = sum++;
			}
		}

		// special case for middle element if value of 'n' is odd
		if (n % 2 == 1) {
			matrix[(n - 1) / 2][(n - 1) / 2] = sum++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}