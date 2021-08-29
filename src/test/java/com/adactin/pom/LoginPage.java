package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;

	// POM - Page Object Model

	@FindBy(id = "username")
	private WebElement user_name;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;
	
	//@FindBy(xpath = "//table[@class='login']/tbody/tr[2]/td[2]/select[@id='location']")

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUser_name() {
		return user_name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
