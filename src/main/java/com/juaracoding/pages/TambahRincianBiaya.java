package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TambahRincianBiaya {
    private WebDriver driver;

    public TambahRincianBiaya() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='btn btn-gradient']")
    WebElement btnTambahRincianBiaya;

    @FindBy(id = "nama")
    WebElement namaProgram;

    @FindBy(id = "harga")
    WebElement haragaNormal;

    @FindBy(name = "diskon")
    WebElement diskon;

    @FindBy(name = "totalharga")
    WebElement hargaSetelahDiskon;

    @FindBy(name = "keunggulan1")
    WebElement keunggulanSatu;

    @FindBy(name = "keunggulan2")
    WebElement keunggulanDua;

    @FindBy(name = "keunggulan3")
    WebElement keunggulanTiga;

    @FindBy(name = "keunggulan4")
    WebElement keunggulanLEmpat;

    @FindBy(name = "keunggulan5")
    WebElement keunggulanLima;

    @FindBy(name = "publish")
    WebElement publish;

    @FindBy(xpath = "//input[@name='mysubmit']")
    WebElement btnSimpan;

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/a/div")
    WebElement btnMenuHome;

    @FindBy(xpath = "//a[normalize-space()='Rincian Biaya']")
    WebElement btnMenuRincianBiaya;

    @FindBy(xpath = "//h4[@class='card-title mb-0']")
    WebElement txtFormTambahRincianBiaya;

    @FindBy(xpath = "//alert[@class='alert alert-success']")
    WebElement txtSimpanData;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    WebElement txtHarapIsiNamaProgram;

    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[2]/div/div/div")
    WebElement txtHarapIsiHargaProgram;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[3]")
    WebElement txtValidasiDiskonHuruf;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement inputSearchData;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr/td[4]")
    WebElement txtHargaSetelahDiskonOtomatis;

    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[5]/div/div")
    WebElement txtHarapIsiKeunggulan;

    @FindBy(xpath = "//h1[normalize-space()='SQA Batch 29']")
    WebElement txtContentPublish;

    public void rincianBiaya(String namaProgram, String hargaNormal, String diskon, String hargaSetelahDiskon,
                             String keunggulanSatu, String keunggulanDua, String keunggulanTiga, String keunggulanLEmpat, String keunggulanLima) {
        this.namaProgram.sendKeys(namaProgram);
        this.haragaNormal.sendKeys(hargaNormal);
        this.diskon.sendKeys(diskon);
        this.hargaSetelahDiskon.sendKeys(hargaSetelahDiskon);
        this.keunggulanSatu.sendKeys(keunggulanSatu);
        this.keunggulanDua.sendKeys(keunggulanDua);
        this.keunggulanTiga.sendKeys(keunggulanTiga);
        this.keunggulanLEmpat.sendKeys(keunggulanLEmpat);
        this.keunggulanLima.sendKeys(keunggulanLima);
    }

    public void choosePublish(String publish) {
        Select selectPublish = new Select(this.publish);
        selectPublish.selectByValue(publish);
    }

    public void clickBtnTambahRincianBiaya() {
        btnTambahRincianBiaya.click();
    }

    public void clickBtnSimpan() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSimpan);
    }

    public void clickBtnHome() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnMenuHome);
    }

    public void clickBtnRincianBiaya() {
        btnMenuRincianBiaya.click();
    }
    public void clearData(){
        namaProgram.clear();
        haragaNormal.clear();
        diskon.clear();
        keunggulanSatu.clear();
        keunggulanDua.clear();
        keunggulanTiga.clear();
        keunggulanLEmpat.clear();
        keunggulanLima.clear();
    }

    public void searchInput(String searchInput) {
        this.inputSearchData.sendKeys(searchInput);
    }

    public String getTxtFormTambahRincianBiaya() {
        return txtFormTambahRincianBiaya.getText();
    }

    public String getTxtDataBerhasilDisimpan() {return txtSimpanData.getText();}

    public String getTxtHarapIsiNamaProgram() {return txtHarapIsiNamaProgram.getText();}

    public String getTxtHarapIsiHargaProgram() {return txtHarapIsiHargaProgram.getText();}

    public String getTxtValidasiDiskon() {return txtValidasiDiskonHuruf.getText();}

    public String getTxtHargaDiskon() {return txtHargaSetelahDiskonOtomatis.getText();}

    public String getTxtIsiKeunggulan() {return txtHarapIsiKeunggulan.getText();}

    public String getTextContentPublish() {return txtContentPublish.getText();}



}
