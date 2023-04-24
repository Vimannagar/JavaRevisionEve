package variables;

public class ThisKeyword {

	int i = 50;
	
	static int j = 100;
	
	
	
	
	public void m1()
	{
	int i = 10;
	
	System.out.println(this.i);
	
	System.out.println(this.j);
		
	}
	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		
		tk.m1();
	}
	
	
}
