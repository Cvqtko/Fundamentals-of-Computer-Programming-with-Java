
public class Exercise_04 {
	public static void main(String[] args) {

		String[] cardValues = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] cardColors = { "Diamonds", "Spades", "Clubs", "Hearts" };

		for (String cardColor : cardColors) {
			for (String cardValue : cardValues) {
				System.out.println(cardValue + " of " + cardColor);
			}
		}
	}
}
