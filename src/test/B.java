package test;

import accessmodifier.A;

public class B extends A {
	
	public static void main(String[] args) {
		
		A a = new A();
		
//		a.pm1();
		
		A.pm2();// can be accessible as it is static and inside the child class
		
		B b = new B();
		
		b.pm1();
		
		pm2();//can be accessible as it is static and inside the child class
		
		B.pm2();//can be accessible as it is static and inside the child class
		
		
//		Protected = <default> for within package + using child class reference variable inside child class only for outside package
		
		
		System.out.println(A.b);
		
//		System.out.println(a.c);// protected so can be accessible through child class reference variable only
		
		
		
		
		
	}

}
