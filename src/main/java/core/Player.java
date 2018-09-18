package core;

public class Player {
	
	
	private String playerName; 
	private Card [] playerHand; 
	//xprivate int numberOfCards= 0; 
	
	
	public Player(String name ) {
		
		this.playerName = name;
		
	}
	
	
	public String getPlayerName() {
		
		return playerName; 
	}

	
	public Card[] getPlayerHand() { 
		return playerHand; 
		
		
	}
	
	
	
}
