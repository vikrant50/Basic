package in.ak.basic;

import java.util.Scanner;

public class PrimePrint {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;

		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp++;
					break;
				}
			}
		}
		if(temp==2)
		{
			System.out.println("this no is prime no");
		}
		else
		{
			System.out.println("this no is prime no");
		}
		
		}
	
	}
