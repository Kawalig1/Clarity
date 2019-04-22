package com.stta.Pages;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class PageEditProduct {

	WebDriver driver;
	
	@FindBy(id="p1")
	WebElement prodSelPriceBook;
	
	@FindBy(name="save")
	WebElement prodSavePriceBook;
	
	@FindBy(id="PricebookEntrycol0")
	WebElement prodFieldFilter;
	
	@FindBy(id="PricebookEntryoper0")
	WebElement prodOprFilter;
	
	@FindBy(id="PricebookEntryfval0")
	WebElement prodFieldFilterValue;
	
	@FindBy(id="save_filter_PricebookEntry")
	public WebElement prodSearchBtn;
	
	@FindBy(xpath="//div[contains(@id,'_PRODUCT_NAME')]/a/span")
	WebElement prodName;
		
	@FindBy(xpath="//div[contains(@id,'_PRODUCT2_FAMILY_ENUM')]")
	WebElement prodCOB;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw0000008CtHZ')]")
	WebElement prodLOB;
	
	/*@FindBy(id="01uw000000hWnfn")
	By prodSelCheckbox;*/
	
	//@FindBy(xpath="//div[contains(@id,'_RelatedContactList_body')]/table/tbody/tr[2]/th/a")
	//WebElement contactNameOnRelatedList;
	
	@FindBy(name="edit")
	WebElement prodSelBtn;
		
	@FindBy(xpath="//input[starts-with(@id,'UnitPrice01')]")
	WebElement prodRevenue;
	
/*	@FindBy(xpath="//select[starts-with(@id,'00Nw0000003PaOh01uw000000')]")
	WebElement prodRevType;
	
	@FindBy(xpath="//select[starts-with(@id,'00Nw0000003PEtX01uw000000')]")
	WebElement prodBussType;
	
	@FindBy(xpath="//input[starts-with(@id,'Description01uw000000')]")
	WebElement prodLineDesc;
	*/
	
	@FindBy(xpath="//select[starts-with(@id,'00Nw0000003PaOh01u')]")
	WebElement prodRevType;
	
	@FindBy(xpath="//select[starts-with(@id,'00Nw0000003PEtX01u')]")
	WebElement prodBussType;
	
	@FindBy(xpath="//input[starts-with(@id,'Description01u')]")
	WebElement prodLineDesc;
	@FindBy(xpath="//input[contains(@id,'ServiceDate01')]")
	WebElement prodInvoiceDate;

	@FindBy(name="save")
	WebElement prodSaveBtn;
	
	
	
	public PageEditProduct(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
		  //This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
		
	
	public void setProdSelPriceBook(String strPriceBook) 
	{
		
		if (!driver.findElements(By.id("p1")).isEmpty()) 
		{
			Select pricebook = new Select(prodSelPriceBook);
			pricebook.selectByVisibleText(strPriceBook);
		}
				
		
	}

	public void SavePriceBook() 
	{
		if (!driver.findElements(By.name("save")).isEmpty()) 
		{
			prodSavePriceBook.click();
		}
		
		
	}

	public void setProdFieldFilter(String strFieldFilter) 
	{
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PricebookEntrycol0")));
		Select fieldfilter = new Select(prodFieldFilter);
		fieldfilter.selectByVisibleText(strFieldFilter);
		
	}

	public void setProdOprFilter(String strOprFilter)
	{
		Select oprfilter = new Select(prodOprFilter);
		oprfilter.selectByVisibleText(strOprFilter);
		
	}

	public void setProdFieldFilterValue(String strFilterValue) 
	{
		prodFieldFilterValue.sendKeys(strFilterValue);;
	}

	public void selProd()
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("edit")));
		
		prodSelBtn.click();
	}

	public void setProdRevenue(String strprodRevenue) 
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@id,'UnitPrice01')]")));
		prodRevenue.clear();
		prodRevenue.sendKeys(strprodRevenue);
	}

	public void setProdRevType(String strprodRevType) 
	{
		Select prodrevtype = new Select(prodRevType);
		prodrevtype.selectByVisibleText(strprodRevType);
	}

	public void setProdBussType(String strprodBussType) 
	{
		if (driver.findElements(By.xpath("//select[starts-with(@id,'00Nw0000003PEtX01u')]")).size() != 0) 
		{
		Select prodbustype = new Select(prodBussType);
		prodbustype.selectByVisibleText(strprodBussType);
		}
		
		else
		{
			System.out.println("Business Type not present as it is DM Opportunity");
		}
	}

	public void setProdLineDesc(String strprodLineDesc)
	{
		prodLineDesc.sendKeys(strprodLineDesc);
	}

	public void setProdInvoiceDate() 
	{
		prodInvoiceDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")));
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 
	}

	public void saveProdDetails()
	{
		prodSaveBtn.click();
	}
	
	public void clickProdSearchBtn()
	{
		prodSearchBtn.click();
		
	}

	public void setProdSelCheckbox(String checkboxProdId) throws InterruptedException
	{
		
		System.out.println("Inside Prod1");
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='"+checkboxProdId+"']")));
	
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id(checkboxProdId))).click().build().perform();

		if(driver.findElement(By.id(checkboxProdId)).isSelected())
		{
			//System.out.println("Inside if");	
			System.out.println("Inside Prod2");

		}
		else
		{
			System.out.println("Inside Prod3");

			try
			{
				Thread.sleep(5000);
			}
			catch (StaleElementReferenceException elementHasDisappeared)
			{
			}
			action.moveToElement(driver.findElement(By.id(checkboxProdId))).click().build().perform();
			System.out.println("Inside Prod4");

		}
		
	}


	public String getProdName()
	{
		System.out.println("Inside Prod5");
WebDriverWait wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_PRODUCT_NAME')]/a/span")));
		return prodName.getText();

	}


	public String getProdCOB()
	{
		
		System.out.println("Inside Prod6");
WebDriverWait wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_PRODUCT2_FAMILY_ENUM')]")));
		return prodCOB.getText();
	}


	public String getProdLOB() 
	{
		System.out.println("Inside Prod7");
		
WebDriverWait wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id,'_00Nw0000008CtHZ')]")));

		return prodLOB.getText();
	}
	
	

}
