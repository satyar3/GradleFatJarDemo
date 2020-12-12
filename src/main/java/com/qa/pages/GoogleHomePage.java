package com.qa.pages;

import com.qa.base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    private WebDriver driver;

    @FindBy(name="q")
    private WebElement searchBox;

    @FindBy(css="#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b")
    private WebElement searchBtn;

    @FindBy(css = "a[title='Google apps']")
    private WebElement googleApps;

    public GoogleHomePage(){
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void googleSearch(String searchTerm){
        this.driver.get("https://www.google.com");
        this.searchBox.sendKeys(searchTerm);
        this.googleApps.click();
        this.searchBtn.click();
    }
}
