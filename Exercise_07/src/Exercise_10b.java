import java.util.Scanner;

/*Напишете програма, която създава следните квадратни матрици и ги извежда на 
конзолата във форматиран вид. Размерът на матриците се въвежда от конзолата. Пример за (4,4):
1	8	9	16	
2	7	10	15	
3	6	11	14	
4	5	12	13	
*/
public class Exercise_10b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the matrix: ");
		int row = input.nextInt();
		input.close();
		int col = row;
		int[][] matrix = new int[row][col];
		int sum = 1;
		boolean switchColum = true;
		for (int i = 0; i < row; i++) {
			if (switchColum) {
				for (int j = 0; j < col; j++) {
					matrix[j][i] = sum;
					sum++;
					switchColum = false;
				}
			} else {
				for (int j = col - 1; j >= 0; j--) {
					matrix[j][i] = sum;
					sum++;
					switchColum = true;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
