import java.util.Scanner;

/* 3. Напишете програма, която чете от конзолата поредица от цели числа и
 отпечатва най-малкото и най-голямото от тях.*/
public class Exercise_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some numbers number. You can stop entering numbers by pressing \"s + Enter\"");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		String s = input.nextLine();

		while (!s.equals("s")) {
			int number = Integer.parseInt(s);
			if (min > number)
				min = number;
			if (max < number)
				max = number;
			s = input.nextLine();
		}
		input.close();
		System.out.printf("The smallest number is %d, the largest number is %d", min, max);
	}
}
