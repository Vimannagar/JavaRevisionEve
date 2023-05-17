package exceptionhandling;

public class ThrowKeyword {
	
	public static void main(String[] args) {
		
		int i = 50;
		
		if(i<60)
		{
			throw new ArithmeticException();
		}
		
		
		System.out.println("After exception");
	}

}
