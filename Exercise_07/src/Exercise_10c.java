import java.util.Scanner;

/*Напишете програма, която създава следните квадратни матрици и ги извежда на 
конзолата във форматиран вид. Размерът на матриците се въвежда от конзолата. Пример за (4,4):
7	11	14	16	
4	8	12	15	
2	5	9	13	
1	3	6	10	
*/
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