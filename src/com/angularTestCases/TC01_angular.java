package com.angularTestCases;

import org.openqa.selenium.By;

import com.genericfunctions.GenericFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TC01_angular extends GenericFunctions{
	
@Given("i want to launch firefox browser and open application")
	
	public static void LaunchAngularMaterialApplication(){
		
		LaunchBrowser("firefox","https://material.angular.io/");
		
}


	
}
