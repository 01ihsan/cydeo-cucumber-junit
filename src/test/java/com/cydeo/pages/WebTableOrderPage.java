package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends WebTableBasePage {
    public WebTableOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;
    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement productQuantity;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputName;
    @FindBy(xpath = "//input[@name='street']")
    public WebElement inputStreet;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement inputCity;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement inputState;
    @FindBy(xpath = "//input[@name='zip']")
    public WebElement inputZip;
    @FindBy(xpath = "//input[@name='card']")
    public List<WebElement> inputCardType;
    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement inputCardNo;
    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement inputCardExp;
    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;
    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement nameCheck;
}
