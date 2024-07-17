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
  "name": "User adds an item to basket and completes the checkout process",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    },
    {
      "name": "@ui"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the online shopping website",
  "keyword": "Given "
});
formatter.match({
  "location": "JuiceAppSteps.the_user_is_on_the_online_shopping_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds the \"Apple Juice\" item to the basket",
  "keyword": "When "
});
formatter.match({
  "location": "JuiceAppSteps.the_user_adds_the_item_to_the_basket(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user proceeds to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "JuiceAppSteps.the_user_proceeds_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the shipping address",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ]
    },
    {
      "cells": [
        "Name",
        "Aishvarya"
      ]
    },
    {
      "cells": [
        "Street Address",
        "31 Abirami nagar"
      ]
    },
    {
      "cells": [
        "Phone",
        "9999999999"
      ]
    },
    {
      "cells": [
        "Country",
        "India"
      ]
    },
    {
      "cells": [
        "City",
        "Chennai"
      ]
    },
    {
      "cells": [
        "State",
        "TamilNadu"
      ]
    },
    {
      "cells": [
        "ZIP Code",
        "600045"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "JuiceAppSteps.the_user_enters_the_shipping_address(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits the shipping address",
  "keyword": "And "
});
formatter.match({
  "location": "JuiceAppSteps.the_user_submits_the_shipping_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see delivery speed options",
  "keyword": "Then "
});
formatter.match({
  "location": "JuiceAppSteps.the_user_should_see_delivery_speed_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the payment details",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ]
    },
    {
      "cells": [
        "Cardholder Name",
        "Aishvarya"
      ]
    },
    {
      "cells": [
        "Card Number",
        "9876543210988765"
      ]
    },
    {
      "cells": [
        "Expiry Month",
        "3"
      ]
    },
    {
      "cells": [
        "Expiry Year",
        "2080"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "JuiceAppSteps.the_user_enters_the_payment_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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