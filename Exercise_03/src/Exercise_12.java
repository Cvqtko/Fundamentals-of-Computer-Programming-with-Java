/* 12. ������ � ����� n, �������� v (v = 0 ��� 1) � ������� p. �������� �������� �� ��������, ����� �� �������� ���������� �� n, 
���� �� ����� �� ������� p �� ��� �������� v. ������ n=35, p=5, v=0 -> n=3. 
��� ���� ������: n=35, p=2, v=1 -> n=39.*/
public class Exercise_12 {
	public static void main(String[] args) {
		int n = 35;
		int p = 2; 
		int v = 1; 
		n = (v == 0)? n & (~(1 << p)) :  n | (1 << p);
		System.out.println(n);

	}
}