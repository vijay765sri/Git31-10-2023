package day1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num =sc.nextInt();
		int or_num = num;
		
		int rev =0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num=num/10;
		}
		
		if(or_num==rev)
		{
			System.out.println("Number is a palindrome number");
		}
		else
		{
			System.out.println("Number is not palindrome num");
		}

	}

}
