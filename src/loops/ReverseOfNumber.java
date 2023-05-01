package loops;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		
		int number = 12345;
		int remainder; 
		
		
		while(number!=0)
		{
			remainder = number %10;
			System.out.print(remainder);
			
			number = number /10;
		}
		
	}

}
