package arrays;

public class SingleDimensionArray {

	public static void main(String[] args) {
		
		/*int a[] = new int[5];
		a[0] = 100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		int a[] = {100,200,300,400,500,600,700};
		
		System.out.println(a[5]);
		
		System.out.println("Size of array" + a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int x:a)
		{
			System.out.println(x);
		}
		

	}

}
