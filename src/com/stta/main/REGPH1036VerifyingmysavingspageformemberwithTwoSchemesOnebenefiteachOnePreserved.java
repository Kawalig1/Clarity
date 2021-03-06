package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1036VerifyingmysavingspageformemberwithTwoSchemesOnebenefiteachOnePreserved {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testREGPH1036VerifyingmysavingspageformemberwithTwoSchemesOnebenefiteachOnePreserved() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("dynamic07");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    driver.findElement(By.xpath("//a[2]")).click();
    driver.findElement(By.linkText("How much am I saving?")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EmployeeFormView.0.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EmployerFormView.0.0 | ]]
    try {
      assertEquals(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_totalRate")).getText(), "200%");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_totalConts")).getText(), "£3,333.33");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*The amount that you and your employer save is not taxed\\. The cost to you is £666\\.67 if you pay basic-rate tax or £500\\.00 if you pay higher-rate tax\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You are saving your money in the following investment funds\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//th[1]")).getText(), "Fund");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//th[2]")).getText(), "Proportion (%)");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[2]/td[1]")).getText(), "Equities fund");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//td[2]")).getText(), "50.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[3]/td[1]")).getText(), "Cash fund");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//tr[3]/td[2]")).getText(), "50.00");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Change account")).click();
    driver.findElement(By.xpath("//tr[3]/td[1]/a[2]")).click();
    driver.findElement(By.linkText("How much am I saving?")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EmployeeFormView.0.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | id=ctl00_ctl00_BaseContentPlaceHolder_ContentPlaceHolder_EmployerFormView.0.0 | ]]
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*200%[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*£3,333\\.33[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*The amount that you and your employer save is not taxed\\. The cost to you is £666\\.67 if you pay basic-rate tax or £500\\.00 if you pay higher-rate tax\\.[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
