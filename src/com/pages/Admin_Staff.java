package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.GenericFunctions;

public class Admin_Staff extends GenericFunctions {
	
//*******************************************************************************************************************************
//AddStaffMember under staff in admin tab
	
@FindBy(how = How.XPATH, using = "//a[text()='Add staff member']") 
public static WebElement Admin_Add_Staff_Member;	

@FindBy(how = How.XPATH, using = "//input[@name='staff_name']")
public static WebElement AddStaff_StaffName;

@FindBy(how = How.XPATH, using = "//input[@name='staff_gender']")
public static WebElement AddStaff_gender;

@FindBy(how = How.XPATH, using = "//input[@name='staff_dob']")
public static WebElement AddStaff_DOB;

@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[4]/td[2]/select/option[1]")
public static WebElement AddStaff_Relationship;

@FindBy(how = How.XPATH, using = "(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr[5]/td[2]/select/option[2]")
public static WebElement AddStaff_Department;

@FindBy(how = How.XPATH, using = "//input[@name='staff_doj']")
public static WebElement AddStaff_DOJ;

@FindBy(how = How.XPATH, using = "//textarea[@name='staff_address']")
public static WebElement AddStaff_Address;

@FindBy(how = How.XPATH, using = "//input[@name='staff_mobile']")
public static WebElement AddStaff_Mobile;

@FindBy(how = How.XPATH, using = "//input[@name='staff_email']")
public static WebElement AddStaff_Emailid;

@FindBy(how = How.XPATH, using = "//input[@name='staff_pwd']")
public static WebElement AddStaff_Password;

@FindBy(how = How.XPATH, using = "//input[@name='add_staff']")
public static WebElement AddStaff_AddStaffMember;


	
@FindBy(how = How.XPATH, using = "//a[text()='Edit staff member']")
public static WebElement Admin_Edit_Staff;

@FindBy(how = How.XPATH, using = "//a[text()='Delete staff']") 
public static WebElement Admin_Delete_Staff;




//Clicking on add staff member under staff in admin tab
public static boolean clickAddStaff(String Sname, String Gen,String DOB,String relation,String dept,String DOJ,String Add,String mbl,String email,String pwd) {
		testStatus=true;
		try{
			
			
			
			AddStaff_StaffName.sendKeys(Sname);
			
			AddStaff_gender.sendKeys(Gen);
			
			AddStaff_DOB.sendKeys(DOB);
			
			AddStaff_Relationship.sendKeys(relation);
			
			AddStaff_Department.sendKeys(dept);
			
			AddStaff_DOJ.sendKeys(DOJ);
			
			AddStaff_Address.sendKeys(Add);
			
			AddStaff_Mobile.sendKeys(mbl);
			
			AddStaff_Emailid.sendKeys(email);
			
			AddStaff_Password.sendKeys(pwd);
			
		
		}
		catch(Exception e) {
			testStatus=false;
			System.out.println(e.getMessage());
		}
		return testStatus;
		
	}

//clicking edit staff member under staff in admin tab
public static boolean clickEditStaff() {
		testStatus=true;
		try {
			
			Admin_Edit_Staff.click();
			System.out.println("Successfully clicked on Edit staff member");
			
		} 
		catch (Exception e) 
		{
			testStatus=false;
			System.out.println(e.getMessage());
		}
		return testStatus;
		
	}
	
	
//clicking delete staff member under staff in admin tab
public static boolean clickDeleteStaff(){
		testStatus=true;
		try {
			
			Admin_Delete_Staff.click();
			System.out.println("Successfully clicked on Delete staff");
			
		} 
		catch (Exception e) 
		{
			testStatus=false;
			System.out.println(e.getMessage());
		}
		return testStatus;
		
	}
	
	
}
