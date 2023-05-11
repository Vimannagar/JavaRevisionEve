package interfacedisc;

public class Test implements Interface1{

	
	public void m1() {
		
		System.out.println("M1 method ");
	}

	
	public void m2() {
		System.out.println("M2 method ");
		
	}

	
	public void m3() {
		
		System.out.println("M3 method ");
	}

	
	
	public static void main(String[] args) {
		Test t = new Test();
		
		t.m1();
		
		t.m2();
		
		t.m3();
		
		
		
	}
}
