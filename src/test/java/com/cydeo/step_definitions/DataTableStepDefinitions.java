package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableStepDefinitions {
    @Then("user should see fruits I like")
    public void userShouldSeeFruitsILike(List<String> fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(3));
    }
}
