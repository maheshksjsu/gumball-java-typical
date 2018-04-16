public class GumballMachineType1 extends GumballMachine
{

    private int credit;

    //constructor
    public GumballMachineType1( int size )
    {
        this.num_gumballs = size;
        this.credit = 0;
    }

    public void insertCoin(int coin)
    {
        if ( coin != 25 )
        {
            System.out.println("Only quarters accepted.");
            return;
        }

        this.credit += coin;
        System.out.printf("Credited:%d\n", this.credit);
    }

    public boolean hasSufficientCredit()
    {
        if (this.credit >= 25)
            return true;
        else
            return false;
    }

    public void resetCredit()
    {
        this.credit -= 25;
    }
    
}
