// 6. Да се напише програма, която преобразува десетично число в шестнадесетично.
public class Exercise_06 {
	public static void main(String[] args) {
		int n = 32;

		System.out.println(decimalToHex(n));
	}

	public static String decimalToHex(int dec) {
		int sizeOfIntInHalfBytes = 8;
		int numberOfBitsInAHalfByte = 4;
		int halfByte = 0x0F;
		String digits = "0123456789ABCDEF";

		StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
		hexBuilder.setLength(sizeOfIntInHalfBytes);
		for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {
			int j = dec & halfByte;
			hexBuilder.setCharAt(i, digits.charAt(j));
			dec >>= numberOfBitsInAHalfByte;
		}
		return hexBuilder.toString();
	}
}
