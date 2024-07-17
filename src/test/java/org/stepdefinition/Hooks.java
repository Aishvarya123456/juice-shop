package org.stepdefinition;

import org.pageobjects.Locators;
import org.utilities.UtilityClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends UtilityClass {
	
	@Before("not @api")
	public void beforeScenario() {
		browserLaunch();
		urlLaunch(getPropertyValue("url"));
		implicitywait(20);
		Locators l = new Locators();
		click(l.getDismiss());
		click(l.getBtnlogin());
		click(l.getLoginbtn());
		sendkeys(l.getTxtuser(),getPropertyValue("username"));
		sendkeys(l.getTxtpass(),getPropertyValue("password"));
		click(l.getLogin());
	
		
		
		
		
	}
	@After
	public void tearDown() {
//		quit();
	}
	

}
