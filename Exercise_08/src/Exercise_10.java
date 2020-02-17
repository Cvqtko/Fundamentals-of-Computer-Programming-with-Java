// 10. Да се напише програма, която преобразува двоично число в десетично по схемата на Хорнер.
public class Exercise_10 {
	public static void main(String[] args) {
		String binary = "10001";
		System.out.println(binaryToDecimalHorner(binary));
	}

	public static int binaryToDecimalHorner(String binary) {
		int decimal = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (i == 0) {
				decimal = 0 + Integer.parseInt(Character.toString(binary.charAt(i)));
			} else {
				decimal = decimal * 2 + Integer.parseInt(Character.toString(binary.charAt(i)));
			}
		}
		return decimal;
	}
}
