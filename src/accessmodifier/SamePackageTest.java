package accessmodifier;

public class SamePackageTest {
	
	public static void main(String[] args) {
		
		
		Practice p = new Practice();
		
		p.m1();
		
		Practice.m2();
		
//		p.m3(); This method is private hence we will be able to access it inside the same class
		
		
		A a = new A();
		
		a.pm1();
		
//		variable access test
		
		System.out.println(Practice.a);//public variable so it is accessible through out the project
		
		
		System.out.println(Practice.s);//default variable so it can be accessible throughout the same package only
//		System.out.println(Practice.d);// private so it cannot accessible outside the class
		
		System.out.println(A.b);// protected is accessible as for the same package it acts as default
		
		
	}

}
