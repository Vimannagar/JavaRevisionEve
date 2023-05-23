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
	
	
//	split: 
	
	String s20 = "Today is saturday";

	String[] s21 = s20.split(" ");
	
	
	
	for(String s22:s21)
	{
		System.out.println(s22);
	}
	
	
	
//	WAP to remove the un - ncessarily addred space from the Sting- "   this     is String"
	
	
	String s23 = "kjashdjsSDAnjnASDSA";
	
	
	String s24 = s23.replaceAll("[A-Z]", "");
	
	System.out.println(s24);//kjashdjsnjn
	
	String s25 = s23.replaceAll("[a-z]", "");
	System.out.println(s25);//SDAASDSA
	
	
	String s26 = s23.replaceAll("[A-C]", "");
	
	System.out.println(s26);//kjashdjsSDnjnSDS
	
	String s27 = "AccEn%t7ure";
	
	String s28 = s27.replaceAll("[^A-Za-z]", "");
	
	System.out.println(s28);//AccEnture
	
	
	
//	WAP to remove the digits from the String
	
	String s29 = s27.replaceAll("[0-9]", "");
	
	System.out.println(s29);
	
	
	String s30 = s27.replaceAll("[^A-Za-z0-9]", "");
	
	System.out.println(s30);//AccEnt7ure
	
	
	char [] chararray = s30.toCharArray();
	
	for(char ch :chararray)
	{
		System.out.println(ch);
	}
	
//	Non primitive to primitive
	
	String s31 = "10";
	
	int s32 = Integer.parseInt(s31);//10
	
	System.out.println(s32);
	
	String s33 = "58.56";
	
	double s34 = Double.parseDouble(s33);
	
	System.out.println(s34);//58.56
	
	
//	Primitive to non primitive:
	
	int s35 = 40;
	
	String s36 = String.valueOf(s35);
	
	System.out.println(s36+5);//405
	
	boolean s37 = true;
	
	String s38 = String.valueOf(s37);
	
	System.out.println(s38);//true
	}

}
