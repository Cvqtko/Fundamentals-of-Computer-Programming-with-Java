import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		input.close();
		int fib0 = 0;
		int fib1 = 1;
		int sum = 0;
		int result = 0;

		for (int i = 1; i < n; i++) {
			result = fib0 + fib1;
			sum += fib1;
			fib0 = fib1;
			fib1 = result;
		}
		System.out.printf("The sum of the first %d numbers of the fibonnachi sequence is %d ", n, sum);
	}
}
