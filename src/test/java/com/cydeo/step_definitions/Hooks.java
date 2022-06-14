package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

//in this class we create pre- and post-conditions to each scenario and each step
public class Hooks {
    //import from cucumber NOT from junit
    @Before(order = 0)
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before");
    }
    @Before (value = "@admin" , order = 1)
    public void setupScenarioForLogins(){
        System.out.println("This is an admin specific setup");
    }
    @After
    public void teardownScenario(){
        System.out.println("Closing browser using Cucumber @After");
        Driver.closeDriver();
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("Step will start after this");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("Step is done");
    }
}