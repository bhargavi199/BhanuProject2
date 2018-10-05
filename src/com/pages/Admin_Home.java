package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class Admin_Home extends GenericFunctions {

	
	
	@FindBy(how = How.XPATH, using = "(//a)[2]")
	public static WebElement adminTab;
	

	@FindBy(how = How.XPATH, using ="//input[@name='uname']")
	public static WebElement admin_Login_username;
	
	@FindBy(how = How.XPATH, using ="//input[@name='pwd']")
	public static WebElement admin_Login_password;
	
	@FindBy(how = How.XPATH, using ="//input[@name='submitBtn']")
	public static WebElement admin_Login_button_click;
	
	@FindBy(how = How.XPATH,using = "(//a)[text()='Admin Home']")
	public static WebElement Admin_AdminHome ;
	
	@FindBy(how = How.XPATH,using = "(//a)[text()='Change password']")
	public static WebElement Admin_ChangePassword ;

	@FindBy(how = How.XPATH, using = "(//a)[text()='Logout']")
	public static WebElement Admin_LogOut; 
	
	@FindBy(how = How.XPATH, using = "(//a)[1]")
	public static WebElement Home; 
	
	
	//***********************************  Test Objects ********************************
	
	
	//------------------------- Menu--------------------
	//Click on admin tab
	

	
 	
	
	public static boolean clickAdminTab(String username,String password) {
				
			testStatus = true;
			
		try{
			
			
				//adminTab.click();
				//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				admin_Login_username.clear();
				admin_Login_username.sendKeys(username);
				admin_Login_password.clear();
				admin_Login_password.sendKeys(password);
				admin_Login_button_click.click();
				//clickAdminLogout();
				
				//Home.click();
					
		}
		
		catch (Exception e)
		{
			testStatus = false;
			System.out.println(e.getMessage());
			
		}
		return testStatus;
		
		}

	public static boolean clickAdminHomePage() {
		testStatus=true;
		try {
			
			Admin_AdminHome.click();
			System.out.println("Successfully clicked on Admin Home");
			
		} 
		catch (Exception e) 
		{
			testStatus=false;
			System.out.println(e.getMessage());
			//System.out.println(testStatus);
			
		}
		return testStatus;
		 
	}
	
	
	
	public static boolean clickChangePassword() {
		testStatus=true;
		try {
			
			Admin_ChangePassword.click();
			System.out.println("Successfully clicked on Change Password");
			
		} 
		catch (Exception e) 
		{
			testStatus=false;
			System.out.println(e.getMessage());
			
		}
		return testStatus;
	}
	
	@FindBy(how = How.XPATH,using = "")
	public static WebElement Admin_Logout ;
	
	public static boolean clickAdminLogout() {
		testStatus=true;
		try {
			Admin_Logout.click();
			System.out.println("Successfully clicked on Logout");
			
		} 
		catch (Exception e) 
		{
			testStatus=false;
			System.out.println(e.getMessage());
		}
		return testStatus;
	}
	
	
}


		
		
