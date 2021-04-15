import java.util.Scanner;

public class Exercise_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String word = input.nextLine();
		input.close();
		char[] wordToChar = word.toCharArray();

		char[] alphabet = new char[26];
		for (int i = 97; i < 123; i++) {
			alphabet[-97 + i] = (char) i;
		}

		System.out.print("The indexes: ");
		for (char c : wordToChar) {
			for (int i = 0; i < alphabet.length; i++) {
				if (c == alphabet[i]) {
					System.out.print(c + "[" + i + "] ");
					break;
				}
			}
		}

	}
}
