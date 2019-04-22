package com.stta.Pages;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEditAccountApproval {

	WebDriver driver;

	@FindBy(name="add_account_approval")
	public WebElement addAABtn;


	@FindBy(name="j_id0:j_id1:pblock:pbTable:0:j_id42")
	public WebElement addAARole;
	
	@FindBy(name="j_id0:j_id1:pblock:pbTable:1:j_id42")
	public WebElement addAARole1;
	
	
	@FindBy(name="j_id0:j_id1:pblock:pbTable:0:j_id42")
	public WebElement addAARole2;
	
	

	@FindBy(id="j_id0:j_id1:pblock:pbTable:0:j_id48")
	public WebElement addAAOrg;
	
	@FindBy(id="j_id0:j_id1:pblock:pbTable:1:j_id48")
	public WebElement addAAOrg1;

	@FindBy(id="j_id0:j_id1:pblock:pbTable:0:j_id58")
	public WebElement addAABP;

	@FindBy(id="j_id0:j_id1:pblock:j_id31:j_id32")
	public WebElement addAASave;

	@FindBy(xpath ="//div[contains(@id,'_00Nw0000003PKQF_body')]/table/tbody/tr[2]/td[2]")
	public WebElement aaRLRoleName;



	@FindBy(xpath ="//div[contains(@id,'_00Nw0000003PKQF_body')]/table/tbody/tr[2]/td[4]")
	public WebElement aaRLStatus;

	@FindBy(id ="j_id0:j_id1:pblock:j_id4:j_id5:j_id6:0:j_id7:j_id8:j_id10")
	public WebElement aablockMsg;

	@FindBy(name ="j_id0:j_id1:pblock:j_id31:j_id33")
	public WebElement aaCancelBtn;

	@FindBy(name ="submit_for_approval")
	public WebElement aaSubmitBtn;

	@FindBy(xpath ="//span[@id='j_id0:j_id1:j_id2:messages:j_id5:j_id6:0:j_id7']/div")
	public WebElement aaSubmitMsg;

	@FindBy(name ="j_id0:j_id1:j_id2:j_id3:j_id4")
	public WebElement aaGoBack;

	@FindBy(id="j_id0:j_id1:pblock:pbTable:0:j_id53")
	public WebElement attchConfirmCheck;


	@FindBy(xpath = "//a[contains(text(),'Upload Completed Forms')]")
	public WebElement aaDocUploadlink;

	@FindBy(name="attachFile")
	public WebElement aaAttachFile;

	@FindBy(id="file")
	public WebElement aaBrowse;

	@FindBy(id="Attach")
	public WebElement aaAttach;

	@FindBy(name="cancel")
	public WebElement aaAttchDone;

	@FindBy(xpath="//a[contains(@id,'Nw0000003PKQF')]")
	public WebElement aaAccountlink;

	@FindBy(xpath="//div[contains(@id,'_00Nw0000003PKQF_body')]/table/tbody/tr[2]/th/a")
	public WebElement accntAAlink;

	@FindBy(xpath="//div[contains(@id,'_RelatedProcessHistoryList_body')]/table/tbody/tr[2]/td/span")
	public WebElement aaActionBefore;

	@FindBy(xpath="//div[contains(@id,'_RelatedProcessHistoryList_body')]/table/tbody/tr[2]/td[6]/div/span")
	public WebElement aaOverallStatusBefore;

	//div[@id='a3F0E0000008jQb_RelatedProcessHistoryList_body']/table/tbody/tr[2]/td[6]/div/span
	@FindBy(xpath="//div[contains(@id,'_RelatedProcessHistoryList_body')]/table/tbody/tr[4]/td/span")
	public WebElement aaActionAfter;

	@FindBy(xpath="//div[contains(@id,'_RelatedProcessHistoryList_body')]/table/tbody/tr[4]/td[6]/div/span")
	public WebElement aaOverallStatusAfter;

	@FindBy(xpath="//div[@id='ep']/div[2]/div[2]/table/tbody/tr/td[4]")
	public WebElement aaCurrentApprovalStatus;

	@FindBy(xpath="//td[@id='bodyCell']/table/tbody/tr[2]/td")
	public WebElement aaLastLvlErr;

	@FindBy(name="edit")
	public WebElement aaEditBtn;

	@FindBy(name="save")
	public WebElement aaSaveBtn;

	@FindBy(id="errorDiv_ep")
	WebElement aaSaveError;


	@FindBy(linkText = "Approve / Reject")
	public WebElement aaApproveReject;

	@FindBy(id = "Comments")
	public WebElement aaComments;

	@FindBy(name = "goNext")
	public WebElement aaApproveButton;

	@FindBy(name = "Reject")
	public WebElement aaRejectButton;

	@FindBy(id = "00Nw0000003PKQJ")
	public WebElement aaDate;

	@FindBy(xpath = "//div[10]/div/div/div[2]/table/tbody/tr[2]/th/a")
	public WebElement aaOrgLink;

	@FindBy(xpath = "//div[10]/div/div/div[2]/table/tbody/tr[3]/th/a")
	public WebElement aaOrgLink2;

	@FindBy(xpath = "//div[10]/div/div/div[2]/table/tbody/tr[4]/th/a")
	public WebElement aaOrgLink3;

	@FindBy(xpath = "//div[10]/div/div/div[2]/table/tbody/tr[5]/th/a")
	public WebElement aaOrgLink4;

	@FindBy(xpath = "//div[10]/div/div/div[2]/table/tbody/tr[6]/th/a")
	public WebElement aaOrgLink5;

	@FindBy(xpath = "//div[@id='ep']/div[2]/div[2]/table/tbody/tr/td[2]")
	public WebElement aaName;

	@FindBy(xpath = "//div[@id='ep']/div[2]/div[2]/table/tbody/tr[3]/td[2]")
	public WebElement aaType;

	@FindBy(id = "00Nw0000008CtFD")
	public WebElement aaClientType;

	@FindBy(id = "00Nw0000008CtFx")
	public WebElement aaTypeofIntermediary;

	@FindBy(id="RecordType_ileinner")
	public WebElement aaAccntRecordType;

	@FindBy(xpath="//a[contains(text(),'Recall Approval')]")
	public WebElement aaRecallLnk;

	@FindBy(name="piRemove")
	public WebElement aaRecallBtn;

	@FindBy(id="Comments")
	public WebElement aaRecallCmnts;

	@FindBy(name="save")
	public WebElement aaRecallSave;

	@FindBy(name="need_more_information")
	public WebElement aaNeedMoreInfoBtn;

	@FindBy(id="j_id0:j_id1:j_id2:j_id29:j_id30:newDesc")
	public WebElement aaNeedMoreInfotxt;

	@FindBy(name="j_id0:j_id1:j_id2:j_id33:j_id34")
	public WebElement aaNeedMoreInfoSave;

	@FindBy(name="new00Nw0000003PKQF")
	public WebElement newAABtn;
	
	@FindBy(id="p3")
	public WebElement aaRecordType;
	
	@FindBy(xpath="(//input[@name='save'])[2]")
	public WebElement saveAARecordType;
	
	@FindBy(id="Name")
	public WebElement aaNameEdit;
	
	@FindBy(id="CF00Nw0000003PKQM")
	public WebElement aaOrgEdit;

	@FindBy(id="CF00Nw0000003PKQN")
	public WebElement aaRoleEdit;
	
	
	@FindBy(id="00Nw0000003PKQQ_ileinner")
	public WebElement aaStatusInline;
	
	@FindBy(id="Name_ileinner")
	public WebElement aaNameInline;

	@FindBy(id="j_id0:j_id1:pblock:j_id4:j_id5:j_id6:0:j_id7:j_id8:j_id10")
	public WebElement aaDuplicateErrMsg;
	
	

		public  PageEditAccountApproval(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		//This initElements method will create all WebElements
	}

	public void addAA() {
		System.out.println("test3");
		addAABtn.click();
	}

	public void addAARole(String  roletxt) {

		Select role = new Select(addAARole);
		role.selectByVisibleText(roletxt);

	}
	
	public void addAARole1(String  roletxt) {

		Select role = new Select(addAARole1);
		role.selectByVisibleText(roletxt);

	}

	//aska Corporate recovery
	public void addAARole2(String  roletxt) {

		Select role = new Select(addAARole2);
		role.selectByVisibleText(roletxt);

	}
	
	@FindBy(id="00Nw0000008CtDy_ileinner")
	public WebElement AccountAuthorizationStatus;	
	
	
	@FindBy(xpath="//div[11]/div/div/div[2]/table/tbody/tr[2]/td[4]")
	public WebElement CurrentApprovalStatus;	
	
	
	
	
	
	public void addAAOrg(String orgtxt) {
		
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.stalenessOf(addAAOrg));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id1:pblock:pbTable:0:j_id48")));
		addAAOrg.sendKeys(orgtxt);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	
public void addAAOrg1(String orgtxt) {
		
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.stalenessOf(addAAOrg));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:j_id1:pblock:pbTable:1:j_id48")));
		addAAOrg1.sendKeys(orgtxt);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public void setAAbp(String bptxt) {
		Select bp = new Select(addAABP);
		bp.selectByVisibleText(bptxt);

	}

	public void AASave() {
		
		System.out.println("test7");
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='j_id0:j_id1:pblock:j_id31:j_id32']")));
		addAASave.click();
		System.out.println("test8");
	}

	public String getAARoleName() {
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000003PKQF_body')]/table/tbody/tr[2]/td[2]")));
		return aaRLRoleName.getText();
	}

	public void clickAARoleName() {
		aaRLRoleName.click();
	}
	public String getAAStatus() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000003PKQF_body')]/table/tbody/tr[2]/td[4]")));
		return aaRLStatus.getText();
	}

	public String getAablockMsg() {
		return aablockMsg.getText();
	}

	public void clickAACancel() {
		aaCancelBtn.click();
	}

	public void clickAASubmit() {
		aaSubmitBtn.click();
	}

	public String getAASubmitMsg(){
		
		System.out.println("inside submit msg");
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='j_id0:j_id1:j_id2:messages:j_id5:j_id6:0:j_id7']/div")));
		return aaSubmitMsg.getText();


	}

	public void clickGoBack() {
		aaGoBack.click();
	}

	public void clickUploadLink() {
		aaDocUploadlink.click();
	}

	public void AAAttachFile() {
		aaAttachFile.click();
	}

	public boolean isAlertPresent() {
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			// Alert alert = driver.switchTo().alert();
			// alert.accept();
			
			return true;
		}// try
		catch (Exception e) {

			return false;
		}// catch
	} // catch
	
	public void AABrowse() throws InterruptedException, IOException {
		System.out.println("Inside ABrowse1");
		aaBrowse.click();
		Thread.sleep(1000);
		//String autoitscriptpath = "C:\\Selenium Workspace\\GRM_Regression_Local\\GRM_Regression_SVN\\File_upload_selenium_webdriver.au";
		String userdir=System.getProperty("user.dir");
		System.out.println("userdir:"+userdir);
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIT\\FileUpload.exe");
		//Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIT\\FileUpload.exe"+""+"C:\\Program Files (x86)\\AutoIT\\UploadAttachment.txt");
		Thread.sleep(5000);
		System.out.println("Inside ABrowse2");
		if(isAlertPresent()==true)
		{
			System.out.println("alert was present");
			Alert alert = driver.switchTo().alert();
			
			alert.accept();
		}
		System.out.println("Inside ABrowse3");

		
	}

	public void AAAttach() {
		//WebDriverWait wait = new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Attach']")));
		System.out.println("Inside ABrowse4");

		
		aaAttach.click();


	}

	public void AAAttachDone() {
		
		System.out.println("Inside ABrowse5");

		aaAttchDone.click();
	}

	public void clickAccountLink() {
		
		if (driver.findElements(By.xpath("//a[contains(@id,'Nw0000003PKQF')]")).size()!=0)
		{
			System.out.println("Account Link present");
		aaAccountlink.click();
		}
		
		else
		{
			System.out.println("Account link not present ");
		}
	}

	public void clickAASignedCheck() {
		attchConfirmCheck.click();
	}

	public void clickAALinkOnAccnt() {
		accntAAlink.click();
	}

	public void clickaaApproveReject()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Approve / Reject")));
		aaApproveReject.click();
	}

	public void clickaaComments(String comments)
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Comments")));
		aaComments.sendKeys(comments);
	}

	public void clickaaApproveButton()
	{
		aaApproveButton.click();
	}

	public void setaaPastDate()
	{
		aaDate.clear();
		aaDate.click();
		driver.findElement(By.xpath("//img[@alt='Previous Month']")).click(); 
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[20]")).click();
	}

	public void setaaFutureDate()
	{
		aaDate.clear();
		aaDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click();
	}
	
	public void setCommissionAADate()
	{
		aaDate.clear();
		aaDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[26]")));
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[26]")).click(); 
	}

	public String getAAActionBefore()
	{
		return aaActionBefore.getText();
	}

	public String getAAOverallStatusBefore()
	{
		return aaOverallStatusBefore.getText();
	}

	public String getAAActionAfter()
	{
		return aaActionAfter.getText();
	}

	public String getAAOverallStatusAfter()
	{
		return aaOverallStatusAfter.getText();
	}

	public String getAACurrentApprovalStatus()
	{
		return aaCurrentApprovalStatus.getText();
	}

	public String getAALastLvlErr()
	{
		return aaLastLvlErr.getText();
	}


	public void clickaaEditButton()
	{
		aaEditBtn.click();
	}


	public void clickaaSaveButton()
	{
		aaSaveBtn.click();
	}

	public String getAASaveErr()
	{

		return aaSaveError.getText();
	}

	public String getAAName()
	{
		return aaName.getText();
	}

	public String getAAType()
	{
		return aaType.getText();
	}

	public void setClientType(String clienttypetxt) {
		Select bp = new Select(aaClientType);
		bp.selectByVisibleText(clienttypetxt);
	}

	public void setTypeOfIntermediary(String typeofinttxt) {
		Select bp = new Select(aaTypeofIntermediary);
		bp.selectByVisibleText(typeofinttxt);

	}

	public String getAARecordType()
	{
		return aaAccntRecordType.getText();
	}

	public void clickAARecallLnk()
	{
		aaRecallLnk.click();
	}

	public void clickAARecallBtn()
	{
		aaRecallBtn.click();
	}

	public void setAARecallCmnts(String comments)
	{
		aaRecallCmnts.sendKeys(comments);
	}

	public void clickAARecalSaveBtn()
	{
		aaRecallSave.click();
	}

	public void clickAARejectBtn()
	{
		aaRejectButton.click();
	}

	public void clickNeedMoreInfoBtn()
	{
		aaNeedMoreInfoBtn.click();
	}

	public void setAANeedMoreInfo(String txt)
	{
		aaNeedMoreInfotxt.sendKeys(txt);
	}

	public void SaveNeedMoreInfo()
	{
		aaNeedMoreInfoSave.click();
	}

	public String getAaStatusInline() {
		return aaStatusInline.getText();
	}

	public String getAaNameInline() {
		return aaNameInline.getText();
	}

	public void clickNewAABtn() {
		 newAABtn.click();
	}

	
	public void SaveAARecordType( ) {
		saveAARecordType.click();
	}

	public void setAaNameEdit(String aaNameEditstr) {
		aaNameEdit.sendKeys(aaNameEditstr);
	}
	
	
	public void setAaOrgEdit(String aaOrgEditstr) {
		aaOrgEdit.sendKeys(aaOrgEditstr);
	}

	public void selAaRoleEdit(String aaRoleEditstr) {
		
		aaRoleEdit.sendKeys(aaRoleEditstr);

	}

		
	public void selAARecordType(String recordtype) {
		Select bp = new Select(aaRecordType);
		bp.selectByVisibleText(recordtype);

	}
		
	public String getAADuplicateMsg() {
		return aaDuplicateErrMsg.getText();
	}
	
	
//aska Corporate Recovery
	
	public String getAccountAuthorizationStatus() {
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nw0000008CtDy_ileinner")));
		return AccountAuthorizationStatus.getText();
	}	
	
	
	public String getCurrentApprovalStatus() {
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[11]/div/div/div[2]/table/tbody/tr[2]/td[4]")));
		return CurrentApprovalStatus.getText();
	}	
	
	
	
}



