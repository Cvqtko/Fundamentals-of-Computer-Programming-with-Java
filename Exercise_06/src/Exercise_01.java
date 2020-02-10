import java.util.Scanner;

// 1. Напишете програма,която отпечатва на конзолата числата от 1 до N.Числото N се чете от стандартния вход.

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		input.close();
		if (n <= 0) {
			System.err.print("Number must be greater than 0");
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
}
