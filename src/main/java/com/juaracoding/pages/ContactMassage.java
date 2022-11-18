package com.juaracoding.pages;

import com.juaracoding.Driver.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactMassage {

    private WebDriver driver;

    public ContactMassage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/ul/li[5]/a")
    WebElement btnContact;

    @FindBy(xpath = "//*[@id=\"frmcontact\"]/div[1]/input")
    WebElement txtFullname;

    @FindBy(xpath = "//*[@id=\"frmcontact\"]/div[2]/input")
    WebElement txtEmail;

    @FindBy(xpath = "//*[@id=\"frmcontact\"]/div[3]/input")
    WebElement txtPhone;

    @FindBy(xpath = "//*[@id=\"frmcontact\"]/div[4]/input")
    WebElement txtSubject;

    @FindBy(xpath = "//*[@id=\"frmcontact\"]/div[5]/textarea")
    WebElement txtMassage;

    @FindBy(xpath = "//*[@id=\"frmcontact\"]/button")
    WebElement btnSandmassage;




    public void ClickContact() {
   btnContact.click();

    }


    public void fullname(String fulname) {
        this.txtFullname.sendKeys(fulname);

    }
    public void email(String email) {
        this.txtEmail.sendKeys(email);

    }
    public void Phone(String phone) {
        this.txtPhone.sendKeys(phone);

    }
    public void subject (String subject) {
        this.txtSubject.sendKeys(subject);

    }
    public void TxtMassage(String Massage) {

        this.txtMassage.sendKeys(Massage);
    }

    public void clickBtnMassage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSandmassage);

    }


}



