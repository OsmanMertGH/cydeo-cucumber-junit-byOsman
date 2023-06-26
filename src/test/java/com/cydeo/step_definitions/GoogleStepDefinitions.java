package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {
    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);


    }


    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types apple and clicks enter")
    public void userTypesAppleAndClicksEnter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees apple in the google title")
    public void userSeesAppleInTheGoogleTitle() {

        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected,second arg as actual
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user types {string} and clicks enter")
    public void userTypesAndClicksEnter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void userSeesInTheGoogleTitle(String searchKeyword) {
        String expectedTitle = searchKeyword + " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

        //Junit assertion accepts first arg as expected,second arg as actual
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
