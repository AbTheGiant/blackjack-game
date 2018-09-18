package core;

import junit.framework.*;
public class PlayerTester {
	
	private Player testPlayer  = new Player ("Tester "); 
	
	public void testPlayerCreated()  {
		assertNotNull(testPlayer);
	}
	
	public void testGetName()   {
		assertEquals("Tester", testPlayer.getPlayerName());
	}
	
	
	
	
	
	
	
	
	
	
 
	
	
	
	
	
	
	

}
