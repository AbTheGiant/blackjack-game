package core;

import junit.framework.*;

public class CardTest extends TestCase {
	
	
	Card testCard = new Card (Suit.Diamond, 1); 
	
	public void testgetSuit() {
		assertEquals(Suit.Diamond, testCard.getCardSuit());
		
	}
	
	public void testgetRank() {
		
		assertEquals(1, testCard.getCardRank());
		
	}
	
	
	
	
	
	
	
	

}
