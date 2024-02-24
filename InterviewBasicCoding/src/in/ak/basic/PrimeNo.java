package in.ak.basic;

public class PrimeNo {

	public static void main(String[] args) 
	{	
		int num=5;
		
		int temp=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%1==0)
			{
				temp++;
			}
		}
		if(temp==2)
		{
			System.out.println("it is prime no ");
		}
		else
			System.out.println("not prime no");
	}
}
