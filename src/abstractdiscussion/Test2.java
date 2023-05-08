package abstractdiscussion;

public class Test2 extends Test
{


	public void m4() {
		
		System.out.println("m4 method completed by Test2 class");
	}

	public void m5() {
		
		System.out.println("m5 method completed by Test2 class");	
	}

	public void m6() {
		
		System.out.println("m6 method completed by Test2 class");
	}

	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.m1();
		
		t2.m4();
		
		Test t = new Test2();
		
		t.m1();
		
		t.m4();
	}
}
