package stringclassdisc;

public class RemoveSpaceBetweenString {
	
	public static void main(String[] args) {
		
		String s = "    This   is       String    ";
		String withoutspace = "";
		
		
//		This   is       String
	String s1 = s.trim();
	
	for(int i=0; i<s1.length(); i++)
	{
		if((s1.charAt(i)== ' ') && (s1.charAt(i+1)== ' '))
		{
			continue;
		}
		else
		{
			withoutspace = withoutspace + s1.charAt(i);
		}
	}
	
	System.out.println(withoutspace);
		
	}

}
