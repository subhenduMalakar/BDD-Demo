package com.cucumber.api.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	@Before
	public void DriverSetup(Scenario name)
	{
		System.out.println("=====Driver Setup=====");
		System.out.println("Name "+name.getName());
		System.out.println("Status "+name.getStatus());
	}
	@After
	public void quit(Scenario name)
	{
		System.out.println("=====Driver quit=====");
		System.out.println("Name: "+name.getName());
		System.out.println("Status: "+name.getStatus());
	}
}
