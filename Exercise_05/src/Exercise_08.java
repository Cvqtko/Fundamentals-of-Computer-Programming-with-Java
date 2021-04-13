import java.util.Scanner;

public class Exercise_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter points in the interval [1..9]");
		int points = input.nextInt();
		input.close();
		switch (points) {
		case 1:
		case 2:
		case 3:
			System.out.println("Your bonus points are " + points * 10);
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Your bonus points are " + points * 100);
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Your bonus points are " + points * 1000);
			break;
		default:
			System.err.println("The entered points are not between 0 and 9.");
		}

	}
}
