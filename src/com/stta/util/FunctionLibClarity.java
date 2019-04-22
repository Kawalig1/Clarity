package com.stta.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*************Clarity dependent functions****************/

public class FunctionLibClarity {
	
	Keywords k = Keywords.getInstance();
	
	public void loginInClarityMember(String Username, String Password)
	{
		k.input("xpath","cl_uname",Username);
		k.input("xpath","cl_pwd",Password);
		k.click("xpath","cl_login");
		
	}
	
	public void loginInClarityAdmin(String Username, String Password)
	{
		k.input("xpath","username",Username);
		k.input("xpath","password",Password);
		k.click("xpath","login");
		
	}
	
	public void selectPreValidationParams()
	{
		k.check("chkPreValidation");
		k.check("chkFirstName");
		k.check("chkLastName");
		k.check("chkDoB");
		k.check("chkNINumber");
		k.check("chkMemRef");
		k.check("chkPostCode");
	}
	
	public void unSelectPreValidationParams()
	{
		k.uncheck("chkPreValidation");
		k.uncheck("chkFirstName");
		k.uncheck("chkLastName");
		k.uncheck("chkDoB");
		k.uncheck("chkNINumber");
		k.uncheck("chkMemRef");
		k.uncheck("chkPostCode");
	}
	
	public void selectPostValidationParams()
	{
		k.check("chkPostValidation");
		k.check("chkPostFirstName");
		k.check("chkPostLastName");
		k.check("chkPostDoB");
		k.check("chkPostNINo");
		k.check("chkPostMemRef");
		k.check("chkPostZipCode");
	}
	
	public void unSelectPostValidationParams()
	{
		k.uncheck("chkPostValidation");
		k.uncheck("chkPostFirstName");
		k.uncheck("chkPostLastName");
		k.uncheck("chkPostDoB");
		k.uncheck("chkPostNINo");
		k.uncheck("chkPostMemRef");
		k.uncheck("chkPostZipCode");
	}
		
	public void provideMemberDetailsSelfRegistration(String fname, String lname, String NI, String Dob, String Mref, String ZipCode)
	{
		k.input("id", "SR_txtFirstName", fname);
	    k.input("id", "SR_txtLastName", lname);
	    k.input("id", "SR_txtDoB", Dob);
	    k.input("id", "SR_txtNiNo",NI);
	    k.input("id","SR_txtMemRef",Mref);
	    k.input("id","SR_txtZipCode",ZipCode);	   	    
	}
	
	public void changeMemberPassword(String ExistingPwd, String Newpwd, String ConfirmNewPwd )
	{ 
	k.input("id", "SR_txtFirstName", ExistingPwd);
    k.input("id", "SR_txtLastName", Newpwd);
    k.input("id", "SR_txtFirstName", ConfirmNewPwd);
    k.click("id", "cl_savebtn_id");		
	}
	
	public String registrationLink()
	{
		try {
			System.out.println("I am in thread");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		k.openBrowser("Chrome");
		k.navigate("webMail");
		k.clickLink("Inbox");
		try {
			System.out.println("I am in thread");
			Thread.sleep(180000);
			k.clickLink("Inbox");
			System.out.println("I am in Inbox");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		k.clickLink("RegisterLink");
		String s =	k.getText("MailText");
		System.out.println(s);
		String pattern1 = "GUID=";
		String pattern2 = "\n";
		String text = s;

		Pattern p = Pattern.compile(Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2));
		Matcher m = p.matcher(text);
		String reglink = null;
		while (m.find()) {
		  System.out.println(m.group(1));
		  reglink = "http://clarity/pages/login/OnlineTransaction.aspx?GUID=" + m.group(1);
		  System.out.println(reglink);
		}
		
		//String reglink = "http:/clarity/pages/login/OnlineTransaction.aspx?" + m.group(1);
		System.out.println(reglink);
		k.navigateURL(reglink);
		return(reglink);
	}
	
	public String passowrdResetLink()
	{
		try {
			System.out.println("I am in thread");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		k.openBrowser("Chrome");
		k.navigate("webMail");
		k.clickLink("Inbox");
		try {
			System.out.println("I am in thread");
			Thread.sleep(1800);
			k.clickLink("Inbox");
			System.out.println("I am in Inbox");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		k.clickLink("PasswordLink");
		String s =	k.getText("MailText");
		System.out.println(s);
		String pattern1 = "GUID=";
		String pattern2 = "\n";
		String text = s;
		Pattern p = Pattern.compile(Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2));
		Matcher m = p.matcher(text);
		String reglink = null;
		while (m.find()) {
		  System.out.println(m.group(1));
		  reglink = "http://clarity/pages/login/OnlineTransaction.aspx?GUID=" + m.group(1);
		  System.out.println(reglink);
		}
		
		//String reglink = "http:/clarity/pages/login/OnlineTransaction.aspx?" + m.group(1);
		System.out.println(reglink);
		return(reglink);
	}
	
	
	public String onlineUserNameLink()
	{
		try {
			System.out.println("I am in thread");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		k.openBrowser("Chrome");
		k.navigate("webMail");
		k.clickLink("Inbox");
		try {
			System.out.println("I am in thread");
			Thread.sleep(1800);
			k.clickLink("Inbox");
			System.out.println("I am in Inbox");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		k.clickLink("UsernameLink");
		String s =	k.getText("MailText") + " ";
		System.out.println(s);
		String pattern1 = "is: ";
		String pattern2 = " ";
		String text = s;

		Pattern p = Pattern.compile(Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2));
		Matcher m = p.matcher(text);
		String reglink = null;
		while (m.find()) {
		  System.out.println(m.group(1));
		  reglink = m.group(1);
		  System.out.println(reglink);
		}
		
		return(reglink);
	}
	
	
	public void resetPasswordSelectPreValidationParams()
	{
		k.check("RPchkPreValidation");
		k.check("RPchkPreFirstName");
		k.check("RPchkPreLastName");
		k.check("RPchkPreDoB");
		k.check("RPchkPreNINo");
		k.check("RPchkPreMemRef");
		k.check("RPchkPreZipCode");
	}
	
	public void resetPasswordDSelectPreValidationParams()
	{
		k.uncheck("RPchkPreValidation");
		k.uncheck("RPchkPreFirstName");
		k.uncheck("RPchkPreLastName");
		k.uncheck("RPchkPreDoB");
		k.uncheck("RPchkPreNINo");
		k.uncheck("RPchkPreMemRef");
		k.uncheck("RPchkPreZipCode");
	}

	public void resetPasswordselectPostValidationParams()
	{
		k.check("RPchkPostValidation");
		k.check("RPchkPostFirstName");
		k.check("RPchkPostLastName");
		k.check("RPchkPostDoB");
		k.check("RPchkPostNINo");
		k.check("RPchkPostMemRef");
		k.check("RPchkPostZipCode");
	}
	
	public void resetPasswordDSelectPostValidationParams()
	{
		k.uncheck("RPchkPostValidation");
		k.uncheck("RPchkPostFirstName");
		k.uncheck("RPchkPostLastName");
		k.uncheck("RPchkPostDoB");
		k.uncheck("RPchkPostNINo");
		k.uncheck("RPchkPostMemRef");
		k.uncheck("RPchkPostZipCode");
	}
		
	
	public void pageRefresh()
	{
		Keywords.driver.navigate().refresh();
	}

}
