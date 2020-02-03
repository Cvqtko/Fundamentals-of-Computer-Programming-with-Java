// 4. Ќапишете израз, който да провер€ва дали трети€ бит на дадено число е 1 или 0.
public class Exercise_04 {
	public static void main(String[] args) {
		int number = 8;
		System.out.println(
				((number >> 3) & 1) == 1 ? "“рети€ бит на дадено число е 1" : "“рети€ бит на дадено число е 0");
	}
}
