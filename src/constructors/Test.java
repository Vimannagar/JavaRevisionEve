package constructors;

public class Test {
	
	
	public Test()
	{
		System.out.println("zero argument constructor is executing");
	}
	
	public  Test(int i)
	{
		System.out.println("one argument constructor is executing");
	}
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
	}
	
	
	

}
