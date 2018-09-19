package core;


import static org.junit.Assert.*;
import org.junit.Test;


//import junit.framework.TestCase;

public class CardTest  {
	
	
	
// test card class
    
    // test suit
	@Test
    public void testSuit()
    {
    	try
    	{
    	Card card = new Card(0,2);
    	assertTrue(card.getSuit().equals("H"));
    	
    	card = new Card(3,12);
    	assertTrue(card.getSuit().equals("C"));
    	}
    	catch (Exception e) {

            assertTrue(false);
		}
    }
    
    
    // test rank
	
	
	@Test
    public void testRank()
    {
    	try
    	{
    	Card card = new Card(0,2);
    	assertTrue(card.getRank().equals("4"));
    	
    	card = new Card(0,11);
    	assertTrue(card.getRank().equals("K"));
    	}
    	catch (Exception e) {

            assertTrue(false);
		}
    }
    
    // test value
	@Test
    public void testValue()
    {
    	try
    	{
    	Card card = new Card(0,2);
    	assertTrue(card.getValue()==4);
    	
       	card = new Card(0,11);
    	assertTrue(card.getValue()==10);
    	}
    	catch (Exception e) {

            assertTrue(false);
		}
    }
    
    // test is ace
	@Test
    public void testIsAce()
    {
    	try
    	{
    	Card card = new Card(0,12);
    	assertTrue(card.isAce());
    	
    	card = new Card(0,2);
    	assertFalse(card.isAce());
    	}
    	
    	catch (Exception e) {

            assertTrue(false);
		}
    }
    
    // test to Card string
	@Test
    public void testCardToString()
    {
    	try
    	{
    	Card card = new Card(0,2);
    	assertTrue(card.toString().equals("H4"));
    	}
    	
    	catch (Exception e) {

            assertTrue(false);
		}
    
    }
	
	
	
	
	
	

}
