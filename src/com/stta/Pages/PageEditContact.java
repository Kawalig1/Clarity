package com.stta.Pages;
//import java.util.concurrent.TimeUnit;

//import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageEditContact {
	
	WebDriver driver;
	
    @FindBy(name="new")
    WebElement contactNewBtn;
    
	@FindBy(id="name_firstcon2")
	WebElement contactEditFirstName;
	
	@FindBy(id="name_lastcon2")
	WebElement contactEditLastName;
	
	@FindBy(id="con10")
	WebElement contactEditPhone;
	
	@FindBy(id="con4")
	WebElement contactEditAccount;
	
	@FindBy(xpath="//div[@id='con4_autoCompleteRowId_0']/strong")
	WebElement contactEditAccountSel;
	
	@FindBy(name="save")
	WebElement contactSaveButton;
	
	 @FindBy(name="edit")
	 WebElement contactEditBtn;
	
	@FindBy(name="cancel")
	WebElement contactCancelButton;
	
	@FindBy(id="lookup001m000000Mgbtrcon4")
	WebElement acntLinkOnContact;
	
	@FindBy(id="00Nw0000008CtEz")
	WebElement optOutContactAll;
	
	@FindBy(id="00Nw0000003PEs6")
	WebElement optOutContactDirectMail;	
	
	@FindBy(id="00Nw0000003PEs8")
	WebElement optOutContactSMS;	
	
	@FindBy(id="00N20000001hTiT")
	WebElement OptOutContactPrefMthd;	
	
	@FindBy(id="00N20000001hTis_unselected")
	WebElement accEditContactHobbyIntrst;
	
	@FindBy(id="00N20000001hTis_ileinner")
	WebElement contactInlineHobbyIntrst;
	
	@FindBy(id="00N200000025wNJ_unselected")
	WebElement accEditContactSubscrips;
	
	@FindBy(id="00N200000025wNJ_ileinner")
	WebElement contactInlineSubscrips;
		
	@FindBy(id="con9_ileinner")
	WebElement contactInlineLeadSource;
	
	@FindBy(id="00Nw0000003PEs5")
	WebElement contactStatus;
	
	@FindBy(id="con19_ileinner")
	WebElement contactInlineAddrs;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/div[2]")
	WebElement contactLastNameErrMsg;
	
	@FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/div[2]")
	WebElement contactAccountErrMsg;
	
	@FindBy(id="errorDiv_ep")
	WebElement contactSaveError;
	
	@FindBy(xpath="//td[@id='bodyCell']/div/div/div/h1")
	WebElement saveContactLabel;
	
	@FindBy(xpath="//td[@id='bodyCell']/div/div/div/h2")
	WebElement saveContactName;
	
	@FindBy(id = "00Nw0000008CtEz")
	WebElement chk_opt_com;
	
	@FindBy(id = "con27")
	WebElement chk_do_not_call;
	
	@FindBy(id = "con23")
	WebElement chk_email_opt_out;
	
	@FindBy(id = "con28")
	WebElement chk_fax_opt_out;
	
	@FindBy(id = "00Nw0000003PEs6")
	WebElement chk_direct_mail_out;
	
	@FindBy(id = "00Nw0000003PEs8")
	WebElement chk_sms_opt_out;
	

	@FindBy(name="newOpp")
	WebElement contNewOpptyBtn;
	
	@FindBy(xpath="//div[contains(@id,'_RelatedOpportunityList_body')]/table/tbody/tr[2]/th/a")
	WebElement opptytNameOnRelatedList;
	
	@FindBy(xpath="//div[contains(@id,'_RelatedOpportunityList_body')]/table/tbody/tr[2]/th/a")
	WebElement contact;
	
	
	//Deepali added elements for subscription ans hobbies/interests right arrow
	
	@FindBy(id="00N20000001hTis_right_arrow")
    WebElement conhobbiesinterestrightarrow;
    
       
    @FindBy(id="00N200000025wNJ_right_arrow")
    WebElement consubcriptionsrightarrow;
    
    
  //Deepali added Profession type
    
    @FindBy(id="00Nw0000008lyP4")
    WebElement professionType;
    
    
    //Deepali added Contact Team Member elements
    @FindBy(xpath="//a[contains(@id,'lookup005')]")
    WebElement contactOwner;
    
   @FindBy(xpath="//div[contains(@id,'_00N1r0000090a1t_body')]/table/tbody/tr[2]/th/a")
    WebElement contactDefaultTM;
   

   @FindBy(xpath="//div(contains[@id,'_00N1r0000090a1t_body')]/table/tbody/tr[2]/td[2]")
   WebElement contactDefaultOpco;
   
   @FindBy(name="new00N1r0000090a1t")
   WebElement newContactTMBtn;
   
   @FindBy(name="CF00N1r0000090a1z")
   WebElement newTMName;
   
   @FindBy(id="00N1r0000090a1x")
   WebElement newTMMethodOFComm;
    
   @FindBy(id="00N1r0000090a1v")
   WebElement newTMFreOfEng;
   
   @FindBy(id="00N1r0000090a1y")
   WebElement newTMStrOfRel;
   
   @FindBy(xpath="//div[contains(@id,'_00N1r0000090a1t_body')]/table/tbody/tr[3]/th/a")
   WebElement newTMNameRL;
   
   @FindBy(xpath="//div[contains(@id,'_00N1r0000090a1t_body')]/table/tbody/tr[3]/td[2]")
   WebElement newTMOpcoRL;
   
   @FindBy(xpath="//div[contains(@id,'_00N1r0000090a1t_body')]/table/tbody/tr[3]/td[3]")
   WebElement newTMMethodOFCommRL;
    
   @FindBy(xpath="//div[contains(@id,'_00N1r0000090a1t_body')]/table/tbody/tr[3]/td[4]")
   WebElement newTMFreOfEngRL;
   
   @FindBy(xpath="//div[contains(@id,'_00N1r0000090a1t_body')]/table/tbody/tr[3]/td[5]")
   WebElement newTMStrOfRelRL;
   
   @FindBy(xpath="//div[@id='CF00N1r0000090a1t_ileinner']/a")
   WebElement newTMContactLnk;
   
    
	//Constructor
	
		public  PageEditContact(WebDriver driver)
		
		{
			
			this.driver=driver;
			  //This initElements method will create all WebElements
			PageFactory.initElements(driver, this);
		}

		public void setContactEditFirstName(String firstName) {
			
			contactEditFirstName.sendKeys(firstName);
		}

		public void setContactEditLastName(String LastName) {
			contactEditLastName.sendKeys(LastName);
		}

		public void setContactEditPhone(String phone) {
			contactEditPhone.sendKeys(phone);
		}
		
		
		
		public void setContactEditAccount(String account) {
			//contactEditAccount.clear();
			
			if(contactEditAccount.getAttribute("value").isEmpty())
			{
			System.out.println("Inside if blank account1");
			contactEditAccount.sendKeys(account);
			System.out.println("Inside blank account1");
			contactEditAccountSel.click();
			}
			
			else 
			{
				System.out.println("Inside else blank account1");
				//contactEditAccount.clear();
				//contactEditAccount.sendKeys(account);
				//contactEditAccountSel.click();
			}
		}

		public void clickSaveContact()
		{
			contactSaveButton.click();
		}
		
		public void clickCancelContact()
		{
			contactCancelButton.click();
		}
		
		public void clickEditContact()
		{
			contactEditBtn.click();
		}
		
		public void clickAccntLink(String accntName)
		{
			
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(accntName)));
			driver.findElement(By.linkText(accntName)).click();
			
			
		}
		
		public void setContactStatus(String contctStatus)
		{
			Select status = new Select(contactStatus);
			status.selectByVisibleText(contctStatus);
			//contactStatus.sendKeys(contctStatus);
		}

		public String getContactInlineAddrs() 
		{
			return contactInlineAddrs.getText();
		}

		public String getContactLastNameErrMsg() 
		{
			return contactLastNameErrMsg.getText();
		}

		public String getContactAccountErrMsg() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/div[2]")));
			return contactAccountErrMsg.getText();
		}
		
		 public void clickonNewContact()
		 {
             contactNewBtn.click();
         }

		public String getContactSaveError()
		{
			return contactSaveError.getText();
		}
		 
		public String getSaveContactLabel()
		{
			return saveContactLabel.getText();
		}
		
		public String getSaveContactName()
		{
			return saveContactName.getText();
		} 
		
		public String get_contact_opt_Status()
		{
        
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nw0000008CtEz")));
			return chk_opt_com.getAttribute("value");
                 
        }

		public boolean getChk_do_not_call() {
			return chk_do_not_call.isSelected();
			
		}
		
		public boolean getChk_email_opt_out() {
			return chk_email_opt_out.isSelected();
		}

		public boolean getChk_fax_opt_out() {
			return chk_fax_opt_out.isSelected();
		}

		public boolean getChk_direct_mail_out() {
						
			return chk_direct_mail_out.isSelected();
		}

		public boolean getChk_sms_opt_out() {
			return chk_sms_opt_out.isSelected();
		}

		public void createNewOpptyFrmCont() {
			contNewOpptyBtn.click();
		}
		
		 public String getOpptyNameOnRelatedList()
		    {
		           //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		           //System.out.println("Inside click13");
		           String opptyName = opptytNameOnRelatedList.getText();
		           //System.out.println("Inside click14:" + opptyName);
		           return opptyName;
		    }
		 
		 public void clickOpptyNameOnRelatedList()
		    {
		           //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		           //System.out.println("Inside click13");
		           opptytNameOnRelatedList.click();
		           //System.out.println("Inside click14:" + opptyName);
		    }

		public String getContactInlineHobbyIntrst() 
		{
			return contactInlineHobbyIntrst.getText();
		}

		public String getContactInlineSubscrips() {
			return contactInlineSubscrips.getText();
		}

		public String getContactInlineLeadSource() {
			return contactInlineLeadSource.getText();
		}


		public void setAccEditContactSubscrips(WebElement accEditContactSubscrips) {
			this.accEditContactSubscrips = accEditContactSubscrips;
		}
		
		public void setConHobbiesinterest(String strhobbiesinterest)
		{
			Select dropdown = new Select (accEditContactHobbyIntrst) ;
            dropdown.selectByVisibleText(strhobbiesinterest); 
            conhobbiesinterestrightarrow.click();
			
		}

		public void setConSubcriptions(String strsubcriptions)
		{
			Select dropdown = new Select (accEditContactSubscrips) ;
            dropdown.selectByVisibleText(strsubcriptions); 
            consubcriptionsrightarrow.click();

		}
		
		public void selProfessionType(String profession)  {
			
			
			Select dropdown = new Select (professionType) ;
            dropdown.selectByVisibleText(profession); 
	}

		public String getNewTMNameRL() {
			return newTMNameRL.getText();
		}

		public String getNewTMOpcoRL() {
			return newTMOpcoRL.getText();
		}

		public String getNewTMMethodOFCommRL() {
			return newTMMethodOFCommRL.getText();
		}

		public void clickNewContactTMBtn() {
			newContactTMBtn.click();
		}

		public void setNewTMName(String newTMNamestr) {
			newTMName.sendKeys(newTMNamestr);
		}

		public void setNewTMMethodOFComm(String newTMMethodOFCommstr) {
			
			Select comm=new Select(newTMMethodOFComm); 
			comm.selectByVisibleText(newTMMethodOFCommstr);
			
					}

		public void setNewTMFreOfEng(String newTMFreOfEngstr) {
			Select comm=new Select(newTMFreOfEng); 
			comm.selectByVisibleText(newTMFreOfEngstr);
		
		}

		public void setNewTMStrOfRel(String newTMStrOfRelstr) {
			
			Select comm=new Select(newTMStrOfRel); 
			comm.selectByVisibleText(newTMStrOfRelstr);
			
			
		}

		public String getNewTMFreOfEngRL() {
			
		return	newTMFreOfEngRL.getText();
						
			
		}

		public String getNewTMStrOfRelRL() {
			return newTMStrOfRelRL.getText();
		}

		public String getContactOwner() {
			return contactOwner.getText();
		}

		public String getContactDefaultTM() {
			return contactDefaultTM.getText();
		}

		public String getContactDefaultOpco() {
			return contactDefaultOpco.getText();
		}
		
		public void clickNewTMContactLnk() {
			newTMContactLnk.click();
		}
		
		
		
		

		
		
}


