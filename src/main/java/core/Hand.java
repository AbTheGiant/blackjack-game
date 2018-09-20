package core;


public class Hand {

	public static final int MAX_CARDS = 52;
	private Card[] cards = new Card[MAX_CARDS];
	private int numCards;

	
	public Hand() {

		numCards = 0;
	}

	
	public Hand(String str) throws Exception {

		String[] tokens = str.split("\\s+");

		for (int i = 0; i < tokens.length; i++) {

			Card card = new Card(tokens[i]);
			addCard(card);
		}
	}

	public Card getUpCard() {

		return cards[0];
	}

	
	public void addCard(Card card) throws Exception {

		
		for (int i = 0; i < numCards; i++) {
			if (card.equals(cards[i]))
				throw new Exception("Duplicate card in Hand: " + card);

		}

		
		cards[numCards++] = card;

	}

	
	public void clear() {

		numCards = 0;
	}

	
	public Card getCard(int i) {

		Card card = null;

		if (i >= 0 && i < numCards)
			card = cards[i];

		return card;
	}

	
	public int getScore() {

		Card card;
		int score = 0;
		int numOfAces = 0;

		
		for (int i = 0; i < numCards; i++) {

			card = cards[i];
			int value = card.getValue();

			if (value == 11) 
			{
				numOfAces++;
			}

			score = score + value;
		}
		while (score > 21 && numOfAces > 0) {
			score = score - 10;
			numOfAces--;
		}
		return score;
	}

	
	public boolean playerCanDraw(Card dealerUpCard) {

		int score = getScore();
		int dealerUpCardValue = dealerUpCard.getValue();

		if (score < 17 && dealerUpCardValue >= 7) {
			return true;
		} else if (score < 12 && dealerUpCardValue <= 6) {
			return true;
		} else
			return false;
	}

	
	public boolean dealerCanDraw() {
		int score = getScore();
		return score <= 16 || (score == 17 && hasAce());
	}

	public int getNumCards() {
		return numCards;
	}

	
	public boolean hasAce() {
		for (int i = 0; i < numCards; i++) {
			if (cards[i].getRank().equals("A"))
				return true;
		}

		return false;
	}

	public String toString() {

		String holder = "";

		for (int i = 0; i < numCards; i++) {
			Card card = cards[i];
			holder += card + " ";
		}

		return holder;
	}

}