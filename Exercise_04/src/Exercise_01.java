import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете 3 числа");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		System.out.println("Сумата на трите числа е " + (a + b + c));

	}
}
