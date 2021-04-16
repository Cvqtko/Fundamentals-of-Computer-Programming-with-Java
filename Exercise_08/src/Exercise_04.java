
public class Exercise_04 {
	public static void main(String[] args) {
		System.out.println(intToBinary(32));
	}

	public static String intToBinary(int n) {
		if (n == 0) {
			return "0";
		}
		String s = "";
		if (n < 0) {
			n = (int) (Math.pow(2, 16) + n);
		}

		while (n > 0) {
			s = ((n % 2) == 0 ? "0" : "1") + s;
			n = n / 2;
		}
		return s;
	}
}
