package stringclassdisc;

public class MethodsOfStringClass {
	
	public static void main(String[] args) {
		
		String s1 = "Happy";
		
		int count = s1.length();
		
		System.out.println(count);//5
		
		System.out.println("*********************************");
		
		String s2 = "Welcome";
		
		char c = s2.charAt(2);
		
		System.out.println(c);
		
		System.out.println("*********************************");
		
		String s3 = "abc";
		
		String s4 = "Abc";
		
		boolean isequal = s3.equals(s4);
		
		System.out.println(isequal);//false
		
		
		System.out.println("*********************************");
		
		boolean isequals = s3.equalsIgnoreCase(s4);
		
		System.out.println(isequals);//true
		
		System.out.println("*********************************");
		
				String s5 = "This IS STRING";
				
				String s6 = s5.toLowerCase();
				
				System.out.println(s6);
				System.out.println("*********************************");	
//		Assignment: WAP to count number of upper case characters present inside the String
		
		String s7 = s5.toUpperCase();
		
		System.out.println(s7);
		
		System.out.println("*********************************");	
		
		
		String s8 = "Hyderabad";
		
		
		String s9 = s8.substring(3);
		
		System.out.println(s9);//erabad
		
		
		System.out.println("*********************************");	
		
		String s10 = "Jaipur";
		
		String s11 = s10.substring(0, 3);
		
		System.out.println(s11);//Jai
		
		System.out.println("*********************************");
		
		String s12 = "abcdef";
		
		String s13 = s12.replace('a', 'd');
		
		System.out.println(s13);//dbcdef
		
		System.out.println("*********************************");
		
		String s14 = "PuneCity";
		
		String s15 = s14.replace("City", "Mahanagar");
		
		System.out.println(s15);//PuneMahanagar
		
		
		
//		Assignment: WAP to replace all the space value from the String- This is String
		
		String s16 = "   this is String      ";
		
		String s17 = s16.trim();
		
		System.out.println(s17);//this is string
		
	System.out.println("**********************************");
		
	
	
	String s18 = "ahmedabad";
	
	int indexposition = s18.indexOf('a');
	System.out.println(indexposition);//0
	
	
	
	String s19 = "Denver";
	
	boolean isstartingwith = s19.startsWith("De");
	
	System.out.println(isstartingwith);//true
	
	
	boolean endswith = s19.endsWith("ers");
	
	System.out.println(endswith);//false
	
	
	
	
	
	}

}
