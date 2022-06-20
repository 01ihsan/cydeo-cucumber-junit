package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrderStepDefinitions {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();

    @Given("user is already logged in and on order page")
    public void userIsAlreadyLoggedInAndOnOrderPage() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTableLoginPage.login("Test", "Tester");
        webTableOrderPage.orderLink.click();
    }

    @When("user selects product type {string}")
    public void userSelectsProductType(String arg0) {
        Select select = new Select(webTableOrderPage.productDropdown);
        select.selectByVisibleText(arg0);
    }

    @And("user enters quantity {int}")
    public void userEntersQuantity(int arg0) {
        webTableOrderPage.productQuantity.sendKeys((arg0 + ""));
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String arg0) {
        webTableOrderPage.inputName.sendKeys(arg0);
    }

    @And("user enters street {string}")
    public void userEntersStreet(String arg0) {
        webTableOrderPage.inputStreet.sendKeys(arg0);
    }

    @And("user enters city {string}")
    public void userEntersCity(String arg0) {
        webTableOrderPage.inputCity.sendKeys(arg0);
    }

    @And("user enters state {string}")
    public void userEntersState(String arg0) {
        webTableOrderPage.inputState.sendKeys(arg0);
    }

    @And("user enters zipcode {string}")
    public void userEntersZipcode(String arg0) {
        webTableOrderPage.inputZip.sendKeys(arg0);
    }

    @And("user selects credit card type {string}")
    public void userSelectsCreditCardType(String arg0) {
        BrowserUtils.clickRadioButtonWithName(webTableOrderPage.inputCardType,arg0);
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String arg0) {
        webTableOrderPage.inputCardNo.sendKeys(arg0);
    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String arg0) {
        webTableOrderPage.inputCardExp.sendKeys(arg0);
    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {
        webTableOrderPage.processOrderButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String arg0) {
        Assert.assertTrue(webTableOrderPage.nameCheck.getText().equalsIgnoreCase(arg0));
    }
}