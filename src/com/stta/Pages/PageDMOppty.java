package com.stta.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageDMOppty {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@id='showFeedLink']/a/span")
    WebElement showFeed;
	
	@FindBy(css="span.triggerText")
    WebElement moredrpdown;
	
	@FindBy(xpath="//a[@id='publisherAttach09Dw0000000qLEI']/span/span")
    WebElement createSimpleLnk;
	
	@FindBy(xpath="//a[@id='publisherAttach09Dw0000000qLEJ']/span")
    WebElement createTransactionalLnk;
	
	@FindBy(id="opp3__09Dw0000000qLEI")
	 WebElement chatterSimpleOppName;
	//input[@id='opp3__09Dw0000000qLEJ']
		
	
	@FindBy(id="opp4__09Dw0000000qLEI")
    WebElement chatterSimpleAccntName;
	
	@FindBy(id="opp9__09Dw0000000qLEI")
    WebElement chatterSimpleCloseDate;
	
	@FindBy(id="opp11__09Dw0000000qLEI")
    WebElement chatterSimpleSalesStage;
	
	@FindBy(id="opp7__09Dw0000000qLEI")
    WebElement chatterSimpleTotalFee;
		
	@FindBy(id="00Nw0000008w75h__09Dw0000000qLEI")
    WebElement chatterSimpleCOB;
	
	@FindBy(id="00Nw0000003PEsx__09Dw0000000qLEI")
    WebElement chatterSimpleOpptyType;
	
	@FindBy(id="00N20000003NlIs__09Dw0000000qLEI")
    WebElement chatterSimpleRevType;
	
	
	//chatter Transactional Opp ids
	
	@FindBy(id="opp3__09Dw0000000qLEJ")
	 WebElement chatterTransOppName;
	//input[@id='opp3__09Dw0000000qLEJ']
		
	
	@FindBy(id="opp4__09Dw0000000qLEJ")
   WebElement chatterTransAccntName;
	
	@FindBy(id="opp9__09Dw0000000qLEJ")
   WebElement chatterTransCloseDate;
	
	@FindBy(id="opp11__09Dw0000000qLEJ")
   WebElement chatterTransSalesStage;
	
	@FindBy(id="opp7__09Dw0000000qLEJ")
   WebElement chatterTransTotalFee;
		

	
	@FindBy(id="00Nw0000003PEsx__09Dw0000000qLEJ")
   WebElement chatterTransOpptyType;
	
	@FindBy(id="00N20000003NlIs__09Dw0000000qLEJ")
   WebElement chatterTransRevType;
	
	@FindBy(id="publishersharebutton")
    WebElement chatterCreateBtn;
	
	@FindBy(css="div.nonFeedSuccessTitle")
    WebElement chatterSuccessMsg;
	
	
	//Opportunity from Opp tab
	
	@FindBy(id="00Nw00000095SR8")
	WebElement businessType;
	
	@FindBy(id="00Nw0000008w75h")
	WebElement COB;
	
	//Opportunity Revenue sharing elements
	
	@FindBy(name="new00Nw00000095SQM")
	WebElement newOppRevShareBtn;
	
	@FindBy(id="CF00Nw00000095SQk")
	WebElement sharedWith;
	
	@FindBy(id="00Nw00000095SQl")
	WebElement payAwayAmnt;
	
	@FindBy(xpath="//div[@id='CF00Nw00000095SQM_ileinner']/a")
	WebElement oppLnkOnRevShare;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQM_body')]/table/tbody/tr[2]/th/a")
	WebElement SharedWithRL;
	
	@FindBy(xpath="//div[contains(@id,'_00Nw00000095SQM_body')]/table/tbody/tr[2]/td[2]")
	WebElement payAwayAmntRL;
	
	@FindBy(id="00Nw00000095SRE_ileinner")
	WebElement totalDealAmnt;
	
	
	//Deepali added element for multiple Account error on Opportunity Relationships
    @FindBy(xpath="//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/div[2]")
    WebElement multipleAccntErr;
	
	//Constructor
		public  PageDMOppty(WebDriver driver)
		{
			this.driver=driver;
			  //This initElements method will create all WebElements
			PageFactory.initElements(driver, this);
		}
		
		
	public void showFeed_click() {
		// TODO Auto-generated method stub
		
		if (driver.findElements(By.xpath("//span[@id='showFeedLink']/a/span")).isEmpty())
		{
			System.out.println("Inside else");
			showFeed.click();
					
			
		}
		else
			
		{
			System.out.println("Hide Feed link present");
		}
		
		
	}


	public void clickMoredrpdown() throws InterruptedException {
		System.out.println("Inside more");
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,400);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.triggerText")));
		
		Actions xAct = new Actions(driver);
		xAct.moveToElement(moredrpdown).click().build().perform();
		System.out.println("Inside more1");
	}


	public void clickCreateSimpleLnk() {
		
		System.out.println("Inside simple1");
		
		if (driver.findElements(By.xpath("//a[@id='publisherAttach09Dw0000000qLEI']/span/span")).size()==0)
		{
			System.out.println("simple link not present");
			moredrpdown.click();
			createSimpleLnk.click();	
			
		}
		else if (driver.findElements(By.xpath("//a[@id='publisherAttach09Dw0000000qLEI']/span/span")).size()!=0)
			
		{
			System.out.println("simple link  present");
			
			
			createSimpleLnk.click();                              
		}
		
	}


	public void clickCreateTransactionalLnk() {
		createTransactionalLnk.click();
	}


	public void setChatterSimpleOppName(String chatterOppNametxt) {
		chatterSimpleOppName.sendKeys(chatterOppNametxt);
	}


	public void setChatterSimpleAccntName(String  chatterAccntNametxt) {
		chatterSimpleAccntName.sendKeys(chatterAccntNametxt);
	}


	public void setChatterSimpleCloseDate() {
		chatterSimpleCloseDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 			

	}


	public void setChatterSimpleSalesStage(String chatterSalesStagetxt) {
				
		Select SalesStage = new Select(chatterSimpleSalesStage);
		SalesStage.selectByVisibleText(chatterSalesStagetxt);
	}


	public void setChatterSimpleTotalFee(String chatterTotalFeetxt) {
		chatterSimpleTotalFee.sendKeys(chatterTotalFeetxt);
	}


	public void setChatterSimpleCOB(String chatterCOBtxt) {
		Select COB = new Select(chatterSimpleCOB);
		COB.selectByVisibleText(chatterCOBtxt);
	}


	public void setChatterSimpleOpptyType(String chatterOpptyTypetxt) {
				
		Select SalesStage = new Select(chatterSimpleOpptyType);
		SalesStage.selectByVisibleText(chatterOpptyTypetxt);
	}


	public void setChatterSimpleRevType(String chatterRevTypetxt) {
		
		
		Select revtype = new Select(chatterSimpleRevType);
		revtype.selectByVisibleText(chatterRevTypetxt);
	}

	
	public void setChatterTransOppName(String chatterOppNametxt) {
		chatterTransOppName.sendKeys(chatterOppNametxt);
	}


	public void setChatterTransAccntName(String  chatterAccntNametxt) {
		chatterTransAccntName.sendKeys(chatterAccntNametxt);
	}


	public void setChatterTransCloseDate() {
		chatterTransCloseDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click(); 			

	}


	public void setChatterTransSalesStage(String chatterSalesStagetxt) {
				
		Select SalesStage = new Select(chatterTransSalesStage);
		SalesStage.selectByVisibleText(chatterSalesStagetxt);
	}


	public void setChatterTransTotalFee(String chatterTotalFeetxt) {
		chatterTransTotalFee.sendKeys(chatterTotalFeetxt);
	}




	public void setChatterTransOpptyType(String chatterOpptyTypetxt) {
				
		Select SalesStage = new Select(chatterTransOpptyType);
		SalesStage.selectByVisibleText(chatterOpptyTypetxt);
	}


	public void setChatterTransRevType(String chatterRevTypetxt) {
		
		
		Select revtype = new Select(chatterTransRevType);
		revtype.selectByVisibleText(chatterRevTypetxt);
	}


	public void setChatterCreateBtn() {
		chatterCreateBtn.click();
	}

	public String getChatterSuccessMsg() {
		
	System.out.println("msg1");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		System.out.println("msg2");
		jse.executeScript("window.scrollBy(0,250)", "");
		System.out.println("msg3");
		WebDriverWait wait= new WebDriverWait(driver, 40);
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.nonFeedSuccessTitle")));
		System.out.println("msg5");
		return chatterSuccessMsg.getText();
	
	}
	
	public void selBussinessType(String bussinesstypestr) {
		Select busstype = new Select(businessType);
		busstype.selectByVisibleText(bussinesstypestr);
		
		
	}
	
	public void selCOB(String cobstr) {
		Select cob = new Select(COB);
		cob.selectByVisibleText(cobstr);
		
		
	}


	public String getSharedWithRL() {
		return SharedWithRL.getText();
	}


	public String getPayAwayAmntRL() {
		return payAwayAmntRL.getText();
	}


	public void setNewOppRevShareBtn() {
		newOppRevShareBtn.click();
	}


	public void setSharedWith(String sharedWithtxt) {
		sharedWith.sendKeys(sharedWithtxt);
	}


	public void setPayAwayAmnt(String payAwayAmnttxt) {
		payAwayAmnt.sendKeys(payAwayAmnttxt);;
	}


	public void clickOppLnkOnRevShare() {
		oppLnkOnRevShare.click();
	}
	
	public String getTotalDealAmnt() {
		return totalDealAmnt.getText();
	}
	
	public void clickOppRevShareBtn() {
		newOppRevShareBtn.click();
	}
	
	public String getMultipleAccntErr() {
		
		if (driver.findElements(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/div[2]")).size() != 0) 
		{	
			System.out.println("test2");
			String errmsg=multipleAccntErr.getText();
			System.out.println("errmsg:"+errmsg);
		return errmsg;
		
		
		}
		else
			
		{
			
			return "Error text not present";
		}
	}
	
}
