package arraydisc;

public class DefiningArray {
	
	
	public static void main(String[] args) {
		
		 int a[] = new int[5];
		
		 a[0] = 5;
		 a[1] = 10;
		 a[2] = 1; 
		 a[3] = 9;
		 a[4] = 90;
		 
		 System.out.println(a[4]);
		 
		 for(int i = 0; i<a.length; i++)
		 {
			 System.out.println(a[i]);
		 }
		
		 
		int size = a.length;
		
		
		System.out.println(size);
		
		
//		another way to define the array:
		
		String[] s = {"abc", "def", "ghi"};
		
		System.out.println(s.length);//3
		
		System.out.println(s[1]);
		
		 
//		Assignment: WAP to add all the elements present inside an int array
//		WAP to add all the elements which are available at even index position
//		WAP to add all the elements which are available at odd index position
//		WAP to print the addition of number from Array which are odd and even
			
//		WAP to swap two numbers from an array 5 and 8
//		int a[] = {5, 8, 17, 60};
		

	}
	
	

}
