import java.util.Scanner;
/* 4. �������� ��������, ����� ���� �� ��������� ��� ���� ����� (integer) � ���������, ����� ����� ��� ����� ���,
������, �� ��������� �� �� �������� �� 5 �� � 0.*/
public class Exercise_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������� ��� ���� �����: ");
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		if (a > b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		int counter = 0;

		for (int i = a + 1; i < b; i++) {
			if (i % 5 == 0) {
				int nextDivider = i;
				do {
					counter++;
					nextDivider += 5;
				} while (nextDivider < b);
				break;
			}
		}

		System.out.printf("���� �� ������� ������ �� 5 ����� %d � %d � %d\n", a, b, counter);

	}
}
