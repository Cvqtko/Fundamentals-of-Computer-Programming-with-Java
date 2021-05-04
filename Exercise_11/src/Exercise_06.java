import java.util.Random;


public class Exercise_06 {
	public static final String[] MOTIVATIONAL_QUOTES = { "Believe in yourself! Have faith in your abilities!",
			"If you can dream it, you can do it.", "Where there is a will, there is a way.",
			"Do not wait; the time will never be ‘just right.’",
			"ress forward. Do not stop, do not linger in your journey, but strive for the mark set before you.",
			"The future belongs to those who believe in the beauty of their dreams." };

	public static final String[] AUTHORS = { "Norman Vincent Peale", "Walt Disney", "Pauline Kael", "George Herbert",
			"George Whitefield", "Eleanor Roosevelt" };
	public static Random rnd = new Random();

	public static void main(String[] args) {
		String motivationMessage = "\"" + getRandomString(MOTIVATIONAL_QUOTES) + "\" - " + getRandomString(AUTHORS);

		System.out.println(motivationMessage);

	}

	public static String getRandomString(String[] array) {
		return array[rnd.nextInt(array.length)];
	}
}
