package day3;

import java.util.Scanner;

public class RevNumber {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		int num = sc.nextInt(); //1234
		
		//Using Algorithm
		/*int rev=0;
		while (num!=0)
		{
			rev =rev*10 + num%10;//0+5=5 50+4=54  540+3=543  5430+2=5432 54320+1=54321
			num=num/10;//1234  123  12 1 0
		}*/
		
		//StringBuffer rev;
		
	//	StringBuffer sb=new StringBuffer(String.valueOf(num));
		//StringBuffer rev = sb.reverse();
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reverse number is :"+rev);
	}

}
