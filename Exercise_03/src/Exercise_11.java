
public class Exercise_11 {
	public static void main(String[] args) {
		int n = 2;
		int p = 1;

		System.out.println(((n >> p) & 1) == 1 ? "Стойността на бита p на числото n-> 1"
				: "Стойността на бита p на числото n е 0");
	}
}
