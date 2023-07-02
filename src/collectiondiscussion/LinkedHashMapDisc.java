package collectiondiscussion;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDisc {
	
	
	public static void main(String[] args) {
		
LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		
		
		lhm.put("US", "Washington");
		lhm.put("Canada", "Toronto");
		lhm.put("Brazil", "Rio De janario");
		lhm.put("SouthAfrica", "Capetown");
		lhm.put("US", "Tampa");
		lhm.put("RSA", "Capetown");
		
		System.out.println(lhm);
	}

}
