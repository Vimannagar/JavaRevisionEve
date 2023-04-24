package methods;

public class Test {
	
	static int a = 20;
	
//	syntax of static method:
		
//		access_modifier static returntype nameofmethod()
//		{
//			actions
//		}
	
//	syntax of non static method:
	
//	access_modifier returntype nameofmethod()
//	{
//		actions
//	}
	
	public void m3()
	{
		System.out.println("m3 method");
	}
	
	
	
	public void m2()
	{
		System.out.println("non static m2 method");
		
		m3();
	}

	
		
	
	public static void m1()
	{
		System.out.println("M1 method");
	}
	
	
	
	
	public static void main(String[] args) {
		
		m1();
		
		Test.m1();
		
		Test t = new Test();
		
		t.m2();
		
	}

}
