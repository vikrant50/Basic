package in.ak.basic;

import java.util.Scanner;

public class PalindromeString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Scanner sc =new Scanner(System.in);
		String str="madam";
		String rev="";
		String orgStr=str;
		int len=str.length();
		
		for(int i=len-1 ;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(orgStr.equals(rev))
		{
			System.out.println(orgStr+ " Palindrome string ");
		}
		else
		{
			System.out.println(orgStr+ " Not palindrome String");
		}
		
		
		

	}

}
