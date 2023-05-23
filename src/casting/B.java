package casting;

public class B extends A{
	
	public static void main(String[] args) {
		
		
	B b = new B();
	
	A aa = (A)b;// Up casting
	
	
	A a = new A();
	
//	B bb = (B)a;// Down casting this will give an exception - classcast exception
	
	 B bbb = (B)aa;
	
	
	
	

	
	
	}

}
