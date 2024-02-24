package in.ak.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile
{

	public static void main(String[] args) throws FileNotFoundException
	{
		

		//1st approact
//		FileReader fr=new FileReader("copy here file path");
//		
//		BufferedReader br=new BufferedReader(fr);
//		
//		String str;
//		
//		while(str = br.readLine())!= null)
//		{
//		 System.out.println(str);	
//		}
//		br.close();
		
		//Approcah 2 :  using Scanner & File
		
		File gile=new File("copy path here " );
		
		Scanner sc = new Scanner(System.in);
		
		//loop Statement 
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		
	}

}
