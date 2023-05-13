package exceptionhandling;

public class MultiCatch3 {
	
	public static void main(String[] args) {
		int k = 0;
		try
		{
			int i = 10;
			int j = 0;
			
			 k = i/j;
			
		}
		
		
		catch(ArithmeticException e )
		{
			System.out.println("AE arrived");
		}
		catch(NullPointerException e)
		{
			System.out.println("NPE arrived ");
		}
		
		catch(Exception e)
		{
			System.out.println("Run time exception catch is running");
			
		}
		
		
		
		
		
		
	}

}
