package inheritance;

public class Child  extends Parent{
	
//	Here after writing extends keyword Child becomes subclass and Parent becomes super class
	
	int i = 20;

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
		
		System.out.println(c.i);//20
		
		Parent p = new Parent();
		
		System.out.println(p.i);//10
		
		System.out.println(c.j);//50
		
	
		
	}
}
