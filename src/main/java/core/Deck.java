package core;
import java.util.List;
import java.util.ArrayList;

public class Deck {

	// constants
	public int NUM_CARDS = 52;
	public int NUM_SUITS = 4;
	public int NUM_RANKS = 13;
	private List<Card> cards = new ArrayList<Card>();

	// initialize deck
	public Deck() throws Exception {

		initialize();
	}

	// initialize deck
	private void initialize() throws Exception {

		cards = new ArrayList<Card>();

		for (int i = 0; i < NUM_SUITS; i++) {

			for (int j = 0; j < NUM_RANKS; j++) {
				cards.add(new Card(i, j));
			}
		}

	}

	// return number of cards in deck
	public int getNumCards() {
		return cards.size();
	}

	// shuffle deck
	public void shuffle() {

		for (int i = 0; i < NUM_CARDS; i++) {

			for (int j = 0; j < NUM_CARDS; j++) {

				int x = (int) (Math.random() * 52);
				int y = (int) (Math.random() * 52);

				swap(x, y);

			}
		}

	}

	// swap card at index i mf j
	private void swap(int i, int j) {

		Card t = cards.get(i);
		cards.set(i, cards.get(j));
		cards.set(j, t);

	}

	// deal one card
	// shuffle deck if necessarry
	public Card deal() throws Exception {
		Card card = cards.remove(0);

		if (cards.size() == 0) {
			initialize();
			shuffle();
		}

		return card;
	}

	// print deck
	public String toString() {

		int k = 0;
		String s = "";

		for (int i = 0; i < NUM_SUITS; i++) {

			for (int j = 0; j < NUM_RANKS; j++) {
				s += cards.get(k++) + " ";
			}

			s += "\n";
		}

		return s;
	}

}