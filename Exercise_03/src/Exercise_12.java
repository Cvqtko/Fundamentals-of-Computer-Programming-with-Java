
public class Exercise_12 {
	public static void main(String[] args) {
		int n = 35;
		int p = 2; 
		int v = 1; 
		n = (v == 0)? n & (~(1 << p)) :  n | (1 << p);
		System.out.println(n);

	}
}
