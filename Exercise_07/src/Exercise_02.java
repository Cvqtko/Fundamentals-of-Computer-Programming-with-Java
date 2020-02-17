import java.util.Arrays;
import java.util.Scanner;

// 2. ƒа се напише програма, ко€то чете два масива от конзолата и провер€ва дали са еднакви.
public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of first array");
		int n = input.nextInt();
		int[] array1 = new int[n];
		System.out.println("Enter elements for the first array");
		for (int i = 0; i < n; i++) {
			array1[i] = input.nextInt();
		}
		System.out.println("Enter length of second array");
		n = input.nextInt();
		int[] array2 = new int[n];
		System.out.println("Enter elements for the second array");
		for (int i = 0; i < n; i++) {
			array2[i] = input.nextInt();
		}
		input.close();
		boolean equal = true;
		if (array1.length != array2.length) {
			System.out.println("Arrays are not equal");
		} else {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					equal = false;
				}
			}
			System.out.println("Arrays: \n" + Arrays.toString(array1) + "\n" + Arrays.toString(array2));
			System.out.println(equal ? "are equal" : "are not equal");
		}

	}
}
