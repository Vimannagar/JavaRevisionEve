package exceptionhandling;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		
		int i = 10;
		
		int j = 0;
		
		try {
		
		int k = i/j;
		
		System.out.println(k);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception arrives inside the try block");
		}
		
		
		System.out.println("After the catch block");
		
		
		
		
	}

}
