
public class Exercise_07 {
	public static void main(String[] args) {
		String text = "one\\two\\three";
		String[] words = text.split("[\\\\]");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}
