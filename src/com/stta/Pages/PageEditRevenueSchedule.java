package com.stta.Pages;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEditRevenueSchedule {

	WebDriver driver;
	
	@FindBy(xpath="//div[@id='00Nw0000008w75n_ileinner']/a")
	public WebElement revSceduleLink;
	
	@FindBy(xpath="//input[@id='p2']")
	public WebElement revSrtDate;
	
	@FindBy(xpath="//input[@id='p1']")
	public WebElement rev;
	
	@FindBy(xpath="//select[@id='p4']")
	public WebElement revSceduleType;
	
	@FindBy(xpath="//select[@id='p5']")
	public WebElement revInstallPrd;
	
	@FindBy(xpath="//input[@id='p6']")
	public WebElement revNoOfInstall;
	
	@FindBy(xpath="//input[@name='save']")
	public WebElement revSave;
	
	@FindBy(xpath="xpath=(//input[@name='save'])[2]")
	public WebElement revEditSave;
	
	@FindBy(xpath="//h3[contains(@id,'_RelatedScheduleList_title')]")
	public WebElement revScheduleLbl;
	
	@FindBy(xpath="//div[@id='Opportunity_ileinner']/a")
	public WebElement revOppLnk;
	
	@FindBy(xpath="//div[@id='00Nw0000008w75d_ileinner']")
	public WebElement revUpdatedFeeRe;
	
	@FindBy(xpath="//div[@id='opp7_ileinner']")
	public WebElement revUpdatedFeeStd;
	
	@FindBy(xpath="//div[contains(@id,'_RelatedLineItemList_body')]/table/tbody/tr[2]/th/a")
	public WebElement prodLink;
	
	@FindBy(xpath="//input[@name='establish']")
	public WebElement establishBtn;
	
	//Constructor
	public  PageEditRevenueSchedule(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		//This initElements method will create all WebElements
	}



	public void clickRevSceduleLink() {
		revSceduleLink.click();
	}

	public String getRevSceduleLink() 
	{
		return revSceduleLink.getText();
	}


	public void setRevSrtDate()
	{
		revSrtDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 
	}

	
	public void setRev(String revenue)
	{
		rev.clear();
		rev.sendKeys(revenue);
	}

	

	public void setRevSceduleType(String revSceduleTypetxt) 
	{
		Select scheduleTypeValue=new Select(revSceduleType); 
		scheduleTypeValue.selectByVisibleText(revSceduleTypetxt);
		
	}


	public void setRevInstallPrd(String  revInstallPrdtxt)
	{
		
		Select installPrdvalue=new Select(revInstallPrd); 
		installPrdvalue.selectByVisibleText(revInstallPrdtxt);
	}

	
	public void setRevNoOfInstall(String revNoOfInstalltxt)
	{
		revNoOfInstall.sendKeys(revNoOfInstalltxt);
	}


	public void setRevSave()
	{
		revSave.click();;
	}

	
	public void setRevEditSave() 
	{
		revEditSave.click();
	}

	public String getRevScheduleLbl() 
	{
		return revScheduleLbl.getText();
	}

	
	public void clickRevOppLnk() 
	{
		revOppLnk.click();
	}

	public String getRevUpdatedReFee() {
		return revUpdatedFeeRe.getText();
	}


	public String getRevUpdatedStdFee() {
		return revUpdatedFeeStd.getText();
	}


	public WebElement getProdLink() {
		return prodLink;
	}



	public void clickProdLink() 
	{
		prodLink.click();
	}


	public void clickEstablishBtn() 
	{
		establishBtn.click();
	}
	
}


