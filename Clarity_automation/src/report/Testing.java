package report;

import java.io.File;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Clarity1_3.SelectBrowser;

public class Testing {
	
	private WebDriver driver;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)@Parameters("browser")
	  
	  public void setUp(String browser) throws Exception 
	  {
	    driver = SelectBrowser.setup(driver,browser);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    /*Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		.withTimeout(20, TimeUnit.SECONDS)
	    		.pollingEvery(5, TimeUnit.SECONDS)
	    		.ignoring(NoSuchElementException.class);
	    WebElement ele = wait.until(new Function<WebDriver, WebElement>()
	    		{
	    			public WebElement apply(WebDriver driver)
	    			{
	    				return driver.findElement(By.id("Textbox"));
	    			}
	    		}
	    );*/
	    
	    Actions action = new Actions(driver);
	    WebElement element = driver.findElement(By.id("Test"));
	    WebElement FromPath = driver.findElement(By.name("testing"));
	    WebElement ToPath = driver.findElement(By.name("ToLocation"));
	    action.doubleClick(element).perform();
	    action.contextClick(element).perform();
	    action.moveToElement(element).perform();
	    action.dragAndDrop(FromPath, ToPath);
	    
	    String getsourcecode = driver.getPageSource();
	    
	    String tooltip = element.getAttribute("title");
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("C:\\screenshot\\test.jpg"));
	    
	    Select contiresFromDropDown = new Select(driver.findElement(By.id("contry")));
	    contiresFromDropDown.selectByVisibleText("India");
	    contiresFromDropDown.selectByIndex(2);
	    contiresFromDropDown.selectByValue("ind");
	    
	    WebDriverWait Wait1 = new WebDriverWait(driver, 10);
	    WebElement element2 = Wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(browser))));
	    
	    
	  }
	




}
