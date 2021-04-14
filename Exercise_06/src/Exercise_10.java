import java.util.Scanner;


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
