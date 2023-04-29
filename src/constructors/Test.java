package constructors;

public class Test {
	
	
	public Test()
	{
		System.out.println("zero argument constructor is executing");
	}
	
	public Test(int i)
	{
		
		this();
		System.out.println("one argument constructor is executing");
		
		System.out.println(i);
	}
	
	public Test(String s)
	{
		this(20); 
		System.out.println("Constructor with String argument");
	}
	
	public Test(String s1, String s2)
	{
		this(20); 
		System.out.println("Constructor with String argument");
	}
	
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println("*********************************");
		
		Test t1 = new Test(5);
		
		System.out.println("*********************************");
		
		Test t2 = new Test("Hello");
		System.out.println("*********************************");
		Test t3 = new Test("Hello", "Class");
	}
	
	
	

}
