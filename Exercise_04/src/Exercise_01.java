import java.util.Scanner;
// 1. �������� ��������, ����� ���� �� ��������� ��� ����� �� ��� int � ��������� ������� ����.
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������� ��� ����� �� ��� int");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		System.out.println("������ �� ����� ����� � " + (a + b + c));

	}
}
