package com.stta.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageUser
{
	WebDriver driver;

	@FindBy(id="setupLink")
	WebElement setupLnk;
	
	@FindBy(id="setupSearch") 
	WebElement setupSearch;
	
	@FindBy(id="ManageUsers_font")
	WebElement manageUsers;
	
	@FindBy(name="new")
	WebElement newBtn;
	
	@FindBy(id="name_firstName")
	WebElement firstName;
	
	@FindBy(id="name_lastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Username")
	WebElement username;
	
	@FindBy(id="user_license_id")
	WebElement userLicense;
	
	@FindBy(id="Profile")
	WebElement profile;
	
	@FindBy(id="UserPermissions_0")
	WebElement marketingPermission;
	
	@FindBy(id="role")
	WebElement role;
	
	
	@FindBy(id="EmployeeNumber")
	WebElement employeeNo;
	
	@FindBy(id="00Nw0000008CtHa")
	WebElement notifySSO;
	
	@FindBy(name="save")
	WebElement saveUser;
	
	@FindBy(linkText="Add/Edit User's Organisation")
	WebElement addUserOrgLnk;
	
	@FindBy(id="CF00Nw0000003PEsQ")
	WebElement Org;
	
	
	@FindBy(xpath="//a[contains(@id,'lookup005')]")
	WebElement userLookup;
	
	@FindBy(id="moderatorMutton")
	WebElement userActionMenu;
	
	@FindBy(xpath="//a[@id='USER_DETAIL']/span")
	WebElement userDetailLnk;
	
	@FindBy(linkText="Add/Edit User's Geography")
	WebElement addUserGeogLnk;
	

	@FindBy(id="CF00Nw0000003PEtm")
	WebElement Geog;
	
	@FindBy(id="CommunityNickname")
	WebElement nickName;
	
	
	@FindBy(id="Alias")
	WebElement alias;
	
	@FindBy(name="edit")
	WebElement editBtn;
	
	@FindBy(name="new_password")
	WebElement new_password;
	
	//Reminder Settings
	
	
	@FindBy(id="userNavLabel")
	WebElement userMenu;
	
	@FindBy(linkText="My Settings")
	WebElement settingLnk;
	
	@FindBy(id="CalendarAndReminders_font")
	WebElement calendar_reminder;
	
	@FindBy(css="#Reminders_font > #Reminders_font")
	WebElement activityReminder;
		
	@FindBy(id="enable_reminders")
	WebElement showReminder;
	
	@FindBy(id="USEEDEF")
	WebElement defaultEventReminder;
	
	@FindBy(id="USETDEF")
	WebElement defaultTaskReminder;
	
	//Australia User Specific
	// Add Projects to tab
	
	@FindBy(xpath="//img[@alt='All Tabs']")
	WebElement allTabsImg;
	
	@FindBy(name="customize")
	WebElement customizeName;
	
	@FindBy(id="duel_select_0")
	WebElement availableTabs;
	
	@FindBy(xpath="//img[@alt='Add']")
	WebElement addimg;
	
	//Forecasting User Settings
	@FindBy(xpath="//a[@onclick='searchResultClick.mousedown(this, event)']")
	WebElement userNameOnSearch;
	
	@FindBy(name="editPermSetAssignments")
	WebElement editPermissionSet;
	
	@FindBy(id="j_id0:j_id2:j_id3:permSetAssignSection:pages:duelingListBox:backingList_a")
	WebElement availablePermissionSet;
	
	
	@FindBy(id="j_id0:j_id2:j_id3:permSetAssignSection:pages:duelingListBox:add")
	WebElement addPermissionSet;
	
	@FindBy(id="j_id0:j_id2:j_id3:j_id19:save")
	WebElement savePermissionSet;
	
	@FindBy(id="00Nw00000095SRg")
	WebElement enableCustomForecast;
	
	//Adding Approver's data
	@FindBy(xpath="//div[@id='JLT_Core_Organisation__c_body']/table/tbody/tr[2]/th/a")
	WebElement orgNameOnSearch;
	
	
	@FindBy(id="CF00Nw0000008CtH0")
	WebElement editlocalOpsApprover;
	
	@FindBy(id="CF00Nw0000008CtGx")
	WebElement editlocalRiskUser;
	
	
	public PageUser(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		//This initElements method will create  all WebElements
	}


	public void clickSetupLnk() {
		setupLnk.click();
	}


	public void setSetupSearch(String setupSearchtxt) {
		setupSearch.sendKeys(setupSearchtxt);
	}


	public void clickManageUsers() {
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ManageUsers_font")));
		manageUsers.click();
	}


	public void clickNewBtn() {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("new")));
		
		newBtn.click();
	}


	public void setFirstName(String firstNametxt) {
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name_firstName")));
		firstName.sendKeys(firstNametxt);;
	}


	public void setLastName(String lastNametxt) {
		lastName.sendKeys(lastNametxt);
	}


	public void setEmail(String emailtxt) {
		email.sendKeys(emailtxt);
	}


	public void setUsername(String usernametxt) {
		username.clear();
		username.sendKeys(usernametxt);
	}

	public void setNickName(String nicknametxt) {
		nickName.sendKeys(nicknametxt);
	}


	public void setUserLicense(String userLicensetxt) {
		
		Select license=new Select(userLicense);
		license.selectByVisibleText(userLicensetxt);
	}


	public void setProfile(String profiletxt) {
		Select profilename=new Select(profile);
		profilename.selectByVisibleText(profiletxt);
		
	}


	public void setMarketingPermission() {
		marketingPermission.click();
	}


	public void setRole(String roletxt) {
		
		Select rolename=new Select(role);
		rolename.selectByVisibleText(roletxt);
		
	}


	public void setEmployeeNo(String employeeNotxt) {
		employeeNo.sendKeys(employeeNotxt);;
	}


	public void setNotifySSO() {
		notifySSO.click();
	}


	public void SaveUser() {
		saveUser.click();
	}


	public void clickAddUserOrgLnk() {
		addUserOrgLnk.click();
	}


	public void setOrg(String orgtxt) {
		Org.sendKeys(orgtxt);
	}


	public void clickUserLookup() {
		userLookup.click();
	}


	public void clickUserActionMenu() {
		userActionMenu.click();
	}


	public void clickUserDetailLnk() {
		userDetailLnk.click();
	}


	public void clickAddUserGeogLnk() {
		addUserGeogLnk.click();
	}


	public void setGeog(String geogtxt) {
		Geog.sendKeys(geogtxt);
	}
	
	public void setAlias(String aliastxt) {
		alias.clear();
		alias.sendKeys(aliastxt);
	}
	
	
	public void editUser() {
		editBtn.click();
	}
	
	
	public void setNewPass() {
		new_password.click();
	}


	public void setUserActionMenu() {
		userActionMenu.click();
	}


	public void setUserMenu() {
		userMenu.click();
	}


	public void setSettingLnk() {
		settingLnk.click();
	}


	public void setCalendar_reminder() {
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("CalendarAndReminders_font"))).click().build().perform();
		//calendar_reminder.click();
	}


	public void setActivityReminder() {
		System.out.println("Inside activity1");
		//WebDriverWait wait = new WebDriverWait(driver, 40);
		//wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.cssSelector("#Reminders_font > #Reminders_font"))));
		//activityReminder.click();
		
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.cssSelector("#Reminders_font > #Reminders_font"))).click().build().perform();
		System.out.println("Inside activity2");
		
	}


	public void setShowReminder() {
		System.out.println("Inside showreminder1");
		
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id("enable_reminders"))));
		//showReminder.click();
		
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("enable_reminders"))).click().build().perform();
		System.out.println("Inside showreminder2");
	}


	public void setDefaultEventReminder() {
		
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("USEEDEF"))).click().build().perform();
		System.out.println("Inside default");
		
		//defaultEventReminder.click();
	}


	public void setDefaultTaskReminder() {
		
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("USETDEF"))).click().build().perform();
		
		//defaultTaskReminder.click();
	}


	public void setAllTabsImg() {
		allTabsImg.click();
	}


	public void setCustomizeName() {
		customizeName.click();
	}


	public void setAddimg() {
		addimg.click();
	}


	public void setAvailableTabs(String availableTabstxt) {
		
		Select tab=new Select(availableTabs);
		tab.selectByVisibleText(availableTabstxt);
		
		
	}
	
	public void clickUserName() {
		userNameOnSearch.click();
	}


	public void EditPermissionSet() {
		editPermissionSet.click();
	}


	public void seltAvailablePermissionSet(String availablePermissionSettxt) {
		
		Select permission=new Select(availablePermissionSet);
		
		permission.selectByVisibleText(availablePermissionSettxt);
	}


	public void setAddPermissionSet() {
		addPermissionSet.click();
	}


	public void setEnableCustomForecast() {
		enableCustomForecast.click();
	}
	
	public void savePermissionSet() {
		savePermissionSet.click();
	}


	public void setOrgNameOnSearch() {
		orgNameOnSearch.click();
	}


	public void setEditlocalOpsApprover(String editlocalOpsApprovertxt) {
		editlocalOpsApprover.sendKeys(editlocalOpsApprovertxt);
	}


	public void setEditlocalRiskUser(String editlocalRiskUsertxt) {
		editlocalRiskUser.sendKeys(editlocalRiskUsertxt);
	}
	
	
}
