package accessmodifier;

public class Child extends Parent {

	static final int a = 20;
	
	public void bike()
	{
		System.out.println("Bike method from Child class");
	}
	
	public void marry()
	{
		System.out.println("marry method from Child class");
	}
	
	
	public static void main(String[] args) {
		Child c = new Child();
		c.home();
		
		c.car();
		
		c.surname();
		
		c.marry();
		
		
		System.out.println(a);
		
//		a= 60; here a is final hence we cannot re initialize / update the value.
	}
}
