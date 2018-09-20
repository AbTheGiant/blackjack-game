package core;


import junit.framework.TestCase;




public class CardTest extends TestCase {
	
	
	

	
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
	
	
	
    public void testRank()
    {
    	try
    	{
    	Card testerCard = new Card(0,2);
    	assertTrue(testerCard.getRank().equals("4"));
    	
    	testerCard = new Card(0,11);
    	assertTrue(testerCard.getRank().equals("K"));
    	}
    	catch (Exception e) {

            assertTrue(false);
		}
    }
    
    
	
    public void testValue()
    {
    	try
    	{
    	Card testerCard = new Card(0,4);
    	assertEquals(6,testerCard.getValue());
    	
       	testerCard = new Card(0,11);
    	assertEquals(10, testerCard.getValue());
    	}
    	catch (Exception e) {

            assertTrue(false);
		}
    }
    
    
	
    public void testIsAce()
    {
    	try
    	{
    	Card testerCard = new Card(0,12);
    	assertTrue(testerCard.isAce());
    	
    	testerCard = new Card(0,4);
    	assertFalse(testerCard.isAce());
    	}
    	
    	catch (Exception e) {

            assertTrue(false);
		}
    }
    
    // test to Card string
	
    public void testCardToString()
    {
    	try
    	{
    	Card testerCard = new Card(1,5);
    	assertEquals("S7", testerCard.toString());
    	}
    	
    	catch (Exception e) {

            assertTrue(false);
		}
    
    }
	
	
	
	
	
	

}
