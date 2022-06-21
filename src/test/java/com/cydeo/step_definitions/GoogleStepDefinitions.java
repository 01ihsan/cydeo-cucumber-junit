package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Opening google page");
        Driver.getDriver().get("https://www.google.com");
        //googleSearchPage.cookiesAcceptButton.click();
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        System.out.println("Checking page title");
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        System.out.println("Searching for keyword: apple");
        googleSearchPage.googleSearchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
        System.out.println("Checking page title");
        Assert.assertEquals("apple - Google Search",Driver.getDriver().getTitle());
    }

    @When("user types {string} and clicks enter")
    public void userTypesAndClicksEnter(String keyword) {
        System.out.println("Searching for keyword: "+keyword);
        googleSearchPage.googleSearchBox.sendKeys(keyword + Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void userSeesInTheGoogleTitle(String keyword) {
        System.out.println("Checking page title");
        Assert.assertEquals(keyword+" - Google Search",Driver.getDriver().getTitle());
    }
}