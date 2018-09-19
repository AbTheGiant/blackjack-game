package core;

import static org.junit.Assert.*;
import org.junit.Test;
public class DeckTest {
	
	
	
	@Test
	  public void testDeckNumberCards() 
	    {
	        Deck deck=null;
			try {
				deck = new Deck();
			} 
			
			catch (Exception e) {

	             assertTrue(false);
			}
	    	
	    	assertTrue(deck.getNumCards()==52);

	    }
	    
		@Test
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
	    				&& c1.getSuit().equals(c2.getSuit())) count++;
	    		
	    		
	    	}
	    	
	    	// count of 5 is accepable
	    	assertTrue(count < 5);
	    	}
	    	
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    	
	    }
	    @Test
	    public void testDeal()
	    {
	    	try
	    	{
	       Deck deck = new Deck();
	       Card c = deck.deal();
	       assertTrue(c != null);
	       assertTrue(deck.getNumCards()==51);
	    	}
	    	
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }
	   

	    @Test
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
