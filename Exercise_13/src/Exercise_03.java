
public class Exercise_03 {
	public static void main(String[] args) {
		String text = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
		int position = text.indexOf("<upcase>");

		while (position != -1) {
			text = text.substring(0, position) + text.substring(position + 8, text.indexOf("</upcase>")).toUpperCase()
					+ text.substring(text.indexOf("</upcase>") + 9);
			position = text.indexOf("<upcase>", position + 1);
		}
		System.out.println(text);
	}
}
