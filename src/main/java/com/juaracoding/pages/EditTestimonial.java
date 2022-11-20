package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditTestimonial {

    private WebDriver driver;

    public EditTestimonial() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[1]/div/input[3]")
    WebElement pilihulang;

    @FindBy(xpath = "//*[@id=\"nama\"]")
    WebElement Editnama;

    @FindBy(xpath = "//*[@id=\"exampleFormControlSelect9\"]")
    WebElement EditSelectPublish;

    @FindBy(xpath = "//*[@id=\"summernote\"]")
    WebElement EdittxtIsiTestimonial;

    @FindBy(xpath = "//*[@id=\"rating\"]")
    WebElement EditSelectReting;

    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[2]/form/input")
    WebElement txtsearch;

    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/figure[1]/a")
    WebElement pilihnama;

    //edit testimonial

    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[2]/div/div")
    WebElement txttidakberhasilnama;


    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[4]/div/div")
    WebElement txttidakberhasilisi;


     @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/form/div[3]/input")
    WebElement btnSimpanedit;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/figure[1]/a/div/p[2]")
    WebElement txtberhasil;



    public void searchNama() {

        txtsearch.sendKeys("Andri Yansyah" + Keys.ENTER);

    }

    public void pilihnama() {

        pilihnama.click();

    }
    public void Pilihulang(String locationFile) {
        this.pilihulang.sendKeys(locationFile);
    }

    public void EditNamaPeserta(String fulname) {
        this.Editnama.clear();
        this.Editnama.sendKeys(fulname);

    }

    public void EditSelectPublishactive () {

        EditSelectPublish.sendKeys("Active" + Keys.ENTER);
    }

    public void EditSelectPublishnonactive() {

        EditSelectPublish.sendKeys("No Active" + Keys.ENTER);
    }

    public void EditTxtIsiTestimonial(String isi) {
        this.EdittxtIsiTestimonial.clear();
        this.EdittxtIsiTestimonial.sendKeys(isi);
    }

    public void editSelectrating() {

        EditSelectReting.sendKeys("4" + Keys.ENTER);
    }

    public void clickBtnSimpanEdit() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSimpanedit);
    }
    public String getTexttidakberhasilnama(){

        return txttidakberhasilnama.getText();
    }
    public String getTextidakberhasilisi(){

        return txttidakberhasilisi.getText();
    }public String getTextberhasil(){

        return txtberhasil.getText();
    }


}