package in.ak.basic;

public class sumOfDigit {

	public static void main(String[] args)
	{
		// sum of digit 
		
		int num=12324;
		
		int sum=0;
		int rem;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);

	}

}
