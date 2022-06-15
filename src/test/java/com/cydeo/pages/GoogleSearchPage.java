package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleSearchPage {
    //create constructor
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@id='L2AGLb']")
    public WebElement cookiesAcceptButton;

    @FindBy(xpath = "//input[@name='q']")
    public WebElement googleSearchBox;

}
