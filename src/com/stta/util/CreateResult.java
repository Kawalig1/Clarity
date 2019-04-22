package com.stta.util;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.imageio.ImageIO;

import com.stta.main.Driver;

//import com.sun.jna.platform.FileUtils;

public class CreateResult  {

	Keywords k = Keywords.getInstance();
	//public WebDriver driver;
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd-hh.mm.ss";
	public static List<String> tempList_Order_Details = new ArrayList<String>(0);
	public static List<String> tempList_Reward_Details = new ArrayList<String>(0);
	public static boolean IsOrderConf = false;
	public static boolean IsRewardConf = false;
	//com.JLT.util.Keywords k = com.JLT.util.Keywords.getInstance();
	com.stta.util.Keywords key = new com.stta.util.Keywords();
	public static String strTestCaseScenarioDesc=null;
	public static String strTestCaseScenario=null;
	List<String> tempList = new ArrayList<String>(0);
    List<String> tempList_data = new ArrayList<String>(0);
    List<String> tempList_execute = new ArrayList<String>(0);
   
    static List<String> tempList_scenario_name = new ArrayList<String>(0);
    static List<String> tempList_exp_result = new ArrayList<String>(0);
    static List<String> tempList_testCase_name = new ArrayList<String>(0);
    static List<String> tempList_description = new ArrayList<String>(0);
    static List<String> tempList_location = new ArrayList<String>(0);
    static List<String> tempList_result = new ArrayList<String>(0);
    static List<String> tempList_act_result = new ArrayList<String>(0);
    static String strAbsolutePath = new File("").getAbsolutePath();
    
    public static int month;
    public static int day;
    public static int year;
    
    public static String strStartTime;
    public static String strStopTime;
    
    public static float timeElapsed;
    public static long startTime;
    public static long stopTime;
    
    public static String strScreenshot;
    
    private static int hour;
    private static int min;
    private static int sec;
    private static String am_pm;
    private static boolean running = false;
    public Calendar calendar = new GregorianCalendar();
    static BufferedWriter aWriter = null;
    static String strReportFile =null;
    public static long strtime = 0;
    public static SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd hh mm ss a");
	private static long strtimesec;
	private static long strtimemin;
    
    public void start(Calendar calander) {
        
        Long actualStartTime = System.currentTimeMillis();
        hour = calander.get(Calendar.HOUR);
        min = calander.get(Calendar.MINUTE);
        sec = calander.get(Calendar.SECOND);
        if(calander.get(Calendar.AM_PM) == 0)
                am_pm = "AM";
        else
                am_pm = "PM";
        
        
         //.currentTimeMillis();
        running = true;
        startTime = actualStartTime ;
        strStartTime =""+ hour + ":"+ min + ":" + sec + " " + am_pm;
    }

   public void TCScenarioData(String strScenario,String strScenarioDesc){
	   strTestCaseScenario=strScenario;
	   strTestCaseScenarioDesc=strScenarioDesc;
   }

    public static String stop() {
		String strStoTime = null;
		Calendar stop = new GregorianCalendar();
		Long actualstopTime = System.currentTimeMillis();
		hour = stop.get(Calendar.HOUR);
		min = stop.get(Calendar.MINUTE);
		sec = stop.get(Calendar.SECOND);
		if (stop.get(Calendar.AM_PM) == 0)
			am_pm = "AM";
		else
			am_pm = "PM";
		// .currentTimeMillis();
		stopTime = actualstopTime;
		strStoTime = "" + hour + ":" + min + ":" + sec + " " + am_pm;

		running = false;
		return strStoTime;
	}


     //elapsed time in milliseconds
     public float getElapsedTime() {
		float elapsedTime = 0;
		if (running) {
			elapsedTime = (System.currentTimeMillis() - startTime);
			// .currentTimeMillis() - startTime);
		} else {
			elapsedTime = (stopTime - startTime);
		}
		return elapsedTime;
     }
     
	public static String now() {
		
	
		
		//String strScreenshotPath = strAbsolutePath + "src/Com/Automation/Results/screenshot/";
		String strScreenshotPath ="C:\\Eclips\\ClarityAutomation\\src\\com\\JLT\\Clarity\\TestResults";
        Calendar cal = Calendar.getInstance();
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        year = cal.get(Calendar.YEAR);
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        Random rand = new Random();
        int num = rand.nextInt(1000);
        strScreenshot = strScreenshotPath + sdf.format(cal.getTime())+num +".png";
        return sdf.format(cal.getTime());
        
        /*Calendar stop = new GregorianCalendar();
		Long actualstopTime = System.currentTimeMillis();
		hour = stop.get(Calendar.HOUR);
		min = stop.get(Calendar.MINUTE);
		sec = stop.get(Calendar.SECOND);
		if (stop.get(Calendar.AM_PM) == 0)
			am_pm = "AM";
		else
			am_pm = "PM";
		// .currentTimeMillis();
		stopTime = actualstopTime;
		String strTime = "" + hour + ":" + min + ":" + sec + " " + am_pm;
		return strTime;*/
		
    }
	
	//public void takeScreenshot(String strScenarioName,String strTestCaseName,String strExpectedResult,String strActualResult, String strResultDescription, boolean isScreenshot, String result, RemoteWebDriver webDriver) {
		public static void takeScreenshot(String strScenarioName,String strExpectedResult,String strActualResult, boolean isScreenshot, String result) throws IOException, AWTException {
			
        /*try {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
            tempList_scenario_name.add(strScenarioName);
            // tempList_testCase_name.add(strTestCaseName);
            tempList_exp_result.add(strExpectedResult);
            tempList_act_result.add(strActualResult);
            //tempList_description.add(strResultDescription);
            //tempList_location=System.getProperty("user.dir") + "\\src\\com\\stta\\Results";
            if (isScreenshot) {
                now();
                Random rand = new Random();
                int num = rand.nextInt(1000);
               
                try {
                	File srcFile = ((TakesScreenshot)Keywords.driver).getScreenshotAs(OutputType.FILE);
            		FileUtils.copyFile(srcFile, new File(strScreenshot)); 
            		tempList_location.add(strScreenshot);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {

                tempList_location.add("No screenshot available");
            }
             tempList_result.add(result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
			
			Calendar now = Calendar.getInstance();
	        Robot robot = new Robot();
	        BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	        ImageIO.write(screenShot, "JPG", new File("c:\\"+formatter.format(now.getTime())+".jpg"));
	        System.out.println(formatter.format(now.getTime()));
			
    }
    public void Clear(){
    	tempList_scenario_name.clear();
    	tempList_exp_result.clear();
    	tempList_act_result.clear();
    	tempList_location.clear();
    	tempList_result.clear();
    	tempList_Order_Details.clear();
    	tempList_Reward_Details.clear();
    }
	   public static void reportGenerator(String strReportFileName ) {
	    	
	    	String strComponent = null;
	    	String strUrlName = null;
	    	String strBrowserName = null;
	    	
	    	System.out.println("Start"+Driver.starttime);
	    	
	    	Calendar cal = Calendar.getInstance();
	        month = cal.get(Calendar.MONTH) + 1;
	        day = cal.get(Calendar.DAY_OF_MONTH);
	        year = cal.get(Calendar.YEAR);
	        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
	        Random rand = new Random();
	        int num = rand.nextInt(1000);
	        String starttime=sdf.format(cal.getTime());
	    	
	    	int seconds = (int) (Driver.starttime / 1000) % 60 ;
	    	int minutes = (int) ((Driver.starttime / (1000*60)) % 60);
	    	int hours   = (int) ((Driver.starttime / (1000*60*60)) % 24);
	    	//strtimemin =((Driver.endtime-Driver.starttime) / 60000 );
	    	//strtimesec=((Driver.endtime-Driver.starttime) / 1000) % 60;
	    	//System.out.println("strtime: " +strtime);
			try {
				strComponent = "Clarity 1.5";
				strUrlName = "Admin -- Http://clarityAdmin and member--Http://clarity";
				strBrowserName = "FireFox";
				String time = now();
				System.out.println("Exe Time is "+time);
				//String strReportFile = utils.getResultPath() +"Report" + "_" + time + ".html";
				//String strReportFile = utils.getResultPath() + utils.getConfigValues("Application Name") + "_" + time + ".html";
				//String strReportFile = utils.getResultPath() + strReportFileName + "_" + time + ".html";
				//C:\Eclips\ClarityAutomation\src\com\JLT\Clarity\TestResults
				strReportFile =System.getProperty("user.dir") + "\\src\\com\\stta\\Results\\" + strReportFileName + "_" + time + ".html";
				
				aWriter  = new BufferedWriter(new FileWriter(strReportFile));
					
				aWriter.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"> ");
				aWriter.write("<html>");
				aWriter.write("<head>");

				aWriter.write("<link type=\"text/css\" href=\"./pages/css/themes/ui-lightness/jquery-ui-1.8.16.custom.css\" rel=\"Stylesheet\" />");
				aWriter.write("<link type=\"text/css\" href=\"./pages/css/myStyle.css\" rel=\"Stylesheet\" />");
				aWriter.write("<script type=\"text/javascript\" src=\"./pages/js/jquery-1.6.2.min.js\"></script>");
				aWriter.write("<script type=\"text/javascript\" src=\"./pages/js/jquery-ui-1.8.16.custom.min.js\"></script>");
				aWriter.write("<script type=\"text/javascript\" src=\"./pages/js/my.js\"></script>");
				aWriter.write("</head>");
				aWriter.write("<script type=\"text/javascript\">");

				aWriter.write("$(document).ready(function(){");
				aWriter.write("$(\"#tabs_environment,#tabs_plan,#tabs_set,#set_content_tabs\").tabs({");
				aWriter.write("selected: 0,");
				aWriter.write("deselectable: true");
				aWriter.write("});");
				aWriter.write("$(\"button\", \".btn\" ).button();");
				aWriter.write("$(\"button\", \".plan_step_list\" ).button();");
				aWriter.write("$(\"#tabs_plan\").hide();");
				aWriter.write("$(\"#tabs_set\").hide();");
				aWriter.write("$(\"#dialog\").dialog({");
				aWriter.write("autoOpen:false,");
				aWriter.write("modal:true,");
				aWriter.write("buttons:{");
				aWriter.write(" Store:function(){");
				aWriter.write("return;");
				aWriter.write("}");
				aWriter.write("},");
				aWriter.write("dialogClass: 'f2',");
				aWriter.write("resizable: true,");
				aWriter.write("show: 'slide',");
				aWriter.write("height:120");
				aWriter.write("});");

				aWriter.write("});");
				aWriter.write("</script>");
				aWriter.write("<body>");
				aWriter.write("<div class=\"page_container\">");
				aWriter.write("<div class=\"head\">");
				

				aWriter.write("<table bgcolor=\"white\" border=\"5\"  class=\"content_table\" cellpadding=\"10\" cellspacing=\"\">");
				aWriter.write("<tr>");
				aWriter.write("<td valign=\"top\">");
				aWriter.write("<div class=\"right_content\">");
				aWriter.write("<div id=\"tabs_environment\">");
				aWriter.write("<ul>");
				aWriter.write("<li><a href=\"#tabs-set-2\" class=\"f2\">"
						+ strReportFileName + " Report </a></li>");
				aWriter.write("<li><a href=\"#tabs-set-2\" class=\"f2\"> URL:- "
						+ strUrlName + " </a></li>");
				aWriter.write("<li><a href=\"#tabs-set-2\" class=\"f2\"> BrowserName:- "
						+ strBrowserName + " </a></li>");
				aWriter.write("</ul>");
				aWriter.write("<div id=\"tabs-set-1\"  class=\"f2\">");
				aWriter.write("<div style=\"margin-top: 10px;\">");
				aWriter.write("<table border=\"1\" id=\"set_table\" width=\"100%\" class=\"f2\" cellpadding=\"10\"\" cellspacing=\"\" ><tr>");
				//aWriter.write("<td><b>Test Case Scenario</b></td>");
				//aWriter.write("<td><b>Test Case Scenario Desc</b></td>");
				aWriter.write("<td><b>Execution Date: </b>"+day + "-" + month + "-" + year+ " </td>");
				aWriter.write("<td><b>Execution Start Time</b>"+ starttime +"</td>");
				//aWriter.write("<td><b>Execution Start Time</b>"+ time +"</td>");
				//aWriter.write("<td><b>Execution End Time : </b>" + Driver.endtime + "</td>");
				//aWriter.write("<td><b>Elapsed Time</b></td>");				
				aWriter.write("</tr>");
				aWriter.write("</table>");
				aWriter.write("<table border=\"1\" id=\"set_table\" width=\"100%\" class=\"f2\" cellpadding=\"10\"\" cellspacing=\"\" ><tr>");
				aWriter.write("<tr class=\"list_table_tr\">");
				aWriter.write("<td><b>Step Number</b></td>");				
				//aWriter.write("<td><b>Expected Result</b></td>");
				//aWriter.write("<td><b>Actual Result</b></td>");
				aWriter.write("<td><b>Pass/Fail</b></td>");
				aWriter.write("<td><b>Execution End Time</b></td>");		
				aWriter.write("</tr>");	
				//...........................................
				//ENter data
				
				//...........................................
				
				
				

			} catch (Exception ex) {
				ex.printStackTrace();
			}

	    }
   
	   public static void StepGenerator(String StepNum,boolean Flag ) throws IOException {
		 
		   String Result = null;
		if(Flag==true)
		   Result = "Pass";
		else{
			Result = "Fail";
			}
		
		   aWriter.write("<tr class=\"list_table_tr\">");
			aWriter.write("<td>"+ StepNum+ "</td>");
			aWriter.write("<td>"+ Result +"</td>");	
			aWriter.write("<td>" + stop() + "</td>");
			//aWriter.write("<td>" + day + "-" + month + "-" + year + "</td>");
			//aWriter.write("<td>" + strtimemin+"Mins " +strtimesec+"secs" +"</td>");
			//aWriter.write("<td>" + Driver.endtime + "</td>");
			//aWriter.write("<td>" + Math.round((timeElapsed / (60000)) * 60)+ " " + "seconds" + "</td>");				
			aWriter.write("</tr>");
			/*aWriter.write(" <tr class=\"list_table_tr\">");
			aWriter.write(" <td></td>");
			aWriter.write(" <td></td>");
			
			aWriter.write("</tr>");*/
			
			
			aWriter.write("<tr class=\"list_table_tr\">");
			for (int i = 0; i < tempList_scenario_name.size(); i++) {
				if (i % 2 == 0) {
					aWriter.write("<tr class=\"list_table_tr\"><td >"
							+ tempList_scenario_name.get(i) + "</td>");						
					aWriter.write("<td >" + tempList_exp_result.get(i)
							+ "</td>");
					aWriter.write("<td >" + tempList_act_result.get(i)
							+ "</td>");
					if ((tempList_result.get(i)).equalsIgnoreCase("Pass"))
						aWriter.write("<td><font color=\"Green\">"
								+ tempList_result.get(i) + "</td>\n");
					else
						aWriter.write("<td><font color=\"Red\">"
								+ tempList_result.get(i) + "</td>\n");
					aWriter.write("<td >");
					if (tempList_location.get(i).contentEquals(
							"No screenshot available")) {
						aWriter.write("No Screenshot available");

					} else {
						aWriter.write("<a href =\"");
						aWriter.write("file:///" + tempList_location.get(i));
						aWriter.write("\" target=\"_blank\">Screenshot</td>\n");

					}
				} else {
					aWriter.write("<tr class=\"list_table_tr\"><td >"
							+ tempList_scenario_name.get(i) + "</td>");						
					aWriter.write("<td >" + tempList_exp_result.get(i)
							+ "</td>");
					aWriter.write("<td >" + tempList_act_result.get(i)
							+ "</td>");
					if ((tempList_result.get(i)).equalsIgnoreCase("Pass"))
						aWriter.write("<td><font color=\"Green\">"
								+ tempList_result.get(i) + "</td>\n");
					else
						aWriter.write("<td><font color=\"Red\">"
								+ tempList_result.get(i) + "</td>\n");
					aWriter.write("<td >");
					if (tempList_location.get(i).contentEquals(
							"No screenshot available")) {
						aWriter.write("No Screenshot available");

					} else {
						aWriter.write("<a href =\"");
						aWriter.write("file:///" + tempList_location.get(i));
						aWriter.write("\" target=\"_blank\">Screenshot</td>\n");

					}
				}
			}
			
	   }
	   
	


			public static void EndReport() throws IOException{
				aWriter.write("</table>");
				aWriter.write("</div>");
				aWriter.write("</div>");
				aWriter.write("</div>");
				aWriter.write("</div>");
				aWriter.write("</td>");
				aWriter.write("</tr>");
				aWriter.write("</table>");
				aWriter.write("</div>");
				aWriter.write("</div>");
				aWriter.write("</body>");
				aWriter.write("</html>");
				aWriter.flush();
				aWriter.close();
			}
			
			public class GenerateReport implements ITestListener {

				@Override
				public void onStart(ITestContext arg0) {

					System.out.println("+Begin test: " + arg0.getName());

				}

				@Override
				public void onTestStart(ITestResult arg0) {

					System.out.println(" Starting test: " + arg0.getName());

				}

				@Override
				public void onTestSuccess(ITestResult arg0) {

					System.out.println(" Test passed: " + arg0.getName());

				}

				@Override
				public void onTestFailure(ITestResult arg0) {

					System.out.println(" Test failed: " + arg0.getName());

				}

				@Override
				public void onTestSkipped(ITestResult arg0) {

					System.out.println(" Test ignored: " + arg0.getName());

				}

				@Override
				public void onFinish(ITestContext arg0) {

					System.out.println("-End test: " + arg0.getName());

				}

				@Override
				public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

					// TODO Auto-generated method stub

				}

			}		
			
			
}