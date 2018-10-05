package com.testcases;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.genericfunctions.GenericFunctions;
import com.pages.Admin_Home;
import com.pages.HomePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_02_AdminPage extends GenericFunctions {
@Given("launch browser and open application")
	public static boolean AdminLaunchBrowser(){
		return LaunchBrowser("firefox","http://server/bank/");
	}
	 
@When("an application is opened verify again home page is displayed")
	 public static boolean AppHome(){
		 return VerifyHome("Click to read safe online banking tips");
		 
	 }
				
		
@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
		
	public static boolean logintoadmin(String username,String password,DataTable credentials) {
			
			testStatus=true;
			try{
				
				
			List<List<String>> cred = credentials.asLists(String.class);
			
			//for(List<String> cre : cred){
				System.out.println(cred.size());
				for(int i= 0; i <= cred.size(); i++){
			
				username=cred.get(i).get(0);
				password=cred.get(i).get(1);
				
				
			Admin_Home pge=PageFactory.initElements(driver, Admin_Home.class);
			
			pge.adminTab.click();
			pge.clickAdminTab(username, password);
			System.out.println("successfully executed");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			pge.Admin_LogOut.click();
			System.out.println("successfully log out");
			
			if(i<cred.size()-1){
			pge.Home.click();
			}
			
			}
				
				
			//}
			}
			catch(Exception e) {
				
				testStatus=false;
				System.out.println(e.getMessage());
				
			}
			return testStatus;
		
		}
				
	/* 	
@Then("test each link")
	public static boolean VerifyBrokenLinks() {
	testStatus=true;
		List<WebElement> links = driver.findElements(By.xpath("//a[text()='Admin Home']/ancestor::div/div[3]/div/ul/li/a"));
		int n = links.size();
		System.out.println(n);
				
		try{
												
				
			for(int i=0;i<n;i++){
				String Turl = links.get(i).getAttribute("href");
				System.out.println(Turl);
				HttpConn(Turl);
					
					}
				}
			catch(Exception e){
				testStatus=false;
				System.out.println(e.getMessage());
				System.out.println("verification of broken links in admin section failed");
			}
		return testStatus;
		} */
		
	}		
	
	

