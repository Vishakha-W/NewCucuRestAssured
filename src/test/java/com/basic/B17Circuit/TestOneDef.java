package com.basic.B17Circuit;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class TestOneDef {
	Response res;
	

	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() throws Throwable {
		res=RestAssured.given().get("https://ergast.com/api/f1/2017/circuits.json");
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
	 
		
		
	}

	@When("^user checks the count or size$")
	public void user_checks_the_count_or_size() throws Throwable {
		 String limitValue=res.getBody().jsonPath().getString("MRData.limit");
		  Assert.assertEquals("30",limitValue);
		  
		  
		  res.then().assertThat().body("MRData.CircuitTable.Circuits.circuitID",hasSize(20));
		
		
		// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^user checks at path \"([^\"]*)\"$")
	public void user_checks_at_path(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

}
