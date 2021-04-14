import java.util.Scanner;


public class Exercise_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("N = ");
		int n = input.nextInt();
		System.out.print("K = ");
		int k = input.nextInt();
		input.close();
		long divisible = 1;
		long divisor = 1;
		if (k < n && k > 0 && n > 0) {
			for (int i = 1; i <= n; i++) {
				divisible *= i;
				if (i == k) {
					divisible = divisible * divisible;
				}
				if (i <= n - k) {
					divisor *= i;
				}
			}

			System.out.println("N!*K!/(N-K)! = " + divisible / divisor);

		} else {
			System.out.println("Not a valid entry");
		}
	}
}
