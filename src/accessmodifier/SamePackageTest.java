package accessmodifier;

public class SamePackageTest {
	
	public static void main(String[] args) {
		
		
		Practice p = new Practice();
		
		p.m1();
		
		Practice.m2();
		
//		p.m3(); This method is private hence we will be able to access it inside the same class
		
		
		A a = new A();
		
		a.pm1();
		
	}

}
