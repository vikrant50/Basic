package in.ak.basic;

import java.util.Scanner;

public class CountNo {

	public static void main(String[] args) 
	{
		// 12345=  5
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int count =0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		

	}

}
