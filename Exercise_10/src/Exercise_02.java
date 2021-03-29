import java.util.Scanner;
/* 2. Напишете програма, която генерира всички вариации с повторение на n елемента от k-ти клас.
Примерен вход:
	n = 3
	к = 2
	Примерен изход:
	(1 1), (1 2), (1 3), (2 1), (2 2), (2 3), (3 1), (3 2), (3 3)
*/
public class Exercise_02 {
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
		getCombinations(0);

	}

	public static void getCombinations(int currentLoop) {
		if (currentLoop == numberOfLoops) {
			printLoops();
			return;
		}
		for (int counter = 1; counter <= numberOfIterations; counter++) {
			array[currentLoop] = counter;
			getCombinations(currentLoop + 1);
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
