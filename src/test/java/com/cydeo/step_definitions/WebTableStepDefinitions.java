package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTableStepDefinitions {
    WebTableLoginPage webTablePage = new WebTableLoginPage();

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
        System.out.println(Driver.getDriver().getTitle());
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String arg0, String arg1) {
        webTablePage.login(arg0, arg1);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
        webTablePage.userName.sendKeys(credentials.get("username"));
        webTablePage.password.sendKeys(credentials.get("password"));
        webTablePage.loginButton.click();
        //webTablePage.login(credentials.get("username"),credentials.get("password"));
    }
}
