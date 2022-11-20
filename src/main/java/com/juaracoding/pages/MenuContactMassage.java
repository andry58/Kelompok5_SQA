package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuContactMassage {
    private WebDriver driver;

    public MenuContactMassage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = " //*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[7]/a")
    WebElement ClickMenucontactmassges;

    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/select/option[1]")
    WebElement ClickSelectBynama;

    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/select/option[2]")
    WebElement ClickSelectByEmail;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/select/option[3]")
    WebElement ClickSelectByPhone;


    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/select/option[4]")
    WebElement ClickSelectBySubject;



    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/select/option[5]")
    WebElement ClickSelectByMassage;


    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[3]/div/input")
    WebElement txtsearch;


    @FindBy(xpath = " //*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[3]/nav/ul/li[4]/a")
    WebElement btnnext;

    public void ClickMenucontactmassges() {
        ClickMenucontactmassges.click();

    }

    public void SelectBynama() {

        ClickSelectBynama.sendKeys("Nama" + Keys.ENTER);
    }


    public void SelectByEmail() {

        ClickSelectByEmail.sendKeys("Email" + Keys.ENTER);
    }

    public void SelectByPhone() {

        ClickSelectByPhone.sendKeys("Phone Number" + Keys.ENTER);
    }


    public void SelectBySubject() {

        ClickSelectBySubject.sendKeys("Subject" + Keys.ENTER);
    }


    public void SelectByMassage() {

        ClickSelectByMassage.sendKeys("Massage" + Keys.ENTER);
    }



    public void searchbyNama() {

        txtsearch.sendKeys("Andri Yansyah" + Keys.ENTER);

    }

    public void searchbyEmail() {

        txtsearch.sendKeys("Andri933@gmail.com" + Keys.ENTER);

    }

    public void searchbyPhone() {

        txtsearch.sendKeys("2147483647" + Keys.ENTER);

    }

    public void searchbySubject() {

        txtsearch.sendKeys("Pendaftaran" + Keys.ENTER);

    }

    public void searchbyMassage() {

        txtsearch.sendKeys("Ingin mendaftar" + Keys.ENTER);

    }

    public void Clicknext() {
       btnnext.click();

    }


}
