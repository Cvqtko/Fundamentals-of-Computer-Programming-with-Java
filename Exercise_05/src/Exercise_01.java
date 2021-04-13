
public class Exercise_01 {
	public static void main(String[] args) {
		int a = 6;
		int b = 5;
		if (a > b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
	}
}
