package in.ak.basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		// Palindrome 1st need to be reverse then compare to oriznal no

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int rev=0;
		int orgNo=num;
		
		while(num>0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
	
		if(orgNo==rev)
		{
			System.out.println(orgNo+ " Palindrome number");
		}
		else
		{
			System.out.println(orgNo+ " Not palindrome number");
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
