package core;

import junit.framework.*;

public class CardTest extends TestCase {
	
	
	Card testCard = new Card ("Diamond ", 1); 
	
	public void getSuitOfTestCard() {
		assertEquals(Suit.Diamond, testCard.getCardSuit());
		
	}
	
	public void getRankOfTestCard() {
		
		assertEquals(1, testCard.getCardRank());
		
		
	}
	
	
	
	
	
	
	
	

}
