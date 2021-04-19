import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		input.close();
		System.out.println("The biggest number you`ve entered is: " + getMax(getMax(number1, number2), number3));
	}

	public static int getMax(int number1, int number2) {
		return number1 > number2 ? number1 : number2;
	}
}
