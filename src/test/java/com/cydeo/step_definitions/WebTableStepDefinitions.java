package com.cydeo.step_definitions;

import com.cydeo.pages.WebTablePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebTableStepDefinitions {
    WebTablePage webTablePage=new WebTablePage();

    @Given("user is on the login page of web table app")
    public void userIsOnTheLoginPageOfWebTableApp() {
        String url = ConfigurationReader.getProperty("webTableUrl");
        Driver.getDriver().get(url);
    }
    @When("user enters username {string}")
    public void userEntersUsername(String arg0) {
        webTablePage.userName.sendKeys(arg0);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String arg0) {
        webTablePage.password.sendKeys(arg0);
    }

    @And("user clicks to login button")
    public void userClicksToLoginButton() {
        webTablePage.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void userShouldSeeUrlContainsOrders() {
        BrowserUtils.verifyURLContains("order");
    }

}
