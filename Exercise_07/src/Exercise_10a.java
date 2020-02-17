import java.util.Scanner;

/*�������� ��������, ����� ������� �������� ��������� ������� � �� ������� �� 
��������� ��� ���������� ���. �������� �� ��������� �� ������� �� ���������. ������ �� (4,4):
1	5	9	13	
2	6	10	14	
3	7	11	15	
4	8	12	16	
*/
public class Exercise_10a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the matrix: ");
		int row = input.nextInt();
		input.close();
		int col = row;
		int[][] matrix = new int[row][col];
		int sum = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[j][i] = sum;
				sum++;
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
