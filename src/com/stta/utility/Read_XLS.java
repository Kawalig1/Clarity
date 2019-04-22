package com.stta.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import com.stta.util.CreateResult;
import com.stta.util.Keywords;
import com.stta.CommonLibrary.CommonLibrary;



public class Read_XLS
{	
	
	public  String filelocation;
	public  FileInputStream ipstr = null;
	public  FileOutputStream opstr = null;
	private HSSFWorkbook wb = null;
	private HSSFSheet ws = null;
	public static Logger Add_Log = null;
	Keywords k = Keywords.getInstance();
	CommonLibrary c = CommonLibrary.getInstance();
	public long starttime, endtime;
	public HSSFCell Step;
	public String Stepval;
	//private HSSFCell res;
	
	
	
	public Read_XLS(String filelocation)
	{		
		this.filelocation = filelocation;
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
	
	
	//To retrieve No Of Rows from .xls file's sheets
	public int retrieveNoOfRows(String wsName)
	{		
		int sheetIndex=wb.getSheetIndex(wsName);
		if(sheetIndex==-1)
			return 0;
		else
		{
			ws = wb.getSheetAt(sheetIndex);
			int rowCount=ws.getLastRowNum()+1;		
			return rowCount;		
		}
	}
	
	
	//To retrieve No Of Columns from .cls file's sheets.
	public int retrieveNoOfCols(String wsName)
	{
		int sheetIndex=wb.getSheetIndex(wsName);
		if(sheetIndex==-1)
			return 0;
		else
		{
			ws = wb.getSheetAt(sheetIndex);
			int colCount=ws.getRow(0).getLastCellNum();			
			return colCount;
		}
	}
	
	
	public boolean TestExecution(String wsName, String colName, String rowName) throws IOException, InterruptedException
	{
		String value = null;
		int colCount = 0;
		int sheetIndex=wb.getSheetIndex(wsName);
		//System.out.println("sheetIndex:"+sheetIndex);
		if(sheetIndex==-1)
			return false;
		else
		{
			int rowNum = retrieveNoOfRows(wsName);
			System.out.println("rowNum"+rowNum);
			int colNum = retrieveNoOfCols(wsName);
			System.out.println("colNum"+colNum);			
			for(int i=0; i<=rowNum-1;i++){
				System.out.println("sheetIndex: "+sheetIndex);
				//Read_XLS TCFileLocation = new Read_XLS(
						//System.getProperty("user.dir") + "\\src\\com\\stta\\ExcelFiles\\TestSuiteList.xls");
				//System.out.println("TCFileLocation:" +TCFileLocation);
				//wb = new HSSFWorkbook(TCFileLocation);
				HSSFSheet sheet = wb.getSheet(wsName);
				HSSFRow Suiterow = sheet.getRow(i);
				String sheetname =sheet.getSheetName();
				//opstr = new FileOutputStream(filelocation);
				System.out.println("Rw "+i+" Col 1 value: "+Suiterow.getCell(1).getStringCellValue()+" |Sheetname: "+ sheetname);
				if(Suiterow.getCell(1).getStringCellValue().equalsIgnoreCase("Y"))
				{
					System.out.println("Inside if ");
					colCount=colCount+1;		
					//System.out.println("column:"+colCount);
					if(colCount>0){
						HSSFSheet sheet1 = wb.getSheet(wsName);
						HSSFRow row = sheet1.getRow(i);
						HSSFCell cell = row.getCell(0);
						
						System.out.println(row);
						System.out.println(cell);
						value = cellToString(cell);
						int sheetIndex1=wb.getSheetIndex(value);
						
						System.out.println("New SheetIndex: "+sheetIndex1);
						CreateResult.reportGenerator(value);
						
					System.out.println("end of row loop: "+sheetIndex);
					TCExecution (value);
					//CreateResult.EndReport();
					}
				}
			}
		}	
		return true;
		
	}
	
	public boolean TCExecution (String wsNameTC) throws InterruptedException, IOException {
		//Read_XLS TCFileLocation = new Read_XLS(
				//System.getProperty("user.dir") + "\\src\\com\\stta\\ExcelFiles\\"+wsNameTC+".xls");
		//System.out.println("TCFileLocation:" +TCFileLocation);
		
		int sheetIndex1=wb.getSheetIndex(wsNameTC);
		if(sheetIndex1==-1){
			return false;
		}
					else
					{
						int TCrowNum = retrieveNoOfRows(wsNameTC);
						System.out.println("rowNum"+TCrowNum);
						int TCcolNum = retrieveNoOfCols(wsNameTC);
						System.out.println("colNum"+TCcolNum);			
						for(int a=0; a<=TCrowNum-1;a++){
			
							for(int j=0; j<=TCcolNum-1;j++){
							HSSFRow TCrows = ws.getRow(a);
							HSSFCell TCcells = TCrows.getCell(j);
							System.out.println("TCrows: "+TCrows);
							System.out.println("TCcells: "+TCcells);
							String ACTION= cellToString(TCcells);
							System.out.println("ACTION: "+ACTION);
							String expectedText;
							
							switch (ACTION){
							case "input":
								System.out.println("inside case set");	
								HSSFCell TCcelllocator = TCrows.getCell(j-2);
								HSSFCell TCcellxpathkey = TCrows.getCell(j-1);
								HSSFCell TCcellval = TCrows.getCell(j+1);
								String locator = cellToString(TCcelllocator);
								String xpathkey = cellToString(TCcellxpathkey);
								String val = cellToString(TCcellval);
								//System.out.println("locator: "+locator);
								//System.out.println("xpathkey: "+xpathkey);
								//System.out.println("val: "+val);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								boolean result=c.input(xpathkey, val);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
							break;
							
							case "UploadDoc":
								TCcelllocator = TCrows.getCell(j-2);
								TCcellxpathkey = TCrows.getCell(j-1);
								TCcellval = TCrows.getCell(j+1);
								locator = cellToString(TCcelllocator);
								xpathkey = cellToString(TCcellxpathkey);
								val = cellToString(TCcellval);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								result=c.UploadDoc(val);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
							break;
							
							case "DeleteDoc":
								TCcelllocator = TCrows.getCell(j-2);
								TCcellxpathkey = TCrows.getCell(j-1);
								TCcellval = TCrows.getCell(j+1);
								locator = cellToString(TCcelllocator);
								xpathkey = cellToString(TCcellxpathkey);
								val = cellToString(TCcellval);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								result=c.DeleteDoc(val);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
							break;
							
							case "click" :
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 TCcellxpathkey = TCrows.getCell(j-2);
								// res=TCrows.getCell(j+2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  locator = cellToString(TCcellxpathkey);
								//String val = cellToString(TCcellval);
								System.out.println("locator: "+locator);
								System.out.println("xpathkey: "+xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								//System.out.println("val: "+val);
								
								result=c.click(xpathkey);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
								/*System.out.println("The Cell Value is: " +res);
								res.setCellValue("PASS");
								System.out.println("New Cell Value is: " +res);*/
								//wb.write(opstr);
								break;
							case "navigateURL":
								TCcellval = TCrows.getCell(j+1);
								val = cellToString(TCcellval);
								result=c.navigateURL(val);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
								
							break;
							
							case "clearElement":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 TCcellxpathkey = TCrows.getCell(j-2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  locator = cellToString(TCcellxpathkey);
								  result=c.clearElement(locator, xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
								break;
								
							case "clickSendMail":
								c.clickSendMail();
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,true);
							break;
							
							case "select":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-2);
								 TCcellxpathkey = TCrows.getCell(j-1);
								 TCcellval = TCrows.getCell(j+1);
								 Step = TCrows.getCell(j-2);
								xpathkey = cellToString(TCcellxpathkey);
								  locator = cellToString(TCcelllocator);
								  val = cellToString(TCcellval);
								  Stepval=cellToString(Step);
								  result=c.select(xpathkey, val);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
								break;
							
							case "getcelldata":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 TCcellxpathkey = TCrows.getCell(j-2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  locator = cellToString(TCcellxpathkey);
								  Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								//c.getcelldata(row, col, tablelocator, key)
								  CreateResult.StepGenerator(Stepval,true);
//								  if(result == false)
//										CreateResult.EndReport();
								break;
							
							case "clickLink":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 //TCcellxpathkey = TCrows.getCell(j-2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  //locator = cellToString(TCcellxpathkey);
								 result=c.clickLink(xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
								break;
							
							case "generateLogin":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 TCcellxpathkey = TCrows.getCell(j-2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  //locator = cellToString(TCcellxpathkey);
								 result=c.generateLogin(xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
								break;
							
							case "check":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 TCcellxpathkey = TCrows.getCell(j-2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  //locator = cellToString(TCcellxpathkey);
								 result=c.check(xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
								break;
							
							case "uncheck":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 TCcellxpathkey = TCrows.getCell(j-2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  //locator = cellToString(TCcellxpathkey);
								 result=c.uncheck(xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
									CreateResult.EndReport();
								break;
							
							case "rdnSelect":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 TCcellxpathkey = TCrows.getCell(j-2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  //locator = cellToString(TCcellxpathkey);
								c.rdnSelect(xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,true);
								break;
							
							case "getText":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 //TCcellxpathkey = TCrows.getCell(j-2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  //locator = cellToString(TCcellxpathkey);
								c.getText(xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,true);
								break;
							
							case "validateTitle":
								
								//c.validateTitle(expectedTitleKey);
								break;
							
							case "validateText":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-2);
								 TCcellxpathkey = TCrows.getCell(j-1);
								 TCcellval = TCrows.getCell(j+1);
								 locator  = cellToString(TCcelllocator);
								 xpathkey= cellToString(TCcellxpathkey);
								  expectedText = cellToString(TCcellval);
								result=c.validateText(expectedText, xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,result);
								if(result == false)
										CreateResult.EndReport();
								break;
							
							case "isElementPresent":
								System.out.println("inside case click");	
								 TCcelllocator = TCrows.getCell(j-1);
								 //TCcellxpathkey = TCrows.getCell(j-2);
								 //TCcellval = TCrows.getCell(j+1);
								 xpathkey = cellToString(TCcelllocator);
								  //locator = cellToString(TCcellxpathkey);
								c.isElementPresent(xpathkey);
								Step = TCrows.getCell(j-2);
								Stepval=cellToString(Step);
								CreateResult.StepGenerator(Stepval,true);
								break;
							
							case "noSelectedMemberFound":
								c.noSelectedMemberFound();
								break;
						
		
							}
							}
							//kc=TCrows;
							}}
							
												
					
				
		System.out.println("end of col loop: "+sheetIndex1);
		CreateResult.EndReport();
		return true;	
	}
	
	//To retrieve SuiteToRun and CaseToRun flag of test suite and test case.
	/*public String retrieveToRunFlag(String wsName, String colName, String rowName)
	{
		System.out.println("wsName:"+wsName+"colName:"+colName+"rowName:"+rowName);

		
		System.out.println("test9");
		System.out.println("Inside retrieveToRunFlag:"+wsName);
		System.out.println("Inside retrieveToRunFlag:"+colName);
		System.out.println("Inside retrieveToRunFlag:"+rowName);

		int sheetIndex=wb.getSheetIndex(wsName);
		System.out.println("sheetIndex:"+sheetIndex);
		if(sheetIndex==-1)
			return null;
		else
		{
			System.out.println("test10");
			int rowNum = retrieveNoOfRows(wsName);
			System.out.println("rowNum"+rowNum);
			int colNum = retrieveNoOfCols(wsName);
			System.out.println("colNum"+colNum);
			int colNumber=-1;
			int rowNumber=-1;			
			System.out.println("test11");
			HSSFRow Suiterow = ws.getRow(0);
			System.out.println("Suiterow"+Suiterow);
			System.out.println("test13");
			for(int i=0; i<colNum; i++)
			{
				System.out.println("test14");
				System.out.println("Inside for col");
				System.out.println("if valuec1:"+Suiterow.getCell(i).getStringCellValue());
				System.out.println("if valuec2:"+colName.trim());
				if(Suiterow.getCell(i).getStringCellValue().equals(colName.trim()))
				{
					System.out.println("Inside if ");
					colNumber=i;		
					System.out.println("New columnno:"+colNumber);
				}					
			}
			
			if(colNumber==-1)
			{
				return "";				
			}
			
			for(int j=0; j<rowNum; j++)
			{
				System.out.println("Inside for row");
				HSSFRow Suitecol = ws.getRow(j);		
				System.out.println("if valuer1:"+Suitecol.getCell(0).getStringCellValue());
				System.out.println("if valuer2:"+rowName.trim());
				if(Suitecol.getCell(0).getStringCellValue().equals(rowName.trim()))
				{
					rowNumber=j;	
				}					
			}
			
			if(rowNumber==-1)
			{
				return "";				
			}
			
			HSSFRow row = ws.getRow(rowNumber);
			HSSFCell cell = row.getCell(colNumber);
			if(cell==null)
			{
				return "";
			}
			String value = cellToString(cell);
			System.out.println("retrieveToRunFlag:"+value);
			return value;			
		}			
	}*/
	
	
	public String[] retrieveToRunFlagTestData(String wsName, String colName)		//To retrieve DataToRun flag of test data
	{		
		int sheetIndex=wb.getSheetIndex(wsName);
		if(sheetIndex==-1)
			return null;
		else
		{
			int rowNum = retrieveNoOfRows(wsName);
			int colNum = retrieveNoOfCols(wsName);
			int colNumber=-1;
					
			HSSFRow Suiterow = ws.getRow(0);				
			String data[] = new String[rowNum-1];
			for(int i=0; i<colNum; i++)
			{
				if(Suiterow.getCell(i).getStringCellValue().equals(colName.trim()))
				{
					colNumber=i;					
				}					
			}
			
			if(colNumber==-1)
			{
				return null;				
			}
			
			for(int j=0; j<rowNum-1; j++)
			{
				HSSFRow Row = ws.getRow(j+1);
				if(Row==null)
				{
					data[j] = "";
				}
				else{
					HSSFCell cell = Row.getCell(colNumber);
					if(cell==null)
					{
						data[j] = "";
					}
					else
					{
						String value = cellToString(cell);
						data[j] = value;	
					}	
				}
			}
			return data;			
		}			
	}
	
	
	//To retrieve test data from test case data sheets.
	public Object[][] retrieveTestData(String wsName)
	{
		long starttime1 = System.currentTimeMillis();

		System.out.println("Inside retrieveTestData");
		System.out.println("the value of SheetName is: "+wsName);
		int sheetIndex=wb.getSheetIndex(wsName);
		
		System.out.println("sheetIndex:"+sheetIndex);
		if(sheetIndex==-1)
			return null;
		else
		{
			int rowNum = retrieveNoOfRows(wsName);
			int colNum = retrieveNoOfCols(wsName);

			Object data[][] = new Object[rowNum-1][colNum-2];
	
			for (int i=0; i<rowNum-1; i++)
			{
				HSSFRow row = ws.getRow(i+1);
				for(int j=0; j< colNum-2; j++)
				{
					if(row==null)
					{
						data[i][j] = "";
					}
					else
					{
						HSSFCell cell = row.getCell(j);	
						if(cell==null)
						{
							data[i][j] = "";
						}
						else
						{
							cell.setCellType(Cell.CELL_TYPE_STRING);
							String value = cellToString(cell);
							data[i][j] = value;
						}
					}
				}				
			}			
			
			System.out.println("data:"+Arrays.toString(data));
 long endtime1 = System.currentTimeMillis();
			
			System.out.println("\n------------------------------------------------------");
			 // System.out.println("Execution Time: checkToRunUtility" + (endtime1 - starttime1)/60000 + " min " + ((endtime1 - starttime1)/1000)%60 + " sec");
		   // long ExecTime = (endtime1 - starttime1);
			  System.out.println("Execution Time: data handling" + (endtime1 - starttime1)/60000 + " min " + (((endtime1 - starttime1)/1000)%60 + " sec")+ (((endtime1 - starttime1)/1000)%60)%100 + "millisec");
			return data;	
			
		}
	}		
	
	
	public static String cellToString(HSSFCell cell){
		int type;
		Object result;
		type = cell.getCellType();			
		switch (type){
			case 0 :
				result = cell.getNumericCellValue();
				break;
				
			case 1 : 
				result = cell.getStringCellValue();
				break;
				
			default :
				throw new RuntimeException("Unsupportd cell.");			
		}
		return result.toString();
	}
	
	//To write result In test data and test case list sheet.
	public boolean writeResult(String wsName, String colName, int rowNumber, String Result){
		try{
			System.out.println("Inside WriteResultTestCase");
			int sheetIndex=wb.getSheetIndex(wsName);
			System.out.println("sheetIndex:"+sheetIndex);
			if(sheetIndex==-1)
				return false;			
			int colNum = retrieveNoOfCols(wsName);
			System.out.println("colNum:"+colNum);
			int colNumber=-1;
					
			
			HSSFRow Suiterow = ws.getRow(0);	
			System.out.println("Suiterow:"+Suiterow);
			
			for(int i=0; i<colNum; i++){			
				
				System.out.println("Suiterowdetails:"+Suiterow.getCell(i).getStringCellValue());
				System.out.println("colName.trim():"+colName.trim());
				if(Suiterow.getCell(i).getStringCellValue().equals(colName.trim())){
					colNumber=i;					
				}					
			}
			System.out.println("colNumber:"+colNumber);
			if(colNumber==-1){
				return false;				
			}
			
			HSSFRow Row = ws.getRow(rowNumber);
			System.out.println("Row:"+Row);
			HSSFCell cell = Row.getCell(colNumber);
			System.out.println("cell1:"+cell);
			if (cell == null)
		        cell = Row.createCell(colNumber);			
			System.out.println("cell2:"+cell);
			cell.setCellValue(Result);
			System.out.println("cell3:"+cell);
			opstr = new FileOutputStream(filelocation);
			System.out.println("opstr:"+opstr);
			wb.write(opstr);
			opstr.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//To write result In test suite list sheet.
	public boolean writeResult(String wsName, String colName, String rowName, String Result){
		try{
			System.out.println("Inside writeResult ");
			int rowNum = retrieveNoOfRows(wsName);
			int rowNumber=-1;
			int sheetIndex=wb.getSheetIndex(wsName);
			System.out.println("sheetIndex:"+sheetIndex);
			if(sheetIndex==-1)
				return false;			
			int colNum = retrieveNoOfCols(wsName);
			int colNumber=-1;
					
			
			HSSFRow Suiterow = ws.getRow(0);			
			for(int i=0; i<colNum; i++){				
				if(Suiterow.getCell(i).getStringCellValue().equals(colName.trim())){
					colNumber=i;					
				}					
			}
			
			if(colNumber==-1){
				return false;				
			}
			
			for (int i=0; i<rowNum-1; i++){
				HSSFRow row = ws.getRow(i+1);				
				HSSFCell cell = row.getCell(0);	
				cell.setCellType(Cell.CELL_TYPE_STRING);
				String value = cellToString(cell);	
				if(value.equals(rowName)){
					rowNumber=i+1;
					break;
				}
			}		
			
			HSSFRow Row = ws.getRow(rowNumber);
			HSSFCell cell = Row.getCell(colNumber);
			if (cell == null)
		        cell = Row.createCell(colNumber);			
			System.out.println("Resultvalue1:"+Result);
			cell.setCellValue(Result);
			System.out.println("Resultvalue2:"+Result);
			opstr = new FileOutputStream(filelocation);
			System.out.println("Resultvalue3:"+Result);
			wb.write(opstr);
			System.out.println("Resultvalue4:"+Result);
			opstr.close();
			
			
		}catch(Exception e){
			System.out.println("/inside catch exception");
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
