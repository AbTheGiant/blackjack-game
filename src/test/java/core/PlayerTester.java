package core;

//import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTester {
	
	
	
	private Player testPlayer;
	
	@Before
	public void setup() {
		testPlayer = new Player("Tester");
	}
	
	@Test
	public void testPlayerCreated()  {
		assertNotNull(testPlayer);
	}
	
	
	@Test
	public void testGetName()   {
		assertEquals("Tester", testPlayer.getPlayerName());
	} 
	
	
	public void testPlayerHnd () {
		
		Card firstCard = new Card(Suit.Diamond, 1); //Ace
		 Card secondCard = new Card(Suit.Diamond, 2);
		 Card thirdCard = new Card(Suit.Diamond, 3);
		 Card fourthCard = new Card(Suit.Diamond, 4);
		 Card fifthCard = new Card(Suit.Diamond, 5);
		 Card sixthCard = new Card(Suit.Diamond, 6);
		 Card seventhCard = new Card(Suit.Diamond, 7);
		 Card eighthCard = new Card(Suit.Diamond, 8);
		 Card ninthCard = new Card(Suit.Diamond, 9);
		 Card tenthCard = new Card(Suit.Diamond, 10);
		
		
		Card [] testHand = new Card [10]; 
		testHand [0]= firstCard;
		testHand[1]= secondCard;
		testHand[2]= thirdCard;
		testHand[3]= fourthCard;
		testHand[4]= fifthCard;
		testHand[5]= sixthCard;
		testHand[6]= seventhCard;
		testHand[7]= eighthCard;
		testHand[8]= ninthCard;
		testHand[9] = tenthCard;
		
		testPlayer.addCard(firstCard);
		testPlayer.addCard(secondCard);
		testPlayer.addCard(thirdCard);
		testPlayer.addCard(fourthCard);
		testPlayer.addCard(fifthCard);
		testPlayer.addCard(sixthCard);
		testPlayer.addCard(seventhCard);
		testPlayer.addCard(eighthCard);
		testPlayer.addCard(ninthCard);
		testPlayer.addCard(tenthCard);
		
		 assertArrayEquals(testHand, testPlayer.getPlayerHand());
		
		
		
		
				
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}