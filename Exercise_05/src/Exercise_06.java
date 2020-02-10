import java.util.Scanner;
/* 6. Напишете програма, която намира най-голямото по стойност число
измежду дадени 5 числа.*/
public class Exercise_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter five numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		input.close();
		if (a < b)
			a = b;
		if (a < c)
			a = c;
		if (a < d)
			a = d;
		if (a < e)
			a = e;
		System.out.println("The biggest number among the five is " + a);
	}
}
