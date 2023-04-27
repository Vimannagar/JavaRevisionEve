package loops;

public class FactorialOfANumber {
	
	
public static void main(String[] args) {
	
	int factorial = 1;
	int i = 1;
	
	int number = 5;
	
	while(i<=number)
	{
	factorial = factorial*i;
	
	i++;
	
	}
	
	
	System.out.println(factorial);
	
	
}
}
