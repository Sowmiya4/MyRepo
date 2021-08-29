package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User launch url of adactin application$")
	public void user_launch_url_of_adactin_application() throws Throwable {

		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);

	}

	@When("^User enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {

		inputOnElement(pom.getLp().getUser_name(), arg1);
	}

	@When("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {

		inputOnElement(pom.getLp().getPassword(), arg1);
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
		clickOnElement(pom.getLp().getLogin());
	}

	@Then("^User validate login button$")
	public void user_validate_login_button() throws Throwable {

	}

}
