package com.stta.Pages;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageEditProject {
	
	WebDriver driver;
	
    @FindBy(name="new")
    WebElement projectNewBtn;
    
       
    @FindBy(id="Name")
    WebElement projectName;
    
    @FindBy(id="00N20000001gVaj")
    WebElement projectCountry;
	
    @FindBy(id="00N20000001gXnS")
    WebElement projectRegion;
    
    @FindBy(id="00Nw0000003PKR5")
    WebElement projectValue;
    

    @FindBy(id="00Nw0000003PKR6")
    WebElement projectSrtDate;
    
    @FindBy(id="00Nw0000003PKR4")
    WebElement projectEndDate;
    
    @FindBy(id="00N20000001gTKT")
    WebElement projectDescp;
    
    @FindBy(xpath="(//input[@name='save'])[2]")
    WebElement projectSaveBtn;
    
    
    @FindBy(name="edit")
    WebElement projectEditBtn;
    
    @FindBy(xpath="//td[@id='bodyCell']/div/div/div/h2")
    WebElement projectNameOnSave;
    
    @FindBy(name="new00Nw0000003PKQ1")
    WebElement newAccntPrjBtn;
    
    @FindBy(name="CF00Nw0000003PKPz")
    WebElement prjAccntName;
    
    @FindBy(xpath="(//input[@name='save'])[2]")
    WebElement prjAccntSaveBtn;
    
    @FindBy(xpath="//div[contains(@id,'_00Nw0000003PKQ1_body')]/table/tbody/tr[2]/th/a")
    WebElement prjAccntRL;
    
    @FindBy(xpath="//div[contains(@id,'_00N20000001gfMI_body')]/table/tbody/tr[2]/th/a")
    WebElement prjOpptyRL;
    
    @FindBy(id="00Nw0000003PKR7_ileinner")
    WebElement prjInlineStatus;
    
   
  
  
	//Constructor
	
		public  PageEditProject(WebDriver driver)
		
		{
			
			this.driver=driver;
			  //This initElements method will create all WebElements
			PageFactory.initElements(driver, this);
		}



		public String getProjectNameOnSave() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='bodyCell']/div/div/div/h2")));
			return projectNameOnSave.getText();
		}



		public String getPrjAccntRL() {
			return prjAccntRL.getText();
		}



		public String getPrjOpptyRL() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00N20000001gfMI_body')]/table/tbody/tr[2]/th/a")));
			return prjOpptyRL.getText();
		}



		public void clickProjectNewBtn() {
			projectNewBtn.click();;
		}



		public void setProjectName(String strprojectName) {
			projectName.sendKeys(strprojectName);;
		}



		public void setProjectCountry(String strprojectCountry) {
						
			Select country=new Select(projectCountry);
			country.selectByVisibleText(strprojectCountry);
		}



		public void setProjectRegion(String strprojectRegion) {
			
			Select region=new Select(projectRegion);
			region.selectByVisibleText(strprojectRegion);
		}



		public void setProjectValue(String strprojectValue) {
			projectValue.sendKeys(strprojectValue);
		}


		public void setProjectSrtDate() {
			projectSrtDate.clear();
			projectSrtDate.click();
			//projectSrtDate.sendKeys(print(date.today()));
			
			driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click(); 
		}

		public void setProjectSrtDateComplete() {
			projectSrtDate.clear();
			projectSrtDate.click();
			driver.findElement(By.xpath("//img[@alt='Previous Month']")).click(); 
			driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[1]")).click();
		}
		
		public void setProjectEndDateComplete() {
			projectEndDate.clear();
			projectEndDate.click();
			driver.findElement(By.xpath("//img[@alt='Previous Month']")).click(); 
			driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[20]")).click();
		}

		
		public void setProjectSrtDateNotStarted() {
			projectSrtDate.clear();
			projectSrtDate.click();
			//driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); 
			//driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[1]")).click();
			driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
			driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 
		}
		
		
		public void setProjectEndDate() {
			projectEndDate.clear();
			projectEndDate.click();
			driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
			driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 	
		}



		public void setProjectDescp(String strprojectDescp) {
			projectDescp.sendKeys(strprojectDescp);
		}



		public void clickProjectSaveBtn() {
			projectSaveBtn.click();
		}



		public void clickNewAccntPrjBtn() {
			newAccntPrjBtn.click();
		}



		public void setPrjAccntName(String strprjAccntName) {
			prjAccntName.sendKeys(strprjAccntName);
		}



		public void clickPrjAccntSaveBtn() {
			prjAccntSaveBtn.click();
		}

		public void clickPrjEditBtn() {
			projectEditBtn.click();
		}
		
		public String getPrjStatus() {
			return prjInlineStatus.getText();
		}
			
}


