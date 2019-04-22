package com.stta.Pages;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class PageMeetingReport
{
	WebDriver driver;
	
	@FindBy(name="new")
	WebElement MRNewbtn;
	
	@FindBy(name="Name")
	WebElement MRName;
	
	@FindBy(id="CF00Nw0000009ELBB")
	WebElement MRAccntName;
	
	@FindBy(id="00Nw0000009ELBK")
	WebElement MRTypeOfMeeting;
	
	@FindBy(id="00Nw0000009ELBG")
	WebElement MRGoal;
	
	@FindBy(id="00Nw0000009ELBD")
	WebElement MRComments;
	
	@FindBy(id="00Nw0000009ELBF")
	WebElement MRConclusions;
	
	@FindBy(id="00Nw0000009ELBC")
	WebElement MRActions;
	
	@FindBy(id="00Nw0000009ELBJ")
	WebElement MRSpecialNotes;
	
	@FindBy(id="00Nw0000009ELBH")
	WebElement MRDate;
	
	@FindBy(id="00Nw0000009ELBI")
	WebElement MRLocation;
	
	@FindBy(name="save")
	WebElement MRSaveBtn;
	
	 @FindBy(id="errorDiv_ep")
     WebElement lblErrorMessage;
	 
	 @FindBy(xpath="//td[@id='bodyCell']/div/div/div/h1")
	WebElement saveMRlbl;

	@FindBy(xpath="//td[@id='bodyCell']/div/div/div/h2")
	WebElement saveMRName;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/div[2]")
    WebElement multipleAccntErr;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/div[2]")
    WebElement multipleExtnAttndtErr;
	 
	@FindBy(id="CF00Nw0000009ELBB_lkid")
    WebElement multipleAccntDrpDown;
	
	@FindBy(id="CF00Nw0000009ELB7_lkid")
    WebElement multipleExtAttndDrpDown;
	
	//Competitor elements
	
	@FindBy(name="new_competitor")
    WebElement newCompBtn;
	
	@FindBy(name="save")
    WebElement compSaveBtn;
	
	@FindBy(id="CF00Nw0000009ELB5")
    WebElement compName;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000009ELB6_body')]/table/tbody/tr[2]/th/a")
	WebElement compNameRL;
	
	// Meeting Attendees elements
	
	@FindBy(name="new_external_attendee")
    WebElement newExtAttndBtn;
	
	@FindBy(name="save")
    WebElement extAttndSaveBtn;
	
	@FindBy(id="CF00Nw0000009ELB7")
    WebElement extAttndName;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000009ELB8_body')]/table/tbody/tr[2]/td[2]/a")
	WebElement extAttndRL;
	
	
	//div[@id='a2Z9E000000MvHn_00Nw0000009ELB8_body']/table/tbody/tr[2]/td[2]/a
	@FindBy(xpath="//div[@id='CF00Nw0000009ELB7_autoCompleteRowId_0']/strong")
	WebElement extAttndAutoMatch;
	
	
	@FindBy(name="new_jlt_attendee")
    WebElement newjltAttndBtn;
	
	@FindBy(name="save")
    WebElement jltAttndSaveBtn;
	
	@FindBy(id="CF00Nw0000009ELB9")
    WebElement jltAttndName;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000009ELB8_body')]/table/tbody/tr[3]/td[3]/a")
	WebElement jltAttndRL;
	
	
	@FindBy(name="create_new_opportunity")
    WebElement newOpptyBtn;
	
	@FindBy(name="associate_an_opportunity")
    WebElement exstOpptyBtn;

	@FindBy(id="CF00Nw0000009ELB3")
    WebElement exstOppty;
	
	@FindBy(name="save")
    WebElement exstOpptySaveBtn;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000009ELB1_body')]/table/tbody/tr[2]/td[2]/a")
	WebElement newOpptyRL;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000009ELB1_body')]/table/tbody/tr[3]/td[2]/a")
	WebElement exstOpptyRL;
	
	//div[@id='a2Z9E000000MvIO_00Nw0000009ELB1_body']/table/tbody/tr[3]/td[2]/a
	
	@FindBy(xpath="//div[contains(@id,'Nw00000095d3x')]")
	WebElement OpptyMRLink;
	
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div")
	WebElement multipleExstOppErr;
	
	
	@FindBy(id="CF00Nw0000009ELB3_lkid")
    WebElement multipleExstOppDrpDown;
	
		
	@FindBy(xpath="//div[contains(@id,'_00Nw0000009ELB3_body')]/table/tbody/tr[2]/td[2]/a")
    WebElement OpptyMRRL;
	
	
	@FindBy(xpath="//div[contains(@id,'_RelatedActivityList_body')]/table/tbody/tr[2]/th/a")
    WebElement eventRL;
    
	@FindBy(xpath="//div[contains(@id,'_RelatedActivityList_body')]/table/tbody/tr[3]/th/a")
    WebElement taskRL;
	
	@FindBy(name="edit")
    WebElement editMRBtn;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[2]/table/tbody/tr[5]/td")
    WebElement shareMRLbl;
	
	//@FindBy(id="00N9E000000refT")
   // WebElement shareMRchkbefore;
	
	
	@FindBy(id="00Nw00000095wmO")
    WebElement shareMRchkbefore;
	
	
	//@FindBy(id="00N9E000000refT_chkbox")
    //WebElement shareMRchkafter;
	
	@FindBy(id="00Nw00000095wmO_chkbox")
    WebElement shareMRchkafter;
	
	
	public PageMeetingReport(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		//This initElements method will create  all WebElements
	}

	public void clickMRNewbtn() {
		MRNewbtn.click();
	}

	public void setMRName(String MRNameStr) {
		MRName.sendKeys(MRNameStr);
	}

	public void setMRAccntName(String MRAccntNameStr) {
		MRAccntName.clear();
		MRAccntName.sendKeys(MRAccntNameStr);
		
	}

	public void setMRTypeOfMeeting(String MRTypeOfMeetingStr) {
		Select type = new Select(MRTypeOfMeeting);
		type.selectByVisibleText(MRTypeOfMeetingStr);
		
	}

	public void setMRGoal(String MRGoalStr) {
		MRGoal.sendKeys(MRGoalStr);;
	}

	public void setMRComments(String MRCommentsStr) {
	MRComments.sendKeys(MRCommentsStr);
	}

	public void setMRConclusions(String MRConclusionsStr) {
		MRConclusions.sendKeys(MRConclusionsStr);
	}

	public void setMRActions(String MRActionsStr) {
		MRActions.sendKeys(MRActionsStr);
	}

	public void setMRSpecialNotes(String MRSpecialNotesStr) {
	MRSpecialNotes.sendKeys(MRSpecialNotesStr);
	}

	public void setMRDate() {
		
		MRDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 
	
	}

	public void setMRLocation(String MRLocationStr) {
		MRLocation.sendKeys(MRLocationStr);;
	}
	
	public void clickMRSavebtn() {
		MRSaveBtn.click();
	}
	
    public String getErrorText()
    
    {                    
           if (driver.findElements(By.id("errorDiv_ep")).size() != 0) 
           
           {  
                 System.out.println("element exists");  
                 return lblErrorMessage.getText();                
     }                  
           else                       
           {
                 return "Error text not present" ;
           }
    }
    
    
    public String getMRLbl()
	{
		String mrPageLbl;
		mrPageLbl = saveMRlbl.getText();
		return mrPageLbl;
	}
    
    public String getMRName()
	{
		String mrpagedescc;
		mrpagedescc= saveMRName.getText();
		return mrpagedescc;
	}
    
    public String getMultipleAccntErr() {
		
		if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/div[2]")).size() != 0) 
		{	
		return multipleAccntErr.getText();
		}
		else
			
		{
			
			return "Error text not present";
		}
	}
    
    public void selAccnt(String Accnttxt) {
		Select dropdown = new Select (multipleAccntDrpDown) ;
        
        dropdown.selectByVisibleText(Accnttxt);      
	}
	
    public void clickNewComp() {
		newCompBtn.click();
	}
    
    public void saveComp() {
		compSaveBtn.click();
	}
    
    public void setComp(String compStr) {
		compName.sendKeys(compStr);;
	}
	
    public String getComp() {
		return compNameRL.getText();
	}
    
    
    public void clickNewExtAttnd() {
		newExtAttndBtn.click();
	}
    
    public void saveExtAttnd() {
		extAttndSaveBtn.click();
	}
    
    public void setExtAttnd(String compStr) {
    	extAttndName.sendKeys(compStr);
    	
    	Boolean isPresent = driver.findElements(By.xpath("//div[@id='CF00Nw0000009ELB7_autoCompleteRowId_0']/strong")).size() > 0;
		System.out.println("isPresent:"+isPresent);
		if(isPresent==false)
		{
		System.out.println("Inside if1");
		
		}
		else if(isPresent==true) 
		{
			System.out.println("Inside else1");
			
			extAttndAutoMatch.click();
		}
		
    	
    	
	}
	
    public String getExtAttnd() {
		
    	WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000009ELB8_body')]/table/tbody/tr[2]/td[2]/a")));
    	return extAttndRL.getText();
	}

    public void clickNewjltAttnd() {
		newjltAttndBtn.click();
	}
    
    public void savejltAttnd() {
		jltAttndSaveBtn.click();
	}
    
    public void setjltAttnd(String compStr) {
    	jltAttndName.sendKeys(compStr);
	}
	
    public String getjltAttnd() {
		return jltAttndRL.getText();
	}

    public void clickNewOppty() {
    	
    	   	
		newOpptyBtn.click();

	}
    
    public String getNewOppty() {
    	if (driver.findElements(By.xpath("//div[contains(@id,'_00Nw0000009ELB1_body')]/table/tbody/tr[2]/td[2]/a")).size() != 0) 
		{	
    	
    	
		return newOpptyRL.getText();
		}
    	
else
			
		{
			
			return "Related List not present";
		}
	}
    
    public String getMultipleExtnAttnd() {
		
		if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/div[2]")).size() != 0) 
		{	
		return multipleExtnAttndtErr.getText();
		}
		else
			
		{
			
			return "Error text not present";
		}
	}

    public void selExtAttnd(String ExtAttndtxt) {
		Select dropdown = new Select (multipleExtAttndDrpDown) ;
        
        dropdown.selectByVisibleText(ExtAttndtxt);      
	}

    
    public void clickNewOpptyLnk() {
		 newOpptyRL.click();
    }
    
    
    public void clickExtsOpptyLnk() {
		 exstOpptyRL.click();
   }
    public void clickExstOppty() {
		exstOpptyBtn.click();
	}
    
    public void setExstOppty(String oppty) {
		exstOppty.sendKeys(oppty);
	}
    
    
    public void saveExstOpp() {
		exstOpptySaveBtn.click();
	}
    
    public String getExstOppty() {
		return exstOpptyRL.getText();
	}
    
    
public String getMultipleExstOpp() {
		
		if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div")).size() != 0) 
		{	
		return multipleExstOppErr.getText();
		}
		else
			
		{
			
			return "Error text not present";
		}
	}


public void selExstOpp(String ExtOpptxt) {
	Select dropdown = new Select (multipleExstOppDrpDown) ;
    
    dropdown.selectByVisibleText(ExtOpptxt);      
}

public String getMRLinktxt() {
	return OpptyMRLink.getText();
}


public String getMRRLtxt() {
	return OpptyMRRL.getText();
}

public void clickMRRLtxt() {
	 OpptyMRRL.click();
}

public String geteventRLtxt() {
	return eventRL.getText();
}


public String gettaskRLtxt() {
	return taskRL.getText();
}


public void clickeditMR() {
	editMRBtn.click();
}



public void clickshareMRChk() {
	shareMRchkbefore.click();
}

public String getShareMRLbl() {
	return shareMRLbl.getText();
}

public String getshareMRChk() {
	return shareMRchkafter.getAttribute("title");
}

}









