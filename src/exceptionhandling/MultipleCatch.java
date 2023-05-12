package exceptionhandling;

public class MultipleCatch {
	
	public static void main(String[] args) {

		int i = 10;
		
		int j = 0;
		
		try {
		
		int k = i/j;
		
		System.out.println(k);
		}
		
		
		catch(NullPointerException e)
		{
			System.out.println("Null pointer Exception arrives inside the try block");
		}
		
		catch(ArithmeticException m)
		{
			System.out.println("Arithmetic exception arrives ");
		}
		
		
		System.out.println("After the catch block");
	}

}
