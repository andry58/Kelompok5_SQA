package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Url {
    private WebDriver driver;

    public Url() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Admin Login']")
    WebElement txtValidUrl;

    @FindBy(xpath = "//h1[normalize-space()='404 - File Not Found']")
    WebElement txtInvalidUrl;


    public String getTxtValidUrl() {
        return txtValidUrl.getText();
    }

    public String getTxtInvalidUrl() {
        return txtInvalidUrl.getText();
    }





}
