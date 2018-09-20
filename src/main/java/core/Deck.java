package core;
import java.util.List;
import java.util.ArrayList;

public class Deck {

	
	public int NUM_CARDS = 52;
	public int NUM_SUITS = 4;
	public int NUM_RANKS = 13;
	private List<Card> cards = new ArrayList<Card>();

	public Deck() throws Exception {

		initialize();
	}

	private void initialize() throws Exception {

		cards = new ArrayList<Card>();

		for (int i = 0; i < NUM_SUITS; i++) {

			for (int j = 0; j < NUM_RANKS; j++) {
				cards.add(new Card(i, j));
			}
		}

	}

	
	public int getNumCards() {
		return cards.size();
	}

	
	public void shuffle() {
		for (int i = 0; i < NUM_CARDS; i++) {
			for (int j = 0; j < NUM_CARDS; j++) {

				int x = (int) (Math.random() * 52);
				int y = (int) (Math.random() * 52);

				swap(x, y);
			}
		}

	}

	private void swap(int i, int j) {

		Card t = cards.get(i);
		cards.set(i, cards.get(j));
		cards.set(j, t);

	}

	public Card deal() throws Exception {
		Card card = cards.remove(0);

		if (cards.size() == 0) {
			initialize();
			shuffle();
		}

		return card;
	}

	public String toString() {
		int k = 0;
		String holder = "";

		for (int i = 0; i < NUM_SUITS; i++) {

			for (int j = 0; j < NUM_RANKS; j++) {
				holder += cards.get(k++) + " ";
			}
			holder += "\n";
		}

		return holder;
	}

}