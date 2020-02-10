import java.util.Scanner;

/* 8. Напишете програма, която прилага бонус точки към дадени точки в
интервала [1..9] чрез прилагане на следните правила:
- Ако точките са между 1 и 3, програмата ги умножава по 10.
- Ако точките са между 4 и 6, ги умножава по 100.
- Ако точките са между 7 и 9, ги умножава по 1000.
- Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.*/
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
