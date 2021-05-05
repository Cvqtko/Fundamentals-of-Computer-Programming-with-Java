
public class Exercise_06 {
	public static void main(String[] args) {
		String text = "C# is not C++ and PHP is not Delphi";
		String[] words = text.split("\\s+");
		StringBuilder textReversed = new StringBuilder("");

		for (int i = words.length-1; i >= 0; i--) {
			textReversed.append(words[i] + " ");
		}
		System.out.println(textReversed);
	}
}
