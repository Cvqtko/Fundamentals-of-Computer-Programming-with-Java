import java.util.Scanner;

/* 10. �������� ��������, ����� ���� �� ��������� ����������� ���� ����� N
(N < 20) � ��������� ������� � ����� ���� �� �������� ��-����: 
			N = 3			N = 4
			1 2 3			1 2 3 4
			2 3 4			2 3 4 5
			3 4 5			3 4 5 6
     						4 5 6 7

*/
public class Exercise_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		input.close();
		for (int row = 1; row <= n; row++) {
			for (int col = row; col < row + n; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

}
