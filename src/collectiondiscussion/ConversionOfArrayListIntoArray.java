package collectiondiscussion;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionOfArrayListIntoArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pune");
		al.add("mumbai");
		al.add("Bangalore");
		al.add("Ahemdabad");
		al.add("Chennai");

//		conversion of ArrayList into array

		String[] scity = new String[al.size()];

		String[] arrayoflist = al.toArray(scity);

		for (String str : arrayoflist) {
			System.out.println(str);
		}
		
//		Convert Array into arraylist
		
		
		Integer a [] = new Integer[5];
		
		a[0] = 12;
		a[1] = 15;
		a[2] = 10;
		a[3] = 80;
		a[4] = 92;
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(a));
		
		System.out.println(al2);
		
		
 
	}

}
