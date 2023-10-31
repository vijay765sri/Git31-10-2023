package arrays;

public class SumofElementsinArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int sum=0;
		/*for(int i=0; i<=4;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum oa array element"+ sum);*/
		

		for(int value : a)
		{
			sum=sum+value;
		}
		System.out.println("Sum oa array element"+ sum);
	}

}
