package inheritance;

public class Parent extends GrandParent  {
	
	int i = 10;
	
	public void home()
	{
		System.out.println("Home method from parent class");
	}
	
	public static void surname()
	{
		System.out.println("surname method from parent class");
	}

	
	public void car()
	{
		System.out.println("Car method from parent class");
	}

	
	public void furniture()
	{
		System.out.println("furniture method from parent class");
	}
	
	
	public static void main(String[] args) {
		Parent p = new Parent();
		
		
	}

}
