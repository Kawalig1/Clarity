package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SUPWRS91648ATS005Verifythatthegovernanceuserisloggedoutifhelockshisaccountduringchangememorableword {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSUPWRS91648ATS005Verifythatthegovernanceuserisloggedoutifhelockshisaccountduringchangememorableword() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://clarity");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("SGovenance1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder_formcontainer']/table/tbody/tr[2]/td[3]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/ul/li[2]/a")).click();
    Thread.sleep(1000);

    //driver.findElement(By.linkText("Change memorable word")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password1");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("password");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("password");
    Thread.sleep(1000);
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ResetButton")).click();
    Thread.sleep(1000);
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid.Your new memorable word should contain numbers. It should be between 8 and 15 characters in length.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ResetButton")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid.Your new memorable word should contain numbers. It should be between 8 and 15 characters in length.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ResetButton")).click();
    // Warning: verifyTextPresent may require manual changes
    /*try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password incorrect or new memorable word is invalid\\. Your new memorable word should contain numbers, 8 to 15 characters \\(inclusive\\)\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_PasswordTextBox")).sendKeys("password4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_MemorableWordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ConfirmMemorableWordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ChangeMemorableWord1_ResetButton")).click();*/
    // Warning: verifyTextPresent may require manual changes
    try {
    	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You have now made a number of unsuccessful attempts to log in. For security reasons you will be prevented temporarily from attempting to log in for the next 30 minutes.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
