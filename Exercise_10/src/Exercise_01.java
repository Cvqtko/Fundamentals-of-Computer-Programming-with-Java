import java.util.Scanner;

/* Напишете програма, която генерира и отпечатва всички комбинации с повторение на k елемента над n-елементно множество.
	Примерен вход:
	n = 3
	к = 2
	Примерен изход:
(1 1), (1 2), (1 3), (2 2), (2 3), (3 3)*/
public class Exercise_01 {
	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int[] array;
	public static boolean firstPrint = true;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("N = ");
		numberOfIterations = input.nextInt();
		System.out.print("K = ");
		numberOfLoops = input.nextInt();
		input.close();
		array = new int[numberOfLoops];
		getCombinations(0, 1);

	}

	public static void getCombinations(int currentLoop, int start) {
		if (currentLoop == numberOfLoops) {
			printLoops();
			return;
		}
		for (int counter = start; counter <= numberOfIterations; counter++) {
			array[currentLoop] = counter;
			getCombinations(currentLoop + 1, counter);
		}
	}

	public static void printLoops() {
		if (firstPrint)
			System.out.print("(");
		else
			System.out.print(", (");

		for (int i = 0; i < numberOfLoops; i++) {
			if (i == numberOfLoops - 1)
				System.out.printf("%d", array[i]);
			else
				System.out.printf("%d ", array[i]);
		}
		System.out.print(")");
		firstPrint = false;
	}
}
