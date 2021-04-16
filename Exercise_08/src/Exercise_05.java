
public class Exercise_05 {
	public static void main(String[] args) {
		String s = "11001";
		System.out.println(binaryToInt(s));

	}

	public static int binaryToInt(String s) {
		int decimal = 0, p = 0;

		while (s.length()!=0) {
			decimal += Integer.parseInt(s.substring(s.length()-1)) * Math.pow(2, p);
			s = s.substring(0, s.length() - 1);
			p++;
		}

		return decimal;
	}
}
