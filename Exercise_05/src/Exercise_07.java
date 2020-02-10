import java.util.Arrays;

/* 7. Дадени са няколко цели числа. Напишете програма, която намира онези
подмножества от тях, които имат сума 0. Примери:
- Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
- Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.*/
public class Exercise_07 {
	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int[] array;
	public static boolean foundZeroSum = false;
	public static int[] numbers = { 3, 1, -7 };

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
