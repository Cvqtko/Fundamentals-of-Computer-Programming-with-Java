// 3. Напишете програма, която намира най-голямото по стойност число, измежду три дадени числа.
public class Exercise_03 {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 7;
		int num3 = 1;

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is the greatest among the three numbers");
			} else {
				System.out.println(num3 + " is the greatest among the three numbers");
			}
		} else if (num2 > num3)
			System.out.println(num2 + " is the greatest among the three numbers");
		else
			System.out.println(num3 + " is the greatest among the three numbers");
	}

}
