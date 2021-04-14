import java.util.Scanner;

public class Exercise_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		input.close();
		System.out.println("Random number between 1 and " + number + "->" + Math.ceil(Math.random() * number));
	}
}
