import java.util.Scanner;

/* 8. Напишете програма, която за дадено цяло число N, пресмята сумата:
S = 1 +1!/x +2!/x2+ ... +n!/xn */

public class Exercise_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		System.out.print("x = ");
		int x = input.nextInt();
		input.close();
		double sum = 1;
		double factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial *= i;
			sum += factorial / Math.pow(x, i);
		}
		System.out.println("The sum of 1 +1!/x +2!/x2+ ... +n!/xn is " + sum);
	}
}
