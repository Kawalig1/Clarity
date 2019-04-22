package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandeling {

	public static void main(String[] args)  {
		
		File Fs = new File("C:\\test1.txt");
		try {
			FileReader FR = new FileReader(Fs);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			
			System.out.println("In Final Block of Code");
		}
	}

}
