package exceptionhandling;

public class FinallyBlock {
	
	
	public static void main(String[] args) {
		
		try 
		{
			int [] a = new int[3];
			
			a[0] = 50;
			a[1] = 20;
			a[2] = 30;
			a[3] = 58;
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index occur please check the array");
		}
		
		finally {
			System.out.println("This is finally");
			
		}
		
		
	}
	

}
