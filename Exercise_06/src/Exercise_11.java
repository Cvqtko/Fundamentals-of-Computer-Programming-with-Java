import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_11 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("N = ");
		int n = input.nextInt();
		input.close();
		BigInteger factorial = new BigInteger("1");
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		while (factorial.remainder(BigInteger.valueOf(10)) == BigInteger.valueOf(0)) {
			counter++;
			factorial = factorial.divide(BigInteger.valueOf(10));
		}
		System.out.println("N! = " + (factorial.multiply(BigInteger.valueOf((long) Math.pow(10, counter)))) + " -> " + counter);
	}
}
