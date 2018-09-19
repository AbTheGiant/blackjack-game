package core;

public class BlackJackStarter {
	
	
	public static void main( String[] args )
    {
        System.out.println( "welcome to casino " );
        
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
