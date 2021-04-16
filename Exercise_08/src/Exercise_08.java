
public class Exercise_08 {
	public static void main(String[] args) {
		String hexadecimal = "FFFFFFE0";

		System.out.println(hexadecimal + " to binary --> " + hexToBinary(hexadecimal));

	}

	public static String hexToBinary(String s) {
		String digits = "0123456789ABCDEF";
		String hexTobinary = "";
		for (int i = 0; i < s.length(); i++) {
			int n = digits.indexOf(s.charAt(i));
			String bit = "";
			for (int j = 0; j < 4; j++) {
				bit = ((n % 2) == 0 ? "0" : "1") + bit;
				n = n / 2;
			}
			hexTobinary = hexTobinary + bit;
		}
		return hexTobinary;
	}


}
