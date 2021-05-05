
public class Exercise_02 {
	public static void main(String[] args) {
		String text = "We are living in a yellow submarine. We don't have anything else. "
				+ "Inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days.";

		String searchedString = "in";
		int counter = 0;
		text = text.toLowerCase();

		int position = text.indexOf(searchedString);

		while (position != -1) {
			counter++;
			position = text.indexOf("in", position + 1);

		}
		System.out.println("\"" + searchedString + "\" found " + counter + " times.");

	}
}
