package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTableStepDefinitions {
    @Then("user should see fruits I like")
    public void userShouldSeeFruitsILike(List<String> fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(3));
    }
    DropdownsPage dropdownsPage = new DropdownsPage();
    @Given("User is on the dropdown page of the practice")
    public void userIsOnTheDropdownPageOfThePractice() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @Then("User should see below info in months dropdown")
    public void userShouldSeeBelowInfoInMonthsDropdown(List<String> expectedMonths) {
        List<String> actualOptionsAsString=BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);
        Assert.assertEquals(expectedMonths,actualOptionsAsString);
    }
}
