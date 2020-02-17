// 9. Да се напише програма, която преобразува двоично число в шестна-десетично.
public class Exercise_09 {
	public static void main(String[] args) {
		String s = "11001";

		System.out.println(binaryTohex(s));

	}

	public static String binaryTohex(String s) {
		int decimal = 0, p = 0;

		while (s.length() != 0) {
			decimal += Integer.parseInt(s.substring(s.length() - 1)) * Math.pow(2, p);
			s = s.substring(0, s.length() - 1);
			p++;
		}

		int sizeOfIntInHalfBytes = 8;
		int numberOfBitsInAHalfByte = 4;
		int halfByte = 0x0F;
		String digits = "0123456789ABCDEF";

		StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
		hexBuilder.setLength(sizeOfIntInHalfBytes);
		for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {
			int j = decimal & halfByte;
			hexBuilder.setCharAt(i, digits.charAt(j));
			decimal >>= numberOfBitsInAHalfByte;
		}
		return hexBuilder.toString();
	}

}