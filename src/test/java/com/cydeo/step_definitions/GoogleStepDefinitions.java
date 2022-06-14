package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
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
        Driver.getDriver().get("https://www.google.com");
        googleSearchPage.cookiesAcceptButton.click();
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        googleSearchPage.googleSearchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {
        Assert.assertEquals("apple - Google Search",Driver.getDriver().getTitle());
    }
}