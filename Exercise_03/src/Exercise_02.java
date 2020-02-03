// 2. Напишете булев израз, който да проверява дали дадено цяло число се дели на 5 и на 7 без остатък.
public class Exercise_02 {
	public static void main(String[] args) {
		int number = 35;

		System.out.println((number % 5 == 0 && number % 7 == 0) ? "Число се дели на 5 и на 7 без остатък"
				: "Число не се дели на 5 и на 7 без остатък");
	}
}
