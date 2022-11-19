package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSignIn;

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[2]/a/span")
    WebElement txtDashboard;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    WebElement txtInvalidCredentials;

    @FindBy(xpath = "//*[@id=\"swal2-html-container\"]")
    WebElement txtNull;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement btnOkNull;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[1]/div/div[3]/ul/li[2]/ul/li/a")
    WebElement btnLogout;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);

    }
    public void clickBtnSignIn() {
        btnSignIn.click();
    }

    public void clickBtnOkNull() {
        btnOkNull.click();
    }

    public void clickBtnLogout() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnLogout);
    }

    public String getTxtDashboard() {
        return txtDashboard.getText();
    }

    public String getTxtNull() {
        return txtNull.getText();
    }

    public String getTxtInvalidCredentials() {
        return txtInvalidCredentials.getText();
    }

}
