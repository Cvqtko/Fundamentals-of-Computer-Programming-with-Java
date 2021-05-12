
public class Swap {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		swap(a, b);
		System.out.println(a + " " + b);
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}
}
