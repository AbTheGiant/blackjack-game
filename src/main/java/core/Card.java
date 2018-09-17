package core;

public class Card {

		
	private int card_rank; 
	private Suit card_suit; 
	
	
	public Card (Suit cardSuit, int cardRank) {
		
		this.card_rank = cardRank; 
		this.card_suit = cardSuit; 
		
		
	}
	
	public int getCardRank() {
		return card_rank;
	}
	
	public Suit getCardSuit() {
		return card_suit;
		
		
	}
	
	
	
	
}
