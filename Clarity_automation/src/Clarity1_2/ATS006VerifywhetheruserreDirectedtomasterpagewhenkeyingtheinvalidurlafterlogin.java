package Clarity1_2;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATS006VerifywhetheruserreDirectedtomasterpagewhenkeyingtheinvalidurlafterlogin {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)@Parameters("browser")
  public void setUp(String browser) throws Exception {
    driver = SelectBrowser.setup(driver,browser);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test0128ATS006VerifywhetheruserreDirectedtomasterpagewhenkeyingtheinvalidurlafterlogin() throws Exception {
    // ERROR: Caught exception [ERROR: Unsupported command [setTimeout | 60000 | ]]
    // Re-direct to home page
    driver.get("http://clarity/pages/static/login.aspx");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("DEFBEN103");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.linkText("Select")).click();
    try {
      //assertEquals(driver.findElement(By.cssSelector("body")).getText(), "Scheme Home Page");
      boolean str = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Scheme Home Page[\\s\\S]*$");
      System.out.println("String is: "+str);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      //assertEquals(driver.findElement(By.linkText("Frequently asked questions")).getText(), "Frequently asked questions");
      boolean str1 = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Frequently asked questions[\\s\\S]*$");
      System.out.println("String is: "+str1);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*What life insurance pay-out would there be[\\s\\S][\\s\\S]*$"));
      boolean str2 = driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*What life insurance pay-out would there be[\\s\\S][\\s\\S]*$");
      System.out.println("String is: "+str2);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      //assertTrue(driver.findElement(By.linkText("What pension will I get?")).getText().matches("^[\\s\\S]*What pension will I get[\\s\\S]$"));
      boolean str3 = driver.findElement(By.linkText("What pension will I get?")).getText().matches("^[\\s\\S]*What pension will I get[\\s\\S]$");
      System.out.println("String is: "+str3);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      //assertTrue(driver.findElement(By.linkText("How much do I pay?")).getText().matches("^[\\s\\S]*How much do I pay[\\s\\S]$"));
      boolean str4 = driver.findElement(By.linkText("How much do I pay?")).getText().matches("^[\\s\\S]*How much do I pay[\\s\\S]$");
      System.out.println("String is: "+str4);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("DEFCON103");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.linkText("Select")).click();
    try {
      //assertTrue(driver.findElement(By.linkText("How can I invest?")).getText().matches("^[\\s\\S]*How can I invest[\\s\\S]$"));
      boolean str5 = driver.findElement(By.linkText("How can I invest?")).getText().matches("^[\\s\\S]*How can I invest[\\s\\S]$");
      System.out.println("String is: "+str5);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      //assertTrue(driver.findElement(By.linkText("Where can I invest?")).getText().matches("^[\\s\\S]*Where can I invest[\\s\\S]$"));
      boolean str6 = driver.findElement(By.linkText("Where can I invest?")).getText().matches("^[\\s\\S]*Where can I invest[\\s\\S]$");
      System.out.println("String is: "+str6);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      //assertTrue(driver.findElement(By.linkText("What does the scheme provide?")).getText().matches("^[\\s\\S]*What does the scheme provide[\\s\\S]$"));
      boolean str7 = driver.findElement(By.linkText("What does the scheme provide?")).getText().matches("^[\\s\\S]*What does the scheme provide[\\s\\S]$");
      System.out.println("String is: "+str7);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      //assertEquals(driver.findElement(By.linkText("Frequently asked questions")).getText(), "Frequently asked questions");
      boolean str8 = driver.findElement(By.linkText("What does the scheme provide?")).getText().matches("^[\\s\\S]*Frequently asked questions[\\s\\S]$");
      System.out.println("String is: "+str8);
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("ctl00_ctl00_BaseContentPlaceHolder_LoginStatus")).click();
    
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_UserNameTextBox")).sendKeys("HYD103");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_PasswordTextBox")).sendKeys("password");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_LoginButton")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_btnLogin")).click();
    //driver.findElement(By.linkText("Select")).click();
    try {
      //assertEquals(driver.findElement(By.linkText("Pension planner")).getText(), "My pension planner");
      boolean str9 = driver.findElement(By.linkText("What does the scheme provide?")).getText().matches("^[\\s\\S]*My pension planner[\\s\\S]$");
      System.out.println("String is: "+str9);
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
}
