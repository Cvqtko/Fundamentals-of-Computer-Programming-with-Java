
import java.util.Scanner;

// 10. Напишете метод, който умножава два многочлена.
public class Exercise_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter degree of your 1 polynomial: ");
		int degree = input.nextInt();
		double[] arr1 = new double[degree];
		System.out.println("Enter coefficient from higest to smallest [ax^n + bx^n-1 ... zx]:");
		for (int i = 0; i < degree; i++) {
			System.out.print("Enter the coefficient \" " + (char) ('a' + i) + "\" = ");
			arr1[i] = input.nextDouble();
		}

		System.out.println("Enter degree of your 2 polynomial: ");
		degree = input.nextInt();
		double[] arr2 = new double[degree];
		System.out.println("Enter coefficient from higest to smallest [ax^n + bx^n-1 ... zx]:");
		for (int i = 0; i < degree; i++) {
			System.out.print("Enter the coefficient \"" + (char) ('a' + i) + "\" = ");
			arr2[i] = input.nextDouble();
		}

		pritnResult(arr1, arr2);
		input.close();

	}

	static double[] multiplyArrays(double[] arr1, double[] arr2) {
		double[] multiArr = new double[arr1.length + arr2.length - 1];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				multiArr[i + j] = multiArr[i + j] + arr1[i] * arr2[j];

			}

		}
		return multiArr;
	}

	static void printPolynom(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (i != arr.length - 2 && i != arr.length - 1) {
					System.out.printf("%s%.2fx^%d", returnSign(arr[i]), arr[i], arr.length - i - 1);
				} else if (i == arr.length - 2) {
					System.out.printf("%s%.2fx", returnSign(arr[i]), arr[i]);

				} else if (i == arr.length - 1) {
					System.out.printf("%s%.2f", returnSign(arr[i]), arr[i]);
				}
			}
		}
	}

	static void pritnResult(double[] arr1, double[] arr2) {
		System.out.print("The result of (");
		printPolynom(arr1);
		System.out.print(")*(");
		printPolynom(arr2);
		System.out.print(") = ");
		printPolynom(multiplyArrays(arr1, arr2));
	}

	static String returnSign(double number) {
		return number > 0 ? "+" : "";
	}

}
