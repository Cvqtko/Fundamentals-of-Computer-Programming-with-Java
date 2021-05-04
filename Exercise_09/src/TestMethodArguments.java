
public class TestMethodArguments {
	public static void main(String[] args) {
		printTotalAmountForBooks(3, 2.5);
		printTotalAmountForBooks(3, 5.1, 10, 4.5);
	}

	public static void printTotalAmountForBooks(double ...prices) {
		double totalAmount = 0;
		for (double singleBookPrice : prices) {
			totalAmount += singleBookPrice;
		}
		System.out.println("The total amount of all books is: " + totalAmount);
	}
}
