package arraydisc;

public class SwappingOf2Numbers {
	
	
	public static void main(String[] args) {
		
		int a[] = {0, 8, 17, 5};
		
//		int i = 0;
//		
//		i = a[0];
//		
//		a[0] = a[1];
//		
//		a[1] = i;
//		
//		for(int aa :a)
//		{
//			System.out.print(aa);
//		}
		
		
		int i = 0;
		
		int j = 0;
		
		for(int k = 0; k<a.length; k++)
		{
			if(a[k]==5)
			{
				i= k;
			}
			if(a[k]==8)
			{
				j=k;
			}
		}
		
		System.out.println(i);
		System.out.println(j);
		
		int l = 0;
		
		l = a[i];
		
		a[i] = a[j];
		
		a[j] = l;
		
		for(int aa :a)
		{
			System.out.print(aa);
		}
		
		
		
	}

}
