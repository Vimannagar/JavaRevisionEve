package accesstest;

import accessmodifier.Practice;

public class OutsidePackage {
	

	public static void main(String[] args) {
		
		
		Practice p = new Practice();
		
		p.m1();// it is a public method hence it is accessible
		

//		Practice.m2();// m2 is a default method hence we will not be able to access it here
		
		
//		p.m3();// this is private method hence it cannot be accessible here
		
//		variable access test:
		
		System.out.println(Practice.a);//public variable so it is accessible through out the project
//		System.out.println(Practice.s);//default variable so it can be accessible throughout the same package only
		
	}
	
	
}
