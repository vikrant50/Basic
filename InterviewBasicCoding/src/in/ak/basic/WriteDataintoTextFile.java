package in.ak.basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoTextFile {

	public static void main(String[] args) throws IOException 
	{
		
		FileWriter fw=new FileWriter("path paste here ");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Java");
		bw.write("Java programmnig");
		bw.write(" learn Java");
		
		System.out.println("Finished !!!!!!!!");
		bw.close();
		

	}

}
