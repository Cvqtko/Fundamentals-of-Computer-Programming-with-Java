import java.util.Scanner;

public class Exercise_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a = ");
		int a = input.nextInt();
		System.out.printf("Enter b = ");
		int b = input.nextInt();
		System.out.printf("Enter c = ");
		int c = input.nextInt();
		System.out.printf("Enter d = ");
		int d = input.nextInt();
		System.out.printf("Enter e = ");
		int e = input.nextInt();
		input.close();
		System.out.println("Сумата на петте числа е: " + (a + b + c + d + e));
	}
}
