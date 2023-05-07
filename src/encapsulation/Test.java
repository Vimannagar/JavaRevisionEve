package encapsulation;

public class Test {

	String username;
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
	
	
	public String getName()//Getter method
	{
		String name = "Ron";
		
		return name;
	}
	
	
	
	public void setUsername(String uname)// Setter method
	{
		username= uname;
	}
}
