/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck deck1 = new Deck(ranks, suits, values);
		Deck deck2 = new Deck(ranks, suits, values);
		Deck deck3 = new Deck(ranks, suits, values);

		System.out.println(deck1.size());
		System.out.println(deck2.isEmpty());
		System.out.println(deck3.deal());
	}
}
