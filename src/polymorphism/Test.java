package polymorphism;

public class Test {
	
	
	public void m1()
	{
		System.out.println("m1 method with no argument");
		
	}
	
	
	 static void m1(int i)
	{
		System.out.println("m1 method with int argument");
		
	}
	
	public String m1(double d, boolean b)
	{
		int a = 50;
		int f = 60;
		
		int c = a+f;
		
		String s = "abc"+c;
		
		return s;
		
	}
	
	public void m1(boolean b, double d)
	{
		System.out.println("Method with 2 arguments");
	}

	
	public static void main(String[] args) {
		Test t = new Test();
		
		t.m1();
		
		t.m1(10);
	}
	

}
