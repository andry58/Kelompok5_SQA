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

    @FindBy(xpath = "//textarea[@id='deskripsi_1']")
    WebElement deskripsisatuedit;

    @FindBy(xpath = "//input[@id='judul_2']")
    WebElement judulduaedit;

    @FindBy(xpath = "//textarea[@id='deskripsi_2']")
    WebElement deskripsiduaedit;

    @FindBy(xpath = "//input[@id='judul_3']")
    WebElement judultigaedit;

    @FindBy(xpath = "//textarea[@id='deskripsi_3']")
    WebElement deskripsitigaedit;

    @FindBy(xpath = "//input[@id='judul_4']")
    WebElement judulempatedit;

    @FindBy(xpath = "//textarea[@id='deskripsi_4']")
    WebElement deskripsiempatedit;

    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
    WebElement publishedit;

    @FindBy(xpath = "//input[@name='mysubmit']")
    WebElement buttonedit;


    @FindBy(xpath = "//alert[@class='alert alert-success']")
    WebElement txtberhasiledit;

    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[1]/h4")
    WebElement txtmasukledit;
    //*[@id="frmregister"]/div[1]/h4

    // Button Home dan Input ===========================================================================================

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/a")
    WebElement buttonhome;

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/ul/li[3]/a")
    WebElement buttonbenefit;

    @FindBy(xpath = "//a[@class='btn btn-gradient']")
    WebElement buttonembhbenefit;

    @FindBy(xpath = "//h3[normalize-space()='Data Benefit']")
    WebElement txttambahdatabenefit;

    @FindBy(xpath = "//h4[@class='card-title mb-0']")
    WebElement txttambahisibenefit;



    // Untuk Input =====================================================================================================
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



    // Untuk Edit========================================================================================================

    public void setbuttonedit() {
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();", btnedit);
        btnedit.click();
    }
        public void setjudulsatuedit(String judulsatuedit){
            this.judulsatuedit.clear();
            this.judulsatuedit.sendKeys(judulsatuedit);
        }

        public void setdeskripsisatuedit (String deskripsisatuedit){
            this.deskripsiduaedit.clear();
            this.deskripsisatuedit.sendKeys(deskripsisatuedit);
        }
        public void setjudulduaedit (String judulduaedit){
            this.judulduaedit.clear();
            this.judulduaedit.sendKeys(judulduaedit);
        }
        public void setdeskripsiduaedit (String deskripsiduaedit){
            this.deskripsiduaedit.clear();
            this.deskripsiduaedit.sendKeys(deskripsiduaedit);
        }
        public void setjudultigaedit (String judultigaedit){
            this.judultigaedit.clear();
            this.judultigaedit.sendKeys(judultigaedit);
        }
        public void setdeskripsitigaedit (String deskripsitigaedit){
            this.deskripsitigaedit.clear();
            this.deskripsitigaedit.sendKeys(deskripsitigaedit);
        }
        public void setjudulempatedit (String judulempatedit){
            this.judulempatedit.clear();
            this.judulempatedit.sendKeys(judulempatedit);
        }
        public void setdeskripsiempatedit (String deskripsiempatedit){
            this.deskripsiempatedit.clear();
            this.deskripsiempatedit.sendKeys(deskripsiempatedit);
        }

        public void setPublishedit () {
            publishedit.sendKeys("Active" + ENTER);
        }
        public void kliksiempatedit () {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", buttonedit);
        }

        // Button Home dll =============================================================================================

        public void setbtnhome()
        {
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("arguments[0].click();", buttonhome);
             buttonhome.click();
        }
        public void setbtnenefit()
         {
             //JavascriptExecutor js = (JavascriptExecutor) driver;
             //js.executeScript("arguments[0].click();", buttonbenefit);
             buttonbenefit.click();
         }
        public void setbtntambahbenefit()
        {
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("arguments[0].click();", buttonembhbenefit);
            buttonembhbenefit.click();
        }

        public String settextdatabenefit() {
        return txttambahdatabenefit.getText();
        }

        public String settextisibenefit()
        {
        return txttambahisibenefit.getText();
        }

    public String setmasukeditbenefit()
    {
        return txtmasukledit.getText();
    }
}