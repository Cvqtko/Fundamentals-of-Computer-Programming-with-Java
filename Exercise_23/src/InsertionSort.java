import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {

		// int[] array = { 19, 18, 15, 12, 1, 2, 14, 10, 9, 8, 5, 1, 0 };
		int[] array = { 19, 18, 15, 12, 1 };
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
				System.out.println(Arrays.toString(arr));
			}
			arr[j + 1] = key;
		}

	}
}
