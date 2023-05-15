package exceptionhandling;

public class TryWithFinally {
	
	
	public static void main(String[] args) {
		try
		{
			System.out.println("This is risky code");
			
			int i = 10/0;
		}
		finally
		{
			System.out.println("This is finally");
		}
	}

}
