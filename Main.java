

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachineType1(5);
        System.out.println("\nType1");
		System.out.println(gumballMachine1);
		gumballMachine1.insertCoin( 25 );
		gumballMachine1.turnCrank();
        
        System.out.println("\nType2");
		GumballMachine gumballMachine2 = new GumballMachineType2(5);
        System.out.println(gumballMachine2);
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.turnCrank();

        System.out.println("\nType3");
		GumballMachine gumballMachine3 = new GumballMachineType3(5);
		System.out.println(gumballMachine3);
		gumballMachine3.insertCoin( 5 );
		gumballMachine3.insertCoin( 10 );
		gumballMachine3.insertCoin( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoin( 10 );
		gumballMachine3.turnCrank();
	}
}
