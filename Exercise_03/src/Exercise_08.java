// 8. �������� ��������, ����� ��������� ���� ������ ����� � (x, y) � ����� � ����������� � ((0,0), 5).
public class Exercise_08 {
	public static void main(String[] args) {
		double pointX = 4.0;
		double pointY = 3.1;

		System.out.println(Math.sqrt(Math.pow(pointX, 2) + Math.pow(pointY, 2)) <= 5
				? "������ ����� � (x, y) � ����� � ����������� � ((0,0), 5)"
				: "������ ����� � (x, y) �� � ����� � ����������� � ((0,0), 5)");

	}
}
