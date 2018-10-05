package com.testcases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.genericfunctions.GenericFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_01_BrokenLinksValidation extends GenericFunctions {
	@Given("As an user i want to launch firefox browser")
	
	public static boolean LaunchApplication(){
		testStatus=true;
		try{
		LaunchBrowser("firefox","http://server/bank/");
		}
		catch(Exception e) {
			
			testStatus=false;
			System.out.println(e.getMessage());
		}
		return testStatus;
		
		
	}
	@When("an application is opened verify home page is displayed")
	
	public static boolean VerifyingHomePage(){
		testStatus=true;
		try{
			VerifyHome("Click to read safe online banking tips");
		}
		catch(Exception e) {
			
			testStatus=false;
			System.out.println(e.getMessage());
		}
		return testStatus;
		}

	@Then("verify the tabs order")
	
	public static void verifyTabsOrder() {
		TabsOrder("//div[@class='wrapper']/div[2]/ul/li",Hometabs);
	}
	
	
	@Then("verify the broken links")
	
	public static boolean VerifyBrokenLinks() {
		
		
		//String[] adminTabLinks = {"Admin Home","Change password","Logout","Add staff member","Edit staff member","Delete staff","Add Customer","Edit customer","Delete customer"};
		
		testStatus=true;
		List<WebElement> links = driver.findElements(By.xpath("html/body/div/div[4]/div/a"));
		int n = links.size();
		System.out.println(n);
			
		try{
						
			
			for(int i=0;i<n;i++)
			{
				String ur = links.get(i).getAttribute("href");
				//System.out.println(ur);
				
				HttpConn(ur);
				
					}
			}
			catch(Exception e){
				testStatus=false;
				System.out.println(e.getMessage());
				System.out.println("verification of broken links failed");
			}
		return testStatus;
		}
	
		
	
	
	}		
	

	
		
	
