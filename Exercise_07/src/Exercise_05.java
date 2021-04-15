// 5. Напишете програма, която намира максималната редица от нарастващи елементи в масив. Пример: {3, 2, 3, 4, 2, 2, 4}  {2, 3, 4}.
public class Exercise_05 {

	public static void main(String[] args) {
		int[] array = { 3, 2, 3, 4, 2, 2, 4 };
		int count = 1;
		int start = 0;
		int maxStart = 0;
		int maxCount = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1] - 1) {
				count++;
				start = i + 1;
			} else {
				count = 1;
			}
			if (count > maxCount) {
				maxStart = start;
				maxCount = count;
			}

		}
		maxStart = maxStart - maxCount + 1;

		for (int i = maxStart; i < maxStart + maxCount; i++) {
			System.out.print(array[i] + " ");
		}

	}

}