package org.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.pageobjects.Cards;
import org.pageobjects.Datas;
import org.utilities.UtilityClass;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CardAPITest extends UtilityClass{
	RequestSpecification reqSpec;
	Response res;

	@Given("Add the base uri")
	public void add_the_base_uri() {
		RestAssured.baseURI = "http://localhost:3000/";
		reqSpec = RestAssured.given()
				             .log().all()
				             .header("Authorization", "Bearer " + getPropertyValue("token"))
				             .header("Content-Type", "application/json");
		

	}

	@When("call the GET method with card details api to get added card details")
	public void call_the_get_method_with_card_details_api_to_get_added_card_details() {
		res = reqSpec.when().get("api/Cards");
	}

	@Then("Verify the card details added is the payment options")
	public void verify_the_card_details_added_is_the_payment_options() {
		res = res.then()
				 .log().all()
				 .assertThat().statusCode(200)
				 .extract().response();
		
		String resBody = res.getBody().asString();
		System.out.println(resBody);
		
		Cards cards = res.as(Cards.class);
		
		List<Datas> data = cards.getData();
		List<Datas> dp= new ArrayList<Datas>();
		
		for(int i=0; i<data.size()-1; i++) {
			for(int j=i+1; j<data.size(); j++) {
				if(data.get(i).equals(data.get(j))) {
					dp.add(data.get(i));
				}
			}
			
		}
		if(dp.size()==0) {
			System.out.println("All cards are Unique");
		}
		else {
			System.out.println(dp+" these are the cards are Not unique");
		}
		
	}

}
