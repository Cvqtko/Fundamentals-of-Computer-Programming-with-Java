import java.util.Random;

public class Exercise_05 {
	public static final String[] LAUDATORY_PHRASES = { "Продуктът е отличен.", "Това е страхотен продукт.", "Постоянно ползвам този продукт.", "Това е най-добрият продукт от тази категория." };
	public static final String[] lAUDATORY_HAPPENINGS = { "Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.", "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна." };
	public static final String[] FIRST_NAMES = {"Диана", "Петя", "Стела", "Елена", "Катя"};
	public static final String[] SURNAMES = {"Иванова", "Петрова", "Кирова"};
	public static final String[] CITIES = {"София", "Пловдив", "Варна", "Русе", "Бургас"};
	public static Random rnd = new Random();

	public static void main(String[] args) {
		String advertisementMessage = getRandomString(LAUDATORY_PHRASES) + " " + getRandomString(lAUDATORY_HAPPENINGS)
				+ " - " + getRandomString(FIRST_NAMES) + " " + getRandomString(SURNAMES) + ", "
				+ getRandomString(CITIES);

		System.out.println(advertisementMessage);

	}

	public static String getRandomString(String[] array) {
		return array[rnd.nextInt(array.length)];
	}
}
