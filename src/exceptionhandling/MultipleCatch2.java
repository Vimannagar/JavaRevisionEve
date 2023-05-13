package exceptionhandling;

public class MultipleCatch2 {
	
	Test2 t2;

	
	
	public void m2()
	{
		System.out.println("This is m2 method from Multicatch2 class");
		
		t2.m1();
	}
	
	
	public static void main(String[] args) {
		
		MultipleCatch2 var = new MultipleCatch2();
		
		
		var.m2();
		
		
		
		
	}

}
