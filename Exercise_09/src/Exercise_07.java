/* 7. Напишете метод, който отпечатва цифрите на дадено десетично число в обратен ред. Например 256, 
трябва да бъде отпечатано като 652.*/
public class Exercise_07 {
	public static void main(String[] args) {
		int number = 256;
		reverseNumber(number);
	}

	public static void reverseNumber(int number) {
		String reversed = "";
		while (number != 0) {
			reversed += number % 10;
			number /= 10;
		}
		System.out.println(reversed);
	}
}
