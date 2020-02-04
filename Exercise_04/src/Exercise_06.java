import java.util.Scanner;
// 6. Напишете програма, която чете пет числа и отпечатва тяхната сума. 
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
		System.out.println("Сбора на числата е: " + (a + b + c + d + e));
	}
}
