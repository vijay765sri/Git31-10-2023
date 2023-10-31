package arrays;

public class TwoDimesnisonalArray {

	public static void main(String[] args) {
		
	//	int a[][]=new int [3][2];
		
		/*a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		int a[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("lenth of rows"+(a.length));

		System.out.println("lenth of columns"+(a[2].length));
		
		for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.println(a[r][c]);
			}
		}
		
		//enhnced for loo[p
		
		for(int arr[]:a)
		{
			for(int x:arr)
				{System.out.println(x);
				}
				
		}
		
		

	}

}
