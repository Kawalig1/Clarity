package Clarity1_3;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS020VerifyPensionernotabletoaccesspagesofotherrolesandgotredirectedtopensionerHomepage {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test10005ATS020VerifyPensionernotabletoaccesspagesofotherrolesandgotredirectedtopensionerHomepage() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    driver.get("http://Clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("02.08.08");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    Thread.sleep(1000);
    //driver.findElement(By.linkText("Select")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    driver.findElement(By.linkText("How much is my pension?")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[3]/span/a")).click();
    driver.findElement(By.linkText("Where is my pension paid?")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='navigation']/li[4]/span/a")).click();
    driver.findElement(By.linkText("About me")).click();
    // Warning: verifyTextNotPresent may require manual changes
    try {
      assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*PensionerPlanner[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get("http://Clarity/Pages/Dynamic/WhatHaveIPaidSoFar.aspx");
    try {
      assertEquals(driver.findElement(By.linkText("My pension")).getText(), "My pension");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.linkText("My details")).getText(), "My details");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextNotPresent may require manual changes
    //try {
     // assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*PensionerPlanner[\\s\\S]*$"));
    //} catch (Error e) {
    //  verificationErrors.append(e.toString());
    //}
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
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
