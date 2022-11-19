package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShortingRincianBiaya {
    private WebDriver driver;

    public ShortingRincianBiaya() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@name='st']")
    WebElement shortingData;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[2]/td[1]")
    WebElement txtShortingByNamaProgram;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]")
    WebElement txtShortingByDiskon;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]")
    WebElement txtShortingByHargaNormal;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[2]/td[4]")
    WebElement txtShortingByHargaDiskon;

    public void setShortingData(String shortingData) {
        Select shorting = new Select(this.shortingData);
        shorting.selectByValue(shortingData);
    }
    public String getTxtShortingNamaProgram() {
        return txtShortingByNamaProgram.getText();
    }
    public String getTxtShortingDiskon() {return txtShortingByDiskon.getText();}
    public String getTxtShortingHargaNormal() {return txtShortingByHargaNormal.getText();}
    public String getTxtShortingHargaDiskon() {return txtShortingByHargaDiskon.getText();}
}
