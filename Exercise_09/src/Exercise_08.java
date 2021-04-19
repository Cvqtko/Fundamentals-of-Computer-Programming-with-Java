import java.math.BigInteger;

public class Exercise_08 {
	public static void main(String[] args) {
		printFactorial(55);
	}

	public static void printFactorial(int number) {
		BigInteger factorial = new BigInteger("1");
		if (number < 1 || number > 100) {
			System.out.println("You have to enter a number between 1 and 100 inclusive");
		} else {
			for (BigInteger i = new BigInteger("1"); i.intValue() <= number; i = i.add(new BigInteger("1"))) {

				factorial = factorial.multiply(i);

			}
			System.out.printf("%d! = %d", number, factorial);

		}
	}
}
