import java.math.BigInteger;
import java.util.Scanner;

/* 11. Напишете програма, която пресмята на колко нули завършва факто-
риела на дадено число. Примери:
	N = 10 -> N! = 3628800 -> 2
	N = 20 -> N! = 2432902008176640000 -> 4*/
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
