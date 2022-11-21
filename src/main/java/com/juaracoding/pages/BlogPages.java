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

public class BlogPages {

    private WebDriver driver;

    public BlogPages() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

//Form Input Blog ===========================================================================================================================================

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement txtboxfoto;

    @FindBy(xpath = "//input[@id='judul']")
    WebElement txtjudulblog;

    @FindBy(xpath = "//div[3]//div[1]//select[1]")
    WebElement txtpublish;

    @FindBy(xpath = "//div[3]//div[1]//select[1]")
    WebElement txtsettohome;

    @FindBy(xpath = "//textarea[@name='body_preview']")
    WebElement txtcontentpriview;

    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[6]/div/div/div[3]/div[3]")
    WebElement txtcontent;

    @FindBy(xpath = "//input[@name='mysubmit']")
    WebElement btnsimpan;


    //Form Edit Blog ===========================================================================================================================================

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement txtboxfotoedit;

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement txtjudulblogedit;

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement txtpublishedit;

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement txtsettohomeedit;

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement txtcontentpriviewedit;

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement txtcontentedit;

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement btnedit;


    //Form Edit Blog ===========================================================================================================================================

    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/a")
    WebElement buttonhomeblog;

    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement buttonBlog;

    @FindBy(xpath = "//h3[normalize-space()='List Blog']")
    WebElement txtListBlog;

    @FindBy(xpath = "//a[@class='btn btn-gradient']")
    WebElement buttontambahblog;



    //Form Input Blog ===========================================================================================================================================

    public void setFoto(String foto)
    {
        this.txtboxfoto.sendKeys(foto);
    }

    public void setjudublog(String judulblog)
    {
        this.txtjudulblog.sendKeys(judulblog);
    }

    public void setpublishblog()
    {
        txtpublish.sendKeys("Active" + ENTER);
    }

    public void setsettohome()
    {
        txtsettohome.sendKeys("Active" + ENTER);
    }

    public void setcontentpriview(String cntpriview)
    {
        this.txtcontentpriview.sendKeys(cntpriview);
    }

    public void setcontent(String content)
    {
        this.txtcontent.sendKeys(content);
    }

    public void setbtnsimpan()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnsimpan);
    }

    //Form Edit Blog ===========================================================================================================================================


    public void setFotoedit(String fotoedit)
    {
        this.txtboxfotoedit.sendKeys(fotoedit);
    }

    public void setjudublogedit(String judulblogedit)
    {
        this.txtjudulblogedit.clear();
        this.txtjudulblogedit.sendKeys(judulblogedit);
    }

    public void setpublishblogedit()
    {
        this.txtpublishedit.clear();
        txtpublishedit.sendKeys("Active" + ENTER);
    }

    public void setsettohomeedit()
    {
        this.txtsettohomeedit.clear();
        txtsettohomeedit.sendKeys("Active" + ENTER);
    }

    public void setcontentpriviewedit(String cntpriviewedit)
    {
        this.txtcontentpriviewedit.clear();

        this.txtcontentpriviewedit.sendKeys(cntpriviewedit);
    }

    public void setcontentedit(String contentedit)
    {
        this.txtcontentedit.clear();

        this.txtcontentedit.sendKeys(contentedit);
    }

    public void setbtnsimpanedit()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnedit);
    }

    //Button Blog ===========================================================================================================================================

    public void setButtonBlog ()
    {
        buttonBlog.click();
    }

    public String settxtlistblog ()
    {
        return txtListBlog.getText();
    }

    public void setButtontambahblog()
    {
        buttontambahblog.click();
    }

    public void setBtnHomeBlog()
    {
        buttonhomeblog.click();
    }
}
