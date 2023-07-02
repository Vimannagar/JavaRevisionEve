package collectiondiscussion;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	
	
	public static void main(String[] args) {
		
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		
		hm.put("US", "Washington");
		hm.put("Canada", "Toronto");
		hm.put("Brazil", "Rio De janario");
		hm.put("SouthAfrica", "Capetown");
		hm.put("US", "Tampa");
		hm.put("RSA", "Capetown");
		
		System.out.println(hm);
		
		
//		methods inside HashMap
		
		Set<String> allkeys = hm.keySet();
		
		System.out.println(allkeys);//[Canada, RSA, SouthAfrica, Brazil, US]
		
		Collection<String> allvalues = hm.values();
		
		System.out.println(allvalues);//[Toronto, Capetown, Capetown, Rio De janario, Tampa]
		
		String value = hm.get("Brazil");
		
		System.out.println(value);
		
boolean ispresent = hm.containsKey("Cyprus");

System.out.println(ispresent);//false

boolean ispresent2 = hm.containsValue("Toronto");


System.out.println(ispresent2);//true


Set<Entry<String, String>> allkeyvalue = hm.entrySet();

for(Entry<String, String> keyvalue :allkeyvalue)
{
	String key = keyvalue.getKey();
	
	String value2 = keyvalue.getValue();
	
	boolean istownpresent = value2.contains("town");
	
	if(istownpresent)
	{
		System.out.println(key);
	}
	
//	System.out.println(key+" "+ value2);
}


		
	
	}

}
