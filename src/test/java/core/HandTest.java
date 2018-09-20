package core;

import static org.junit.Assert.*;
import org.junit.Test;  
public class HandTest {
	
	
	
	
	  public void testAddCard()
	    {
	    	try
	    	{
	    	Hand testerHand = new Hand();
	    	testerHand.addCard(new Card(0,2));
	    	Card card = testerHand.getCard(0);
	    	assertTrue(card != null);
	    	assertTrue(testerHand.getNumCards()==1);
	    	}
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }
	    
	    
	 	public void testDealerCanDraw() {
	 	
	 		try
	    	{
	 			
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,8));
	    	hand.addCard(new Card(0,4));
	  
	    	assertTrue(hand.dealerCanDraw());
	    	
	    	
	    	hand = new Hand();
	    	hand.addCard(new Card(0,10));
	    	hand.addCard(new Card(0,4));
	  
	    	assertTrue(hand.dealerCanDraw());
	    	
	    	// 17 no ace
	    	hand = new Hand();
	    	hand.addCard(new Card(0,10));
	    	hand.addCard(new Card(0,5));
	    	
	    	assertTrue(!hand.dealerCanDraw());
	    	
	    	// 17 has ace
	    	hand = new Hand();
	    	hand.addCard(new Card(0,12));
	    	hand.addCard(new Card(0,4));
	    	
	    	assertTrue(hand.dealerCanDraw());
	    	
	    	// greater than 17
	    	hand = new Hand();
	    	hand.addCard(new Card(0,10));
	    	hand.addCard(new Card(0,11));
	    	
	    	assertTrue(!hand.dealerCanDraw());
	    	
	    	}
	    	catch (Exception e) {

	            assertTrue(false);
			}
	 	}

	 
	 	// test if hand has a ace
	 	@Test
	 	public void testHasAce() {

	 		try
	 		{
	 	 	// hand has ace
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,12));
	    	hand.addCard(new Card(0,5));
	    	
	    	assertTrue(hand.hasAce());
	    	
	     	// hand has no ace
	    	hand = new Hand();
	    	hand.addCard(new Card(0,10));
	    	hand.addCard(new Card(0,5));
	    	
	    	assertTrue(!hand.hasAce());
	    	
	    	}
	    	catch (Exception e) {

	            assertTrue(false);
			}
	 		
	 	}
	 	
	 	
	 	@Test
	 	public void testDuplicateCard() {

	 		try
	 		{
	 	 	// hand has duplicate card
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,10));
	    	hand.addCard(new Card(0,10));
	 		}
	 		
	 		catch (Exception e) {

	            assertTrue(true);
			}
	 		
	 	 	// hand has do duplicate card
	    	try
	    	{
	 
	    	// hand has do duplicate card
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,8));
	    	hand.addCard(new Card(0,5));
	    	
	    	}
	    	catch (Exception e) {

	            assertTrue(false);
			}
	 		
	 	}
	    
	    // test add card score
	 	@Test
	    public void testCardScore()
	    {
	    	try
	    	{
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,2));
	    	hand.addCard(new Card(0,3));
	    	hand.addCard(new Card(0,5));
	    	hand.addCard(new Card(0,10));
	    	int score = hand.getScore();
	    	assertTrue(score==26);
	    	}
	    	
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }
	    
	    // test add card score
	 	@Test
	    public void testCardAceScoreBlackJack()
	    {
	    	try
	    	{
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,10));
	    	hand.addCard(new Card(0,11));
	    	hand.addCard(new Card(0,12));
	    	assertTrue(hand.getScore()==21);
	    	}
	    	
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }
	    	
	    // test add card score
	 	@Test
	    public void testCardAceScoreBlackJack2()
	    {
	    	try
	    	{
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,10));
	    	hand.addCard(new Card(0,12));
	    	assertTrue(hand.getScore()==21);
	    	}
	    	
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }
	    
	    // test add card score
	 	@Test
	    public void testCardAceScoreBlackJack3()
	    {
	    	try
	    	{
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,12));
	    	hand.addCard(new Card(0,10));
	    	assertTrue(hand.getScore()==21);
	    	}
	    	
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }
	    
	    // test add card score
	 	@Test
	    public void testCardAceScoreBlackJack4()
	    {
	    	try
	    	{
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,12));
	    	hand.addCard(new Card(0,10));
	    	hand.addCard(new Card(1,10));
	    	assertTrue(hand.getScore()==21);
	    	}
	    	
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }
	    
	    // test add card score
	 	@Test
	    public void testCardAceScore()
	    {
	    	
	    	try
	    	{
	    	Hand hand = new Hand();
	    	hand.addCard(new Card(0,10));
	    	hand.addCard(new Card(0,1));
	      	hand.addCard(new Card(2,2));
	    	hand.addCard(new Card(0,12));
	    	int score = hand.getScore();
	    	assertTrue(score==18);
	    	}
	    	catch (Exception e) {

	            assertTrue(false);
			}
	    }
	    	
	    // test hand score 1
	    // black jack tie
	 	@Test
	    public void testHandScores1()
	    {
	    	try
	    	{
	        Hand player = new Hand("SK HA");
	        Hand dealer = new Hand("HQ CA");
	        
	        BlackJackGame bj = new BlackJackGame();
	        
	        Scores score = bj.checkScore(player, dealer);
	        
	        assertTrue(score == Scores.BlackjackTieGame);
	    	}
	    	
	    	catch(Exception ex)
	    	{
	    		assertTrue(false);
	    	}
	    	
	    }
	    
	    // test hand score 2
	    // player wins
	 	@Test
	    public void testHandScores2()
	    {
	    	try
	    	{
	        Hand player = new Hand("SK HQ");
	        Hand dealer = new Hand("SQ C5 DJ");
	        
	        BlackJackGame bj = new BlackJackGame();
	        
	        Scores score = bj.checkScore(player, dealer);
	        
	        assertTrue(score == Scores.DealerBusts);
	    	}
	    	
	    	catch(Exception ex)
	    	{
	    		assertTrue(false);
	    	}
	    	
	    }
	    
	    
	 	@Test
	    public void testHandScores3()
	    {
	    	try
	    	{
	        Hand player = new Hand("S10 D3 H5 SA");
	        Hand dealer = new Hand("SQ C5 CA D2");
	        
	        BlackJackGame bj = new BlackJackGame();
	        
	        Scores score = bj.checkScore(player, dealer);
	        
	        assertTrue(score == Scores.PlayerWins);
	    	}
	    	
	    	catch(Exception ex)
	    	{
	    		assertTrue(false);
	    	}
	    	
	    }
	    
	    
	 	@Test
	    public void testHandScores4()
	    {
	    	try
	    	{
	        Hand player = new Hand("S2 D3 H5 S3");
	        Hand dealer = new Hand("SQ C5 CA D2");
	        
	        BlackJackGame bj = new BlackJackGame();
	        
	        Scores score = bj.checkScore(player, dealer);
	        
	        assertTrue(score == Scores.DealerWins);
	    	}
	    	
	    	catch(Exception ex)
	    	{
	    		assertTrue(false);
	    	}
	    	
	    }
	    
	    // test hand score 5
	    // black jack  player
	 	@Test
	    public void testHandScores5()
	    {
	    	try
	    	{
	        Hand player = new Hand("SK HA");
	        Hand dealer = new Hand("HQ H5");
	        
	        BlackJackGame bj = new BlackJackGame();
	        
	        Scores score = bj.checkScore(player, dealer);
	        
	        assertTrue(score == Scores.PlayerBlackjack);
	    	}
	    	
	    	catch(Exception ex)
	    	{
	    		assertTrue(false);
	    	}
	    	
	    }
	    
	   
	 	@Test
	    public void testHandScores6()
	    {
	    	try
	    	{
	        Hand player = new Hand("D4 HA");
	        Hand dealer = new Hand("HQ HA");
	        
	        BlackJackGame tester = new BlackJackGame();
	        
	       Scores score = tester.checkScore(player, dealer);
	        
	        assertTrue(score == Scores.DealerBlackjack);
	    	}
	    	
	    	catch(Exception ex)
	    	{
	    		assertTrue(false);
	    	}
	    	
	    }

}
