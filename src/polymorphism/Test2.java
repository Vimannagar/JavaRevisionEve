package polymorphism;

public class Test2 {

	
	
	
	
	
	public static void main() {
		System.out.println("second main method");
	}
	
	
	public void m1(String s)
	{
		System.out.println("String specific method");
	}
	

	public void m1(StringBuffer s)
	{
		System.out.println("StringBuffer specific method");
	}
	
	public static void main(String[] hjhjhdsjd) {
		Test2 t2 = new Test2();
		t2.m1("abc");//--> Error because null value is applicable for both String and StringBuffer specific mehtod.
		
		
	}
	
	
	
}
