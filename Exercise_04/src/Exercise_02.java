import java.util.Scanner;
// 2. �������� ��������, ����� ���� �� ��������� ������� "r" �� ���� � ��������� ������� ��������� � ��������.
public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������� ������� \"r\" �� ����: ");
		double r = input.nextDouble();
		double pi = Math.PI;
		input.close();
		System.out.printf("������ �� ����� � %f. ���������� �� ����� � %f.",pi*Math.pow(r, 2), 2*pi*r);
		
	}
}
