package stringclassdisc;

public class ConceptOfString2 {

	public static  void main(String[] args) {

		String s1 = "abc";

		s1.concat("def");

		System.out.println(s1);// abc---> String is immutable class
		
		
		
		StringBuffer sb = new StringBuffer("abc");
		
		sb.append("def");

		System.out.println(sb);//abcdef --> StringBuffer is called as Mutable class
		
		
	
	}

}
