import java.util.Scanner;

public class Exercise_09 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		printMenu();
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			reverseNumber();
			break;
		case 2:
			avarage();
			break;
		case 3:
			solveEquation();
			break;
		default:
			System.out.println("Wrong choice.");
		}

	}

	public static void printMenu() {
		System.out.println("Choose an option from the menu: ");
		System.out.println("1 - Reverse an integer");
		System.out.println("2 - Calculate the average of array of numbers");
		System.out.println("3 - Find a solution for the equation a * x + b = 0");
	}

	public static void reverseNumber() {
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		while (number < 0) {
			System.out.println("The number must be positive.\nEnter an integer: ");
			number = input.nextInt();
		}
		String reversed = "";
		while (number != 0) {
			reversed += number % 10;
			number /= 10;
		}
		System.out.printf("Your number reversed is %s", reversed);
	}

	public static void avarage() {
		int entries = 0;
		double numberAverage = 0;
		double number = 0;
		System.out.println("Enter a number to calculate the average. Enter a letter to stop and calculate.");
		while (input.hasNextDouble()) {
			System.out.println("Enter a number to calculate the average. Enter a letter to stop and calculate.");
			number = input.nextDouble();
			numberAverage += number;
			entries++;
		}
		System.out.println("The average number is: " + numberAverage / entries);
	}

	public static void solveEquation() {
		System.out.println("Enter \"a\" form the equation a * x + b = 0");
		double a = input.nextDouble();
		double b;
		double x;
		while (a == 0) {
			System.out.println("A must be different than zero.\nEnter \\\"a\\\" form the equation a * x + b = 0");
			a = input.nextDouble();
		}
		System.out.println("Enter \"b\" form the equation a * x + b = 0");
		b = input.nextDouble();
		
		x = -b/a;
		System.out.println("The solution is x = " + x);
	}

}
