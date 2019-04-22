package com.stta.util;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

// selenium layer
public class Keywords {
	
	public static WebDriver driver = null;
	public WebDriver bak_chrome;
	public WebDriver bak_mozilla;
	public WebDriver bak_ie;
	Properties OR=null;
	Properties ENV=null;
	static Keywords k;
	URL url;
	Keywords(){
		try{
			OR= new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//com//stta//property//OR.properties");
			OR.load(fs);
			
			// init env
			ENV=new Properties();
			String fileName=OR.getProperty("environment")+".properties";
			System.out.println("***"+ fileName);
			fs = new FileInputStream(System.getProperty("user.dir")+"//src//com//stta//property//"+fileName);
			ENV.load(fs);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Keywords getInstance(){
		if(k==null)
			k=new Keywords();
		
		return k;
	}
			
	public  void openBrowser(String browserName) { // open a browser
		
			
		if(browserName.equals("Mozilla")){
			/*try {
				url = new URL( "http", "192.168.97.93", 4444, "/wd/hub" );
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DesiredCapabilities capabilities =DesiredCapabilities.firefox();
			System.out.println("1");
			capabilities.setJavascriptEnabled(true);
			System.out.println("2");
			driver = new RemoteWebDriver(url,capabilities);
			System.out.println("4");*/
			
			FirefoxProfile profile = new FirefoxProfile();
			String path = "C:\\Downloads_sel";
	        profile.setPreference("browser.download.folderList", 2);
	        profile.setPreference("browser.download.dir", path);
	        profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
	        profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip, application/x-zip, application/x-zip-compressed, application/download, application/octet-stream");
	        profile.setPreference("browser.download.manager.showWhenStarting", false);
	        profile.setPreference("browser.download.manager.focusWhenStarting", false);
	        profile.setPreference("browser.helperApps.alwaysAsk.force", false);
	        profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
	        profile.setPreference("browser.download.manager.closeWhenDone", false);
	        profile.setPreference("browser.download.manager.showAlertOnComplete", false);
	        profile.setPreference("browser.download.manager.useWindow", false);
	        profile.setPreference("browser.download.manager.showWhenStarting", false);
	        profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
	      
	       driver = new FirefoxDriver(profile);
			  //bak_mozilla=driver;
		}
		else if(browserName.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
				driver= new ChromeDriver();
				//bak_chrome=driver;
		}else if(browserName.equals("IE")){
			
			try {
				url = new URL( "http", "192.168.97.93", 4444, "/wd/hub" );
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			DesiredCapabilities capabilities =DesiredCapabilities.internetExplorer();
			System.out.println("1");
			capabilities.setJavascriptEnabled(true);
			System.out.println("2");
			driver = new RemoteWebDriver(url,capabilities);
			System.out.println("4");
		
		}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void navigate(String URLKey){ // load page
		System.out.println(ENV.getProperty(URLKey));
		
		    driver.get(ENV.getProperty(URLKey));
	}
	
	public void navigateURL(String URL)
	{
		System.out.println(URL);
		driver.get(URL);
	}
	
	public void click(String locator,String xpathKey){ // click
		
		if (locator.equalsIgnoreCase("xpath")){
			System.out.println(driver);
			System.out.println(OR.getProperty(xpathKey));
			System.out.println(driver.findElement(By.xpath(OR.getProperty(xpathKey))));
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).click();
		}else if (locator.equalsIgnoreCase("id")){
				driver.findElement(By.id(OR.getProperty(xpathKey))).click();
									
		}else if (locator.equalsIgnoreCase("name")){
				driver.findElement(By.name(OR.getProperty(xpathKey))).click();
				
			}
		else
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

	
	public void clearElement(String locator,String xpathKey){ // click
			
			if (locator.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(OR.getProperty(xpathKey))).click();
			}else if (locator.equalsIgnoreCase("id")){
					driver.findElement(By.id(OR.getProperty(xpathKey))).click();
										
			}else if (locator.equalsIgnoreCase("name")){ 
					driver.findElement(By.name(OR.getProperty(xpathKey))).click();
					
				}
			else
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public void clickSendMail()
	{
		int count = 0; 
		while (count < 4){ 
		try { 
			 WebElement kancheck = driver.findElement(By.xpath(OR.getProperty("SelectCheck")));
		        if(!kancheck.isSelected())
			    kancheck.click();
			WebElement ele = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSendEmailActivationLink")); 
		    ele.click(); 
		
		} 
		
		catch (StaleElementReferenceException e){ 
		e.toString(); 
		System.out.println("Trying to recover from a stale element :" + e.getMessage()); 
		count = count+1; 
		} 
		count = count+4; 
		} 
		 
		//WebElement e = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSendEmailActivationLink")); 
		//(new WebDriverWait(driver, 5)).until(ExpectedConditions.stalenessOf(e)); 
		
	}
	
	public String getcelldata(int row, int col, String tablelocator, String key)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement  tablename =driver.findElement(By.id(OR.getProperty(key)));	
		WebElement value = tablename.findElement(By.xpath("//tbody/tr[" + row +"]/td[" + col +"]"));
		System.out.println(value.getText());
		String celldata = value.getText();
		return celldata;
	}
	public void select(String locator, String xpathkey, String selectItem)
	{
		Select dropdown = new Select(driver.findElement(By.xpath(OR.getProperty(xpathkey))));
		dropdown.selectByVisibleText(selectItem);
	}
	
	public void clickLink(String linkText)
	{
		driver.findElement(By.linkText((OR.getProperty(linkText)))).click();
	}

	public void generateLogin(String xpathkey)
	{
		int count = 0; 
		while (count < 4){ 
		try { 
			WebElement kancheck = driver.findElement(By.xpath(OR.getProperty("SelectCheck")));
	        if(!kancheck.isSelected())
		    kancheck.click();
	        WebElement generatelogin = driver.findElement(By.id(OR.getProperty("btnGeneratePin")));
	        generatelogin.click();
	        System.out.println(count);
		}
		catch (StaleElementReferenceException e){ 
			e.toString(); 
			System.out.println("Trying to recover from a stale element :" + e.getMessage()); 
			count = count+1; 
			} 
			count = count+4; 
			} 
		
	}

	public void check(String xpathkey)
	{
		    WebElement kancheck = driver.findElement(By.xpath(OR.getProperty(xpathkey)));
	        if(!kancheck.isSelected())
		    kancheck.click();
	        System.out.println(kancheck.isSelected());
	}
	
	public void uncheck(String xpathkey)
	{
		    WebElement kancheck = driver.findElement(By.xpath(OR.getProperty(xpathkey)));
	        if(kancheck.isSelected())
		    kancheck.click();
	        System.out.println(kancheck.isSelected());
	}
	
	public void rdnSelect(String xpathkey)
	{
		WebElement rdnSelect = driver.findElement(By.id(OR.getProperty(xpathkey)));
        if(!rdnSelect.isSelected())
        	rdnSelect.click();
	}
	
	
	public void input(String locator,String xpathKey,String text){ // text fields
		if (locator.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(OR.getProperty(xpathKey))).clear();
			driver.findElement(By.xpath(OR.getProperty(xpathKey))).sendKeys(text);
		}else if (locator.equalsIgnoreCase("id")){
			driver.findElement(By.id(OR.getProperty(xpathKey))).clear();
			driver.findElement(By.id(OR.getProperty(xpathKey))).sendKeys(text);
		}else if (locator.equalsIgnoreCase("name")){
			driver.findElement(By.name(OR.getProperty(xpathKey))).clear();
			driver.findElement(By.name(OR.getProperty(xpathKey))).sendKeys(text);
		}
		
		
	}
	
	public String getText(String xpathkey)
	{
		String mailContent = driver.findElement(By.xpath(OR.getProperty(xpathkey))).getText();
		return (mailContent);
	}
	
	public boolean validateTitle(String expectedTitleKey){
		
		String expectedTitle=OR.getProperty(expectedTitleKey);
		
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
			return true;
		else
			return false;
		
	}
	
	public boolean validateText(String locator,String expectedText,String xpathKey){
		String actualText =null;
		if (locator.equalsIgnoreCase("xpath"))
		actualText=driver.findElement(By.xpath(OR.getProperty(xpathKey))).getText();
		else if (locator.equalsIgnoreCase("id"))
		actualText=driver.findElement(By.id(OR.getProperty(xpathKey))).getText();
		System.out.println(actualText);
		if(actualText.equals(expectedText))
			{System.out.println("Pass");
			return true;
			}
		else
			return false;
	
	}
	
	public boolean isElementPresent(String xpathKey){
		
		int count= driver.findElements(By.xpath(OR.getProperty(xpathKey))).size();
		if(count>=1)
			return true;
		else
			return false;
		}
	
	
	public void close(){
		driver.quit();
		if(bak_chrome!=null)
		bak_chrome.quit();
		if(bak_chrome!=null)
		bak_mozilla.quit();
		bak_chrome=bak_mozilla=null;
	}
	
	public String noSelectedMemberFound()
	{
		  WebElement table = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PinGenerationGridView"));
		 // List<WebElement> row = table.findElements(By.tagName("tr"));
		  List<WebElement> coll = table.findElements(By.tagName("td"));
		  System.out.println(coll.size());
		  System.out.println(coll.get(0).getText());
		  return coll.get(0).getText();
	}
}
