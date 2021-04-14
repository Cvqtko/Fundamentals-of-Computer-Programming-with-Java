import java.util.Scanner;


public class Exercise_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Decimal number: ");
		int n = input.nextInt();
		input.close();
		String binary = "";
		while (n > 0) {
			int a = n % 2;
			binary = a + binary;
			n = n / 2;
		}
		System.out.println(binary);
	}
}
