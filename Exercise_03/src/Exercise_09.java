/* 9. �������� ��������, ����� ��������� ���� ������ ����� � (x, y) 
� ����� � ����������� � ((0,0), 5) � � ����� ������������� ((-1, 1), (5, 5).*/
public class Exercise_09 {
	public static void main(String[] args) {
		double pointX = 4;
		double pointY = 4;
		boolean insideTheCircle = Math.sqrt(Math.pow(pointX, 2) + Math.pow(pointY, 2)) <= 5 ? true : false;

		boolean outsideOtTheRectangle = ((pointX < -1) || (pointX > 5)) || ((pointY < 1) || (pointY > 5));

		System.out.println((insideTheCircle && outsideOtTheRectangle)
				? "�������� ����� � (x, y) � ����� � ����������� � ((0,0), 5) � � ����� ������������� ((-1, 1), (5, 5))"
				: outsideOtTheRectangle ? "�������� ����� � (x, y) �� � ����� � ����������� � ((0,0), 5)"
						: insideTheCircle ? "�������� ����� � (x, y) � � ������������� ((-1, 1), (5, 5))"
								: "�������� ����� � (x, y) �� � � ����������� � ((0,0), 5) � � � ������������� ((-1, 1), (5, 5))");

	}
}
