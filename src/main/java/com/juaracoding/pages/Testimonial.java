package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class Testimonial {

    private WebDriver driver;

    public Testimonial() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/a")
    WebElement clickSlideHome;

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/ul/li[1]/a")
    WebElement ClickTestimonial;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/a")
    WebElement clickBtnAdd;

    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[1]/div/input")
    WebElement ChooseFile;

    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[2]/div/input")
    WebElement txtNama;

    @FindBy(xpath = "//*[@id=\"exampleFormControlSelect9\"]")
    WebElement SelectPublish;

    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[4]/div/textarea")
    WebElement txtIsiTestimonial;

    @FindBy(xpath = "//*[@id=\"rating\"]")
    WebElement SelectReting;


    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[3]/input")
    WebElement btnSave;




    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/figure/a/div/p[2]")
    WebElement txtStatus;

    @FindBy(xpath = "/html/body/main/section[6]/div/div[2]/div/div/div[1]/div/div[13]/div/div/div/div[1]/div[2]/div/h1/text()")
    WebElement txtStatusPublish;

    @FindBy(xpath = "/html/body/div/h1")
    WebElement txttidakberhasilfoto;


    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[2]/div/div")
    WebElement txttidakberhasilnama;

    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[4]/div/div")
    WebElement txtareatidakberhasil;





    public void ClickSlideHome() {

        clickSlideHome.click();
    }

    public void ClickMenuTestimonial() {
        ClickTestimonial.click();

    }

    public void clickBtnAdd() {

        clickBtnAdd.click();
    }


    public void ChooseFile(String locationFile) {

        this.ChooseFile.sendKeys(locationFile);
    }

    public void fullname(String fulname) {
        this.txtNama.sendKeys(fulname);

    }

    public void SelectPublishactive() {

        SelectPublish.sendKeys("Active" + Keys.ENTER);
    }

    public void SelectPublishnonactive() {

        SelectPublish.sendKeys("No Active" + Keys.ENTER);
    }

    public void TxtIsiTestimonial(String isi) {

        this.txtIsiTestimonial.sendKeys(isi);
    }

    public void Selectrating() {

        SelectReting.sendKeys("5" + Keys.ENTER);
    }

    public void clickBtnSave() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSave);
    }


    public String getTextberhasil(){

        return txtStatus.getText();
    }

    public String getTexttidakberhasilfoto(){

        return txttidakberhasilfoto.getText();
    }

    public String getTexttidakberhasilnama(){

        return txttidakberhasilnama.getText();
    }

    public String getTextareatidakberhasil(){

        return txtareatidakberhasil.getText();
    }
    public String getTextberhasilPublish(){

        return txtStatusPublish.getText();
    }






    //edit Nama Peserta


}

