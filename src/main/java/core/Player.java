package core;

public class Player {
	
	
	private String playerName; 
	private Card [] playerHand; 
	private int numberOfCards= 0; 
	
	
	public Player(String name ) {
		
		this.playerName = name;
		
	}
	
	
	public String getPlayerName() {
		
		return playerName; 
	}

	
	public Card[] getPlayerHand() { 
		return playerHand; 
		
		
	}
	
	public int addCard(Card aCard) {
		
		this.playerHand[this.numberOfCards] = aCard;
		numberOfCards++;
		return numberOfCards; 
		
	}
	
	
}
