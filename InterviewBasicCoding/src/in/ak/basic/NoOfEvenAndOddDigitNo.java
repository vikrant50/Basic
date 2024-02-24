package in.ak.basic;

import java.util.Scanner;

public class NoOfEvenAndOddDigitNo {

	public static void main(String[] args) 
	{
		// check how many even no and oddd no 
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int evenCount=0;
		int oddCount=0;
		
		while(n>0)//1234   //123 //12 //1 exit
		{
			int rem = n%10;//4  //3 //2 //1
			if(rem%2==0)
			{
				evenCount++;//1   //2
			}
			else
			{
				oddCount++;//1 //2
			}
			n=n/10;//123   //12  //1 0
		}
		System.out.println(evenCount);
		System.out.println(oddCount);

	}

}
