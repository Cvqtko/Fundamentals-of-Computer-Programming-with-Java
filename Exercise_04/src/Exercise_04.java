import java.util.Scanner;
/* 4. Напишете програма, която чете от конзолата две цели числа (integer) и отпечатва, колко числа има между тях,
такива, че остатъкът им от деленето на 5 да е 0.*/
public class Exercise_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете две цели числа: ");
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

		System.out.printf("Броя на числата кратни на 5 между %d и %d е %d\n", a, b, counter);

	}
}
