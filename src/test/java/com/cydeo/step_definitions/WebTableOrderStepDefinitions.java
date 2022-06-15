package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTableOrderStepDefinitions {
    WebTableLoginPage webTablePage= new WebTableLoginPage();
    @Given("user is already logged in and on order page")
    public void userIsAlreadyLoggedInAndOnOrderPage() {
        webTablePage.login("Test","Tester");
    }

    @When("user selects product type {string}")
    public void userSelectsProductType(String arg0) {
    }

    @And("user enters quantity {int}")
    public void userEntersQuantity(int arg0) {
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String arg0) {
    }

    @And("user enters street {string}")
    public void userEntersStreet(String arg0) {
    }

    @And("user enters city {string}")
    public void userEntersCity(String arg0) {
    }

    @And("user enters state {string}")
    public void userEntersState(String arg0) {
    }

    @And("user enters zipcode {string}")
    public void userEntersZipcode(String arg0) {
    }

    @And("user selects credit card type {string}")
    public void userSelectsCreditCardType(String arg0) {
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String arg0) {
    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String arg0) {
    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {
    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String arg0) {
    }
}