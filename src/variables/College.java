package variables;

public class College {
	
	
	String studentname;
	static String collegename;
	double percentage;
	int age; 
	static String collegecity;
	public static void main(String[] args)
	{
		collegename = "coep";
		
		collegecity = "pune";
		
		College student1 = new College();
		
		student1.studentname = "Eder";
		
		student1.percentage = 50.56;
		
		student1.age = 12;
		
		
		College student2 = new College();
		
		student2.studentname = "Daniel";
		
		student2.percentage = 70;
		
		student2.age = 13;
		
		College student3 = new College();
		
		student3.studentname = "Diana";
		
		student3.percentage = 60;
		
		student3.age = 13;
		
		College student4 = new College();
		
		student4.studentname = "Ron";
		
		student4.percentage = 80;
		
		student4.age = 12;
		
		
		
		System.out.println(student3.percentage);
		System.out.println(student1.percentage);
		
		
		
	}

}
