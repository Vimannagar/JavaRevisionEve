package memorymanagement;

public class D extends E {
	
	
	
	public void m10()
	{
		a.m1();
		b.m4();
		c.m8();
	}
	
	public void m11()
	{
		c.m9();
		a.m3();
		b.m6();
	}
	
	
	
	public static void main(String[] args) {
		
		D d = new D();
		
		d.m10();
		
		d.m11();
		
		
		
	}

}
