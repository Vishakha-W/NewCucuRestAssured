package com.basic.allfileinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestOneDef {

	protected WebDriver driver;
	@Given("the user is on facebook login page")
	public void the_user_is_on_facebook_login_Page()
	{
		
		System.setProperty("webdriver.chrome.driver","G:\\Radical\\Selinium\\chromedriver_win32_B45\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
	}
	
	@When("^he enter \"([^\"]*)\" as user name$")
	public void he_enter_as_user_name(String username) {
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys(username);
	}

	@When("^he enter \"([^\"]*)\" as password$")
	public void he_enter_as_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^i am check facebook login page$")
	public void i_am_check_facebook_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
	
}
