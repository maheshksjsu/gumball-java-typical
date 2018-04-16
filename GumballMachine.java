
public abstract class GumballMachine
{

    protected int num_gumballs;

    abstract void insertCoin(int coin);
    abstract boolean hasSufficientCredit();
    abstract void resetCredit();
    
    public void turnCrank()
    {
    	if ( this.hasSufficientCredit())
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.resetCredit();
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "No sufficient funds" ) ;
    	}        
    }
}
