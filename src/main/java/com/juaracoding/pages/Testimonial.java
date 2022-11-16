package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[2]/form/input")
    WebElement txtsearch;

    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[4]/figure[1]/a")
    WebElement pilihnama;

    //edit testimonial

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


    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/form/div[3]/input")
    WebElement btnSimpanedit;







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

    public void searchNama() {

        txtsearch.sendKeys("Andri Yansyah" + Keys.ENTER);

    }

    public void pilihnama() {

        pilihnama.click();

    }

    //edit Nama Peserta

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

}

