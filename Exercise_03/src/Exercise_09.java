
public class Exercise_09 {
	public static void main(String[] args) {
		double pointX = 4;
		double pointY = 4;
		boolean insideTheCircle = Math.sqrt(Math.pow(pointX, 2) + Math.pow(pointY, 2)) <= 5 ? true : false;

		boolean outsideOtTheRectangle = ((pointX < -1) || (pointX > 5)) || ((pointY < 1) || (pointY > 5));

		System.out.println((insideTheCircle && outsideOtTheRectangle)
				? "Точката с координати x="+pointX+" y=" +pointY+ " е в окръжността ((0,0), 5) и извън правоъгълник с координати ((-1, 1), (5, 5))"
				: outsideOtTheRectangle ? "Точката с координати x="+pointX+" y=" +pointY+ " не е в окръжността ((0,0), 5)"
						: insideTheCircle ? "Точката с координати x="+pointX+" y=" +pointY+ " е в правоъгълник с координати ((-1, 1), (5, 5))"
								: "Точката с координати x="+pointX+" y=" +pointY+ " е извън окръжността((0,0), 5) и в правоъгълник с координати ((-1, 1), (5, 5))");

	}
}
