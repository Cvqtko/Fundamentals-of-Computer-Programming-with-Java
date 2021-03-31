
public class Exercise_04 {
	public static void main(String[] args) {
		int number = 8;
		System.out.println(
				((number >> 3) & 1) == 1 ? "Третият бит е 1" : "Третият бит е 0");
	}
}
