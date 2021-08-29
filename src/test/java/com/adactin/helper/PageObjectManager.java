package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;

public class PageObjectManager {

	public static WebDriver driver;
	
	private LoginPage lp;
	
	//private SearchPage sp;
	
	//private SelectHotel sh;
		

	public PageObjectManager(WebDriver driver2) {
		
		this.driver = driver2;
	}

	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	
	
}
