package com.stta.main;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class REGPH1005Verifysystemdoesnotdisplaymemorablewordwhensecondpasswordoptionunchecked {
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
  public void testREGPH1005Verifysystemdoesnotdisplaymemorablewordwhensecondpasswordoptionunchecked() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 120000 | ]]
    // Defect 97: Verify system does not display meo morable word option in Forgot password page when Uses memorable word is unchecked.
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    driver.findElement(By.id("__tab_ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel")).click();
    driver.findElement(By.linkText("New")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_txtPasswordPolicyNameValue")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_txtPasswordPolicyNameValue")).sendKeys("Defect97");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    if (!driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_ctl04")).isSelected()) {
      driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_ctl04")).click();
    };
    if (!driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_ctl06")).isSelected()) {
      driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_PasswordPolicyPanel_PasswordPolicyDetailsView_ctl06")).click();
    };
    driver.findElement(By.linkText("Insert")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel")).click();
    driver.findElement(By.linkText("Edit")).click();
    if (driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_ctl05")).isSelected()) {
      driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_ctl05")).click();
    };
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_drpSettingsPassword1Policy"))).selectByVisibleText("Defect97");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_drpSettingsPassword2Policy"))).selectByVisibleText("Defect97");
    driver.findElement(By.linkText("Update")).click();
    driver.findElement(By.id("ctl00_MenuTreeViewn3")).click();
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("Offshore4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_lnkForgotPassword")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_gobackbutton")).click();
    driver.get("http://clarityAdmin/Login.aspx?ReturnUrl=%2fDefault.aspx");
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.id("ctl00_MenuTreeViewn5")).click();
    driver.findElement(By.linkText("Edit")).click();
    if (!driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_ctl05")).isSelected()) {
      driver.findElement(By.id("ctl00_ContentPlaceHolder1_AdminContainer_SettingsPanel_SettingsDetailsView_ctl05")).click();
    };
    driver.findElement(By.linkText("Update")).click();
    driver.findElement(By.id("ctl00_MenuTreeViewn1")).click();
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
