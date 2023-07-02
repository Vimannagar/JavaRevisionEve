package collectiondiscussion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterface {
	
	
	public static void main(String[] args) {
		
//		Vector<Boolean> v = new Vector<Boolean>();
//		
//		v.addElement(true);
//		
//		v.addElement(true);
//		v.addElement(false);
//		
//		System.out.println(v);
		
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Pune");
		hs.add("mumbai");
		hs.add("Bangalore");
		hs.add("Ahemdabad");
		hs.add("Chennai");
		hs.add("Bangalore");
		hs.add("mumbai");
		
		System.out.println(hs);
		
Integer a [] = new Integer[5];
		
		a[0] = 12;
		a[1] = 15;
		a[2] = 10;
		a[3] = 80;
		a[4] = 12;
		
//		Removing duplicate from Array using HashSet
		HashSet<Integer> hs1 = new HashSet<Integer>(Arrays.asList(a));
		
		System.out.println(hs1);//[80, 10, 12, 15]
		
		
//		Removing duplicate from Array using LinkedHashSet
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(a));
		
		System.out.println(lhs);//[12, 15, 10, 80]
		
		
		
		
	}

}
