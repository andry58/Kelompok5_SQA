package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TambahBenefitPages {

    private WebDriver driver;

    public TambahBenefitPages() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='judul_1']")
    WebElement tboxjudulsatu;

    @FindBy(xpath = "//textarea[@name='deskripsi_1']")
    WebElement tboxdeskripsisatu;

    @FindBy(xpath = "//input[@id='judul_2']")
    WebElement tboxjuduldua;

    @FindBy(xpath = "//textarea[@name='deskripsi_2']")
    WebElement tboxdeskripsidua;

    @FindBy(xpath = "//input[@id='judul_3']")
    WebElement tboxjudultiga;

    @FindBy(xpath = "//textarea[@name='deskripsi_3']")
    WebElement tboxdeskripsitiga;

    @FindBy(xpath = "//input[@id='judul_4']")
    WebElement tboxjudulempat;

    @FindBy(xpath = "//textarea[@name='deskripsi_4']")
    WebElement tboxdeskripsiempat;

    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
    WebElement cbpublish;

    @FindBy(xpath = "//input[@name='mysubmit']")
    WebElement buttonsimpan;


    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/alert")
    WebElement txtdatadisimpan;

    public void setjudulsatu(String judulsatu) {
        this.tboxjudulsatu.sendKeys(judulsatu);
    }

    public void setdeskripsisatu(String deskripsilsatu) {
        this.tboxdeskripsisatu.sendKeys(deskripsilsatu);
    }

    public void setjuduldua(String juduldua) {
        this.tboxjuduldua.sendKeys(juduldua);
    }

    public void setdeskripsidua(String deskripsidua) {
        this.tboxdeskripsidua.sendKeys(deskripsidua);
    }

    public void setjudultiga(String judultiga) {
        this.tboxjudultiga.sendKeys(judultiga);
    }
    public void setdeskripsitiga(String deskripsitiga) {
        this.tboxdeskripsitiga.sendKeys(deskripsitiga);
    }

    public void setjudulempat(String judulempat) {
        this.tboxjudulempat.sendKeys(judulempat);
    }

    public void setdeskripsiempat(String deskripsiempat) {
        this.tboxdeskripsiempat.sendKeys(deskripsiempat);
    }

    public void setpublish(String publish) {
        Select selectPublish = new Select(this.cbpublish);
        selectPublish.selectByValue(publish);
    }

    public void clickButtonSimpan() {
        buttonsimpan.click();
    }

    public String settextdatatersimpan() {
        return txtdatadisimpan.getText();
    }

}
