package in.ak.basic;

public class SwapNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		System.out.println("value of a is before swapping : "+a);
		System.out.println("value of b is before swapping : "+b);
		
		
		//using 3rd variable 
//		int temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("value of a is after swapping : "+a);
//		System.out.println("value of b is after swapping : "+b);
		
		
		//logic 2 without using 3rd variable 

		a=a+b;//10+20=30;
		b=a-b;//30-20=10;
		a=a-b;//30-10=20;
		System.out.println("value of a is after swapping : "+a);
		System.out.println("value of b is after swapping : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
	}

}
