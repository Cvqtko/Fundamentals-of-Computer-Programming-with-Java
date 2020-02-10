import java.util.Scanner;

// 14. Напишете програма, която преобразува дадено число от десетична в шестнайсетична бройна система.

public class Exercise_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Decimal number: ");
		int n = input.nextInt();
		input.close();

		String hex = Integer.toHexString(n);
		System.out.println(n + " -> " + hex);
	}
}
