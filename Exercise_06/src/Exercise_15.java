import java.util.Scanner;

// 15. Напишете програма, която преобразува дадено число от шестнайсе-тична в десетична бройна система.
public class Exercise_15 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Hexadecimal number: ");
		String hex = input.nextLine();
		input.close();
		int decimal = Integer.parseInt(hex, 16);
		System.out.println(hex + " -> " + decimal);
	}
}
