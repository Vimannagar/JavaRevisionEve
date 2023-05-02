package loops;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		
		int number = 121;
		int remainder; 
		String reverse = "";
		
		String originalnum = String.valueOf(number);
	
		while(number!=0)
		{
			remainder = number %10;
			System.out.print(remainder);
			
			reverse = reverse  + remainder;
			
			
			number = number /10;
						
		}
		
		if(originalnum.equals(reverse))
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}

}
