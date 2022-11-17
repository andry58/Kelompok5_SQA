package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.support.FindBy;
;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

import static org.openqa.selenium.Keys.ENTER;

public class TambahBenefitPages {

    private WebDriver driver;

    public TambahBenefitPages() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Actions action = new Actions(driver);


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


    //@FindBy(id = "exampleFormControlSelect9")

    @FindBy(xpath = "//*[@id='exampleFormControlSelect9']")
    WebElement cbpublish;

    @FindBy(xpath = "//input[@name='mysubmit']")
    WebElement buttonsimpan;


    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[1]/h3")
    WebElement txtdatadisimpan;

//edit

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[10]/a")
    WebElement btnedit;


    @FindBy(xpath = "//*[@id=\"judul_1\"]")
    WebElement judulsatuedit;

    @FindBy(xpath = "//*[@id=\"judul_1\"]")
    WebElement deskripsisatuedit;

    @FindBy(xpath = "//*[@id=\"judul_1\"]")
    WebElement judulduaedit;

    @FindBy(xpath = "//*[@id=\"judul_1\"]")
    WebElement deskripsiduaedit;

    @FindBy(xpath = "//*[@id=\"judul_1\"]")
    WebElement judultigaedit;

    @FindBy(xpath = "//*[@id=\"judul_1\"]")
    WebElement jdsatuedit;

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


    public void setpublish() {

        //this.cbpublish.sendKeys(publish);
        cbpublish.sendKeys("Active" + ENTER);
    }

    public void clickButtonSimpan() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", buttonsimpan);


    }

    //public String settextdatatersimpan() {
        //return txtdatadisimpan.getText();
   // }

}
