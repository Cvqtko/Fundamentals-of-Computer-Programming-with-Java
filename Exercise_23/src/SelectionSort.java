import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = { 19, 18, 15, 12, 1, 2, 14, 10, 9, 8, 5, 1, 0 };
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minimum = array[i];
			int minimumPosition = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < minimum) {
					minimum = array[j];
					minimumPosition = j;
				}
			}
			int temp = array[i];
			array[i] = array[minimumPosition];
			array[minimumPosition] = temp;
		}
	}
}
