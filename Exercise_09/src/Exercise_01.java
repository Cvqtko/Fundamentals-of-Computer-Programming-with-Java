import java.util.Scanner;

/* 1. �������� �����, ����� ��� �������� ��� ��������� � ��������� "Hello, <name>!" 
(�������� "Hello, Peter!"). �������� ��������, ����� ������ ���� �����.*/
public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		input.close();
		printHello(name);
	}

	public static void printHello(String name) {
		System.out.printf("Hello, %s!", name);
	}
}
