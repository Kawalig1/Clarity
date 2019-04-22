package Clarity1_2;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Testing {

	public static void main(String[] args) 
	{
		System.out.println("Hello World");

	}

	private FileInputStream ipstr;
	private HSSFWorkbook wb;
	private HSSFSheet ws;



public void Read_XLS(String filelocation)
{		
	System.out.println("new filelocation is: " +filelocation);
	try
	{
		ipstr = new FileInputStream(filelocation);
		wb = new HSSFWorkbook(ipstr);
		ws = wb.getSheetAt(0);
		ipstr.close();
	}
	catch (Exception e)
	{			
		e.printStackTrace();
	} 
}
}