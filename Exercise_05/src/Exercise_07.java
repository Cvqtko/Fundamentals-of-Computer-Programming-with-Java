import java.util.Arrays;

public class Exercise_07 {
	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int[] array;
	public static boolean foundZeroSum = false;
	public static int[] numbers = {-2, -1, 1};

	public static void main(String[] args) {
		numberOfIterations = numbers.length;
		for (numberOfLoops = 1; numberOfLoops <= numberOfIterations; numberOfLoops++) {
			array = new int[numberOfLoops];
			getCombinations(0, 0);
		}
		if (!foundZeroSum) {
			System.out.println(Arrays.toString(numbers) + ", there are no subsets with zero sum.");
		}
	}

	public static void getCombinations(int currentLoop, int start) {
		if (currentLoop == numberOfLoops) {
			checkSum();
			return;
		}
		for (int counter = start; counter < numberOfIterations; counter++) {
			array[currentLoop] = counter;
			getCombinations(currentLoop + 1, counter + 1);
		}
	}

	public static void checkSum() {
		int sum = 0;
		for (int i = 0; i < numberOfLoops; i++) {
			sum += numbers[array[i]];
		}
		if (sum == 0) {
			foundZeroSum = true;
			printSum();
		}
	}

	public static void printSum() {
		for (int i = 0; i < numberOfLoops; i++) {
			if (i == 0)
				System.out.print(numbers[array[i]]);
			else
				System.out.print(numbers[array[i]] >= 0 ? "+" + numbers[array[i]] : numbers[array[i]]);
		}
		System.out.println("=0");
	}
}
