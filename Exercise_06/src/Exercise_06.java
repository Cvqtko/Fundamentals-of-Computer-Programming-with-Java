import java.util.Scanner;

public class Exercise_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("N = ");
		int n = input.nextInt();
		System.out.print("K = ");
		int k = input.nextInt();
		input.close();
		long result = 1;
		while (n > k) {
			result *= n;
			n--;
		}
		System.out.println("N!/K! = " + result);
	}
}
