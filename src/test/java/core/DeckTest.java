package core;

import junit.framework.TestCase;

public class DeckTest extends TestCase {
	
	
	
	
	  public void testDeckNumberCards() 
	    {
	        Deck testerDeck=null;
			try {
				testerDeck = new Deck();
			} 
			
			catch (Exception e) {

	             assertTrue(false);
			}
	    	assertEquals(52, testerDeck.getNumCards());

	    }
	    
		
	    public void testShuffle()
	    {
	    	try
	    	{
	    	Deck deck1 = new Deck();
	    	Deck deck2 = new Deck();
	    	
	    	deck2.shuffle();
	    	
	    	int count = 0;
	    	
	    	for(int i=0;i<52;i++)
	    	{
	    		Card c1 = deck1.deal(); 
	    		Card c2 = deck2.deal(); 
	    		
	    		
	    		if(c1.getValue()==c2.getValue() && c1.getRank().equals(c2.getRank())
	    				&& c1.getSuit().equals(c2.getSuit())) {
	    			count++;
	    		} 
	    		
	    		
	    	}
	    	
	    	
	    	assertTrue(count < 5);
	    	}
	    	
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    	
	    }
	    
	    public void testDeal()
	    {
	    	try
	    	{
	       Deck testerDeck = new Deck();
	       Card c = testerDeck.deal();
	       assertTrue(c != null);
	       assertEquals(51, testerDeck.getNumCards());
	    	}
	    	
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }
	   

	    
	    public void testInitialize()
	    {
	    	try
	    	{
	    	Deck deck = new Deck();
	    	for(int i=0;i<52;i++)
	    	{
	    		deck.deal();
	    	}

	        assertTrue(deck.getNumCards()==52);
	        
	    	}
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }

}
