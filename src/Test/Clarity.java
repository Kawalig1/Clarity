/*package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Driver;
//import org.sikuli.script.App;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
import java.util.List;
public class Clarity {

       public static void main(String[] args) {
              // TODO Auto-generated method stub
              
              System.out.println("Hello");
              WebDriver driver;
              System.setProperty("webdriver.ie.driver", "C:\\Program Files\\BrowserDrivers\\IEDriverServer.exe");
       
              DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
              cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
              cap.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
              cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
              cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
              cap.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://ukpc32427/PremierFoods-ClarityAdmin1.5.0/Login.aspx");
        
              driver = new InternetExplorerDriver(cap);
              driver.manage().window().maximize();
              driver.navigate().to("http://ukpc32427/PremierFoods-ClarityAdmin1.5.0/Login.aspx");
                     
              
              
              driver.findElement(By.id("UserNameTextBox")).sendKeys("superadmin");
              driver.findElement(By.id("PasswordTextBox")).sendKeys("password");
              driver.findElement(By.id("LoginButton")).click();
              
              List<WebElement> txtfields = driver.findElements(By.tagName("a"));
              
              String[] Id_list = new String[1000];
              
              System.out.println(txtfields.size());
              
              for(int a=0; a<txtfields.size();a++){   
                        //txtfields.get(a).sendKeys("Text"+(a));  
                        System.out.println(txtfields.get(a).getAttribute("id") +" "+ txtfields.get(a).getAttribute("text"));
                        
                        String Linkelement = txtfields.get(a).getAttribute("id");
                        
                        Id_list[a] = Linkelement;
                        
                        //System.out.println(Linkelement);
                       
                        
                       }
              
              String abc = Id_list[1].toString();
              
              System.out.println("Name of the control" + abc);
              
              driver.findElement(By.id(abc)).click();
                           
              for(int a=3; a<Id_list.length;a++){   
                        //txtfields.get(a).sendKeys("Text"+(a));  
                     
                     //System.out.println(Id_list[a]);               
                     String id_name;                   
                     id_name = Id_list[a];      
                     System.out.println(id_name);      
                     driver.findElement(By.id(id_name)).click();     
                                         
                     driver.navigate().back();                
                     if (Id_list[a]==null) 
                           
                     {                                 
                    break;                         
                     }
       
              
              }

       }
       
}
*/