package day3;

public class Swappingof2Numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before Swapping values are..."+a+" "+b);
		
		//Method --1  Using 3 rd variable
		/*int t=a;
		a=b;
		b=t;*/
		
		//Method --2  with out using 3rd variable(- and +)
		/*a=a+b;//30
		b=a-b;//10
		a=a-b;//20*/
		
		//Method 3 * and /
		a=a*b;//200
		b=a/b;//10
		a=a/b;//20
		
		//Method 4 
		a=a^b;
		b=a^b;
		a=a^b;
		
		//Logic
		b=a+b-(a=b);
		
		
		
		 System.out.println("After Swapping values are.."+a+" "+b);

	}

}
