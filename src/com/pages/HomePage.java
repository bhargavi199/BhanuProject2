package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class HomePage extends GenericFunctions{		
	
	@FindBy(how = How.XPATH, using = "(//a)[3]")
	public static WebElement staffTab; 
	
	@FindBy(how = How.XPATH, using = "(//a)[4]")
	public static WebElement featuresTab; 
	
	@FindBy(how = How.XPATH, using = "(//a)[5]")
	public static WebElement contactusTab;  
	
	@FindBy(how = How.XPATH, using = "")
	public static WebElement Secure_Login; 	
	public static WebElement Username;
	public static WebElement Passwrod;
	
	@FindBy(how = How.XPATH, using = "(//a/h3)[1]")
	public static WebElement Secure_Login_Tips;
	
	@FindBy(how = How.XPATH, using = "(//a/h3)[2]")
	public static WebElement Terms_And_Conditions; 
	
	@FindBy(how = How.XPATH, using = "(//a/h3)[3]")
	public static WebElement FAQ; 
	
	//Click on staff tab
	public static boolean clickStaffTab() {
		testStatus=true;
		
		try {
			staffTab.click();
			System.out.println("Successfully clicked on Staff Tab");
			
		}
		catch(Exception e)
		{
			testStatus=false;
			System.out.println(e.getMessage());
		}
		return testStatus;
	}
	

		
	 	
		
		
		
//Click on Features tab  	
		
	public static boolean clickFeaturesTab() {
			try {
				testStatus=true;
				featuresTab.click();
				System.out.println("Successfully clicked on Features Tab");
				
			}
			catch(Exception e)
			{
				testStatus=false;
				System.out.println(e.getMessage());
			}
			return testStatus;
		}

//Click on contact us tab
		public static boolean clickContactUsTab() {
			try {
				testStatus=true;
				contactusTab.click();
				System.out.println("Successfully clicked on ContactUs Tab");
			}
			catch(Exception e){
				testStatus=false;
				System.out.println(e.getMessage());
			}
			return testStatus;
		}
		
//Secure log in
		public static boolean HomeSecureLogin() {
			try {
				testStatus=true;
				Username.sendKeys("user02");
				Passwrod.sendKeys("pass1234");
				Secure_Login.click();
				System.out.println("Login Successful");
			}
			catch(Exception e){
				testStatus=false;
				System.out.println(e.getMessage());
			}
			return testStatus;
		}

		
public static boolean HomeSecureLoginTips() {
			testStatus=true;
			try {
			
				Secure_Login_Tips.click();
				System.out.println("Secure login tips link clicked Successfully");
			}
			catch(Exception e){
				testStatus=false;
				System.out.println(e.getMessage());
			}
			return testStatus;
		}
		
		
public static boolean HomeTermsAndConditions() {
			testStatus=true;
			try {
				
				Secure_Login_Tips.click();
				System.out.println("Terms and Conditions link clicked Successfully");
			}
			catch(Exception e){
				testStatus=false;
				System.out.println(e.getMessage());
			}
			return testStatus;
		}
		
		
public static boolean HomeFAQ(){
			testStatus=true;
			try {
				
				FAQ.click();
				System.out.println("FAQ's link clicked Successfully");
			}
			catch(Exception e){
				testStatus=false;
				System.out.println(e.getMessage());
			}
			return testStatus;
		}

		

}
