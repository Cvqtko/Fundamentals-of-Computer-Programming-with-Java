import java.util.Arrays;

/* 8. Напишете програма, която намира най-често срещания елемент в масив. 
Пример: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3}  4 (5 пъти).*/
public class Exercise_08 {
	public static void main(String[] args) {
		int[] array = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };
		Arrays.sort(array);
		int number = array[1];
		int count = 1;
		int maxNumber = array[1];
		int maxCount = 1;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				count++;
			} else {
				number = array[i + 1];
				count = 1;
			}
			if (count > maxCount) {
				maxCount = count;
				maxNumber = number;

			}
		}
		System.out.println(maxNumber + " (" + maxCount + " times)");
	}
}
