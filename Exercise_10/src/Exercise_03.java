import java.util.Scanner;
/* 3. Нека е дадено множество от символни низове. Да се напише програма, 
която генерира всички подмножества съставено от k на брой символни низа, избрани измежду елементите на това множество.
Примерен вход:
strings = {'test', 'rock', 'fun'}
k = 2
Примерен изход:
(test rock), (test fun), (rock fun)*/

public class Exercise_03 {
	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int[] array;
	public static boolean firstPrint = true;
	public static String[] strings = { "a", "b", "c", "d", "f" };
	public static int k;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		numberOfIterations = strings.length;
		System.out.print("K = ");
		numberOfLoops = input.nextInt();
		input.close();
		array = new int[numberOfLoops];
		getCombinations(0, 0);

	}

	public static void getCombinations(int currentLoop, int start) {
		if (currentLoop == numberOfLoops) {
			printLoops();
			return;
		}
		for (int counter = start; counter < numberOfIterations; counter++) {
			array[currentLoop] = counter;
			getCombinations(currentLoop + 1, counter + 1);
		}
	}

	public static void printLoops() {
		if (firstPrint)
			System.out.print("(");
		else
			System.out.print(", (");

		for (int i = 0; i < numberOfLoops; i++) {
			if (i == numberOfLoops - 1)
				System.out.printf("%s", strings[array[i]]);
			else
				System.out.printf("%s ", strings[array[i]]);
		}
		System.out.print(")");
		firstPrint = false;
	}
}
