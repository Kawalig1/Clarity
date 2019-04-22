package com.stta.utility;

import java.io.IOException;

public class SuiteUtility
{	
	public static boolean checkToRunUtility(Read_XLS xls, String sheetName, String ToRun, String testSuite) throws IOException, InterruptedException
	{
		long starttime1 = System.currentTimeMillis();
		//System.out.println("Inside checkToRunUtility ");
		boolean Flag = false;		
		
		//System.out.println("sheetName1:"+sheetName+"ToRun1:"+ToRun+"testSuite1:"+testSuite);
		
		if(xls.TestExecution(sheetName,ToRun,testSuite)){
			Flag = true;
			//System.out.println("FLAG1:"+Flag);

		}
		else
		{
			Flag = false;
			//System.out.println("FLAG2:"+Flag);

		}
		
		//System.out.println("FLAG:"+Flag);
		long endtime1 = System.currentTimeMillis();
		
		System.out.println("\n------------------------------------------------------");
	  System.out.println("Execution Time: checkToRunUtility" + (endtime1 - starttime1)/60000 + " min " + (((endtime1 - starttime1)/1000)%60 + " sec")+ (((endtime1 - starttime1)/1000)%60)%100 + "millisec");
		//long ExecTime = (endtime - starttime);
		//Add_Log.info("Time for verifyOpptyDetails():"+ExecTime);
	    //Add_Log.info("Time for verifyOpptyCreatedFromContact():"+ExecTime);	
			
		return Flag;		
	}
	
	
	public static String[] checkToRunUtilityOfData(Read_XLS xls, String sheetName, String ColName)
	{		
		return xls.retrieveToRunFlagTestData(sheetName,ColName);		 	
	}
 
	
	public static Object[][] GetTestDataUtility(Read_XLS xls, String sheetName)
	{
		System.out.println("Inside GetTestDataUtility ");
		System.out.println("sheetName:"+sheetName);
	 	return xls.retrieveTestData(sheetName);	
	}
 
	
	public static boolean WriteResultUtility(Read_XLS xls, String sheetName, String ColName, int rowNum, String Result)
	{	
		System.out.println("xls:"+xls+"sheetName:"+sheetName+"ColName:"+ColName+"rowNum:"+rowNum+"Result:"+Result);
		System.out.println("Inside WriteResult");
		return xls.writeResult(sheetName, ColName, rowNum, Result);		 	
	}
	
 
	public static boolean WriteResultUtility(Read_XLS xls, String sheetName, String ColName, String rowName, String Result)
	{	
		System.out.println("Read_XLS:"+xls);
		System.out.println("sheetName:"+sheetName);
		System.out.println("ColName:"+ColName);
		System.out.println("ColName:"+rowName);
		System.out.println("ColName:"+Result);
		return xls.writeResult(sheetName, ColName, rowName, Result);		 	
	}
}