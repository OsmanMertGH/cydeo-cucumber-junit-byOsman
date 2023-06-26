package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    //import form io.cucumber.java not from junit
    @Before
    public void setupScenario() {
        System.out.println("=====Setting up browser using cucumber @Before");
    }

    //@Before (value = "@login", order = 2)
    public void setupScenarioForLogins() {
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    @After
    public void teardownScenario(Scenario scenario) {

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
        System.out.println("=====Closing browser using cucumber @After");
        //System.out.println("=====Scenario ended/ Take screenshot if failed!");
    }

    // @BeforeStep
    public void setupStep() {
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep() {
        System.out.println("--------> applying tearDown using @AfterStep");
    }

}
