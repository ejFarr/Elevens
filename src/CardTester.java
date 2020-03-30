/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card = new Card("king", "spades", 13);
		Card card2 = new Card("two", "clubs", 2);
		Card card3 = new Card("two", "clubs", 2);

		System.out.println(card.rank());
		System.out.println(card.suit());
		System.out.println(card.pointValue());
		System.out.println(card2.matches(card3));
		System.out.println(card3.toString());
	}
}
