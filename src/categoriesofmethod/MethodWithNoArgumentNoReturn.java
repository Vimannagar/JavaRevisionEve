package categoriesofmethod;

public class MethodWithNoArgumentNoReturn {
//no return and no argument
	public static void m1()
	{
		System.out.println("method with no return and no argument");
	}
	
//	no return and with argument
	
	public static void m2(int i)
	{
		System.out.println("method with no return and with  argument");
		
		System.out.println("i value is "+i);
	}
	
	
	
	
	public static void main(String[] args) {
		
		m2(80);
		
	}
	
}
