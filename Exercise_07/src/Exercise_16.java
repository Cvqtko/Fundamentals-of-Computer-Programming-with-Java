
public class Exercise_16 {
	public static void main(String[] args) {

		int range = 10_000_000;
		int counter = 1;
		for (int number = 1; number <= range; number++) {

			boolean prime = true;
			for (int divider = 2; divider <= Math.sqrt(number); divider++) {
				if (number % divider == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.printf("%d ", number);
				counter++;
			}
			if (counter == 50) {
				System.out.println();
				counter = 1;
			}
		}
	}
}
