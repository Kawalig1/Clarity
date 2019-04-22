package com.stta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;


public class PageEditEBContracts  {
	
	
	WebDriver driver;
	//Schemes
	@FindBy(name="new")
    WebElement Schemesnewbtn;
	
	@FindBy(id="Name")
	WebElement SchemesName; 
	
	@FindBy(name="save")
	WebElement SchemesSave;
	
	@FindBy(xpath="//div[2]/div[2]/table/tbody/tr/td[2]/div")
	WebElement SchemesSaveName;
	
	//Contracts New Btn
	@FindBy(name="new_contract")
    WebElement Contractsnewbtn;
	
	
	@FindBy(id="CF00N9E000001Sb40") 
    WebElement AccountName;
	

	@FindBy(id="00Nw0000006nc8V")
    WebElement EBcontractstatus;
	
	@FindBy(id="00Nw0000006nc7x")
    WebElement EBContractTermtype;
	
	@FindBy(id="00Nw0000006nc7z")
    WebElement EBcontracttype;
	
	
	@FindBy(id="00Nw0000006nc8F")
    WebElement EBGoverninglaw;
	
	@FindBy(id="00Nw0000006nc8G")
    WebElement EBIndispute;
	
	@FindBy(id="00Nw0000006nc8U")
    WebElement EBSpecialterms;
	
	@FindBy(id="00Nw0000006nc86")
    WebElement ContractDescription;
	
    @FindBy(id="00Nw0000006nc8D")
    WebElement FullysignedByJLT;
	
	@FindBy(id="00Nw0000006nc8d")
    WebElement Unlimitedliability;
	
	@FindBy(id="00Nw0000006nc8M")
    WebElement OffShoreconsent;
	
	@FindBy(id="00Nw0000006nc88")
    WebElement EUModelclauses;
	
	@FindBy(id="00Nw0000006nc8C")
    WebElement Feestructure;
	
	@FindBy(id="00Nw0000006nc87")
    WebElement Disbursementcharges;
	
	@FindBy(id="00Nw0000006nc8I")
    WebElement KeyPersonnelprovision;
	
	@FindBy(name="save")
	WebElement EBContractsSave;

	//Addendum
	
	@FindBy(name="new00Nw0000006nc7g")
    WebElement Addendumnewbtn;
	
	 @FindBy(id="00Nw0000006nc7j_unselected")
	 WebElement AddendumType;
	
	
	 @FindBy(id="00Nw0000006nc7j_right_arrow")
     WebElement AddendumTyperightarrow;
	 
	 
	 @FindBy(id="00Nw0000006nc7i")
	 WebElement AddendumSummary;
	 
	 @FindBy(id="00Nw0000006nc7k")
	 WebElement EffectiveDate;
	 
	 @FindBy(name="save")
     WebElement AddendumSave;
	 
	 
	 
//Contracting Entity
	 
	 
	 @FindBy(xpath="//td[2]/div/a")
	  WebElement ExistingContract;
	 
	
	 @FindBy(name="new00Nw0000006nc7h")
	 WebElement NewContractingEntity;
	 
	 @FindBy(id="00Nw0000006nc8f")
	 WebElement Entitytype;
	 
	 @FindBy(id="CF00Nw0000006nc8e")
     WebElement Account;
	 
	 @FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/div[2]")
     WebElement MultipleAccountError; 
	 
	 
	 
	 
	 @FindBy(name="save")
     WebElement ContractingEntitySave;
	 
	 @FindBy(id="Name_ileinner")
	 WebElement ContractingEntityId;
	 
	 
	 //Contract Scheme
	 @FindBy(name="new00Nw0000006nc7m")
	 WebElement NewContractScheme;
	 
	 
	 @FindBy(id="CF00Nw0000006nc7p")
	 WebElement Scheme;
	 
	 @FindBy(id="00Nw0000006nc7n")
	 WebElement PECodes;
	 
	 @FindBy(id="00Nw0000006nc7l")
	 WebElement Comments;
	 
	 
	 @FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/div[2]")
	 WebElement MultipleSchemeError;
	 
	 
	 @FindBy(name="save")
     WebElement ContractSchemeSave;
	 
	 @FindBy(id="Name_ileinner")
	 WebElement ContractSchemeId;
	 
	 
	 
	 
	 //Verification of contracts fields

		@FindBy(id="00N9E000001Sb4D")
	    WebElement Correspondencestreet;

		
		@FindBy(id="00N9E000001Sb4D")
	    WebElement contractEditCopyAddrs;	
		
		
		//Contract History
		
		 @FindBy(name="edit")
	    WebElement EditContracts;	
		 
		 @FindBy(id="00Nw0000006nc8M")
		 WebElement OffShoreconsent1;
		 
		 @FindBy(id="00Nw0000006nc8M")
		 WebElement OffShoreconsent2;
		
		 @FindBy(id="00Nw0000006nc88_ileinner")
		 WebElement EUModelClauseStatusSave;
		 
		 @FindBy(id="00Nw0000006nc8a")
		 WebElement TerminationForConvenience;
	 
		 
		 @FindBy(id="00Nw0000006nc8a")
		 WebElement TerminationForConvenienceNo;
		 
		 @FindBy(id="00Nw0000006nc8W")
		WebElement TerminationNoticePeriod;
		 
		 //@FindBy(id="00N9E000001Sb4g_ileinner")
		 //WebElement TerminationNoticePeriodStatusonSave;
		 
		 @FindBy(id="00Nw0000006nc8d")
		 WebElement UnlimitedLiabilitycap1;
		 
		 //@FindBy(xpath="//div[contains(@id,'a2i9E000000')]")
		 //WebElement ContractHistoryRelatedList;
		 
		 
		 @FindBy(xpath="//div[contains(@id,'_RelatedEntityHistoryList_body')]/table/tbody/tr[2]/td[2]")
		 WebElement ContractHistory1;
		 

		 @FindBy(xpath="//div[contains(@id,'_RelatedEntityHistoryList_body')]/table/tbody/tr[3]/td[2]")
		 WebElement ContractHistory2;
		 
		 
		 
		// CorrespondingAccountAddrs
		 //@FindBy(id="acc18_ileinner")
		 //WebElement CorrespondingAccountAddrs;
		 
		 @FindBy(id="00Nw0000006nc81_ilecell")
		 WebElement CorrespondingEBContractCountry; 
		 
		 @FindBy(id="00Nw0000006nc82_ileinner")
		 WebElement CorrespondingEBContractState;
		 
		 @FindBy(id="00Nw0000006nc80_ileinner")
		 WebElement CorrespondingEBContractCity;
		 
		 
		 @FindBy(id="00Nw0000006nc8Q_ileinner")
		 WebElement EBRegistrationNumber;
		 
	
	
 public  PageEditEBContracts(WebDriver driver)
			{
				
	          this.driver=driver;
			   //This initElements method will create all WebElements
			  PageFactory.initElements(driver, this);
			}

	
   public void clickonNewSchemesBtn() {
		Schemesnewbtn.click();
	}
	
	public void setSchemesName(String schemesName) {
		
	SchemesName.sendKeys(schemesName);
	}
	
	
	public void SetSchemesSave() {
		SchemesSave.click();
	}
	
	public String getSchemesSaveName() {
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/div[2]/table/tbody/tr/td[2]/div")));
		return SchemesSaveName.getText();
	}
	
	
	//Contracts 
	public void clickonNewContractsBtn() {
		Contractsnewbtn.click();
		}
	
	public void setAccountName(String Accountname) {
		AccountName.sendKeys(Accountname);
	}	
	
	
   public void setEBContractStatus(String strEBcontractstatus) 
	{
		Select ContractStatus = new Select(EBcontractstatus);
		ContractStatus.selectByVisibleText(strEBcontractstatus);
	}
	
	public void setContractTermType(String strContractTermtype) 
	{
		Select ContractTermType = new Select(EBContractTermtype);
		ContractTermType.selectByVisibleText(strContractTermtype);
	}
	
	public void setContractType(String strContracttype) 
	{
		Select ContractType = new Select(EBcontracttype);
		ContractType.selectByVisibleText(strContracttype);
	}
	
	
	public void setGoverningLaw(String strGoverningLaw) 
	{
		
		System.out.println("Inside gov1");
		Select GoverningLaw = new Select(EBGoverninglaw);
		GoverningLaw.selectByVisibleText(strGoverningLaw);
	}
	
	public void setInDispute(String strInDispute) 
	{
		Select InDispute = new Select(EBIndispute);
		InDispute.selectByVisibleText(strInDispute);
	}
	
	public void setSpecialTerms(String Specialterms) 
	{
		
		EBSpecialterms.sendKeys(Specialterms);
	}
	
	public void setDescription(String Description) 
	{
		
		ContractDescription.sendKeys(Description);
	}
	
	public void setFullySignedByJLT(String strFullySignedByJLT) 
	{
		Select FullySignedByJLT = new Select(FullysignedByJLT);
		FullySignedByJLT.selectByVisibleText(strFullySignedByJLT);
	}	
	
	public void setUnlimitedLiability(String strUnlimitedLiability) 
	{
		Select UnlimitedLiability = new Select(Unlimitedliability);
		UnlimitedLiability.selectByVisibleText(strUnlimitedLiability);
	}
	
	public void setOffShoreConsent(String strOffShoreConsent) 
	{
		Select OffShoreConsent = new Select(OffShoreconsent);
		OffShoreConsent.selectByVisibleText(strOffShoreConsent);
	}
	
	public void setEUModelClauses(String strEUModelClauses) 
	{
		Select EUModelClauses = new Select(EUModelclauses);
		EUModelClauses.selectByVisibleText(strEUModelClauses);
	}
	
	public void setFeeStructure(String strFeeStructure) 
	{
		Select FeeStructure = new Select(Feestructure);
		FeeStructure.selectByVisibleText(strFeeStructure);
	}
		
	public void setDisbursementCharges(String strDisbursementCharges) 
	{
		Select DisbursementCharges = new Select(Disbursementcharges);
		DisbursementCharges.selectByVisibleText(strDisbursementCharges);
	}	
	
	public void setKeyPersonnelProvision(String strKeyPersonnelProvision) 
	{
		Select KeyPersonnelProvision = new Select(KeyPersonnelprovision);
		KeyPersonnelProvision.selectByVisibleText(strKeyPersonnelProvision);
	}
	
	public void clickSaveEBContracts() {
		EBContractsSave.click();
	}
	
//New Addendum Related List
	public void clickonNewAddendum() {
		Addendumnewbtn.click();
		}
	
	
	public void setAddendumType(String strAddendumType)
	{
		Select dropdown = new Select (AddendumType) ;
        dropdown.selectByVisibleText(strAddendumType); 
        AddendumTyperightarrow.click();

	}	
	
	
	public void setAddendumSummary(String addendumSummary) {
		
		AddendumSummary.sendKeys(addendumSummary);
		}
	
	

	public void setEffectiveDate()
	{
		EffectiveDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")));
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 
	}
	
	
	public void clickonAddendumSave() {
		AddendumSave.click();
	}
	
	
	//New Contracting Entity Related List
        /*public void clickonExistingContract() {
		Actions act = new Actions(driver);
		WebElement ExistingContract=driver.findElement(By.id("lookupa2i9E000000Aj4I00N9E000001Sb3"));
		act.click(ExistingContract).build().perform();

	}*/
	
	public void clickonExistingContract() {
		
	System.out.println("Inside Contract link");

	WebDriverWait wait = new WebDriverWait(driver,60);
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]/div/a")));
	      System.out.println("Inside Contract link2");
	      ExistingContract.click();

		}
	
	
	
	
	
	
	

	

	
	public void clickonNewContractingEntity() {
		NewContractingEntity.click();
		}
	
	public void setEntityType(String strEntityType) 
	{
		Select EntityType = new Select(Entitytype);
		EntityType.selectByVisibleText(strEntityType);
	}
	
	public void setAccount(String account) {
		
		Account.sendKeys(account);
		}
	
	public void clickonContractingEntitySave() {
		ContractingEntitySave.click();
		
	}
        
		    public String getContractingEntityId() {
			
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Name_ileinner")));
			return ContractingEntityId.getText();
		}
		    
//New Contract Scheme

			public void clickonNewContractScheme() {
				NewContractScheme.click();
				}
		    
			public void setScheme(String scheme) {
				
				Scheme.sendKeys(scheme);
				}	
			
			public void setPECodes(String peCodes) {
				
				PECodes.sendKeys(peCodes);
				}
			
			public void setComments(String comments) {
				
				Comments.sendKeys(comments);
				}
			
			public void clickonContractSchemeSave() {
				ContractSchemeSave.click();
				
			}
			
			public String getContractSchemeId() {
				
				WebDriverWait wait = new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Name_ileinner")));
				return ContractSchemeId.getText();
			}
			
			
			
			//Multiple account error in Contracting entity
			public String getMultipleAccountError() {
				
				if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/div[2]")).size() != 0) 
				{	
					System.out.println("test2");
					String errmsg=MultipleAccountError.getText();
					System.out.println("errmsg:"+errmsg);
				return errmsg;
				
				
				}
				else
					
				{
					
					return "Error text not present";
				}
			}			
			
			
			
//multiple scheme error in contracting scheme
			public String getMultipleSchemeError() {
				
				if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/div[2]")).size() != 0) 
				{	
					System.out.println("test2");
					String errmsg=MultipleSchemeError.getText();
					System.out.println("errmsg:"+errmsg);
				return errmsg;
				
				
				}
				else
					
				{
					
					return "Error text not present";
				}
			}			
			
//verify EB contracts copy address
			
			/*public String getCorrespondenceStreet() 
			{
				WebDriverWait wait = new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00N9E000001Sb4D")));
				return Correspondencestreet.getText();
				
			}
			
			public boolean verifyCopyEBContractAddress()
			{
			
				boolean EBcopyAdrs = false;
				try
				{
					
					WebDriverWait wait = new WebDriverWait(driver,40);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00N9E000001Sb4D")));
					//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
					EBcopyAdrs=contractEditCopyAddrs.isSelected();
					
				} 
				catch (Exception e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				return EBcopyAdrs;
			}*/

//contract history
			
			public void clickonEditContracts() {
				EditContracts.click();
				}			
		
			
			public void setOffShoreConsent1(String strOffShoreConsent1) 
			{
				Select OffShoreConsent1 = new Select(OffShoreconsent1);
				OffShoreConsent1.selectByVisibleText(strOffShoreConsent1);
			}
			
			public String getEUModelClauseStatusonSave() {
				
				WebDriverWait wait = new WebDriverWait(driver,40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nw0000006nc88_ileinner")));
				return EUModelClauseStatusSave.getText();
			}	
			
			public void setTerminationforConvenience(String strTerminationforConvenience) 
			{
	System.out.println("Inside 1");
				Select TerminationforConvenience = new Select(TerminationForConvenience);
				TerminationforConvenience.selectByVisibleText(strTerminationforConvenience);
			}
			
			
			
			public void setTerminationforConvenienceNo(String strTerminationforConvenienceNo) 
			{
				System.out.println("Inside 2");

				Select TerminationforConvenienceNo = new Select(TerminationForConvenienceNo);
				TerminationforConvenienceNo.selectByVisibleText(strTerminationforConvenienceNo);
			}	
			
			public void setTerminationNoticePeriod(String TerminationNoticeperiod) {
				
				TerminationNoticePeriod.sendKeys(TerminationNoticeperiod);
				}
			
public String getTerminationNoticePeriodStatusonSave() {
				
				//WebDriverWait wait = new WebDriverWait(driver,40);
				WebElement TerminationNoticePeriodStatusonSave = driver.findElement(By.cssSelector("input[type=\"text\"]"));

				return TerminationNoticePeriodStatusonSave.getAttribute(null);
			}	
			
public void setUnlimitedLiabilityCap1(String strUnlimitedLiabilityCap1) 
{
System.out.println("Inside UnlimitedLiability");
	Select UnlimitedLiabilityCap1 = new Select(UnlimitedLiabilitycap1);
	UnlimitedLiabilityCap1.selectByVisibleText(strUnlimitedLiabilityCap1);
}

	
	



/*public String clickonContractHistoryRelatedList() {
	System.out.println("click contract history");
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'a2i9E000000Aj')]")));
	return ContractHistoryRelatedList.getText();
}*/

public String getContractHistory1() {
	System.out.println("ContractHistory1");
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_RelatedEntityHistoryList_body')]/table/tbody/tr[2]/td[2]")));
	return ContractHistory1.getText();
}

public String getContractHistory2() {
	System.out.println("ContractHistory1");
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_RelatedEntityHistoryList_body')]/table/tbody/tr[3]/td[2]")));
	return ContractHistory2.getText();
}


/*public String getCorrespondingAccountAddrs() 
{
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("acc18_ileinner")));
	return CorrespondingAccountAddrs.getText();
	}*/
	
	
	
	
		public String getCorrespondingEBContractCountry() 
{
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nw0000006nc81_ilecell")));
	return CorrespondingEBContractCountry.getText();
	}




		public String getCorrespondingEBContractState() 
{
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nw0000006nc82_ileinner")));
	return CorrespondingEBContractState.getText();
	}
		
		

		public String getCorrespondingEBContractCity() 
{
	WebDriverWait wait = new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nw0000006nc80_ileinner")));
	return CorrespondingEBContractCity.getText();
	}		

//Registration Number
		
		public String getEBContractRegistrationNumber() 
		{
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("00Nw0000006nc8Q_ileinner")));
			return EBRegistrationNumber.getText();
			}	

			
			
}