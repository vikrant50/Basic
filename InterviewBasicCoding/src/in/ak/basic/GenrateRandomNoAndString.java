package in.ak.basic;

import java.util.Random;

public class GenrateRandomNoAndString {

	public static void main(String[] args) 
	{
		//Approch 1 - Random
		Random rand=new Random();
		
		int rand_int=rand.nextInt(1000);
		System.out.println(rand_int);

	}

}
