
public class Exercise_06 {
	public static void main(String[] args) {
		int[] array = { 1, 3, 3, 2, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 3 };
		System.out.println("The first element, bigger than his neighbours, is at position " + compareNumbers(array));
	}

	public static int compareNumbers(int[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				return i;
			}
		}
		return -1;
	}
}
