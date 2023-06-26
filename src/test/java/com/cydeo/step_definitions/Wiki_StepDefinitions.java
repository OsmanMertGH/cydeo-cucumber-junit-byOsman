package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Wiki_StepDefinitions {

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    WikiSearchPage wikiSearchPage=new WikiSearchPage();
    @When("User types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String string) {
        wikiSearchPage.searchBoxWiki.sendKeys(string);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchBtn.click();
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String string) {
        Assert.assertTrue(wikiSearchPage.pageHeader.getText().equals(string));
    }

    @And("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String string) {
        Assert.assertTrue(wikiSearchPage.imgHeader.getText().equals(string));

    }
}
