/* 5. ������������ ��� ���������� �� ��� String ��� ��������� "Hello" � "World".
������������ ���������� �� ��� Object. ��������� �� ���� ���������� ����������, ����� �� ��������
�� �������������� �� ����� ��������� ���������� (�������� ��������, ��� � ����������). ����-������� ������������ �� ��� Object.
������������ ���������� �� ��� String � ��������� �� ���������� ������������ �� ��� Object.*/
public class Exercise_05 {
	public static void main(String[] args) {
		String hello = "Hello";
		String world = "World";
		Object helloWorld = hello + " " + world;
		System.out.println(helloWorld);
		
		String hWorld = (String) helloWorld;
	}
}
