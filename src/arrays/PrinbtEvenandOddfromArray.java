package arrays;

public class PrinbtEvenandOddfromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		//int even=0;
		//int odd=0;
		/*System.out.println("Even Numbers in Array");
		for(int i =0; i<=5;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Even Numbers in Array");
		for(int i =0; i<=5;i++)
		{
			if (a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}*/
		
		for(int value:a)
		{
			if(value%2==0)
			System.out.println(value);
		}

	}

}
