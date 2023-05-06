package accessmodifier;

 public class Practice {
	
	 public static int a = 50;
	 
	 static String s = "Pune";
	 
	 private static double d = 78.23;
	
	public void m1()
	{
		System.out.println("public m1 method from Practice class");
	}
	
	static void m2()
	{
		System.out.println("default static method from Practice class");
	}

	private void m3()
	{
		System.out.println("private m3 method from Practice class");
	}
	
	public static void main(String[] args) {
		
		Practice p = new Practice();
		
		p.m3();
		
		System.out.println(Practice.d);
	}
	
}
