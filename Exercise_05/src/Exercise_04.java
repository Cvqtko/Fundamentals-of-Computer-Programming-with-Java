import java.util.Scanner;
/* 4. �������� ��������, ����� �� ������ ����� (0-9), �������� ���� ����,
������� ����� �� ������� �� ��������� ����.*/
public class Exercise_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		switch (number) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("���");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("���");
			break;
		case 6:
			System.out.println("����");
			break;
		case 7:
			System.out.println("�����");
			break;
		case 8:
			System.out.println("����");
			break;
		case 9:
			System.out.println("�����");
			break;
		default:
			System.out.println("���������� ����� �� � ����� 0-9");
		}

	}
}
