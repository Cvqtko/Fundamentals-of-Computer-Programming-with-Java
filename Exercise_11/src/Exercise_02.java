import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side \"a\" of right triangle: ");
		double sideA = input.nextDouble();
		System.out.print("Enter side \"b\" of right triangle: ");
		double sideB = input.nextDouble();
		input.close();
		double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
		
		System.out.println("The hypotenuse of the triangle is = " + sideC);
	}
}
