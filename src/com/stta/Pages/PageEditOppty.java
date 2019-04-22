package com.stta.Pages;

//import java.sql.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEditOppty
{
	WebDriver driver;
	@FindBy(name="new") 
	WebElement opptyNewBtn;
	
	@FindBy(id="p3") 
	WebElement opptySelectRecordType;
	
	@FindBy(xpath="(//input[@name='save'])[2]") 
	WebElement opptyContinueBtn;
	
	@FindBy(id="opp4") 
	WebElement opptyAccntName;
	
	@FindBy(id="opp3")
	WebElement opptyName;
	
	@FindBy(id="opp11") 
	WebElement opptySalesStage;
	
	@FindBy(xpath="//select[@id='00Nw0000003PEt7']") 
	WebElement opptyFunnelStep;
	
	@FindBy(id="opp7") 
	WebElement opptyTotalFee;
	
	@FindBy(id="opp9")
	public WebElement opptyCloseDate;
	
	@FindBy(id="00Nw0000003PEtA") 
	public WebElement opptyInceptionDate;
	
	@FindBy(id="00N20000003NlIs") 
	WebElement opptyRevenueType;
	
	@FindBy(id="00N20000003NlIx") 
	WebElement opptyTypeOfClient;

	@FindBy(name="save") 
	WebElement opptySaveBtn;
	
	@FindBy(name="edit") 
	WebElement opptyEditBtn;
	
	@FindBy(xpath="//div[@id='opp4_ileinner']/a")
	WebElement acntLinkOnOppty;
	
	
	@FindBy(xpath="//div[contains(@id,'_RelatedContactRoleList_body')]//table/tbody/tr[2]/th/a")
	WebElement cntLinkOnOppty;
	
	@FindBy(xpath="//select[@id='calYearPicker']")
	WebElement calYearPicker;
	//select[@id='calYearPicker']
	
	@FindBy(name="addProd")
	WebElement opptyAddProductBtn;
	
	@FindBy(xpath="//div[contains(@id,'_RelatedLineItemList_body')]/table/tbody/tr[2]/th/a")
	WebElement prodNameOnRelatedList;
	
	@FindBy(xpath="//div[contains(@id,'_RelatedLineItemList_body')]/table/tbody/tr[2]/td[3]")
	WebElement COBOnRelatedList;
	
	@FindBy(xpath="//div[contains(@id,'_RelatedLineItemList_body')]/table/tbody/tr[2]/td[4]")
	WebElement LOBOnRelatedList;
	
	@FindBy(name = "add_opportunity_relationship")
	public WebElement opptyAddOpptyRel;
	
	@FindBy(name="j_id0:j_id1:main_block:pbTable:1:j_id74")
	public WebElement opptyOpptyRelRole;
	
	@FindBy(id="opp11_ileinner")
	public WebElement OpptySalesStage;
	
	@FindBy(name = "newRole")
	public WebElement OpptyContRoleNew;
	
	@FindBy(id = "contact0")
	public WebElement OpptyContRoleCont;
	
	@FindBy(id = "role0")
	public WebElement OpptyContRoleRole;
	
	@FindBy(name = "save")
	public WebElement OpptyContRoleSave;
	
	@FindBy(name = "//div[@id='0068E000002HJ6B_RelatedContactRoleList_body']/table/tbody/tr[2]/th/a")
	public WebElement OpptyContRoleContVerify;
	
	@FindBy(id = "bodyCell")
	public WebElement OpptyPage;
	
	@FindBy(name = "cancel")
	public WebElement OpptyCancel;
	
	@FindBy(name = "submit_for_approval")
	public WebElement OpptySubmitApproval;
	
	@FindBy(id = "00Nw0000003PKQx_ileinner")
	public WebElement OpptyApprovalStatus;
	
	@FindBy(id = "00Nw0000003PEt4")
	public WebElement OpptyExpiryDate;
	
	@FindBy(id = "00Nw0000003PEtN")
	public WebElement OpptyReasonWonLost;
	
	@FindBy(id="opp11_ileinner")
	public WebElement OpptySalesStageText;
	
	@FindBy(id = "opp12_ileinner")
	public WebElement OpptyProbPercent;
	
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[7]/table/tbody/tr/td[4]/div")
	public WebElement InceptionDateError;	
			
	@FindBy(id = "opp7_ileinner")
	public WebElement OpptyInlineFeeBkge;	

	
	@FindBy(id = "opp6_ileinner")
	public WebElement OpptyInlineLeadSource;	
	

	@FindBy(id = "00Nw0000003PEtB_ileinner")
	public WebElement OpptyInlineLeadSourceName;
	
	
	@FindBy(id = "00Nw0000003PEtA_ilecell")
	public WebElement OpptyInlineInceptionDate;
	
	@FindBy(xpath = "//div[contains(@id,'_00Nw0000003PErs_body')]/table/tbody/tr[2]/th/a")
	public WebElement OpptyCompName;
	
	@FindBy(xpath = "//div[contains(@id,'_00Nw0000003PErs_body')]/table/tbody/tr[2]/td[2]")
	public WebElement OpptyCompRole;
	
	@FindBy(xpath = "//div[contains(@id,'_00Nw0000003PErs_body')]/table/tbody/tr[2]/td[5]")
	public WebElement OpptyCompComments;
	
	@FindBy(xpath = "//div[@id='opp17_ileinner']/a")
	public WebElement OpptyCampLink;
	
	@FindBy(id ="CF00N20000001gfMI")
	public WebElement OpptyPrj;
	
	@FindBy(xpath ="//div[contains(@id,'_autoCompleteRowId_0')]/strong")
	public WebElement OpptyPrjAuto;
	
	//@FindBy(xpath ="//a[starts-with(@id,'lookupa0A7E')]")
	//public WebElement OpptyPrjLink;
	
	/*@FindBy(id="lookupa0A7E000000SJn100N20000001gfMI")
    WebElement OpptyPrjLink;*/
	
	@FindBy(xpath="//div[@id='CF00N20000001gfMI_ileinner']/a")
    WebElement OpptyPrjLink;
	
	@FindBy(id="errorDiv_ep")
    WebElement lblErrorMessage;
	
	
	//Deepali
	
	@FindBy(xpath="//td[@id='bodyCell']/div/div/div/h1")
	WebElement saveOpptyType;

	@FindBy(xpath="//td[@id='bodyCell']/div/div/div/h2")
	WebElement saveOppName;
	
	@FindBy(id="opp4_autoCompleteRowId_0")
	WebElement selAccntName;
	
	//Deepali added Re Opportunity Fields
	
	@FindBy(xpath="//img[@alt='Account Name Lookup (New Window)']")
	WebElement accntLookup;
		
	@FindBy(xpath="//input[@id='lksrch']")
	WebElement accntLookupSrch;
	
	@FindBy(xpath="//input[@name='go']")
	WebElement accntLookupGo;
	
	@FindBy(xpath="//tr[2]/th/a")
	WebElement accntLookupLink;
	
	@FindBy(xpath="//select[@id='00Nw0000008w75k']")
	WebElement industryType;
	
	@FindBy(xpath="//select[@id='00Nw0000008w75g']")
	WebElement bussDevUnit;
	
	@FindBy(xpath="//select[@id='00Nw0000008oU1X']")
	WebElement riskLoc;
	
	@FindBy(xpath="//select[@id='00Nw0000009CfxN']")
	WebElement lineSlip;
	
	@FindBy(xpath="//select[@id='00Nw0000008w75h']")
	WebElement classOfBuss;
	
	@FindBy(xpath="//input[@id='CF00Nw0000008w75e']")
	WebElement subClass;
	
	@FindBy(xpath="//select[@id='00Nw0000003PEsx']")
	WebElement oppType;
	
	@FindBy(xpath="//select[@id='00Nw0000008V0sn']")
	WebElement reRiskType;
	
	@FindBy(xpath="//input[@id='00Nw0000008w75d']")
	WebElement feeBrkg;
	
	@FindBy(xpath="//input[@id='00Nw0000008vPNd']")
	WebElement noCompetitor;
	
	//Deepali added Organisation id
	
	@FindBy(xpath="//input[@id='CF00Nw0000003PEtH']")
	WebElement oppOrg;
	
	@FindBy(xpath="//input[@id='CF00Nw0000003PEt9']")
	WebElement oppGeog;
	
	
	//Deepali added expiry date  error
	@FindBy(xpath="//div[@id='ep']/div[2]/div[7]/table/tbody/tr[2]/td[4]/div")
	WebElement expiryDateError;
	
	
	//Deepali added Re Opp  error messages
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[5]/table/tbody/tr/td[2]/div")
	public WebElement ReInceptionDateError;
	
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[5]/table/tbody/tr[2]/td[2]/div")
	WebElement ReExpiryDateError;
	
	
	//Deepali added Private Opportunity elements
	@FindBy(xpath = "//input[@id='opp2']")
	WebElement privateOpp;
	
	@FindBy(xpath = "//span[@id='Opportunity.IsPrivate-_help']/img")
	WebElement privateOppHelpTextimg;
	
	@FindBy(xpath = "//td[@id='bodyCell']/div[16]")
	WebElement privateOppHelpText;
	
	//@FindBy(xpath = "//td[@id='bodyCell']/div[15]")
	//WebElement rePrivateOppHelpText;
			
	@FindBy(xpath = "//img[@id='opp2_chkbox']")
	WebElement privateOppCheckbox;
	
	@FindBy(xpath = "//div[contains(@id,'_RelatedOpportunitySalesTeam_body')]/table/tbody/tr/th")
	WebElement viewBlankOppTeam;
	
	
	//Deepali added elements for Opportunity required field error messages 
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/div[2]")
	WebElement accountNameRqdErr;
	
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/div[2]")
	WebElement oppNameRqdErr;
	
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[7]/table/tbody/tr/td[2]/div/div[2]")
	public
	WebElement closeDatRqdErr;
	
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[5]/table/tbody/tr/td[4]/div/div[2]")
	public
	WebElement reCloseDatRqdErr;
	
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/div[2]")
	WebElement salesStageRqdErr;
	
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[3]/table/tbody/tr[3]/td[4]/div/div[2]")
	WebElement totalFeeRqdErr;
	
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[7]/table/tbody/tr/td[4]/div/div[2]")
	WebElement revTypeRqdErr;
	
	@FindBy(xpath = "//div[@id='ep']/div[2]/div[7]/table/tbody/tr[2]/td[4]/div/div[2]")
	WebElement typeOfClientRqdErr;
	
	
	//Deepali added competitor fields
	
	@FindBy(xpath = "//input[@name='add_competitor']")
	WebElement addCompetitorBtn;
	
	@FindBy(xpath = "//input[@id='j_id0:j_id5:pgBlk:j_id53:0:j_id55']")
	WebElement competitor;
	
	@FindBy(xpath="//div[@id='j_id0:j_id5:pgBlk:j_id53:0:j_id55_autoCompleteRowId_0']/strong")
	WebElement selCompetitor;
	
	
	@FindBy(xpath = "//select[@id='j_id0:j_id5:pgBlk:j_id53:0:j_id57']")
	WebElement competitorRole;
	
	@FindBy(xpath = "//input[@id='j_id0:j_id5:pgBlk:j_id53:0:j_id59']")
	WebElement lostToCheck;
	
	@FindBy(xpath = "//input[@id='j_id0:j_id5:pgBlk:j_id53:0:j_id62']")
	WebElement lostToFee;
	
	@FindBy(xpath = "//select[@id='j_id0:j_id5:pgBlk:j_id91:j_id92']")
	WebElement compSalesStage;
	
	@FindBy(xpath = "//select[@id='j_id0:j_id5:pgBlk:j_id91:j_id94']")
	WebElement compFunnelStep;
	
	@FindBy(xpath = "//select[@id='j_id0:j_id5:pgBlk:j_id91:j_id95']")
	WebElement compPrimReasonClose;
	
	@FindBy(xpath = "//textarea[@id='j_id0:j_id5:pgBlk:j_id53:0:j_id64']")
	WebElement compComments;
	

	@FindBy(xpath = "//input[@name='j_id0:j_id5:pgBlk:j_id33:j_id34']")
	WebElement compSave;
	
	
	//Deepali added elements for Change Record Type functionality
	@FindBy(xpath = "//div[@id='RecordType_ileinner']/a")
	WebElement changeRecordType;

	@FindBy(xpath = "//div[@id='ep']/div[2]/div[9]/table/tbody/tr/td[2]/div/div[2]")
	WebElement changeOppTypeErr;
	
	@FindBy(xpath = "//div[contains(@id,'_00Nw0000003PKQ0_body')]/table/tbody/tr[2]/td[2]")
	WebElement defaultOppRelRole;
	
	@FindBy(xpath = "//div[contains(@id,'_00Nw0000003PKQ0_body')]/table/tbody/tr[2]/td[5]")
	WebElement defaultOppRelRoleStatus;
	
	@FindBy(xpath = "//input[@name='j_id0:j_id1:j_id2:j_id3:j_id4']")
	WebElement goBackFromOR;
	
	// Deepali added elements for Local Admin edit Won Opportunity
	@FindBy(xpath = "//select[@id='opp4_lkid']")
	WebElement selAccnt;
	
	@FindBy(xpath = "//select[@id='CF00Nw0000003PEtH_lkid']")
	WebElement selOrg;
	
	//Clone Opportunity elements
	
	@FindBy(id = "CloneButton")
	WebElement cloneBtn;
	
	@FindBy(linkText = "Clone with Products")
	WebElement cloneWithProBtn;
	
	@FindBy(linkText = "Clone without Products")
	WebElement cloneWithoutProBtn;
	
	@FindBy(id = "opp3_ileinner")
	WebElement oppNameLnk;
	
	@FindBy(xpath = "//div[contains(@id,'_RelatedLineItemList_body')]/table/tbody/tr[2]/th/a")
	WebElement oppProdRLWithProd;
	
	@FindBy(xpath = "//div[contains(@id,'_RelatedLineItemList_body')]/table/tbody/tr/th")
	WebElement oppProdRLWithoutProd;
	
	@FindBy(name="choosePB")
	WebElement choosePBBtn;
	
	@FindBy(xpath="//h3[contains(@id,'_RelatedLineItemList_title')]")
	WebElement prodLbl;
	
	
	//Constructor
	public  PageEditOppty(WebDriver driver)
	{
		this.driver=driver;
		  //This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void setOpptySelectRecordType(String opptyRecordType) 
	{
		Select RecordType=new Select(opptySelectRecordType);
		RecordType.selectByVisibleText(opptyRecordType);
	}

	public void setOpptyContinueBtn() 
	{
		opptyContinueBtn.click();
	}

	public void setOpptyAccntName(String stropptyAccntName)
	{
		//System.out.println("set blank account1");
		//opptyAccntName.clear();
		//WebDriverWait wait = new WebDriverWait(driver,40);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("opp4")));
		if(opptyAccntName.getAttribute("value").isEmpty())
		{
		opptyAccntName.sendKeys(stropptyAccntName);
		System.out.println("set blank account2");
		Boolean isPresent = driver.findElements(By.id("opp4_autoCompleteRowId_0")).size() > 0;
		System.out.println("isPresent:"+isPresent);
		if(isPresent==false)
		{
		System.out.println("Inside if1");
		
		}
		else if(isPresent==true) 
		{
			System.out.println("Inside else1");
			
			selAccntName.click();
		}
		}
		
		else
		{
			System.out.println("Inside else blank account1");
		}
		
		System.out.println("Outside if");
	}

	public void setOpptyName(String stropptyName)
	{
		opptyName.clear();
		opptyName.sendKeys(stropptyName);
	}

	public void setOpptySalesStage(String stropptySalesStage) 
	{
		Select SalesStage = new Select(opptySalesStage);
		SalesStage.selectByVisibleText(stropptySalesStage);
	}

	public void setOpptyFunnelStep(String stropptyFunnelStep) 
	{
		//System.out.println("Inside funnel2:"+stropptyFunnelStep);
	//if (driver.findElements(By.xpath("//select[@id='00Nw0000003PEt7']")).size()!=0)
		//{
			
			//System.out.println("Element is Present");
		boolean isenabled = driver.findElement(By.xpath("//select[@id='00Nw0000003PEt7']")).isEnabled();
	if(isenabled==true)
			{
			System.out.println("Element is enabled");
			Select FunnelStep1=new Select(opptyFunnelStep);
			FunnelStep1.selectByVisibleText(stropptyFunnelStep);
			}
		else if(isenabled==false)
			{
				System.out.println("Element is disabled");
				
			}
		//}
		
		
		
	}

	public void setOpptyTotalFee(String intOpptyTotalFee) 
	{
		opptyTotalFee.sendKeys(intOpptyTotalFee);
	}

	public void setOpptyCloseDate() 
	{
		opptyCloseDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 			
	}

	public void setOpptyInceptionDate()
	{
		opptyInceptionDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")));
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 
	}

	public void setOpptyExpiryDate() 
	{
		OpptyExpiryDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 			
	}
	public void setOpptyRevenueType(String stropptyRevenueType) 
	{
		Select revenueType=new Select(opptyRevenueType); 
		revenueType.selectByVisibleText(stropptyRevenueType);
	}

	public void setOpptyTypeOfClient(String stropptyTypeOfClient)
	{
		Select typeOfClient=new Select(opptyTypeOfClient); 
		typeOfClient.selectByVisibleText(stropptyTypeOfClient);
	}

	public void setOpptySaveBtn() 
	{
		opptySaveBtn.click();
	}
	
	public void clickAccntLink(String accntName)
	{
		System.out.println("Inside click1");
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(accntName)));
		driver.findElement(By.linkText(accntName)).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,40);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='opp4_ileinner']/a")));
		//acntLinkOnOppty.click();
		System.out.println("Inside click2");
		
	}
	
	public void clickCntLink(String cntName)
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_RelatedContactRoleList_body')]//table/tbody/tr[2]/th/a")));
		cntLinkOnOppty.click();
	}
	
	public void clickOpptyLink(String OpptyName)
	{
		driver.findElement(By.linkText(OpptyName)).click();
	}
	
	public void clickAddProduct()
	{
		opptyAddProductBtn.click();;
	}


	public String getProdNameOnRelatedList() 
	{
		return prodNameOnRelatedList.getText();
	}

	public String getCOBOnRelatedList()
	{
		return COBOnRelatedList.getText();
	}


	public String getLOBOnRelatedList() 
	{
		return LOBOnRelatedList.getText();
	}
	
	public void clickOpptySubmitApproval() 
	{
		OpptySubmitApproval.click();
	}
	
	public void setOpptyExpiryDate(String expirydate) 
	{
		OpptyExpiryDate.sendKeys(expirydate);
	}
	
	public void setOpptyReasonWonLost(String reasonwonlost) 
	{
		new Select(OpptyReasonWonLost).selectByVisibleText(reasonwonlost);
		//OpptyReasonWonLost.sendKeys(reasonwonlost);
	}

	public String getOpptyInlineFeeBkge() 
	{
		return OpptyInlineFeeBkge.getText();
	}

	public String getOpptyInlineLeadSource() 
	{
		return OpptyInlineLeadSource.getText();
	}

	public String getOpptyInlineLeadSourceName() 
	{
		return OpptyInlineLeadSourceName.getText();
	}

	public String getOpptyInlineInceptionDate()
	{
		return OpptyInlineInceptionDate.getText();
	}

	public String getOpptyCompName() 
	{
		return OpptyCompName.getText();
	}

	public String getOpptyCompRole() 
	{
		return OpptyCompRole.getText();
	}

	public String getOpptyCompComments()
	{
		return OpptyCompComments.getText();
	}
	
	public void clickOpptyCamp() 
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='opp17_ileinner']/a")));
		OpptyCampLink.click();
	}

	public void setOpptyPrj(String stropptyPrj) 
	{
			
			OpptyPrj.sendKeys(stropptyPrj);
			OpptyPrjAuto.click();
	}

	public void clickOpptyPrjLink() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='CF00N20000001gfMI_ileinner']/a")));
		OpptyPrjLink.click();
	}

	public void clickOpptyNewBtn() {
		opptyNewBtn.click();
	}
	
	public void clickOpptyEditBtn() {
		opptyEditBtn.click();
	}
	 public String getErrorText()
     
     {                    
            if (driver.findElements(By.id("errorDiv_ep")).size() != 0) 
            
            {  
     
                  return lblErrorMessage.getText();                
      }                  
            else                       
            {
                  return "Error text not present" ;
            }
     }

	public void addOpptyRel() 
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("add_opportunity_relationship")));
		opptyAddOpptyRel.click();
	}
	 
	//Deepali
	public String getOppLbl()
	{
		String oppPageLbl;
		oppPageLbl = saveOpptyType.getText();
		return oppPageLbl;
	}
	
	//Deepali
		public String getOppName()
	{
		String accntpageDesc;
		accntpageDesc= saveOppName.getText();
		return accntpageDesc;
	}

			
		//Deepali added re Opp methods
		
		public void clickAccntLookup() 
		{
			 accntLookup.click();
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		}

		public void setAccntLookupSrch(String accntName)
		{
			if (driver.findElements(By.xpath("//input[@id='lksrch']")).size() != 0);
			{
				System.out.println("Inside lookupsrch");
				accntLookupSrch.sendKeys("");
				accntLookupSrch.sendKeys(accntName);
			}

			
		}


		public void clickAccntLookupGo() 
		{
			 accntLookupGo.click();
		}

	

		public void getAccntLookupLink() 
		{
			 accntLookupLink.click();
		}

	

		public void setBussDevUnit(String bussdedevunit) 
		{
			Select dropdown = new Select (bussDevUnit) ;
            dropdown.selectByVisibleText(bussdedevunit); 
		}

		
		public void setIndusType(String indusType) 
		{
			Select dropdown = new Select (industryType) ;
            dropdown.selectByVisibleText(indusType);
		
		}

		public void setRiskLoc(String riskloc)
		{
			
			Select dropdown = new Select (riskLoc) ;
            dropdown.selectByVisibleText(riskloc);
			
		}


		public void setClassOfBuss(String classOfbuss)
		{
			Select dropdown = new Select (classOfBuss);
            dropdown.selectByVisibleText(classOfbuss);
			
			
		}

		public void setSubClass(String subclass) 
		{
			subClass.sendKeys(subclass);
			
			
		}

	
		public void setReRiskType(String RiskType)
		{
			Select dropdown = new Select (reRiskType);
            dropdown.selectByVisibleText(RiskType);
			
		}
	

		public void setNoCompetitor() 
		{
			noCompetitor.click();
		}
		
		public void setOppType(String opptype)
		{
			Select dropdown = new Select (oppType);
            dropdown.selectByVisibleText(opptype);
			
		}
		
		public void setLineSlip(String lineslip)
		{
			Select dropdown = new Select (lineSlip);
            dropdown.selectByVisibleText(lineslip);
			
		}
		
		public void setFeeBkrg(String feebrkg)
		{
			feeBrkg.sendKeys(feebrkg);
		}
		
		//Deepali added setOrg
		
		public void setOppOrg(String org)
		{
			oppOrg.clear();
			oppOrg.sendKeys(org);
		}
		
		//Deepali added getexpirydate error
		public String getExpiryDateError() {
			
			if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[7]/table/tbody/tr[2]/td[4]/div")).size()!=0)
			{
			return expiryDateError.getText();
			}
			else
				return "Field not present";
			
		}
	
	public String getReExpiryDateError() {
			
			if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[5]/table/tbody/tr[2]/td[2]/div")).size()!=0)
			{
			return ReExpiryDateError.getText();
			}
			else
				return "Field not present";
			
		}
		//Deepali added getinceptiondate error
		
		public String getInceptionDateError() {
			
			if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[7]/table/tbody/tr/td[4]/div")).size()!=0)
			{
			return InceptionDateError.getText();
			}
			else
				return "Field not present";
			
		}

		public String getReInceptionDateError() {
			
			if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[5]/table/tbody/tr/td[2]/div")).size()!=0)
			{
			return ReInceptionDateError.getText();
			}
			else
				return "Field not present";
			
			
		}

				
		//Deepali added Private Opportunity functions
		
		public void setPrivateOpp()
		{
			privateOpp.click();
			
		}
		
		public void clickPrivateOpphelptextimg() throws InterruptedException
		{
			/*privateOppHelpTextimg.click();
			System.out.println("before help1");		*/
			
			Actions ToolTip1 = new Actions(driver);
		    WebElement privatehelptextimg = driver.findElement(By.xpath("//span[@id='Opportunity.IsPrivate-_help']/img"));

		    Thread.sleep(2000);

		    ToolTip1.clickAndHold(privatehelptextimg).perform();
		}
		
		public String getPrivateOpphelptext()
		{
			/*System.out.println("Inside help1");
			if (driver.findElements(By.xpath("//td[@id='bodyCell']/div[16]")).size()!=0)
			{
				System.out.println("Inside help2");
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				//driver.findElements(By.xpath("//td[@id='bodyCell']/div[16]")).ge
			String helptext= driver.findElement(By.xpath("//td[@id='bodyCell']/div[16]")).getText();
			System.out.println("helptext: "+helptext);
			return helptext;
			}	
			else if(driver.findElements(By.xpath("//td[@id='bodyCell']/div[17]")).size()!=0)
			{
				System.out.println("Inside help2");
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				//driver.findElements(By.xpath("//td[@id='bodyCell']/div[16]")).ge
			String helptext= driver.findElement(By.xpath("//td[@id='bodyCell']/div[17]")).getText();
			System.out.println("helptext: "+helptext);
			return helptext;
			}*/
			
		if (driver.findElements(By.cssSelector("div.helpText")).size()!=0)
		{
			System.out.println("Inside help3");
			return driver.findElement(By.cssSelector("div.helpText")).getText();
		}
		
						
			else
			{
			return "Help Text not present";
			
			}
			
				 
			
		}
		
		public String getPrivateOppcheckbox()
		{
			return privateOppCheckbox.getAttribute("title");
			
		}
		
		public String getBlankOppTeamTxt()
		{
			return viewBlankOppTeam.getText();
			
		}

		public String getAccountNameRqdErr()
		{
			return accountNameRqdErr.getText();
		}

		public String getOppNameRqdErr() 
		{
			return oppNameRqdErr.getText();
		}

		public String getSalesStageRqdErr() {
			return salesStageRqdErr.getText();
		}

		public String getTotalFeeRqdErr() {
			return totalFeeRqdErr.getText();
		}

		public String getRevTypeRqdErr() {
			return revTypeRqdErr.getText();
		}

		public String getTypeOfClientRqdErr() {
			return typeOfClientRqdErr.getText();
		}

		
		//Deepali added competitor methods
		public void setCompetitor(String compName) {
			
			competitor.sendKeys(compName);
			Boolean isPresent = driver.findElements(By.xpath("//div[@id='j_id0:j_id4:j_id6:j_id44:0:j_id46_autoCompleteRowId_0']/strong")).size() > 0;
			System.out.println("isPresent:"+isPresent);
			if(isPresent==false)
			{
			System.out.println("Inside if1");
			
			}
			else if(isPresent==true) 
			{
				System.out.println("Inside else1");
				
				selCompetitor.click();
			}
			
		}

		public void setCompetitorRole(String competitorRoletxt) {
			
			Select dropdown = new Select (competitorRole);
            dropdown.selectByVisibleText(competitorRoletxt);
			
		}

		public void setLostToCheck() {
			lostToCheck.click();
		}

		public void setLostToFee(String lostToFeevalue) {
			lostToFee.sendKeys(lostToFeevalue);
		}

		
		
		public void setCompSalesStage(String compSalesStagevalue) {
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='j_id0:j_id4:j_id6:j_id57:j_id58']")));
			Select dropdown = new Select (compSalesStage);
            dropdown.selectByVisibleText(compSalesStagevalue);
						
		}

		public void setCompFunnelStep(String compFunnelStepvalue) {
			
			Select dropdown = new Select (compFunnelStep);
            dropdown.selectByVisibleText(compFunnelStepvalue);
			
		}

		public void setCompPrimResonClose(String compPrimReasonClosevalue) {
			Select dropdown = new Select (compPrimReasonClose);
            dropdown.selectByVisibleText(compPrimReasonClosevalue);
			
		
		}

		public void clickCompetitorBtn() {
			addCompetitorBtn.click();
		}

		public void setCompComments(String compCommentstxt) {
			compComments.sendKeys(compCommentstxt);
		}

		public void clickOpptyCancel() {
			OpptyCancel.click();
		}

		public void clickCompSave() {
			compSave.click();
		}
			
		
		//Deepali added Change Record Type methods
		public String getChangeOppTypeErr() {
			return changeOppTypeErr.getText();
		}

		public String getDefaultOppRelRole() {
			return defaultOppRelRole.getText();
		}

		public String getDefaultOppRelRoleStatus() {
			return defaultOppRelRoleStatus.getText();
		}

		public void clickChangeRecordType() {
			changeRecordType.click();
		}

		public void clickGoBack() {
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='j_id0:j_id1:j_id2:j_id3:j_id4']")));
			goBackFromOR.click();
		}

		public void setOppGeog(String oppGeogtxt) {
			
			
			oppGeog.clear();
			oppGeog.sendKeys(oppGeogtxt);
		}
		
		public void selAccount(String accnttxt) {
			Select dropdown = new Select (selAccnt);
            dropdown.selectByVisibleText(accnttxt);
			
		
		}
		
		public void selOrg(String orgtxt) {
			Select dropdown = new Select (selOrg);
            dropdown.selectByVisibleText(orgtxt);
			
		
		}

		public String getCloseDatRqdErr() {
			
			if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[7]/table/tbody/tr/td[2]/div/div[2]")).size()!=0)
			{
			return closeDatRqdErr.getText();
			}	
			
			else
			{
				
				return "No error";
			}
		}

		public String getReCloseDatRqdErr() {
			
			
			if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[5]/table/tbody/tr/td[4]/div/div[2]")).size()!=0)
			{
			return reCloseDatRqdErr.getText();
			}	
			
			else
			{
				
				return "No error";
			}
		}

		public String getOppNameLnk() {
			return oppNameLnk.getText();
		}

		public String getOppProdRLWithProd() {
			return oppProdRLWithProd.getText();
		}

		public String getOppProdRLWithoutProd() {
			return oppProdRLWithoutProd.getText();
		}

		public void clickCloneBtn() {
			cloneBtn.click();
		}

		public void clickCloneWithProBtn() {
			cloneWithProBtn.click();
		}

		public void clickCloneWithoutProBtn() {
			cloneWithoutProBtn.click();
		}
		
		public void clickPBBtn()
		{
			choosePBBtn.click();
		}
		
		public String getProdLbl() {
			return prodLbl.getText();
		}
		
}


