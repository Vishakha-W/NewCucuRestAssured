package com.basic.GoogleTest;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
//import junit.framework.Assert;

public class TestOneDef {
	Response res;
	@Given("^I want to open google$")
	public void i_want_to_open_google() throws Throwable {
 res=RestAssured.given().get("https://www.google.com/");
	}

	@Then("^I want to check \"([^\"]*)\" status code$")
	public void i_want_to_check_status_code(String arg1) throws Throwable {
	    int Statuscode=Integer.parseInt(arg1);      
		int std=res.getStatusCode();
	          
	          
		Assert.assertEquals(Statuscode,std);
	}
	
	
}
