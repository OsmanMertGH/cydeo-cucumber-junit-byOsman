package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="searchInput")
    public WebElement searchBoxWiki;

    @FindBy(xpath="//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchBtn;

    @FindBy(xpath="//h1[@id='firstHeading']")
    public WebElement pageHeader;

    @FindBy(xpath="//div[@class='fn']")
    public WebElement imgHeader;

}
