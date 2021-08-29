package com.adactin.runner;


import java.io.IOException;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
					glue = "com\\adactin\\stepdefinition",
					monochrome = true, //to avoid special characters
					dryRun = false,
					strict = true
					//tags = {"~@Login"}
		)

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		
		String browserName = FileReaderManager.getInstance().getCrInstance().getBrowserName();
		driver = BaseClass.browserLaunch(browserName);
	}

	@AfterClass
	public static void tearDown() {

		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
