package core;

public class Player {
	
	
	private String playerName; 
	public Card [] playerHand= new Card [10];
	public int numberOfCards= 0; 
	
	
	public Player(String name ) {
		
		this.playerName = name;
		
	}
	
	
	public String getPlayerName() {
		
		return playerName; 
	}

	public int getNumberOfCards() {
		
		return numberOfCards;
	}
	
	public Card[] getPlayerHand() { 
		return playerHand; 
		
		
	}
	
	public int addCard(Card aCard) {
		
		this.playerHand[this.numberOfCards] = aCard;
		numberOfCards++;
		return numberOfCards; 
		
	}
	
	
	public int getTotalOfHand() {
		int total = 0;
		int numAces = 0;

		Card testCard;
		
		for (int i = 0; i < playerHand.length; i++) {
			
			// Check if value in player hand is null
			// The null pointer exception is killing me
			if (playerHand[i] == null) {
				continue;
			}
			
			testCard = playerHand[i];
			
			switch (testCard.getCardRank()) {

			case 1: 
				numAces++;
				break;
			case 2:
				total += 2;
				break;
			case 3:
				total += 3;
				break;
			case 4:
				total += 4;
				break;
			case 5:
				total += 5;
				break;
			case 6:
				total += 6;
				break;
			case 7:
				total += 7;
				break;
			case 8:
				total += 8;
				break;
			case 9:
				total += 9;
				break;
			case 10:
				total += 10;
				break;
			case 11: 
				total += 10;
				break;
			case 12: 
				total += 10;
				break;
			case 13: 
				total += 10;
			} 
		} 

		
		for (int i = 0; i < numAces; i++) {
			if (total > 10) {
				total += 1;
			} else {
				total += 11;
			}
		}
		return total;
		
		
		
		
	}
	
	
}
