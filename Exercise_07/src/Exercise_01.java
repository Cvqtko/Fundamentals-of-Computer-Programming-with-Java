import java.util.Arrays;

/* 1. �� �� ������ ��������, ����� ������� ����� � 20 �������� �� ���������� ��� � ������������ ����� �� ���������� 
��� �������� ����� �� ������� �� �������� ������� �� 5. ���������� �� ������ �� �� ������� �� ���������.*/
public class Exercise_01 {
	public static void main(String[] args) {
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 5;
		}

		System.out.println(Arrays.toString(array));
	}
}
