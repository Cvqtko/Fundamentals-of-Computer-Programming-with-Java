import java.util.Arrays;
import java.util.Scanner;
/* 6. Напишете програма, която генерира и отпечатва пермутациите на числата 1, 2, …, n, за дадено цяло число n.
	Примерен вход:
	n = 3
	Примерен изход:
	(1, 2, 3), (1, 3, 2), (2, 1, 3), (2, 3, 1), (3, 1, 2), (3, 2, 1)*/
public class Exercise_06 {
	public static boolean firstPrint = true;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		input.close();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}

		permutate(array, 0);
		System.out.println("\n" + Arrays.toString(array));
	}

	public static void permutate(int[] arr, int index) {
		if (index == arr.length) {
			printArray(arr);
			return;
		} else {
			for (int i = index; i < arr.length; i++) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				permutate(arr, index + 1);
				temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
	}

	public static void printArray(int[] array) {
		if (firstPrint)
			System.out.print("(");
		else
			System.out.print(", (");

		for (int i = 0; i < array.length; i++) {
			if (i == 0)
				System.out.print(array[i]);
			else
				System.out.printf(", " + array[i]);
		}
		System.out.print(")");
		firstPrint = false;
	}
}
