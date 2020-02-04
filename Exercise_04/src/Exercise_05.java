import java.util.Scanner;
/* 5. Напишете програма, която чете от конзолата две цели числа и отпечатва по-голямото от тях. 
Реализирайте програмата без използването на сравнение. Забележка: задачата изисква малко да помислите!*/
public class Exercise_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведете две цели числа: ");
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
