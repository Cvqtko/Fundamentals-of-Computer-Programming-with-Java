import java.math.BigInteger;

public class Exercise_01 {
	public static void main(String[] args) {
		int x1 = 151;
		int x2 = 35;
		int x3 = 43;
		int x4 = 251;
		double x5 = -0.41d;
		// double x5 = 0.41d;

		System.out.println(x1 + " in bits --> " + Integer.toBinaryString(x1));
		System.out.println(x2 + " in bits --> " + Integer.toBinaryString(x2));
		System.out.println(x3 + " in bits --> " + Integer.toBinaryString(x3));
		System.out.println(x4 + " in bits --> " + Integer.toBinaryString(x4));
		long bits = Double.doubleToLongBits(x5);

		System.out.println(x5 + " in bits --> " +Long.toBinaryString(bits));
		
		double doubleVal = Double.longBitsToDouble(new BigInteger(Long.toBinaryString(bits), 2).longValue());
		System.out.println(Long.toBinaryString(bits) + " in double --> " + doubleVal);
	}

}