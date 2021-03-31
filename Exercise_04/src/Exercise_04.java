import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете две цели числа: ");
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		if (a > b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		int counter = 0;

		for (int i = a + 1; i < b; i++) {
			if (i % 5 == 0) {
				int nextDivider = i;
				do {
					counter++;
					nextDivider += 5;
				} while (nextDivider < b);
				break;
			}
		}

		System.out.printf("Броят на яислата между %d и %d които се делят на 5 без остатък е %d\n", a, b, counter);

	}
}
