package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class UncheckedException 
{
	public UncheckedException(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void setAttribute(WebElement element, String attributeName, String value)

    {

        WrapsDriver wrappedElement = (WrapsDriver) element;

        JavascriptExecutor driver = (JavascriptExecutor)wrappedElement.getWrappedDriver();

        driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, attributeName, value);

    }
	
	public static void entertext(WebElement element, String attributenames, String value)
	{
		WrapsDriver wrrapelement1 = (WrapsDriver) element;
		JavascriptExecutor je = (JavascriptExecutor)wrrapelement1.getWrappedDriver();
		je.executeScript("arguments[0].setAtribute(arguments[1],arguments[2])", element,attributenames, value);
	}

	private static WebDriver driver;
	
	//EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
	//File scrFile = eDriver.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(scrFile, new File(imgPath));
	
	public static void takeSnapShot(WebDriver webdriver, String filewithpath)
	{
		TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
		File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile = new File(filewithpath);
		
		
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	
	


	public static void main(String[] args)
	{

		int num[] = {1, 2, 3, 4};
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.RETURN);
		act.sendKeys(Keys.ENTER);
		act.sendKeys(Keys.DOWN);
		act.contextClick(driver.findElement(By.id("Test")));
		String press = Keys.chord(Keys.SHIFT,Keys.ENTER);
		
	}
	
	@DataProvider(name = "dataProvider1")
	public Object[][] dataProvideMethod1()
	{
		return new Object[][] {{"Test","Testing"}};
		
	}
	
	@Test(dataProvider = "dataProvider1")
	public void sampleTest(String s1, String s2)
	{
		System.out.println(s1 +" " +s2);
	}
	
	public class TestFactory{
		@Factory
		public Object[] factoryMethod()
		{
			return new Object[]{new UncheckedException("K1")};
		}
	}
			


}


