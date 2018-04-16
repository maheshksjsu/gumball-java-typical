
public class GumballMachineType3 extends GumballMachine
{

    private int credit;

    //constructor
    public GumballMachineType3( int size )
    {
        this.num_gumballs = size;
        this.credit = 0;
    }

    public void insertCoin(int coin)
    {
        if ( coin != 25 &&
             coin != 10 &&
             coin != 5 )
        {
            System.out.println("Only nickels, dimes or quarters accepted.");
            return;
        }

        this.credit += coin;
        System.out.printf("Credited:%d\n", this.credit);
    }

    public boolean hasSufficientCredit()
    {
        if (this.credit >= 50)
            return true;
        else
            return false;
    }

    public void resetCredit()
    {
        this.credit -= 50;
    }
    
}
