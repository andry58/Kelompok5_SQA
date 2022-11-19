package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HalamanRincianBiaya {
    private WebDriver driver;

    public HalamanRincianBiaya() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/a/div")
    WebElement btnMenuHome;

    @FindBy(xpath = "//a[normalize-space()='Rincian Biaya']")
    WebElement btnMenuRincianBiaya;

    @FindBy(xpath = "//h3[normalize-space()='Data Rincian Biaya']")
    WebElement txtRincianBiaya;

    public void clickBtnHome() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnMenuHome);
    }

    public void clickBtnRincianBiaya() {
        btnMenuRincianBiaya.click();
    }

    public String getTxtRincianBiaya() {
        return txtRincianBiaya.getText();
    }


}


