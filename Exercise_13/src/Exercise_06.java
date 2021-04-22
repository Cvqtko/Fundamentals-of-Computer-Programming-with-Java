/* 6. Напишете програма, която обръща думите в дадено изречение. 
Например: "C# is not C++ and PHP is not Delphi" -> "Delphi not is PHP and C++ not is C#".*/
public class Exercise_06 {
	public static void main(String[] args) {
		String text = "C# is not C++ and PHP is not Delphi";
		String[] words = text.split("[ ]");
		StringBuilder textReversed = new StringBuilder("");

		for (int i = words.length-1; i >= 0; i--) {
			textReversed.append(words[i] + " ");
		}
		System.out.println(textReversed);
	}
}
