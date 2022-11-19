package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditRincianBiaya {

    private WebDriver driver;

    public EditRincianBiaya() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[2]/td[11]/a")
    WebElement btnAksi;

    @FindBy(name = "//*[@id=\"frmregister\"]/div[1]/h4")
    WebElement txtFormEdit;

    public void clickBtnAksi() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnAksi);
    }

    public String getTxtFormEdit() {return txtFormEdit.getText();}
}
