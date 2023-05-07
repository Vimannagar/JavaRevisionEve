package polymorphism;

public class B extends A {
	int y = 60;
	int z = 20;
	public void m1()
	{
		System.out.println("m1 method from B class");
	
	}

	
	public void m2()
	{
		System.out.println("non static m2 method from B class");
	}
	
	public void m4()
	{
		System.out.println("public non static method from A class");
	}
	
	
	public static void m5()
	{
		System.out.println(" static method m5 from B class");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.m1();// B class m1 method 
		
		b.m2();// B class m2 method
		
		b.m5();// B class m5 method
		
		System.out.println(b.x);//50
		
		System.out.println(b.z);//20
		A a =  new A();
		
		a.m1();// A class m1 method
		
		a.m2();  // A class m2 method
		
		a.m5(); // A class m5 method
		
		System.out.println(a.x);//50
		
		System.out.println(a.z);//10

		//		Parent_classname reference_variable = new ChildClassName();
		
		A aa = new B();
		
		aa.m1();// B class m1 method
		
		aa.m3();// A class m3 method
		
		aa.m5(); // A class m5 method
		
		System.out.println(aa.x);//50
		
		System.out.println(aa.z);//10
		
	}
}
