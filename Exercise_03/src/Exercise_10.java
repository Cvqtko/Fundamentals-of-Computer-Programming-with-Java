/* 10. �������� ��������, ����� ������ �� ���� ������������� ����� ��� ������ abcd � ���� ���� �������� �������� �������� ����� ����:
- �������� ����� �� ������� �� �������.
- ���������� �� ��������� ������� � ������� ���: dcba.
- ������� ���������� �����, �� ����� �����: dabc.
- ������� ������� �� ������� � ������� �����: acbd.*/
public class Exercise_10 {
	public static void main(String[] args) {
		int abcd = 1234;
		int sum = abcd % 10 + abcd / 10 % 10 + abcd / 100 % 10 + abcd / 1000;

		int dcba = abcd % 10 * 1000 + abcd / 10 % 10 * 100 + abcd / 100 % 10 * 10 + abcd / 1000;
		int dabc = abcd % 10 * 1000 + abcd / 10;
		int acbd = abcd / 1000 * 1000 + abcd / 10 % 10 * 100 + abcd / 100 % 10 * 10 + abcd % 10;

		System.out.println("����� �� ������� �� ������� = " + sum);
		System.out.println("������� � ������� ��� = " + dcba);
		System.out.println("���������� �����, �� ����� ����� = " + dabc);
		System.out.println("� ��������� ������� �� ������� � ������� ����� = " + acbd);

	}
}
