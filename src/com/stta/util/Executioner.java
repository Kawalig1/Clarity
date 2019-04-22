package com.stta.util;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Executioner {

	
	public void runTest() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, IOException {
		
		 ReadExcelFile file = new ReadExcelFile();
	     
	        //Read keyword sheet
	        Sheet xlsSheet = file.readExcel(System.getProperty("user.dir")+"\\","src\\com\\JLT\\Clarity\\Config\\TestRepository.xlsx" , "TestCases");
	      //Find number of rows in excel file
	    	int rowCount = xlsSheet.getLastRowNum()-xlsSheet.getFirstRowNum();
	    	//Create a loop over all the rows of excel file to read it
	    	for (int i = 1; i < rowCount+1; i++) {
	    		//Loop over all the rows
	    		Row row = xlsSheet.getRow(i);
	    		//Check if the first cell contain a value, if yes, That means it is the new test case name
	    		if(row.getCell(0).toString().contains("EndOFTest")){
	    		
	    			System.out.println("Test case ends here");
	    			break;
	    	    }
	    		else{
	    			//Print the new  test case name when it started
	    				
	    			System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
	    			Class <?> obj = Class.forName(row.getCell(0).toString());
	    		  	//Method[] methods=obj.getDeclaredMethods();
	    			//Method method=null;
	    			
	    			//System.out.println(methods.length);
	    			for (Method method:obj.getDeclaredMethods()  )	    			
	    			try {
	    				//Method method=null;
	    				method.invoke(obj.newInstance());
	    			} catch (IllegalArgumentException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			} catch (InstantiationException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			} 
	    			}
	   	}	}
	}

	

