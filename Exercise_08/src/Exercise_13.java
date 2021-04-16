
public class Exercise_13 {
	public static void main(String[] args) {
		float fNumber = 5.3f;
		double dNumber = 5.3d;
		mantisAndExponentFloat(fNumber);
		System.out.println();
		mantisAndExponentDouble(dNumber);

	}

	public static void mantisAndExponentFloat(float number) {
		long bits = Double.doubleToLongBits(number);
		boolean negative = (bits & 0x8000000000000000L) != 0;
		long exponent = bits & 0x7ff0000000000000L;
		long mantissa = (bits & 0x000fffffffffffffL) | 0x3ff0000000000000L;
		System.out.println("negative: " + negative);
		System.out.println("exponent: " + Double.longBitsToDouble(exponent));
		System.out.println("mantissa: " + Double.longBitsToDouble(mantissa));

	}

	public static void mantisAndExponentDouble(double number) {
		long bits = Double.doubleToLongBits(number);
		boolean negative = (bits & 0x8000000000000000L) != 0;
		long exponent = bits & 0x7ff0000000000000L;
		long mantissa = (bits & 0x000fffffffffffffL) | 0x3ff0000000000000L;
		System.out.println("negative: " + negative);
		System.out.println("exponent: " + Double.longBitsToDouble(exponent));
		System.out.println("mantissa: " + Double.longBitsToDouble(mantissa));

	}

}
