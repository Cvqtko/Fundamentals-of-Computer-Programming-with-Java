import java.util.Arrays;
import java.util.Scanner;



public class Exercise_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете N");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Въведете елементите на масива");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("Въведете K");
		int k = input.nextInt();
		input.close();
		Arrays.sort(array);

		System.out.println("Елементите с максимална сума са: ");
		for (int i = array.length - 1; i > array.length - 1 - k; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
