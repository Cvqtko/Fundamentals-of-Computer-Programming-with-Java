import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете две цели числа: ");
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		int z, i, max;
		z = a - b;
		i = (z >> 31) & 1;
		max = a - i * z;
		System.out.println(max + " е по-голямото число!");
		
	}
}
