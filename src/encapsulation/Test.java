package encapsulation;

public class Test {

	
	private	int customerbalance = 50;
	
	
	public void getValue(int pin)
	{
		if(pin == 1234)
		{
		System.out.println(customerbalance);
		}
		
		else
		{
			System.out.println("Invalid pin please check and retry");
		}
	}
	
}
