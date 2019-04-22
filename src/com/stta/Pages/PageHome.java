package com.stta.Pages;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHome
{

	WebDriver driver;
	//PageSearchAccount objSearchAccount = new PageSearchAccount(driver);
	//PageEditAccount objEditAccount = new PageEditAccount(driver);
	//PageEditContact objEditContact = new PageEditContact(driver);
	//PageEditOppty objEditOppty = new PageEditOppty(driver);

	/*@FindBy(linkText="Leads")
	WebElement mnulead;
	
	@FindBy(linkText="Contacts")
	WebElement mnucontact;
	
	@FindBy(linkText="Accounts")
	public WebElement mnuAccount;
	
	@FindBy(linkText="Opportunities")
	public WebElement mnuOppty;
	
	@FindBy(linkText="Campaigns")
	public WebElement mnuCampaign;
	
	@FindBy(linkText="Reports")
	public WebElement mnuReport;
	
	@FindBy(linkText="Dashboards")
	public WebElement mnuDashboard;
	
	@FindBy(linkText="Activities")
	public WebElement mnuActivity;
	
	@FindBy(linkText="Projects")
	public WebElement mnuProject;
	
	@FindBy(id="phSearchInput")
	public WebElement globalSearchtext;
	
	@FindBy(id="phSearchButton")
	public WebElement globalSearchBtn;
	
	@FindBy(id="searchAllSummaryView")
	public WebElement globalSearchAllBtn;
	*/
	
	
/*//Aska EB Contracts
//Schemes
	
    @FindBy(linkText="Schemes")
    WebElement mnuSchemes;
    
//Contracts
	 @FindBy(linkText="Contracts")
     WebElement mnuContracts;    
	
	
	
	
	//Deepali added PrivateOppSearch
	@FindBy(xpath="//div[@id='Opportunity_body']/table/tbody/tr[2]/th/a")
	public WebElement oppNameLink;
	
	//Deepali added Block Account fields
	@FindBy(xpath="//div[@id='Account_body']/table/tbody/tr[2]/th/a")
	public WebElement accntNameLink;
	
			
	//Deepali added No Match Found Warning
	@FindBy(xpath="//div[@id='searchResultsWarningMessageBox']/table/tbody/tr/td[2]/div")
	public WebElement srchRsltWarning;
	
	//Deepali added AA Name link
	
	@FindBy(xpath="//div[@id='JLT_Core_Account_Approval__c_body']/table/tbody/tr[2]/th/a")
	public WebElement aaNameLink;
	
	 @FindBy(xpath="//div[@id='Opportunity_body']/table/tbody/tr[2]/th/a")
	public WebElement CampaignNameLink;
	
	
		
	
	@FindBy(linkText="Meeting Reports")
	public WebElement mnuMeetingReport;
	
	
	@FindBy(linkText="Forecast")
	public WebElement mnuForecast;*/
	
	//Personal and Public tag elements
		/*	@FindBy(id="tag_edit_text")
			public WebElement tagLnk;
			
			@FindBy(id="personaltag_edit_area")
			public WebElement personalTagArea;
			
			@FindBy(id="publictag_edit_area")
			public WebElement publicTagArea;
			
			@FindBy(id="tag_save")
			public WebElement tagSave;
				
			@FindBy(xpath="//span[@id='personaltag_display_list']/a")
			public WebElement personalTagLnk;

			@FindBy(xpath="//span[@id='publictag_display_list']/a")
			public WebElement publicTagLnk;
			
			@FindBy(xpath="//div[@id='tagListBodyALL']/table/tbody/tr/td/span/a/span")
			public WebElement tagList;
			
			//Notes and attachment functions
			
			@FindBy(name="newNote")
			public WebElement notebtn;
			
			@FindBy(id="Title")
			public WebElement noteTitle;
			
			@FindBy(name="save")
			public WebElement saveBtn;
			
			@FindBy(name="attachFile")
			public WebElement attachFilebtn;
			
			@FindBy(xpath="//div[contains(@id,'_RelatedNoteList_body')]/table/tbody/tr[3]/td[2]/a")
			public WebElement noteRL;
			
			@FindBy(xpath="//div[contains(@id,'_RelatedNoteList_body')]/table/tbody/tr[2]/td[2]/a")
			public WebElement attachRL;
			*/
			@FindBy(id="ctl00_MenuTreeViewn5")
			public WebElement adminSettings;
			
			@FindBy(linkText="Change Password")
			public WebElement ChangePasswordTab;
			
			@FindBy(id="ctl00_ContentPlaceHolder1_AdminContainer_WebRegistrationPanel_WebRegistrationControl1_btnSaveOnlineRegistration")
			public WebElement saveSettingsButton;
			
			@FindBy(id="__tab_ctl00_ContentPlaceHolder1_AdminContainer_WebRegistrationPanel")
			public WebElement onlineRegistration;
			
			@FindBy(id="ctl00_ContentPlaceHolder1_AdminContainer_WebRegistrationPanel_WebRegistrationControl1_txtLinkExpiryTime")
			public WebElement expiryLink;
			
			@FindBy(id="ctl00_ContentPlaceHolder1_AdminContainer_WebRegistrationPanel_WebRegistrationControl1_txtattemptsallowed")
			public WebElement daysExpiry;
			
			@FindBy(linkText="Edit")
			public WebElement LinkEdit;
			
			@FindBy(linkText="Update")
			public WebElement UpdateLink;
			
			@FindBy(name="ctl00$ContentPlaceHolder1$AdminContainer$SettingsPanel$SettingsDetailsView$ctl04")
			public WebElement LoginGenerationCount;
			
			@FindBy(id="__tab_ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel")
			public WebElement passwordPolicy;
			
			@FindBy(id="__tab_ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel")
			public WebElement SettingsTab;
			
			@FindBy(id="__tab_ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel")
			public WebElement PasswordPolicyTab;
			
			@FindBy(id="ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_drpPasswordPolicy")
			public 	WebElement PickPswrdPolicyDropDown;
			
			@FindBy(name="ctl00$ContentPlaceHolder1$AdminContainer$PasswordPolicyPanel$PasswordPolicyDetailsView$ctl01")
			public WebElement MinLengthFeild;
			
			@FindBy(name="ctl00$ContentPlaceHolder1$AdminContainer$PasswordPolicyPanel$PasswordPolicyDetailsView$ctl02")
			public WebElement MaxLengthFeild;
			
			@FindBy(id="ctl00_ContentPlaceHolder1_ChangePasswordControl_PasswordTextBox")
			public WebElement password;
			
			@FindBy(id="ctl00_ContentPlaceHolder1_ChangePasswordControl_NewPasswordTextBox")
			public WebElement newPassword;
			
			@FindBy(id="ctl00_ContentPlaceHolder1_ChangePasswordControl_ConfirmNewPasswordTextBox")
			public WebElement confirmNewPassword;
			
	public PageHome(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		//This initElements method will create  all WebElements
	}
	
	public void changePassword(String Password, String NewPassword, String ConfirmNewPassword)
	{
		password.sendKeys(Password);
		newPassword.sendKeys(NewPassword);
		confirmNewPassword.sendKeys(ConfirmNewPassword);	
	}
	
	public void clickLinkEdit()
	{
		LinkEdit.click();
	}

	public void clickUpdateLink()
	{
		UpdateLink.click();
	}	
	public void clickonSettings()
	{
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		System.out.println("Inside Settings");
		/*if(adminSettings.isEnabled())
		{
			adminSettings.sendKeys(Keys.ENTER);
			adminSettings.sendKeys(Keys.ENTER);
		}*/
		adminSettings.click();
		
		/*WebElement link = driver.findElement(By.id("ctl00_MenuTreeViewn5"));
		link.click();*/

		System.out.println("Clicked Settings");
	}
	
	public void clickChangePasswordTab()
	{
		ChangePasswordTab.click();
	}
	
	public void clickonSettingsTab()
	{
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		System.out.println("Inside SettingsTab");
		//adminSettings.clear();
		SettingsTab.click();
		//adminSettings.click();
		System.out.println("Clicked SettingsTab");
	}
	
	public void clickonPasswordPolicyTab()
	{
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		System.out.println("Inside PasswordPolicyTab");
		//adminSettings.clear();
		PasswordPolicyTab.click();
		//adminSettings.click();
		System.out.println("Clicked PasswordPolicyTab");
	}
	
	public void PickPswrdPolicyDropDown(String PickPolicy)
	{
		PickPswrdPolicyDropDown.sendKeys(PickPolicy);
	}
	
	public void ClickOnlineRegistration()
	{
		System.out.println("Inside Online Registration");
		onlineRegistration.click();
		System.out.println("Clicked Online Registration");
		
	}
	
	public void ClickpasswordPolicy()
	{
		System.out.println("Inside password Policy");
		passwordPolicy.click();
		System.out.println("Clicked password Policy");
		
	}
	
	public void setMinLengthFeild(String text)
	{
		MinLengthFeild.clear();
		MinLengthFeild.sendKeys(text);
	}
	
	public void setMaxLengthFeild(String text)
	{
		MaxLengthFeild.clear();
		MaxLengthFeild.click();
	}
	
		
	public void ClicksaveSettingsButton()
	{
		System.out.println("Inside Save Settings");
		saveSettingsButton.click();
		System.out.println("Clicked Save Settings");
	}
	
	public void setexpiryLinktext(String text)
	{
		//WebDriverWait wait = new WebDriverWait(driver,40);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phSearchInput")));
		expiryLink.clear();
		expiryLink.sendKeys(text);
	}
	
	public void setdaysExpirytext(String text)
	{
		//WebDriverWait wait = new WebDriverWait(driver,40);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phSearchInput")));
		daysExpiry.clear();
		daysExpiry.sendKeys(text);
	}
	
	public void setLoginGenerationCount(String text)
	{
		//WebDriverWait wait = new WebDriverWait(driver,40);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phSearchInput")));
		LoginGenerationCount.clear();
		LoginGenerationCount.sendKeys(text);
	}
	
	/*public void clickonContact()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Contacts")));
		mnucontact.click();
	}

	public void clickonOppty()
	{
		mnuOppty.click();
	}

	public void setGlobalSearchtext(String text)
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phSearchInput")));
		globalSearchtext.sendKeys(text);
	}

	public void setGlobalSearchBtn() 
	{
		System.out.println("Inside btn1");
		globalSearchBtn.click();
		System.out.println("Inside btn2");
	}
	
	public void setGlobalSearchAllBtn() 
	{
		
		System.out.println("Inside all1");

		
		if (driver.findElements(By.id("searchAllSummaryView")).size() != 0) 
		{
			System.out.println("Inside all2");

		globalSearchAllBtn.click();
		}
		
		else
		{
			System.out.println("Inside all3");

			System.out.println("GLobal search button not present");
		}
	}
	
	public void clickonCampaign()
	{
		mnuCampaign.click();
	}
	
	
	public void clickonReports()
	{
		mnuReport.click();
	}
	
	public void clickonActivity()
	{
		mnuActivity.click();
	}
	
	public void clickonProject()
	{
		mnuProject.click();
	}
	
	
	//Deepali added PrivateOppSearch
	
	public String getOppName()
	{
		String oppName = null;
		if (driver.findElements(By.xpath("//div[@id='Opportunity_body']/table/tbody/tr[2]/th/a")).size()!=0)
			{
			
				oppName=oppNameLink.getText();
			}
		
		return oppName;
	}
	
	public void clickOppName()
	{
		oppNameLink.click();
	}
	
	public String getSrchResult()
	{
		System.out.println("Inside search");
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='searchResultsWarningMessageBox']/table/tbody/tr/td[2]/div")));
		return srchRsltWarning.getText();
		
	}
	
	public void clickAccntName()
	{
		accntNameLink.click();
	}
	
	public void clickaaName()
	{
		aaNameLink.click();
	}
	
	public void clickonMeetingReport()
	{
		mnuMeetingReport.click();
	}
	
	public void clickonForecast()
	{
		mnuForecast.click();
	}
	
	public void clickonDashboard()
	{
		mnuDashboard.click();
	}

	public String getTagList() {
		return tagList.getText();
	}*/

	/*public void clickTagLnk() {
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tag_edit_text")));		
		tagLnk.click();
	}

	public void setPersonalTagArea(String personaltagtxt) {
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personaltag_edit_area")));
		personalTagArea.sendKeys(personaltagtxt);;
	}

	public void setPublicTagArea(String publicTagtxt) {
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("publictag_edit_area")));
		publicTagArea.sendKeys(publicTagtxt);;
	}

	public void setTagSave() {
		tagSave.click();
	}

	public String getPersonalTagLnk() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='personaltag_display_list']/a")));
		return personalTagLnk.getText();
	}

	public String getPublicTagLnk() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='publictag_display_list']/a")));
		return publicTagLnk.getText();
	}
	
	public String gettagList() {
		return tagList.getText();
	}

	
	//Notes and attachment functions
	public String getNoteRL() {
		return noteRL.getText();
	}

	public String getAttachRL() {
		return attachRL.getText();
	}

	public void clickNotebtn() {
		notebtn.click();
	}

	public void setNoteTitle(String noteTitletxt) {
		noteTitle.sendKeys(noteTitletxt);
	}

	public void clickAttachFilebtn() {
		attachFilebtn.click();
	}

	
	public void clickSavebtn() {

        saveBtn.click();

}
	
	//aska EBContracts Schemes
	
	public void clickonSchemes()
	{
		System.out.println("Inside clickonchemes");
		mnuSchemes.click();
	} 
	
	public void clickonContracts()
	{
		System.out.println("Inside clickonContracts");
		mnuContracts.click();
	} 
*/

	
	
}
	
	
	





