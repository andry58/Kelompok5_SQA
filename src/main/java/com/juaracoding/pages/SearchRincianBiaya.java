package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchRincianBiaya {
    private WebDriver driver;

    public SearchRincianBiaya() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement inputSearchData;

    @FindBy(xpath = "//select[@name='st']")
    WebElement selectKeyword;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]")
    WebElement txtDiskon30;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[1]")
    WebElement txtSqaBatch6;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]")
    WebElement txtLimaJuta;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[2]/td[4]")
    WebElement txtDuaJuta;


    public void searchInput(String searchInput) {
        this.inputSearchData.sendKeys(searchInput);
    }

    public void hapusSearch(){
        inputSearchData.clear();
    }

    public void pressEnter() {
        inputSearchData.submit();
    }

    public void selectKeyword(String selectKeyword) {
        Select keyword = new Select(this.selectKeyword);
        keyword.selectByValue(selectKeyword);
    }

    public String getTxtSearchDiskon() {return txtDiskon30.getText();}

    public String getTxtSearchNamaProgram() {return txtSqaBatch6.getText();}

    public String getTxtSearchHargaNormal() {return txtLimaJuta.getText();}
    public String getTxtSearchHargaDiskon() {return txtDuaJuta.getText();}


}
