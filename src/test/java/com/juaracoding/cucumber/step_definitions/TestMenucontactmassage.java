package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.pages.MenuContactMassage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMenucontactmassage {
    WebDriver driver;
    private static ExtentTest extentTest;
    private MenuContactMassage manucontactmassage = new MenuContactMassage();

    public TestMenucontactmassage() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test case one
    @When("TCC.JC.0185 Admin clik menu contact massage")
    public void Admin_click_menus_contact_massage() {
        manucontactmassage.ClickMenucontactmassges();
        extentTest.log(LogStatus.PASS, "TCC.JC.0185 Admin clik menu contact massage");
}
//test ke 1

    @When("TCC.JC.0186 Admin Pilih Select  Menu by Nama")
    public void admin_Pilih_Select_Menu_by_Nama() {
        manucontactmassage.SelectBynama();
        extentTest.log(LogStatus.PASS, "TCC.JC.0186 Admin Pilih Select  Menu by Nama");
    }

    @And("TCC.JC.0186 Admin Pilih dan Ketik di Dropdownlist di search")
    public void admin_click_button_save_edit1() {
        manucontactmassage.searchbyNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.0186 Admin Pilih dan Ketik di Dropdownlist di search");
    }

    @Then("TCC.JC.0186 Validasi  berhasil")
    public void Validasi_berhasil(){
        Assert.assertEquals(manucontactmassage.getTextvalidasi(),"No Nama Lengkap Email Phone Number Subject Message");
        extentTest.log(LogStatus.PASS, "TCC.JC.0186 Validasi  berhasil");
    }



}