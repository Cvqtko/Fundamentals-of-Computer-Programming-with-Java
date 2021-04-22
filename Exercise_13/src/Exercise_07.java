/* 7. Колко обратни наклонени черти трябва да посочите като аргумент на метода split(…), 
за да разделите текста по обратна наклонена черта?
Пример: one\two\three
Забележка: В Java обратната наклонена черта е екраниращ символ (escaping character).*/
public class Exercise_07 {
	public static void main(String[] args) {
		String text = "one\\two\\three";
		String[] words = text.split("[\\\\]");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}
