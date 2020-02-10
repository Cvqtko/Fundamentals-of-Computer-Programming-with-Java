import java.util.Scanner;

/* 2. Напишете програма, която отпечатва на конзолата числата от 1 до N,
които не се делят на 3 и 7. Числото N се чете от стандартния вход.*/

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		input.close();
		if (n <= 0) {
			System.err.print("Number must be greater than 0");
		}
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 7 == 0)
				continue;
			System.out.print(i + " ");
		}
	}
}
