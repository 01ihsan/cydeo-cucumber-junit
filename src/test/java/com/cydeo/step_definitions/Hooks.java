package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//in this class we create pre- and post-conditions to each scenario and each step
public class Hooks {
    //import from cucumber NOT from junit
    @Before(value = "@employee", order = 1)
    public void setupScenario() {
        System.out.println("Setting up browser using cucumber @Before");
    }

    @Before(value = "@admin", order = 1)
    public void setupScenarioForLogins() {
        System.out.println("This is an admin specific setup");
    }

    @After
    public void teardownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        //Driver.closeDriver();
    }

    @BeforeStep(value = "@admin")
    public void setupStep() {
        System.out.println("A new step is starting...");
    }

    @AfterStep(value = "@admin")
    public void afterStep() {
        System.out.println("The step is done...");
    }
}