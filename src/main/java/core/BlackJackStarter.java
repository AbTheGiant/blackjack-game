package core;

public class BlackJackStarter {
	
	
	public static void main( String[] args )
    {
        System.out.println( "Welcome to The BlackJack Game " );
        
        try
        {
        
        new BlackJackGame().run(args);
        }
        
        catch (Exception ex)
        {
        	System.out.println(ex.getMessage());
        	
        }
    }

}
