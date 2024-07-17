package org.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.pageobjects.Locators;
import org.utilities.UtilityClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JuiceAppSteps extends UtilityClass {

	Locators l = new Locators();

	@Given("the user is on the online shopping website")
	public void the_user_is_on_the_online_shopping_website() {
//		Assert.assertTrue(getCurrentUrl().contains("search"));
	}

	@When("the user adds the {string} item to the basket")
	public void the_user_adds_the_item_to_the_basket(String string) throws InterruptedException {
		click(l.getClick());
		click(l.getAddtocart());
		System.out.println(getText(l.getAddtocart()));

	}

	@When("the user proceeds to checkout")
	public void the_user_proceeds_to_checkout() {
		click(l.getCheck());
	}

	@When("the user enters the shipping address")
	public void the_user_enters_the_shipping_address(io.cucumber.datatable.DataTable address) {
		Map<String, String> mp = address.asMap(String.class, String.class);
		l.selectAddress(mp);
	}

	@When("the user submits the shipping address")
	public void the_user_submits_the_shipping_address() {
		click(l.getCon());
	}

	@Then("the user should see delivery speed options")
	public void the_user_should_see_delivery_speed_options() {
		l.selectDeliveryType();
	}

	@When("the user enters the payment details")
	public void the_user_enters_the_payment_details(io.cucumber.datatable.DataTable card) {
		click(l.getAddnewcart());
		Map<String, String> m2 = card.asMap(String.class, String.class);
		l.addCardDetails(m2.get("Cardholder Name"), m2.get("Card Number"), m2.get("Expiry Month"),
				m2.get("Expiry Year"));

	}

}
