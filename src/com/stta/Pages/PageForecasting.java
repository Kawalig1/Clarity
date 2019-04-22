package com.stta.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageForecasting
{
	WebDriver driver;
	
	@FindBy(id="fcf")
	WebElement forecastView;
	
	@FindBy(name="go")
	WebElement forecastGo;
	
	///@FindBy(xpath="//div[contains(@id,'_NAME')]/a/span")
	//WebElement forecastNameLnk;
	
	@FindBy(xpath="//div[@id='a2c7E000002JlL8_NAME']/a/span")
	WebElement forecastNameLnk;
	
	@FindBy(name="edit")
	WebElement forecastEditBtn;
		
	@FindBy(id="00Nw00000095SQj")
	WebElement forecastTotalEdit;
	
	@FindBy(id="00Nw00000095SQc")
	WebElement forecastCommentsEdit;
	
	@FindBy(id="00Nw00000095SQc_ileinner")
	WebElement forecastCommentsSave;
	
	@FindBy(name="save")
	WebElement forecastSave;
	
	@FindBy(xpath="//div[contains(@id,'00Nw00000095S')]")
	WebElement forecastTotalSave;
	
	@FindBy(id="00Nw00000095SQf_ileinner")
	WebElement forecastGap;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQN_body')]/table/tbody/tr[2]/td[4]")
	WebElement forecastTotalDefaultOrgSave;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQN_body')]/table/tbody/tr[3]/td[4]")
	WebElement forecastTotalOrgSave;
	
	@FindBy(id="00Nw00000095SQn")
	WebElement forecastBestCaseEdit;
	
	@FindBy(id="00Nw00000095SR6")
	WebElement forecastWorstCaseEdit;
	
	@FindBy(id="00Nw00000095SR3")
	WebElement forecastTotalOrgEdit;
	
	
	@FindBy(id="CF00Nw00000095SR1")
	WebElement forecastOrgName;
	
	@FindBy(id="00Nw00000095SRh_ileinner")
	WebElement forecastBestCaseSave;
	
	@FindBy(id="00Nw00000095SRm_ileinner")
	WebElement forecastWorstCaseSave;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQN_body')]/table/tbody/tr[2]/td/a")
	WebElement forecastOrgNameRL;
	
	@FindBy(name="new00Nw00000095SQN")
	WebElement newOrgForecastBtn;
	
	@FindBy(id="CF00Nw00000095SR1")
	WebElement forecastOrgNameEdit;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQN_body')]/table/tbody/tr[3]/td[2]/a")
	WebElement forecastNewOrgNameRL;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQN_body')]/table/tbody/tr[3]/td[4]")
	WebElement forecastTotalNewOrgRL;
	

	
	@FindBy(id="00Nw00000095SQm")
	WebElement forecastadjustComments;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQY_body')]/table/tbody/tr[2]/th")
	WebElement forecastadjustFieldChanged;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQY_body')]/table/tbody/tr[2]/td[2]")
	WebElement forecastadjustOrginalAmount;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQY_body')]/table/tbody/tr[2]/td[3]")
	WebElement forecastadjustAdjustedAmount;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQY_body')]/table/tbody/tr[2]/td[6]")
	WebElement forecastadjustAdjustedComments;
	
	//@FindBy(xpath="//div[contains(@id,'mrua2c')]")
	//WebElement forecastOrgNameLnkRecent;
	@FindBy(xpath="//a[contains(text(),'Related Opportunities')]")
	WebElement forecastReltdOppLnk;
	
	@FindBy(xpath="//div[@id='noTableContainer']/div/div/div/div/h1")
	WebElement forecastReltdOppReport;
	
	
	@FindBy(id="quarter_c")
	WebElement forecastReltdOppReportDate;
	
	
	//Dashbard elements
	
	@FindBy(id="x-auto-2")
	WebElement forecastReportFilterdropdown;
	
	@FindBy(id="thePage:j_id30:dashboardFinder:finder:autoCompleteCombo:j_id39")
	WebElement forecastAutoCompleteFilter;
	
	@FindBy(id="x-auto-0-input")
	WebElement forecastReportFilter;
	
	
	@FindBy(id="refreshInput")
	WebElement forecastReportRefresh;
	
	@FindBy(xpath="//table[@id='bodyTable']/tbody/tr/td/div/div/div/h1")
	WebElement forecastReportTitle;

		
	public PageForecasting(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		//This initElements method will create  all WebElements
	}



	public String getTotalForecast() {
		return forecastTotalSave.getText();
	}



	public String getTotalForecastDeafultOrg() {
		return forecastTotalDefaultOrgSave.getText();
	}
	
	public String getTotalForecastOrg() {
		return forecastTotalOrgSave.getText();
	}



	public String getForecastWorstCase() {
		return forecastWorstCaseSave.getText();
	}



	public String getForecastNewOrgNameRL() {
		
		System.out.println("Inside RL");
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id,'_00Nw00000095SQN_body')]/table/tbody/tr[3]/td[2]/a")));
		
		return forecastNewOrgNameRL.getText();
	}



	public void setForecastView(String forecastViewtxt) {
		
		Select view=new Select(forecastView);
		view.selectByVisibleText(forecastViewtxt);
		
	}



	public void clickForecastGo() {
		
		forecastGo.click();
	}



	public void clickForecastNameLnk() {
		forecastNameLnk.click();
	}



	public void clickForecastEditBtn() {
		forecastEditBtn.click();
	}



	public void setForecastTotal(String forecastTotalEditTxt) {
		//forecastTotalEdit.sendKeys(forecastTotalEditTxt);
		forecastTotalEdit.sendKeys(forecastTotalEditTxt);	
	}



	public void setForecastComments(String forecastCommentsEditTxt) {
		forecastCommentsEdit.sendKeys(forecastCommentsEditTxt);;
	}



	public String getForecastComments() {
		return forecastCommentsSave.getText();
	}



	public void clickForecastSave() {
		forecastSave.click();
	}



	public String getForecastGap() {
		return forecastGap.getText();
	}


	public void setForecastBestCase(String forecastBestCaseEditTxt) {
		forecastBestCaseEdit.clear();
		forecastBestCaseEdit.sendKeys(forecastBestCaseEditTxt);
	}



	public void setForecastWorstCase(String forecastWorstCaseEditTxt) {
		forecastWorstCaseEdit.clear();

		forecastWorstCaseEdit.sendKeys(forecastWorstCaseEditTxt);
	}



	public void setForecastTotalOrgEdit(String forecastTotalOrgEditTxt) {
		forecastTotalOrgEdit.clear();
		forecastTotalOrgEdit.sendKeys(forecastTotalOrgEditTxt);
	}



	public void setForecastOrgName(String forecastOrgNameTxt) {
		forecastOrgName.sendKeys(forecastOrgNameTxt);
	}


	public String getForecastBestCase() {
		return forecastBestCaseSave.getText();
	}
	
	public void clickForecastOrgNameRL() {
		forecastOrgNameRL.click();
	}

	public void addNewOrgForecast() {
		newOrgForecastBtn.click();
		
		}
	
	public void setOrgNameinForecast(String orgname) {
		forecastOrgNameEdit.sendKeys(orgname);
		
		}
	
	
	public void clickOrgForecastNameLnk() {
		System.out.println("Inside 1");
		
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@id,'lookupa2c')]")));
	 Actions action = new Actions(driver);
	   action.moveToElement(driver.findElement(By.xpath("//a[contains(@id,'lookupa2c')]"))).click().build().perform();
	  //forecastOrgNameLnk.click();
		System.out.println("Inside 2");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void setForecastAdjustComments(String comments)
	{
		
		forecastadjustComments.sendKeys(comments);
	}



	public String getForecastadjustFieldChanged() {
		return forecastadjustFieldChanged.getText();
	}



	public String getForecastadjustOrginalAmount() {
		return forecastadjustOrginalAmount.getText();
	}



	public String getForecastadjustAdjustedAmount() {
		return forecastadjustAdjustedAmount.getText();
	}



	public String getForecastadjustAdjustedComments() {
		return forecastadjustAdjustedComments.getText();
	}



	public String getForecastReltdOppReport() {
		return forecastReltdOppReport.getText();
	}



	public String getForecastReltdOppReportDate() {
		return forecastReltdOppReportDate.getText();
	}



	public void clickForecastReltdOppLnk() {
		forecastReltdOppLnk.click();
	}



	public void setForecastReportFilter(String forecastReportFiltertxt) throws InterruptedException {
		forecastReportFilter.clear();
		//Select report=new Select(forecastReportFilterdropdown);
		//report.selectByVisibleText(forecastReportFiltertxt);
		//forecastReportFilterdropdown.click();
		forecastReportFilter.sendKeys(forecastReportFiltertxt);
		Thread.sleep(2000);

		//forecastAutoCompleteFilter.click();

		forecastReportFilter.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}



	public void setForecastReportRefresh() {
		forecastReportRefresh.click();
	}



	public String getForecastReportTitle() {
		 return forecastReportTitle.getText();
	}
	
	
	

	
}




