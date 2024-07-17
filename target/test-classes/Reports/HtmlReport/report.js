$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Juiceshop.feature");
formatter.feature({
  "name": "Online Shopping Checkout Process",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.scenario({
  "name": "To validate the api for add a unique card details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    },
    {
      "name": "@api"
    }
  ]
});
formatter.step({
  "name": "Add the base uri",
  "keyword": "Given "
});
formatter.match({
  "location": "CardAPITest.add_the_base_uri()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "call the GET method with card details api to get added card details",
  "keyword": "When "
});
formatter.match({
  "location": "CardAPITest.call_the_get_method_with_card_details_api_to_get_added_card_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the card details added is the payment options",
  "keyword": "Then "
});
formatter.match({
  "location": "CardAPITest.verify_the_card_details_added_is_the_payment_options()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});