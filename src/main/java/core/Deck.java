package core;

public class Deck {
	
	
	
	private Card [] deck; 
	private int numberOfCards = 52;
	
	
	
	public Deck() {
		deck = new Card [this.numberOfCards];
		int indexOfCard = 0;
		
		for (int i =0 ; i < 4; i++) {
			for (int j =0 ;j < 14; j++) {
				
				
				deck[indexOfCard] = new Card(Suit.values()[i], j);
				indexOfCard++;
			}
			
			
		}
		
	}

	
	
	public int sizeOfDeck() {
		return deck.length;
	}
	

}
