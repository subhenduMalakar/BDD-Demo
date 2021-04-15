package com.cucumber.stepdef;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class postStepDefinition {

    @Given("^Site should be available$")
    public void site_should_be_available() throws Throwable {
        System.out.println("Site should be available");
    }

    @When("^i clicked on the play button$")
    public void i_clicked_on_the_play_button() throws Throwable {
    	 System.out.println("i clicked on the play button");
    }

    @When("^i clicked on search button$")
    public void i_clicked_on_search_button() throws Throwable {
        System.out.println("i clicked on search button");
    }

    @Then("^the video should start$")
    public void the_video_should_start() throws Throwable {
    	System.out.println("the video should start");
    }

    @Then("^proper search result should display$")
    public void proper_search_result_should_display(DataTable arg1) throws Throwable {
    	System.out.println("proper search result should display");
    	List<List<String>> l=arg1.raw();
    	for (List<String> i:l)
    	{
    		for (String j:i)
    		{
    			System.out.println("The table data "+j);
    		}
    	}
    }
    @Then("^the video should \"([^\"]*)\"$")
    public void the_video_should(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Input text--->"+arg1);
    }
    
    
    @Given("^a precondition has value \"([^\"]*)\"$")
    public void a_precondition_has_value(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Data : "+ arg1);
    }

    @Given("^something with \"([^\"]*)\"$")
    public void something_with(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Data : "+ arg1);
    }

    @Then("^check \"([^\"]*)\" is the output$")
    public void check_is_the_output(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Data : "+ arg1);
    }
}
