package constructors;

public class College {
	String studentname;
	static String collegename = "coep";
	double percentage;
	int age; 
	static String collegecity = "Pune";
	
	
	
	public College(String sname, double pcent, int age )
	{
		studentname = sname;
		percentage = pcent;
		this.age = age;
		
	}
	
	public static void main(String[] args) {
		
		 College s1 = new College("Eder", 40, 12);
		 
		 College s2 = new College("Ron", 80, 13);
		 
		 College s3 = new College("Diana", 60, 14);
		 
		 System.out.println(s2.studentname);
		 
		
	}
	
	
}
