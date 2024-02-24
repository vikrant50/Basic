package in.ak.basic;

import java.util.Scanner;

public class reverseNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	 Scanner sc =new Scanner(System.in);
	 
	 int n =sc.nextInt();
	
	 //1. logic using algorithm
	 int rev=0;
	 
	 while(n!=0)
	 {
		rev=rev*10 + n%10;
		n=n/10;
	 }
	 System.out.println(rev);
	 

	 
	}

}
