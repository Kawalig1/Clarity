package com.stta.Pages;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageSearchAccount
{
	WebDriver driver;
	
	//@FindBy(xpath="//li[@id='Account_Tab']/a")
	@FindBy(partialLinkText="Accounts")			//All WebElements are identified by @FindBy annotation
	//driver.findElement(By.partialLinkText("Accounts"))
	WebElement accountTab;
	
	@FindBy(name="new")
	WebElement accountNewButton;
	
	@FindBy(id="p3")
	WebElement accountSelectRecordType;
	
	@FindBy(xpath="(//input[@name='save'])[2]")
	WebElement accountContinueButton;
	
	@FindBy(name="cancel")
	WebElement accountCancelButton;
	
	@FindBy(id="j_id0:inputform:nextbit:j_id29:j_id30:0:j_id31:j_id39")
	WebElement searchAccountName;
	
	@FindBy(id="j_id0:inputform:nextbit:j_id29:j_id30:1:j_id31:j_id36")
	WebElement searchCountry;
	
	@FindBy(id="j_id0:inputform:nextbit:j_id29:j_id30:2:j_id31:j_id39")
	WebElement searchState;
	
	@FindBy(id="j_id0:inputform:nextbit:j_id29:j_id30:3:j_id31:j_id39")
	WebElement searchCity;
	
	@FindBy(xpath="//textarea[@id='j_id0:inputform:nextbit:j_id29:j_id30:4:j_id31:j_id39']")
	WebElement searchStreet;
	
	@FindBy(id="j_id0:inputform:nextbit:j_id29:j_id30:5:j_id31:j_id39")
	WebElement searchZipCode;
	
	@FindBy(id="j_id0:inputform:nextbit:j_id29:j_id30:6:j_id31:j_id39")
	WebElement searchPhone;
	
	@FindBy(id="j_id0:inputform:nextbit:j_id26:bottom:Search")
	WebElement searchButton;
	
	@FindBy(id="j_id0:inputform:nextbit:j_id26:bottom:Cancel")
	WebElement searchCancelButton;
	
	@FindBy(xpath="//div[@id='j_id0:theform:TheResults']/div/table/tbody/tr/td/h2")
	WebElement searchAccountsLabel;
	
	/*@FindBy(xpath="//input[@name='j_id0:theform:TheResults:j_id46']")
	WebElement searchIgnoreAndCreateNewButton;*/
	
	@FindBy(name="j_id0:theform:TheResults:j_id46")
	WebElement searchIgnoreAndCreateNewButton;
	
	@FindBy(xpath="//span[@id='j_id0:inputform:nextbit:pageMessage:j_id1:j_id2:0:j_id3:j_id4:j_id7']/h4")
	WebElement searchError;
	
	@FindBy(xpath="//span[@id='j_id0:inputform:nextbit:pageMessage:j_id1:j_id2:0:j_id3:j_id4:j_id16']/ul/li")
	WebElement searchAccountNameError;
	
	@FindBy(xpath="//span[@id='j_id0:inputform:nextbit:pageMessage:j_id1:j_id2:0:j_id3:j_id4:j_id16']/ul/li[2]")
	WebElement searchCorrsCountryError;

	
	public PageSearchAccount(WebDriver driver)		//Constructor
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);		//Creates all webElements
	}
	
	
	public void clickAccountTab()
	{
		
		//driver.findElement(By.xpath("//li[@id='Account_Tab']/a")).click();
		this.driver.findElement(By.partialLinkText("Accounts")).click();
		accountTab.click();
	}
		

	public void clickNew()
	{
		accountNewButton.click();
	}
	
	
	public void selectAccountRecordType(String strRecordType)
	{
		// TODO Auto-generated method stub
		if (driver.findElements(By.id("p3")).size() != 0)
		{
		Select recordType = new Select(accountSelectRecordType);
		recordType.selectByVisibleText(strRecordType);
		}
		else
		{
			System.out.println("User belongs to Japan, so only Business Account created1");
		}
	}

	
	public void clickContinue()
	{
		if (driver.findElements(By.xpath("(//input[@name='save'])[2]")).size() != 0)
		{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='save'])[2]")));
		accountContinueButton.click();
		}
		
		else
		{
			System.out.println("User belongs to Japan, so only Business Account created2");

		}
	}

	
	public void clickAccountCancel()
	{
		accountCancelButton.click();
	}

		
	public void setAccountName(String strAccountName)
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:inputform:nextbit:j_id29:j_id30:0:j_id31:j_id39")));
		searchAccountName.sendKeys(strAccountName);
	}
		
	
	public void setCountry(String strCountry)
	{
		Select country=new Select(searchCountry);
		country.selectByVisibleText(strCountry);
	}
	
	
	public void setState(String strState)
	{
		
		if (searchState.isEnabled()==true) 
		
		{  
			Select state = new Select(searchState);
			state.selectByVisibleText(strState);
			             
        }  			
		else
		{
			
			System.out.println("element is disabled");  
		}
		

        }

	
	
	
	public void setCity(String strCity)
	{
		searchCity.sendKeys(strCity);
	}
	
	
	public void setStreet(String strStreet)
	{
		System.out.println("inside street1");
		WebDriverWait wait = new WebDriverWait(driver,40);
		System.out.println("inside street2");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='j_id0:inputform:nextbit:j_id29:j_id30:4:j_id31:j_id39']")));
		System.out.println("inside street3");
		searchStreet.sendKeys(strStreet);
		System.out.println("inside street4");
	}
	
	
	public void setZipCode(String strZipCode)
	{
		searchZipCode.sendKeys(strZipCode);
	}
	

	public void setPhone(String strPhone)
	{
		searchPhone.sendKeys(strPhone);
	}
	

	public void clickSearch()
	{
		searchButton.click();		
	}

	
	public void clickCancel()
	{
		searchCancelButton.click();
	}
	
	
	public String accountsLabelPresent()
	{
		String bodyText = searchAccountsLabel.getText();
		return bodyText;
	}
	
	
	public String ignoreAndCreateNewButtonPresent()
	{
		String bodyText = searchIgnoreAndCreateNewButton.getAttribute("value");
		return bodyText;
	}
	
	
	public void clickIgnoreAndCreateNew()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='j_id0:theform:TheResults:j_id46']")));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[@name='j_id0:theform:TheResults:j_id46']"))).doubleClick().build().perform();
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	
	public String getSearchError()
	{
		if (driver.findElements(By.xpath("//span[@id='j_id0:inputform:nextbit:pageMessage:j_id1:j_id2:0:j_id3:j_id4:j_id7']/h4")).size() != 0) 
			return searchError.getText();                
		else				
			return "Error text not present" ;
	}
		
	
	public String getAccountNameError()
	{			
		if (driver.findElements(By.xpath("//span[@id='j_id0:inputform:nextbit:pageMessage:j_id1:j_id2:0:j_id3:j_id4:j_id16']/ul/li")).size() != 0) 
			return searchAccountNameError.getText();                
		else				
			return "Error text not present" ;
	}
	
	
	public String getAccountCountryError()
	{
		if (driver.findElements(By.xpath("//span[@id='j_id0:inputform:nextbit:pageMessage:j_id1:j_id2:0:j_id3:j_id4:j_id16']/ul/li[2]")).size() != 0) 
			return searchCorrsCountryError.getText();                
		else				
			return "Error text not present" ;
	}
}
