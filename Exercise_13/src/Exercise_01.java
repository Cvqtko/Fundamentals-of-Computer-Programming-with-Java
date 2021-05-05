import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String text = input.nextLine();
		input.close();
		System.out.println("The reversed text is: " + reverseText(text));

	}

	public static String reverseText(String text) {
		StringBuilder reverse = new StringBuilder("");
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse.append(text.charAt(i));
		}
		return reverse.toString();
	}
}
