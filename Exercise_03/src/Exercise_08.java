// 8. Напишете програма, която проверява дали дадена точка О (x, y) е вътре в окръжността К ((0,0), 5).
public class Exercise_08 {
	public static void main(String[] args) {
		double pointX = 4.0;
		double pointY = 3.1;

		System.out.println(Math.sqrt(Math.pow(pointX, 2) + Math.pow(pointY, 2)) <= 5
				? "Дадена точка О (x, y) е вътре в окръжността К ((0,0), 5)"
				: "Дадена точка О (x, y) не е вътре в окръжността К ((0,0), 5)");

	}
}
