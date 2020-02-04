import java.util.Scanner;
// 1. Напишете програма, която чете от конзолата три числа от тип int и отпечатва тяхната сума.
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете три числа от тип int");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		System.out.println("Сумата на трите числа е " + (a + b + c));

	}
}
