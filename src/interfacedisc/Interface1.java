package interfacedisc;

public interface Interface1 {
	
	int i = 60;
	
	public void m1();
	
	public abstract void m2();
	
	void m3();
	
	
	public static void m4()
	{
		System.out.println("m4 from Interface1");
	}
	
	public static void main(String[] args) {
		
		System.out.println(i);
		
		m4();
		
		
	}
	
}
