import java.util.Scanner;
/* 5. Напишете програма, която при въвеждане на коефициентите (a, b и c)
на квадратно уравнение: 2 ax bx c , изчислява и извежда неговите
реални корени.*/
public class Exercise_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter \"a\" for the quadratic equation ax2+bx+c");
		double a = input.nextDouble();
		System.out.println("Please enter \"b\" for the quadratic equation ax2+bx+c");
		double b = input.nextDouble();
		System.out.println("Please enter \"c\" for the quadratic equation ax2+bx+c");
		double c = input.nextDouble();
		input.close();
		double x1;
		double x2;

		double d = Math.pow(b, 2) - 4 * a * c;
		System.out.println(d);
		if (d < 0) {
			System.out.printf("The quadratic equation %.1fx2+%.1fx+%.1f has no real roots\n", a, b, c);
		} else if (d == 0) {
			x1 = -b / (2 * a);
			System.out.printf("The quadratic equation %.1fx2+%.1fx+%.1f has one real root - x1 = %f\n", a, b, c, x1);
		} else {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.printf("The quadratic equation %.1fx2+%.1fx+%.1f has two real roots - x1 = %f, x2 = %f\n", a, b,
					c, x1, x2);
		}
	}
}
