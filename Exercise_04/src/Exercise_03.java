import java.util.Scanner;
/* 3. ������ ����� ��� ���, �����, ��������� �����, ���� �����, ��� ���� � ��������. ���������� ��� ���, ������� � ��������� �����.
�������� ��������, ����� ���� ������������ �� ���������� � ������ �������� � � ��������� ���� ���� �� ���������.*/
public class Exercise_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������� ��� �� ������� ");
		String companyName = input.nextLine();
		System.out.println("�������� ����� �� ������� ");
		String company�ddress = input.nextLine();
		System.out.println("�������� ��������� ����� �� ������� ");
		String companyPhoneNumber = input.nextLine();
		System.out.println("�������� ���� ����� �� ������� ");
		String companyFaxNumber = input.nextLine();
		System.out.println("�������� ��� ���� �� ������� ");
		String companyWebsite = input.nextLine();
		System.out.println("�������� �������� �� ������� ");
		String companyManager = input.nextLine();
		System.out.println("�������� ��������� ����� �� ��������� ");
		String companyManagerPhone = input.nextLine();
		input.close();

		System.out.printf("����� %s � ����� - %s. ������� �� ������ - %s, ���� - %s, ��� ���� - %s.\n", companyName,
				company�ddress, companyPhoneNumber, companyFaxNumber, companyWebsite);
		System.out.printf("�������� %s � ��������� ����� %s ", companyManager, companyManagerPhone);
	}
}
