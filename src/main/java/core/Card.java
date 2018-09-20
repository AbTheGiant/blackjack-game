package core;





import java.util.Arrays;

//cards contains suit and rank and a value
public class Card {

	
		
	private static final String[] setOfSuits = {"H","S","D","C"};
	private static final String[] setOfRanks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	private static final int values[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };
	
	private String suit; 
	private String rank; 
	private int value;
	public Card(int s, int r) throws Exception {

		try
		{
		suit = setOfSuits[s];
		rank = setOfRanks[r];
		value = values[r];
		}
		
		catch(Exception ex)
		{
			throw new Exception("the  index is  out of bounds " + ex.getMessage());
		}

	}
	
	
	public Card(String str) throws Exception
	{
		if(str.length() > 3 || str.length() < 1) {
			throw new Exception("bad card string: " + str);
		}
		
		int s = Arrays.asList(setOfSuits).indexOf(str.substring(0,1));
		int r = Arrays.asList(setOfRanks).indexOf(str.substring(1));
		
		Card card = new Card(s,r);
		suit = card.suit;
		rank = card.rank;
		value = card.value;
		
	}

	
	public String getSuit() {

		return suit;
	}

	
	public String getRank() {

		return rank;
	}

	
	public int getValue() {

		return value;
	}

	
	public boolean isAce() {

		return rank.equals("A");
	}

	
	public String toString() {

		return suit + rank;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank == null) {
			if (other.rank != null)
				return false;
		} 
		else if (!rank.equals(other.rank))
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}

	
}