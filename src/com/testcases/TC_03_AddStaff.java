package com.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.genericfunctions.GenericFunctions;
import com.pages.Admin_Home;
import com.pages.Admin_Staff;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_03_AddStaff extends GenericFunctions {	
	
@Given("launch FF browser and open application")
	public static void AddStaffLaunchBrowser(){
		LaunchBrowser("firefox","http://server/bank/");
	}
	
@When("^an application is opened navigate to admin page by giving \"([^\"]*)\" and \"([^\"]*)\"$")
	 public static boolean AdminLogin(String username,String password,DataTable credentials){
		 testStatus=true;
			try{		
				List<List<String>> cred = credentials.asLists(String.class);
				username=cred.get(0).get(0);
				password=cred.get(0).get(1);
				
				
			Admin_Home pge=PageFactory.initElements(driver, Admin_Home.class);
			pge.adminTab.click();
			pge.clickAdminTab(username, password);
			System.out.println("successfully logged into admin tab");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			
			
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			return testStatus;
	 
}

/*@Then("click on add staff member")
public static boolean addStaffButtonClick() {
	
	System.out.println("Successfully clicked on Add staff member");
	return testStatus;
}*/

@Then("Enter credentials for adding staff")
public static boolean addStaffMem(DataTable credentials){

	try {
		
		List<List<String>> cred = credentials.asLists(String.class);
		System.out.println(cred.size());
		
		for(int i= 0; i <= cred.size(); i++){
			Admin_Staff pge1=PageFactory.initElements(driver, Admin_Staff.class);
			pge1.Admin_Add_Staff_Member.click();
		
		String Sname=cred.get(i).get(0);
		String Gen=cred.get(i).get(1);
		String DOB=cred.get(i).get(2);
		String relation=cred.get(i).get(3);
		String dept=cred.get(i).get(4);
		String DOJ=cred.get(i).get(5);
		String Add=cred.get(i).get(6);
		String mbl=cred.get(i).get(7);
		String email=cred.get(i).get(8);
		String pwd=cred.get(i).get(9);
		Admin_Staff pge=PageFactory.initElements(driver, Admin_Staff.class);
		pge.clickAddStaff(Sname, Gen, DOB, relation, dept, DOJ, Add, mbl, email, pwd);
		
		pge.AddStaff_AddStaffMember.click();
		System.out.println("Successfully added details "+i+" time");
		
		}
		
		
	} catch (Exception e) {
		
	}
	return testStatus;
	
	
}



}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/* @Then("verify the staff functionality")
	public static void AddStaffFunction() throws IOException{
		
		
		String[] elementsOrder = {"Staff's name","gender","DOB","Relationship","Department","DOJ","Address","Mobile","Email id","Password"};
		try{
		
			List<WebElement>  ele = driver.findElements(By.xpath("(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr/td[1]"));
			int e = ele.size();
			System.out.println(e);
			for (int i=0;i<e-1;i++){
				//String elem = driver.findElement(By.xpath("(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr/td[1]"))
			//List<WebElement>  ele1 = driver.findElements(By.xpath("(//*[text()='Add Staff'])[2]/ancestor::tr/following-sibling::tr["+i+"]/td[1]"));
				
			String element = ele.get(i).getText();
			//System.out.println(element);
			if(elementsOrder[i].contains(element)){
				System.out.println(element+" is Verified");
			}
			
			}
		}catch(Exception e){
			System.out.println("Elements not printed");
			
		}*/
		//clickElement("//input[@value='ADD STAFF MEMBER']");
		
		/*try{
		List<WebElement> invalidTextFields = driver.findElements(By.cssSelector("input:invalid"));
		int textFieldSize =  invalidTextFields.size();
		System.out.println("invalid text fields "+textFieldSize);
		
		List<WebElement> invalidTextArea = driver.findElements(By.cssSelector("textArea:invalid"));
		int textAreaSize =  invalidTextArea.size();
		System.out.println("invalid text area "+textAreaSize);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
			
		}*/
		
		/*File f = new File("C:\\Users\\TM\\Desktop\\STAFF.xls");
		 FileInputStream fi = new FileInputStream(f);
		 XSSFWorkbook wb = new XSSFWorkbook(fi);
		 XSSFSheet sh = wb.getSheet("Sheet1");
		 int rowcount = sh.getLastRowNum();
		 System.out.printLn(rowcount);
		 
		 for(int l=0;l<=rowcount;l++)
		 {
			 int celcount = sh.getRow(l).getLastCellNum();
			 for(int m=0;m<celcount;m++)
				 String str1 = sh.getRow(l).getCell(m).getStringCellValue();
			 System.out.println(str1);
		 }
		driver.findElement(By.xpath("(//*[text()='Add Staff'])/ancestor::tr/following::tr[7]/td[2]")).sendKeys("Address");
				
		}
		
		
			/*
			
		 
			 driver.findElement(By.cssSelector("input:invalid[1]")).sendKeys("abc");
			String gettext = invalidTextFields[i].get(i).getText();
			System.out.println(gettext);
			System.out.println(size-1);
			invalidTextFields[i].
			}
			*/
			
		
		   
  
	 

