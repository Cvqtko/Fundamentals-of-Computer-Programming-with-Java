// 13. Да се реализира двоично търсене (binary search) в сортиран целочислен масив.
public class Exercise_13 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(binarySearch(array, 3));
	}

	public static int binarySearch(int[] array, int searchedElement) {
		int first = 0;
		int last = array.length - 1;
		int middle;

		while (first <= last) {
			middle = (first + last) / 2;
			if (array[middle] < searchedElement) {
				first = middle + 1;
			} else if (array[middle] > searchedElement) {
				last = middle - 1;
			} else {
				return middle;
			}
		}
		return -1;
	}
}
