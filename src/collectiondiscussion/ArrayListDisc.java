package collectiondiscussion;

import java.util.ArrayList;

public class ArrayListDisc {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("def");
		al.add("abc");
		al.add("ghi");
		
		System.out.println(al);//[def, abc, ghi]
		
		
		String zerothelement = al.get(0);
		
		System.out.println(zerothelement);//def
		
//		to remove data
		
		
		al.remove("ghi");
		
		System.out.println(al);//[def, abc]
		
//		to check whether the element is present inside the list or not
		
		boolean ispresent = al.contains("def");
		
		System.out.println(ispresent);//true
		
		
//		To update the value 
		
		al.set(1, "xyz");
		
		System.out.println(al);//[def, xyz]
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("wxy");
		
		al2.addAll(al);// To add one arraylist to another 
		
		System.out.println(al2);// [wxy,def, xyz]
		
		
		al2.add("def");
		
		System.out.println(al2);
		
		al2.add(null);
		al2.add(null);
		al2.add(null);
		al2.add(null);
		
		System.out.println(al2);
		
		
		 int length = al.size();
		 
		 System.out.println(length);
		
	}

}
