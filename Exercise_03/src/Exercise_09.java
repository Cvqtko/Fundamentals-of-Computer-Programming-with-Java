/* 9. Напишете програма, която проверява дали дадена точка О (x, y) 
е вътре в окръжността К ((0,0), 5) и е извън правоъгълника ((-1, 1), (5, 5).*/
public class Exercise_09 {
	public static void main(String[] args) {
		double pointX = 4;
		double pointY = 4;
		boolean insideTheCircle = Math.sqrt(Math.pow(pointX, 2) + Math.pow(pointY, 2)) <= 5 ? true : false;

		boolean outsideOtTheRectangle = ((pointX < -1) || (pointX > 5)) || ((pointY < 1) || (pointY > 5));

		System.out.println((insideTheCircle && outsideOtTheRectangle)
				? "Дадената точка О (x, y) е вътре в окръжността К ((0,0), 5) и е извън правоъгълника ((-1, 1), (5, 5))"
				: outsideOtTheRectangle ? "Дадената точка О (x, y) не е вътре в окръжността К ((0,0), 5)"
						: insideTheCircle ? "Дадената точка О (x, y) е в правоъгълника ((-1, 1), (5, 5))"
								: "Дадената точка О (x, y) не е в окръжността К ((0,0), 5) и е в правоъгълника ((-1, 1), (5, 5))");

	}
}
