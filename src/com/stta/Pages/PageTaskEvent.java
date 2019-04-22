package com.stta.Pages;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageTaskEvent
{
	//private static final String WebElement = null;


	WebDriver driver;
	

	@FindBy(name="task")
	WebElement taskbtn;
		
	@FindBy(name="event")
	WebElement eventbtn;
	
	@FindBy(id="tsk5")
	WebElement taskSub;
		
	@FindBy(id="00N20000001inA4")
	WebElement taskActType;
	
	@FindBy(id="tsk4")
	WebElement taskDueDate;
	

	@FindBy(id="tsk6")
	WebElement taskComments;
	
	
	@FindBy(id="00Nw0000003PMXE")
	WebElement taskActRolType;
	
	@FindBy(id="tsk12")
	WebElement taskStatus;

	@FindBy(id="tsk13")
	WebElement taskPriority;
	
	@FindBy(id="CF00Nw0000008v2eW")
	WebElement taskMutualAct;
	
	@FindBy(id="00Nw0000003PKQ9")
	WebElement taskProjectType;
	
	@FindBy(name="save")
	WebElement taskSaveBtn;
	
	
	@FindBy(id="evt5")
	WebElement evntSub;
		
	@FindBy(id="StartDateTime")
	WebElement taskStrtDate;
	
	@FindBy(id="EndDateTime")
	WebElement taskEndDate;
	

	@FindBy(id="evt6")
	WebElement evntDescp;
	
	
	@FindBy(id="00Nw0000003PMXE")
	WebElement evntActRolType;
	
	
	@FindBy(id="CF00Nw0000008v2eW")
	WebElement evntMutualAct;

		
	@FindBy(id="00Nw0000003PKQ9")
	WebElement evntProjectType;
	
	@FindBy(xpath="(//input[@name='save'])[2]")
	WebElement evntSaveBtn;
	
	@FindBy(id="j_id0:Activities_listSelect")
	WebElement activityView;
	
	@FindBy(id="j_id0:Activities_listBody")
	WebElement activityListBody;
	
	@FindBy(xpath="//img[@alt='Checked']")
	WebElement taskCheck;
	
	
	@FindBy(xpath="//img[@alt='Checked']")
	WebElement eventCheck;
	
	@FindBy(xpath="//a[@id='whobtn']/img")
	WebElement multipleContactLookup;
	
	@FindBy(id="mw_picker_search_btn")
	WebElement findBtn;
	
	@FindBy(xpath="//li/span/span[2]")
	WebElement availableContact;
	
	@FindBy(xpath="//a[@id='mw_picker_add_button']/div")
	WebElement addArrow;
	
	@FindBy(id="mw_picker_save_btn")
	WebElement multipleContactSave;
	
	@FindBy(xpath="//div[@id='ext-gen15']/div/table/thead/tr/td[12]/div")
	WebElement createDateSort;
	
	public PageTaskEvent(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		//This initElements method will create  all WebElements
	}




	public void clickTaskbtn() {
		taskbtn.click();
	}


	public void clickEventbtn() {
		eventbtn.click();
	}


	public void setTaskSub(String strtaskSub) {
		taskSub.sendKeys(strtaskSub);
	}


	public void setTaskActType(String strtaskActType) {
		//taskActType = taskActType;
		Select taskActType1 = new Select(taskActType);
		taskActType1.selectByVisibleText(strtaskActType);
	}


	public void setTaskDueDate() {
		taskDueDate.click();
		driver.findElement(By.xpath("//img[@alt='Next Month']")).click(); //click next month
		driver.findElement(By.xpath("(//td[@onclick='DatePicker.datePicker.selectDate(this);'])[27]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
	}


	public void setTaskComments(String strtaskComments) {
		taskComments.sendKeys(strtaskComments);
	}


	public void setTaskActRolType(String strtaskActRolType) {
		if (driver.findElements(By.id("00Nw0000003PMXE")).size() != 0) 
		{
		Select taskActRoleType1 = new Select(taskActRolType);
		taskActRoleType1.selectByVisibleText(strtaskActRolType);
		}
	}


	public void setTaskStatus(String strtaskStatus) {
		
		Select taskStatus1 = new Select(taskStatus);
		taskStatus1.selectByVisibleText(strtaskStatus);
	}


	public void setTaskPriority(String strtaskPriority) {
		//this.taskPriority = taskPriority;
		Select taskPriority1 = new Select(taskPriority);
		taskPriority1.selectByVisibleText(strtaskPriority);
	}


	public void setTaskMutualAct(String strtaskMutualAct) {
		taskMutualAct.sendKeys(strtaskMutualAct);
	}


	public void setTaskProjectType(String strtaskProjectType) {
		if (driver.findElements(By.id("00Nw0000003PMXE")).size() != 0) 
		{
		Select taskProjectType1 = new Select(taskProjectType);
		taskProjectType1.selectByVisibleText(strtaskProjectType);
		}
	}


	public void setTaskSaveBtn() {
		taskSaveBtn.click();
	}

	public void setEvntSub(String strevntSub) {
		evntSub.sendKeys(strevntSub);
	}


	public void setEvntStrtDate() {
		taskStrtDate.click();
		driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
	}


	public void setEvntEndDate() {
		taskEndDate.click();
		driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
	}


	public void setEvntDescp(String strtaskDescp) {
		evntDescp.sendKeys(strtaskDescp);
	}


	public void setEvntActRolType(String strevntActRolType) {
		Select evntActRolType1 = new Select(evntActRolType);
		evntActRolType1.selectByVisibleText(strevntActRolType);
	}


	public void setEvntMutualAct(String strevntMutualAct) {
		if (driver.findElements(By.id("CF00Nw0000008v2eW")).size() != 0) 
		{
		evntMutualAct.sendKeys(strevntMutualAct);
		}
	}


	public void setEvntProjectType(String strevntProjectType) {
		
		
		if (driver.findElements(By.id("00Nw0000003PKQ9")).size() != 0) 
		{
		Select evntProjectType1 = new Select(evntProjectType);
		evntProjectType1.selectByVisibleText(strevntProjectType);
		}
	}

	public void setEvntSaveBtn() {
		evntSaveBtn.click();
	}


	public boolean getTaskCheck() {
		return taskCheck.isDisplayed();
	}


	public boolean getEventCheck() {
		return eventCheck.isDisplayed();
	}
	
	public void clickActivityView(String stractivityViewtxt) {
		activityView.click();
		
		Select activityViewtxt = new Select(activityView);
		activityViewtxt.selectByVisibleText(stractivityViewtxt);
		
		
	}


	public String getActivityListBody() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_id0:Activities_listBody")));
		
		return activityListBody.getText();
	}


	public void clickMultipleContactLookup() {
		multipleContactLookup.click();
	}


	public void clickFindBtn() {
		findBtn.click();
	}


	public void selAvailableContact() {
		availableContact.click();
	}


	public void addContact() {
		addArrow.click();
	}


	public void saveMultipleContact() {
		multipleContactSave.click();
	}
	
	
	public void sortByCreateDate() {
		createDateSort.click();
	}
	

}


