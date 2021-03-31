import java.math.BigDecimal;

public class BigDecimalForCurrency {

	public static void main(String[] args) {
		// Declare some variables
		float sum = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		BigDecimal bd1 = new BigDecimal("0.1");
		bd1 = bd1.add(new BigDecimal("0.1"));
		bd1 = bd1.add(new BigDecimal("0.1"));
		bd1 = bd1.add(new BigDecimal("0.1"));
		bd1 = bd1.add(new BigDecimal("0.1"));
		bd1 = bd1.add(new BigDecimal("0.1"));
		bd1 = bd1.add(new BigDecimal("0.1"));
		bd1 = bd1.add(new BigDecimal("0.1"));
		bd1 = bd1.add(new BigDecimal("0.1"));
		bd1 = bd1.add(new BigDecimal("0.1"));
		
		float num = 1.0f;
		BigDecimal bd2 = new BigDecimal("1.0");
		
		// Is sum equal to num
		boolean equal = (num == sum);
		int equal2 = (bd1.compareTo(bd2));
		
		// Print the result ot the console
		System.out.println("num = " + num + " sum = " + sum + " equal = " + equal);
		if (equal2 == 0)
			System.out.println("bd1 = " + bd1 + " bd2 = " + bd2 + " and they are equal");

	}

}
