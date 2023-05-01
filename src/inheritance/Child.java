package inheritance;

public class Child  extends Parent{
	
//	Here after writing extends keyword Child becomes subclass and Parent becomes super class
	

	public void bike()
	{
		System.out.println("Bike method from Child class");
	}
	
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.bike();
		
		c.car();
		
		surname();
		
		c.property();
		
		
		
		
	}
}
