package com.stta.Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageEditCampaign {
	
	WebDriver driver;
	
    @FindBy(name="new")
    WebElement CampNewBtn;
    
    @FindBy(id="p3")
    WebElement CampRecordType;
    
    @FindBy(id="cpn1")
    WebElement CampName;
    
  
    @FindBy(id="cpn2")
    WebElement CampType;
    
    @FindBy(id="Parent")
    WebElement CampParent;
    
    @FindBy(id="cpn7")
    WebElement CampCurr;
    
    @FindBy(id="cpn3")
    WebElement CampStatus;
    
    @FindBy(id="00N20000001udcQ")
    WebElement CampObj;
    
    @FindBy(id="00N20000001udcp")
    WebElement CampAct;
    
    @FindBy(id="cpn5")
    WebElement CampSrtDate;
    
    @FindBy(id="cpn6")
    WebElement CampEndDate;
    
    @FindBy(id="cpn13")
    WebElement CampNumSent;
    
    @FindBy(id="cpn11")
    WebElement CampExpecRes;
    
    @FindBy(id="cpn8")
    WebElement CampExpecRev;
        
    @FindBy(id="cpn9")
    WebElement CampBudCst;
    
    @FindBy(id="cpn10")
    WebElement CampActlCst;
    
    @FindBy(name="save")
    WebElement CampSave;
    
    @FindBy(xpath="//td[2]/div/div/div/h2")
    WebElement CampSaveName;
    
    @FindBy(id="cpn16")
    WebElement CampActive;
    
    @FindBy(id="CF00Nw0000003PKQA")
    WebElement CampMutualAccnt;
    
    @FindBy(id="fcf")
    WebElement CampView;
    
    @FindBy(id="ext-gen11")
    WebElement CampList;
    
    @FindBy(xpath="(//input[@name='save'])[2]")
    WebElement CampContinue;
    
    @FindBy(name="go")
    WebElement CampViewGo;
    
    @FindBy(name="task")
    WebElement CampNewTask;
    
    @FindBy(name="event")
    WebElement CampNewEvent;
    
    @FindBy(xpath="//div[contains(@id,'_RelatedActivityList_body')]/table/tbody/tr[3]/th/a")
    WebElement CampTaskRLSub;
    
    @FindBy(xpath="//div[contains(@id,'_RelatedActivityList_body')]/table/tbody/tr[2]/th/a")
    WebElement CampEvntRLSub;
    
   @FindBy(xpath="//img[@alt='Not Checked']")
    WebElement CampTaskRLChk;
   
   @FindBy(xpath="(//img[@alt='Checked'])[2]")
   WebElement CampEvntRLChk;
   
   
   
   @FindBy(name="newOpp")
   WebElement CampNewOppBtn;
   
   @FindBy(xpath="//div[6]/div/div/div[2]/table/tbody/tr[2]/th/a")
   WebElement CampOppRLName;
   
   @FindBy(id="cpn21_ileinner")
   WebElement CampNoOfOpp;
   
   @FindBy(id="cpn23_ileinner")
   WebElement CampValueOfOpp;
   
   @FindBy(xpath="//h3[contains(@id,'_RelatedCampaignHierarchyList_title')]")
   WebElement CampHierarListTitle;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr/th[2]")
   WebElement CampHierarLead;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr[2]/td")
   WebElement CampHierarLeadValue;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr/th[3]")
   WebElement CampHierarConvertedLead;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr[2]/td[2]")
   WebElement CampHierarConvertedLeadValue;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr/th[4]")
   WebElement CampHierarContacts;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr[2]/td[3]")
   WebElement CampHierarContactsValue;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr/th[5]")
   WebElement CampHierarOpportunity;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr[2]/td[4]")
   WebElement CampHierarOpportunityValue;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr/th[10]")
   WebElement CampHierarNumSent;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr[2]/td[9]")
   WebElement CampHierarNumSentValue;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr/th[12]")
   WebElement CampHierarBudgCst;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr[2]/td[11]")
   WebElement CampHierarBudgCstValue;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr/th[13]")
   WebElement CampHierarActlCst;
   
   @FindBy(xpath="//div[contains(@id,'_RelatedCampaignHierarchyList_body')]/table/tbody/tr[2]/td[12]")
   WebElement CampHierarActlCstValue;
   
   @FindBy(xpath="//a[contains(@id,'Nw0000003PKQA')]")
   WebElement CampMutualAccntLnk;
   
   
   
   @FindBy(id="cpn2_ileinner")
   WebElement CampTypeSub;
  
  @FindBy(id="cpn3_ileinner")
  WebElement CampStatusChk;
  
  //aska
  @FindBy(xpath=("//div[contains(@id,'_RelatedOpportunityList_body')]/table/tbody/tr[2]/th/a"))
  WebElement CampEBOppRLName;
  
  
//Deepali added Org and Geog fields
  
  @FindBy(id="CF00Nw0000008lyP0")
  WebElement CampOrg;
  
  
  @FindBy(id="CF00Nw0000008lyOx")
  WebElement CampGeog;

  
  

   //div[@id='7017E0000005Cxf_RelatedCampaignHierarchyList_body']/table/tbody/tr/th[2]
	//Constructor
	
		public  PageEditCampaign(WebDriver driver)
		
		{
			
			this.driver=driver;
			  //This initElements method will create all WebElements
			PageFactory.initElements(driver, this);
		}

		public void clickCampNewBtn() {
			CampNewBtn.click();
		}

		public void setCampName(String campName) {
			CampName.sendKeys(campName);
		}

		public void selCampType(String strcampType) {
			Select camptype = new Select(CampType);
			camptype.selectByVisibleText(strcampType);
		}

		public void setCampParent(String parentCamp) {
			CampParent.sendKeys(parentCamp);
		}

		public void setCampCurr(WebElement campCurr) {
			CampCurr = campCurr;
		}

		public void setCampStatus(String strcampStatus) {
			
			Select campstatus = new Select(CampStatus);
			campstatus.selectByVisibleText(strcampStatus);
		}

		public void setCampObj(String campObj) {
			CampObj.sendKeys(campObj);
		}

		public void setCampAct(String campAct) {
			CampAct.sendKeys(campAct);
		}

		public void setCampSrtDate() {
			CampSrtDate.click();
			driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
			//driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
			//driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 
			
		}

		public void setCampEndDate() {
			CampEndDate.click();
			driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
			driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click();
		}

		public void setCampNumSent(String campNumSent) {
			CampNumSent.sendKeys(campNumSent);
		}

		public void setCampExpecRes(String campExpecRes) {
			CampExpecRes.sendKeys(campExpecRes);
		}

		public void setCampExpecRev(String campExpecRev) {
			CampExpecRev.sendKeys(campExpecRev);
		}

		public void setCampBudCst(String campBudCst) {
			CampBudCst.sendKeys(campBudCst);
		}

		public void setCampActlCst(String campActlCst) {
			CampActlCst.sendKeys(campActlCst);
		}

		public void setCampSave() {
			CampSave.click();
		}

		public String getCampSaveName() {
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]/div/div/div/h2")));
			return CampSaveName.getText();
		}
		
		public void selCampRecordType(String strcampRcdType) {
						
			Select camprcrdtype = new Select(CampRecordType);
			camprcrdtype.selectByVisibleText(strcampRcdType);
		    CampContinue.click();
			
		}
		
		

		public void setCampActive() {
			CampActive.click();
		}

		public void setCampMutualAccnt(String campMutualAccnt) {
			if (driver.findElements(By.id("CF00Nw0000003PKQA")).size() != 0) 
			{
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				if(CampMutualAccnt.getText() == null)
				{
				CampMutualAccnt.sendKeys(campMutualAccnt);               
				}
				
				
			}
			
		}

	
		public void setCampView(String campViewtxt) 
		{
			Select campView = new Select(CampView);
			campView.selectByVisibleText(campViewtxt);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			if (driver.findElements(By.name("go")).size() != 0) 
			{
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				CampViewGo.click();              
				
			}
			
		}
		
		public String getCampListtxt() {
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ext-gen11")));
			return CampList.getText();
		}

		public void addCampNewTask() {
			CampNewTask.click();
		}

		public void addCampNewEvent() {
			CampNewEvent.click();
		}
		
		
		public String getCampEvntRLSub() {
			return CampEvntRLSub.getText();
		}
		
		public boolean getCampTaskRLChk() {
			return CampTaskRLChk.isDisplayed();
		}
		
		public String getCampTaskRLSub() {
			return CampTaskRLSub.getText();
		}
		
		public boolean getCampEvntRLChk() {
			return CampEvntRLChk.isDisplayed();
		}
		
		public void addCampNewOpp() {
			CampNewOppBtn.click();
		}
		
		
		public String getCampOppName() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[6]/div/div/div[2]/table/tbody/tr[2]/th/a")));
			return CampOppRLName.getText();
		}
		
		public String getCampNoOfOpp() {
			return CampNoOfOpp.getText();
		}
		
		public String getCampValueOfOpp() {
			return CampValueOfOpp.getText();
		}

		public String getCampHierarListTitle() {
			return CampHierarListTitle.getText();
		}

		public String getCampHierarLead() {
			return CampHierarLead.getText();
		}

		public String  getCampHierarLeadValue() {
			return CampHierarLeadValue.getText();
		}

		public String getCampHierarConvertedLead() {
			return CampHierarConvertedLead.getText();
		}

		public String getCampHierarConvertedLeadValue() {
			return CampHierarConvertedLeadValue.getText();
		}

		public String getCampHierarContacts() {
			return CampHierarContacts.getText();
		}

		public String getCampHierarContactsValue() {
			return CampHierarContactsValue.getText();
		}

		public String getCampHierarOpportunity() {
			return CampHierarOpportunity.getText();
		}

		public String getCampHierarOpportunityValue() {
			return CampHierarOpportunityValue.getText();
		}

		public String getCampHierarNumSent() {
			return CampHierarNumSent.getText();
		}

		public String getCampHierarNumSentValue() {
			return CampHierarNumSentValue.getText();
		}

		public String getCampHierarBudgCst() {
			return CampHierarBudgCst.getText();
		}

		public String getCampHierarBudgCstValue() {
			return CampHierarBudgCstValue.getText();
		}

		public String getCampHierarActlCst() {
			return CampHierarActlCst.getText();
		}

		public String getCampHierarActlCstValue() {
			return CampHierarActlCstValue.getText();
		}
		
		public void clickMutualAccntLnk() {
			CampMutualAccntLnk.click();
		}

		public String getEBCampType() {
			// TODO Auto-generated method stub
			return CampTypeSub.getText() ;
		}

		public String getCampStatusChk() {
			// TODO Auto-generated method stub
			return CampStatusChk.getText();
		}

		//aska
            public String getEBCampOppName() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_RelatedOpportunityList_body')]/table/tbody/tr[2]/th/a")));
			return CampEBOppRLName.getText();
            }
            
            public void setCampOrg(String org) {
            	CampOrg.sendKeys(org);    
            	           	
            }

            public void setCampGeog(String geo) {
            	CampGeog.sendKeys(geo);    
            	           	
            }

			
				
		

			
			
}         


