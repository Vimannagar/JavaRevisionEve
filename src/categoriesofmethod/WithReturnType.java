package categoriesofmethod;

public class WithReturnType {
	
//	with return and no argument
	
	public static String m1()
	{
		String s = "city";
		
		System.out.println("This is with return and no argument");
			
		return "Pune"+s;
				
	}
	
//	1. Method logic execution
//	2. It will replace the method name with the return value.
	
	
	
//	With return and with argument
	
	public static int  areaCalculator(int length , int breadth)
	{
		int area = length * breadth;
		
		System.out.println(area);
		
		return area;
	}
	
	public static void main(String[] args) {
		
		String s = m1();
		
		System.out.println(s);
		
		int a = areaCalculator(20, 30);
		
		
		
		int b = a+50;
		
		System.out.println(b);//650
		
		
	}
	
	

}
