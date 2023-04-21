package variables;

public class NonStaticVariable {
	
	String s = "Pune";
	
	static int i = 50;
	
	public static void main(String[] args) {
		
		NonStaticVariable nsv1 = new NonStaticVariable();
		
		System.out.println(nsv1.s);//Pune
		
		
		nsv1.s = "Mumbai";
		
		
		System.out.println(nsv1.s);//Mumbai
		
		NonStaticVariable nsv2 = new NonStaticVariable();
		
		System.out.println(nsv2.s);//Pune
		
		System.out.println(nsv1.s);//Mumbai
		
		
		
		NonStaticVariable nsv3 = new NonStaticVariable();
		
		nsv2.s = "Bangalore";
		
		
		System.out.println(nsv3.s);
		
		System.out.println(i);//50
		
		nsv1.i = 60;
		
		System.out.println(nsv1.i);//60
		
		System.out.println(nsv2.i);//60
		
		
		
		
	}
	
	

}
