/*11. Да се напише програма, която създава правоъгълна матрица с размер (n, m). 
Размерността и елементите на матрицата да се четат от конзолата.
Да се намери подматрицата с размер (3,3), която има максимална сума.*/
public class Exercise_11 {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 1, 1, 1, 1, 1, 1 }, // row 0 values
				{ 1, 1, 1, 1, 1, 1 }, // row 1 values
				{ 1, 1, 1, 1, 1, 1 }, // row 2 values
				{ 1, 1, 2, 2, 1, 3 }, // row 3 values
				{ 1, 1, 1, 1, 2, 1 }, // row 4 values
				{ 1, 1, 2, 1, 2, 2 }, // row 5 values
		};
		if (matrix.length < 3 || matrix[0].length < 3) {
			System.out.println(
					"Wrong entry. You have to enter a matrix with more than 2 elements in each row and column");
			System.exit(0);
		}
		int sum = 0;
		int row = 0;
		int column = 0;
		int maxRow = 0;
		int maxColumn = Integer.MIN_VALUE;
		int maxSum = 0;

		for (int i = 0; i < matrix.length - 2; i++) {
			for (int j = 0; j < matrix[0].length - 2; j++) {
				row = i;
				column = j;
				sum = 0;
				for (int i2 = i; i2 < i + 3; i2++) {
					for (int j2 = j; j2 < j + 3; j2++) {
						sum += matrix[i2][j2];
					}
				}
				if (sum > maxSum) {
					maxSum = sum;
					maxColumn = column;
					maxRow = row;
				}
			}
		}
		System.out.println("The submatrix with size [3;3] and maximum sum is:");
		for (int i = maxRow; i < maxRow + 3; i++) {
			for (int j = maxColumn; j < maxColumn + 3; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("The maximum sum is: " + maxSum);

	}
}
