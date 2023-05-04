package loops;

public class First100PrimeNumbers {
	
	
	public static void main(String[] args) {
		
		int number = 2;
		
		int count = 0;
		
		while(count<100)
		{
		boolean isprime = true;
		
		for(int i= 2; i<number; i++)
		{
			if(number % i==0)
			{
				isprime = false;
				break;
			}
		}
		
		if(isprime)
		{
			System.out.println(number);
			count++;
		}
		
		number++;
		
		}
		
	}

}
