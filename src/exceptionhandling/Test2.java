package exceptionhandling;

public class Test2 {
	
	

	public void m1()
	{
		System.out.println("This is m1 method");
	}
	
	
	public static void main(String[] args) {
		try {
		String s = null;
		
		String s1 = "abc";
		
		System.out.println(s.equals(s1));// null pointer exception
		}
		
		catch(NullPointerException e)
		{
			System.out.println("NPE arrived");
			
			String value = e.getMessage();
			
			System.out.println(value);
		}		
	}

}
