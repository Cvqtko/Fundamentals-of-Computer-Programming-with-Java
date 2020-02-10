import java.util.Scanner;

// 16. Ќапишете програма, ко€то по дадено число N отпечатва случайно число между 1 и N.
public class Exercise_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		input.close();
		System.out.println("Random number between 1 and " + number + "->" + Math.ceil(Math.random() * number));
	}
}
