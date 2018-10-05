package com.genericfunctions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericFunctions {
	public static WebDriver driver;
	public static String[] Hometabs = {"Home","Admin","Staff","Features","Contact Us"};
	
	public static boolean testStatus;
	
	public static boolean LaunchBrowser(String browser,String url){
		boolean status = true;
		try{
		switch (browser.toLowerCase()) {
		case "firefox":
			
			driver = new FirefoxDriver();			
			break;
			
		case "chrome":	
			//System.setProperty("webdriver.chrome.driver", value)
			//driver = new ChromeDriver();
			break;			

		default:		
			
			break;			
		} 
		
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		}
		catch(Exception e){
			status = false;
			System.out.println(e.getMessage());
		}
		return status;
		}


		public static boolean VerifyHome(String value){
			boolean status = true;
			try{
				driver.findElement(By.linkText(value)).isDisplayed();
			System.out.println("Home page is displayed");
			}
			catch(Exception e){
				
			System.out.println("Home page is not displayed");
			
			}
			return false;
			
		}

		public static boolean HttpConn(String currentURL) {
			boolean status = true;
			try{
			URL url = new URL(currentURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			Thread.sleep(3000);
			con.connect();
			int responseCode = con.getResponseCode();
			System.out.println(responseCode);
			if(responseCode == 200) {
				System.out.println(currentURL+"  is not broken");
			}
			else{
				System.out.println(currentURL+"  is broken");
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("failed");
			}
			return false;
			
		}
		
		
		public static boolean sendText(String xpath,String value){
			boolean status = true;
			try{
				driver.findElement(By.xpath(xpath)).clear();
				driver.findElement(By.xpath(xpath)).sendKeys(value);
			System.out.println("Text entered successfully");
			}
			catch(Exception e){
				
			System.out.println("Text not entered");
			
			}
			return false;
			
		}
		public static boolean clickElement(String xpath){
			boolean status = true;
			try{
				
				driver.findElement(By.xpath(xpath)).click();
			System.out.println("Button clicked ");
			}
			catch(Exception e){
				
			System.out.println("Button not clicked");
			
			}
			return false;
			
		}
		public static boolean textVerify(String linktext){
			boolean status = true;
			try{
				
				driver.findElement(By.linkText(linktext)).isDisplayed();
			System.out.println("Text displayed");
			}
			catch(Exception e){
				
			System.out.println("Text not sdisplayed");
			
			}
			return false;
			
		
}
		public static boolean adminLinks(String linktext){
			boolean status = true;
			try{
				
				driver.findElement(By.linkText(linktext)).isDisplayed();
			System.out.println("Text displayed");
			}
			catch(Exception e){
				
			System.out.println("Text not sdisplayed");
			
			}
			return false;
			
		
}

		public static void TabsOrder(String listXpath,String options[]) {
			
			String[] tabs = {"Home","Admin","Staff","Features","Contact Us"};
			
			try{
			List<WebElement> tabslist = driver.findElements(By.xpath(listXpath));
			int a = tabslist.size();
			System.out.println(a);
			
			for(int i=0;i<a;i++){
				String tabsText = tabslist.get(i).getText();
				System.out.println(tabsText);
				
				if(options[i].contentEquals(tabsText))
				{
					System.out.println(tabsText+" is Verified");
				}
			}
			}
			catch(Exception e){
				System.out.println("Tabs not displayed");
			}
			
		}
}