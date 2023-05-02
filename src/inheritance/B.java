package inheritance;

public class B extends A{
	
	int j= 20;
	
	int i = 90;
	
	public void m1()
	{
		int j = 50;
		System.out.println(j);//50
		System.out.println(i);//90
		System.out.println(this.j);//20
		System.out.println(super.i);//10
		
		System.out.println(this.z);//86
		

	}
	
	public static void main(String[] args) {
		B b = new B();
		
		b.m1();
		
		
	}
	

}
