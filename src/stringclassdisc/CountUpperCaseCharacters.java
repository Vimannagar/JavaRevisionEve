package stringclassdisc;

public class CountUpperCaseCharacters {
	
	public static void main(String[] args) {
		
		
		String s = "HElLO";
		
//		ASCII value for A = 65 and Z = 90
			
//		char c = 'Z';
//		
//		int i = c;
//		
//		System.out.println(i);
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			int y = ch;
			
			if(y>=65 && y<=90)
			{
				System.out.println(ch);
			}
			
		}
	}

}
