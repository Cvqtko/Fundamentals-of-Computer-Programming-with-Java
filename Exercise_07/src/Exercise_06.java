import java.util.Arrays;
import java.util.Scanner;



public class Exercise_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������� N");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("�������� ���������� �� ������");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("�������� K");
		int k = input.nextInt();
		input.close();
		Arrays.sort(array);

		System.out.println("���������� � ���������� ���� ��: ");
		for (int i = array.length - 1; i > array.length - 1 - k; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
