import java.util.Scanner;

// 9. В комбинаториката числата на Каталан(Catalan’s numbers)се изчисляват по следната формула:Cn=(2 n)!/(n+1)!*n!за n>0;

public class Exercise_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		input.close();
		long divisible = 1;
		long divisor = 1;
		for (int i = 1; i <= 2 * n; i++) {
			divisible = divisible * i;
			if (i <= n) {
				divisor *= i;
			}
		}
		double nThCatalan = divisible / (divisor * divisor * (n + 1));
		System.out.println("The " + n + "-th Catalan number is " + nThCatalan);
	}
}
