/* 4. Напишете програма, която отпечатва всички подмножества на дадено множество от думи.
Примерен вход:
words = {'test', 'rock', 'fun'}
Примерен изход:
(), (test), (rock), (fun), (test rock), (test fun),
(rock fun), (test rock fun)*/
public class Exercise_04 {
	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int[] array;
	public static boolean firstPrint = true;
	public static String[] strings = { "test", "rock", "fun", "run" };

	public static void main(String[] args) {
		numberOfIterations = strings.length;
		for (numberOfLoops = 0; numberOfLoops <= strings.length; numberOfLoops++) {
			array = new int[numberOfLoops];
			getCombinations(0, 0);
		}
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
