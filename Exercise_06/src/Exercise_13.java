import java.util.Scanner;

// 13. Напишете програма, която преобразува дадено число от двоична в десетична бройна система.

public class Exercise_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Binary number: ");
		String binary = input.nextLine();
		input.close();
		int decimal = Integer.parseInt(binary, 2);
		System.out.println(binary + " -> " + decimal);
	}
}
