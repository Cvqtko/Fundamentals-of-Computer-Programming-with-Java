// 2. Ќапишете програма, ко€то показва знака (+ или -) от частното на две реални числа, без да го пресм€та.
public class Exercise_02 {
	public static void main(String[] args) {
		int a = -6;
		int b = 5;
		if (a > 0 && b > 0 || a < 0 && b < 0) {
			System.out.println("The quotient is a positive number");
		} else {
			System.out.println("The quotient is a negative number");
		}
	}
}
