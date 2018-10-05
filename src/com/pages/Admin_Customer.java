package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class Admin_Customer extends GenericFunctions{
	
	@FindBy(how = How.XPATH, using = "//a[text()='Add Customer']")
	public static WebElement Admin_Add_Customer;	
	
	//click on Add customer under customer in admin tab
	
	public static boolean clickAddCustomer() {
		testStatus=true;
		try {
			
			Admin_Add_Customer.click();
			System.out.println("Successfully clicked on Add customer");
			
		} 
		catch (Exception e) 
		{
			testStatus=false;
			System.out.println(e.getMessage());
		}
		return testStatus;		
		
	}
	
	//-------------------------------------------------------------------------------------------------- 
	//click on Edit customer under customer in admin tab 
	@FindBy(how = How.XPATH, using = "//a[text()='Edit customer']")
	
	public static WebElement Admin_Edit_Customer;
	
	public static boolean clickEditCustomer() {
		testStatus=true;
		try {
			Admin_Edit_Customer.click();
			System.out.println("Successfully clicked on Edit customer");
		} 
		catch (Exception e) 
		{
			testStatus=true;
			System.out.println(e.getMessage());
		}
		return testStatus;
	}
	
	//---------------------------------------------------------------------------------------------------
	//click on Delete customer under customer in admin tab
	
	@FindBy(how = How.XPATH, using = "//a[text()='Delete customer']")
	
	public static WebElement Admin_Delete_Customer;
	
	public static boolean clickDeleteCustomer() {
		testStatus=true;
		
		try {
			Admin_Delete_Customer.click();
			System.out.println("Successfully clicked on Delete customer");
			
		} 
		catch (Exception e) 
		{
			testStatus=false;
			System.out.println(e.getMessage());
		}
		return testStatus;
		
	}
	
}
