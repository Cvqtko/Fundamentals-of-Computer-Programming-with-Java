import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете радиус на кръг: ");
		double r = input.nextDouble();
		double pi = Math.PI;
		input.close();
		System.out.printf("Периметърът на кръга е - %f. Обиколката му е - %f.",pi*Math.pow(r, 2), 2*pi*r);
		
	}
}
