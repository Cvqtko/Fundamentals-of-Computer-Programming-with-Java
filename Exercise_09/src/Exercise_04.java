/* 4. Напишете метод, който намира колко пъти дадено число се среща в даден масив. 
Напишете програма, която проверява дали този метод работи правилно.*/
public class Exercise_04 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 3 };
		int number = 3;

		System.out.printf("The nuber %d occures %d times", number, occurrenceOfNumber(array, number));
	}

	public static int occurrenceOfNumber(int[] array, int number) {
		int occurence = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				occurence++;
			}
		}
		return occurence;
	}
}
