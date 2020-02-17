import java.util.Arrays;

/*7. Сортиране на масив означава да подредим елементите му в нарастващ (намаляващ) ред. Напишете програма, която сортира масив.
Да се използва алгоритъма "Selection sort".*/
public class Exercise_07 {
	public static void main(String[] args) {
		int[] array = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3, 0 };

		for (int i = 0; i < array.length - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[min_idx] > array[j]) {
					min_idx = j;
				}
			}
			int temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
