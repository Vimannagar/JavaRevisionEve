package variables;

public class StaticVariables {
	
	static int a = 50;
	
	
	public static void main(String[] args) {
		
		System.out.println(a);//if staticvariable is inside the same class
		
		System.out.println(StaticVariables.a);//if static variable in any class
		
		
		StaticVariables sv = new StaticVariables();
		
		System.out.println(sv.a);
		
	}
	
	

}
