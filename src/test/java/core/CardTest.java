package core;




import junit.framework.*;

public class CardTest extends TestCase {
	
	
	Card testCard = new Card (Suit.Diamond, 1); 
	private Card [] tester_deck ; 
	
	//private DeckOfCards deck ;
	
	
	
	
	
	
	
	public void setup() {
		//deck = new DeckOfCards();
		tester_deck= new Card[52];
		
		// creating all the diamonds 
		tester_deck[0] = new Card(Suit.Diamond, 1);
		tester_deck[1] = new Card(Suit.Diamond, 2);
		tester_deck[2] = new Card(Suit.Diamond, 3);
		tester_deck[3] = new Card(Suit.Diamond, 4);
		tester_deck[4] = new Card(Suit.Diamond, 5);
		tester_deck[5] = new Card(Suit.Diamond, 6);
		tester_deck[6] = new Card(Suit.Diamond, 7);
		tester_deck[7] = new Card(Suit.Diamond, 8);
		tester_deck[8] = new Card(Suit.Diamond, 9);
		tester_deck[9] = new Card(Suit.Diamond, 10);
		tester_deck[10] = new Card(Suit.Diamond, 11);
		tester_deck[11] = new Card(Suit.Diamond, 12);
		tester_deck[12] = new Card(Suit.Diamond, 13);
		
		
		
		//initializing all the heart cards
		
		tester_deck[13] = new Card(Suit.Heart, 1);
		tester_deck[14] = new Card(Suit.Heart, 2);
		tester_deck[15] = new Card(Suit.Heart, 3);
		tester_deck[16] = new Card(Suit.Heart, 4);
		tester_deck[17] = new Card(Suit.Heart, 5);
		tester_deck[18] = new Card(Suit.Heart, 6);
		tester_deck[19] = new Card(Suit.Heart, 7);
		tester_deck[20] = new Card(Suit.Heart, 8);
		tester_deck[21] = new Card(Suit.Heart, 9);
		tester_deck[22] = new Card(Suit.Heart, 10);
		tester_deck[23] = new Card(Suit.Heart, 11);
		tester_deck[24] = new Card(Suit.Heart, 12);
		tester_deck[25] = new Card(Suit.Heart, 13);
		
		//initializing all the spade  cards
	    tester_deck[26] = new Card(Suit.Spade, 1);
		tester_deck[27] = new Card(Suit.Spade, 2);
		tester_deck[28] = new Card(Suit.Spade, 3);
		tester_deck[29] = new Card(Suit.Spade, 4);
		tester_deck[30] = new Card(Suit.Spade, 5);
		tester_deck[31] = new Card(Suit.Spade, 6);
		tester_deck[32] = new Card(Suit.Spade, 7);
		tester_deck[33] = new Card(Suit.Spade, 8);
		tester_deck[34] = new Card(Suit.Spade, 9);
		tester_deck[35] = new Card(Suit.Spade, 10);
		tester_deck[36] = new Card(Suit.Spade, 11);
		tester_deck[37] = new Card(Suit.Spade, 12);
		tester_deck[38] = new Card(Suit.Spade, 13);
		
		
		// initializing all the card with suit of clubs  
		tester_deck[39] = new Card(Suit.Club, 1);
		tester_deck[40] = new Card(Suit.Club, 2);
		tester_deck[41] = new Card(Suit.Club, 3);
		tester_deck[42] = new Card(Suit.Club, 4);
		tester_deck[43] = new Card(Suit.Club, 5);
		tester_deck[44] = new Card(Suit.Club, 6);
		tester_deck[45] = new Card(Suit.Club, 7);
		tester_deck[46] = new Card(Suit.Club, 8);
		tester_deck[47] = new Card(Suit.Club, 9);
		tester_deck[48] = new Card(Suit.Club, 10);
		tester_deck[49] = new Card(Suit.Club, 11);
		tester_deck[50] = new Card(Suit.Club, 12);
		tester_deck[51] = new Card(Suit.Club, 13);
		
			
		
	}
	
	
	
	public void testgetSuit() {
		assertEquals(Suit.Club, tester_deck[48].getCardSuit());
		
	}
	
	public void testgetRank() {
		
		assertEquals(4, tester_deck[42].getCardRank());
		
	}
	
	
	
	
	
	
	
	

}
