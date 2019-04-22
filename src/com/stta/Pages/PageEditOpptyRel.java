package com.stta.Pages;

import java.io.IOException;

//import java.sql.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEditOpptyRel
{
	WebDriver driver;
	@FindBy(xpath="//span[@id='j_id0:j_id1:j_id5:j_id6:j_id7:0:j_id8:j_id9:j_id21']/ul") 
	WebElement opptyrelMandTxt;

	@FindBy(name="j_id0:j_id1:main_block:j_id60:j_id72") 
	WebElement opptyrelCancelBtn;
	
	@FindBy(name="j_id0:j_id1:main_block:pbTable:0:j_id74")
	public WebElement OpptyRelRole0;
	
	@FindBy(name="j_id0:j_id1:main_block:pbTable:1:j_id74")
	public WebElement OpptyRelRole1;
	
	@FindBy(name="j_id0:j_id1:main_block:pbTable:2:j_id74")
	public WebElement OpptyRelRole2;
	
	@FindBy(name="j_id0:j_id1:main_block:pbTable:3:j_id74")
	public WebElement OpptyRelRole3;
	
	@FindBy(name="j_id0:j_id1:main_block:pbTable:4:j_id74")
	public WebElement OpptyRelRole4;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:1:j_id80")
	public WebElement OpptyRelAccnt1;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:2:j_id80")
	public WebElement OpptyRelAccnt2;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:3:j_id80")
	public WebElement OpptyRelAccnt3;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:4:j_id80")
	public WebElement OpptyRelAccnt4;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:0:j_id97")
	public WebElement OpptyRelApprovalSigned0;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:1:j_id97")
	public WebElement OpptyRelApprovalSigned1;
	
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:2:j_id97")
	public WebElement OpptyRelApprovalSigned2;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:3:j_id97")
	public WebElement OpptyRelApprovalSigned3;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:4:j_id97")
	public WebElement OpptyRelApprovalSigned4;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:0:j_id102")
	public WebElement OpptyRelBusProt;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:1:j_id102")
	public WebElement OpptyRelBusProt2;
	
	@FindBy(id="j_id0:j_id1:main_block:j_id60:j_id61")
	public WebElement OpptyRelSave;
	
	@FindBy(id="j_id0:j_id1:main_block:pbTable:3:j_id90")
	public WebElement OpptyRelFee;
	
		
	@FindBy(xpath = "//a[contains(text(),'Upload Completed Forms')]")
	public WebElement OpptyUploadDoc1;
	
	@FindBy(xpath = "(//a[contains(text(),'Upload Completed Forms')])[2]")
	public WebElement OpptyUploadDoc2;
	
	@FindBy(xpath = "(//a[contains(text(),'Upload Completed Forms')])[3]")
	public WebElement OpptyUploadDoc3;
	
	@FindBy(xpath = "(//a[contains(text(),'Upload Completed Forms')])[4]")
	public WebElement OpptyUploadDoc4;
	
	@FindBy(name="attachFile")
	public WebElement OpptyAttachFile;
	
	@FindBy(id="file")
	public WebElement OpptyBrowse;
	
	@FindBy(id="Attach")
	public WebElement OpptyAttach;
	
	@FindBy(name="cancel")
	public WebElement OpptyDone;
	
	
	@FindBy(xpath="//a[@onclick='return confirmDelete();']")
	public WebElement oppRelDel1;
	
	@FindBy(xpath="(//a[@onclick='return confirmDelete();'])[2]")
	public WebElement oppRelDel2;
	
	@FindBy(id="j_id0:j_id1:j_id2:messages:j_id5:j_id6:0:j_id7:j_id8:j_id10")
	public WebElement oppRelDelErrMSg;
	
	//Deepali added element for multiple Account error on Opportunity Relationships
    @FindBy(xpath="//td[@id='j_id0:j_id1:main_block:pbTable:1:j_id79']/div")
    WebElement multipleAccntErr;
    
    @FindBy(xpath="//td[@id='j_id0:j_id1:main_block:pbTable:2:j_id79']/div")
    WebElement multipleAccntErr1;
    
    @FindBy(id="j_id0:j_id1:main_block:pbTable:1:j_id80_lkid")
    WebElement multipleAccntDrpDown;
    

    @FindBy(id="j_id0:j_id1:main_block:pbTable:1:j_id97")
	public WebElement attchConfirmCheck;
    
    @FindBy(xpath="//a[contains(@id,'00Nw0000003PKQ0')]")
  	public WebElement oppNameOnOR;
	
    
    @FindBy(id="j_id0:j_id1:main_block:pbTable:1:j_id90")
  	public WebElement commissionFee;
    

    @FindBy(id="j_id0:j_id1:main_block:pbTable:1:j_id94")
  	public WebElement commissionSignedCheck;
    
    
    @FindBy(id="j_id0:j_id1:main_block:pbTable:2:j_id94")
  	public WebElement primaryRoleSignedCheck;
    
    
    @FindBy(id="j_id0:j_id1:j_id31:j_id32:j_id34")
  	public WebElement commissionErrMsg;
    
    
    @FindBy(name="attachFile")
	public WebElement aaAttachFile;

	@FindBy(id="file")
	public WebElement aaBrowse;

	@FindBy(id="Attach")
	public WebElement aaAttach;

	@FindBy(name="cancel")
	public WebElement aaAttchDone;
	
	@FindBy(xpath ="//div[contains(@id,'_00Nw0000003PKQ0_body')]/table/tbody/tr[2]/td[5]")
	public WebElement ORStatus0;
	
	@FindBy(xpath ="//div[contains(@id,'_00Nw0000003PKQ0_body')]/table/tbody/tr[3]/td[5]")
	public WebElement ORStatus1;
	
	@FindBy(xpath ="//div[contains(@id,'_00Nw0000003PKQ0_body')]/table/tbody/tr[4]/td[5]")
	public WebElement ORStatus2;
	
	
	@FindBy(id="lookup0069E000006l67500Nw0000003PKQ0")
	public WebElement OpptyLnkOR;
   
  //  Please add the primary role for the commission agent. To mention its primary role, add an extra row below for the same account to which commission has been assigned, and select the appropriate role. : Merill Int.1
	//Constructor
	public  PageEditOpptyRel(WebDriver driver)
	{
		this.driver=driver;
		  //This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	
		
		public String getMandRolesTxt() {
			
			return opptyrelMandTxt.getText();
		
		}
		
		public void clickCancelOppRel()
		{
			opptyrelCancelBtn.click();
			
		}

		public void setOppRole0(String role) 
		{
			Select dropdown = new Select (OpptyRelRole0) ;
            dropdown.selectByVisibleText(role); 
		}
		
		public void setOppRole1(String role) 
		{
			Select dropdown = new Select (OpptyRelRole1) ;
            dropdown.selectByVisibleText(role); 
		}
		
		public void setOppAccnt1(String roleaccnt) 
		{
			WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id1:main_block:pbTable:1:j_id80")));
			OpptyRelAccnt1.sendKeys(roleaccnt);
            
		}
		
		public void setOppRole2(String role) 
		{
			Select dropdown = new Select (OpptyRelRole2) ;
            dropdown.selectByVisibleText(role); 
		}
		
		public void setOppAccnt2(String roleaccnt) 
		{
			OpptyRelAccnt2.sendKeys(roleaccnt);
		}
		
		public String getDelRoleErrMsg() {
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id1:j_id2:messages:j_id5:j_id6:0:j_id7:j_id8:j_id10")));
			return oppRelDelErrMSg.getText();
		
		}
		
		public void clickOppRelDel1()
		{
			oppRelDel1.click();
			
		}
		
		public void clickOppRelDel2()
		{
			oppRelDel2.click();
			
		}

		public String getRoleDelErrMsg() {
			
			return oppRelDelErrMSg.getText();
		
		}
		
		public void saveOppRel()
		{
			OpptyRelSave.click();
			
		}
		
		public String getMultipleAccntErr() {
			
			if (driver.findElements(By.xpath("//td[@id='j_id0:j_id1:main_block:pbTable:1:j_id79']/div")).size() != 0) 
			{	
				System.out.println("test2");
				String errmsg=multipleAccntErr.getText();
				System.out.println("errmsg:"+errmsg);
			return errmsg;
			
			
			}
			else
				
			{
				
				return "Error text not present";
			}
		}
		
         public String getMultipleAccntErr1() {
			
			if (driver.findElements(By.xpath("//td[@id='j_id0:j_id1:main_block:pbTable:2:j_id79']/div")).size() != 0) 
			{	
				System.out.println("test2");
				String errmsg=multipleAccntErr1.getText();
				System.out.println("errmsg:"+errmsg);
			return errmsg;
			
			
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
		
		public void clickORSignedCheck() {
			attchConfirmCheck.click();
		}
		
		public void clickOpptyOnOR() {
			oppNameOnOR.click();
		}



		public String getCommissionErrMsg() {
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id1:j_id31:j_id32:j_id34")));
			
			return commissionErrMsg.getText();
		}



		public void setCommissionFee(String commissionFeestr) {
			System.out.println("Inside commission");
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id1:main_block:pbTable:1:j_id90")));
			commissionFee.clear();
			commissionFee.sendKeys(commissionFeestr);;
		}



		public void checkCommissionSigned() {
			commissionSignedCheck.click();
		}
		
		public void setOpptyRelApprovalSigned0() {
		
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id1:main_block:pbTable:0:j_id97")));
			OpptyRelApprovalSigned0.click();
		}



		public void setOpptyRelApprovalSigned1() {
			
			System.out.println("Inside check1");

			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id1:main_block:pbTable:1:j_id97")));


			OpptyRelApprovalSigned1.click();
		}



		public void setOpptyRelApprovalSigned2() {
			
			System.out.println("Inside check2");

			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id1:main_block:pbTable:2:j_id97")));

			OpptyRelApprovalSigned2.click();;
		}

		
		public void clickUploadLink1() {
			OpptyUploadDoc1.click();
		}
		public void clickUploadLink2() {
			OpptyUploadDoc2.click();
		}
		
		public void clickUploadLink3() {
			OpptyUploadDoc3.click();
		}
		
		public void ORAttachFile() {
			OpptyAttachFile.click();
		}
		
		

		public void OpptyBrowse() throws InterruptedException, IOException {
			System.out.println("Inside ABrowse1");
			OpptyBrowse.click();
			Thread.sleep(1000);
			//String autoitscriptpath = "C:\\Selenium Workspace\\GRM_Regression_Local\\GRM_Regression_SVN\\File_upload_selenium_webdriver.au";
			Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\AutoIT\\FileUpload.exe");
			Thread.sleep(5000);
			System.out.println("Inside ABrowse2");
		}

		public void OpptyAttach() {
			//WebDriverWait wait = new WebDriverWait(driver,60);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Attach']")));
			OpptyAttach.click();


		}

		public void OpptyAttachDone() {
			OpptyDone.click();
		}

		public String getORStatus1() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000003PKQ0_body')]/table/tbody/tr[2]/td[5]")));
			return ORStatus0.getText();
		}

		
		public String getORStatus2() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000003PKQ0_body')]/table/tbody/tr[3]/td[5]")));
			return ORStatus1.getText();
		}
		
		public String getORStatus3() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000003PKQ0_body')]/table/tbody/tr[4]/td[5]")));
			return ORStatus2.getText();
		}
		
		

}



