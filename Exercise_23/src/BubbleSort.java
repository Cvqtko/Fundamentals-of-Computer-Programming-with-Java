import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 19, 18, 15, 12, 1, 2, 14, 10, 9, 8, 5, 1, 0 };
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void bubbleSort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
