package main;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BaseClass 
{
	private static WebDriver driver;
	
	
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kawalig1\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//add Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Get URL
		driver.get("http://automationpractice.com/index.php");
		
		String title = driver.getTitle();
			
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs(title));
		
	}
	
	public void homepage()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		try
		{
			
			Assert.assertEquals("My Store", title);	
			System.out.println(" On the HomePage ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
	public void clickonsignin()
	{
		driver.findElement(By.linkText("Sign in")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		String loginpageTitle = driver.getTitle();
		System.out.println(loginpageTitle);
		wait.until(ExpectedConditions.titleIs(loginpageTitle));
		
	}
	
	public void createLoginID(WebDriver driver, String email){
		
		driver.findElement(By.id("email_create")).sendKeys(email);
	}
	
	
	public static void clickoncreateaccount()
	{
		driver.findElement(By.id("SubmitCreate")).click();
	}
	
	public static void main(String arg[])
	{
		BaseClass BC = new BaseClass();
		BC.launch();
		BC.homepage();
		BC.clickonsignin();
		BC.createLoginID(driver, "gk@gmail.com");
	}
	
	
	

}
