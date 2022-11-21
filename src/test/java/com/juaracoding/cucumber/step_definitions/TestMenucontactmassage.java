package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.Utils.Constants;
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
        driver.get(Constants.Log);
        manucontactmassage.ClickMenucontactmassges();
        extentTest.log(LogStatus.PASS, "TCC.JC.0185 Admin clik menu contact massage");
}
//test ke 1

    @When("TCC.JC.0186 Admin Pilih Select  Menu by Nama")
    public void admin_Pilih_Select_Menu_by_Nama() {
        manucontactmassage.SelectBynama();
        extentTest.log(LogStatus.PASS, "TCC.JC.0186 Admin Pilih Select  Menu by Nama");
    }

    @And("TCC.JC.0186 Admin Pilih dan Ketik di Dropdownlist by nama di search")
    public void admin_Pilih_dan_Ketik_di_Dropdownlist_by_nama_di_searchh() {
        manucontactmassage.searchbyNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.0186 Admin Pilih dan Ketik di Dropdownlist by nama di searchh");
    }

    @Then("TCC.JC.0186 Validasi  berhasil")
    public void Validasi_berhasil(){
        Assert.assertEquals(manucontactmassage.getTextvalidasi(),"Data Contact Messages");
        extentTest.log(LogStatus.PASS, "TCC.JC.0186 Validasi  berhasil");
    }

    //test ke dua

    @When("TCC.JC.0187 Admin Pilih Select  Menu by Email")
    public void admin_Pilih_Select_Menu_by_email() {
        driver.navigate().back();
        driver.navigate().refresh();
        manucontactmassage.SelectByEmail();
        extentTest.log(LogStatus.PASS, "TCC.JC.0186 Admin Pilih Select  Menu by Nama");
    }

    @And("TCC.JC.0187 Admin Pilih dan Ketik di Dropdownlist by email di search")
    public void admin_Pilih_dan_Ketik_di_Dropdownlist_by_email_di_searchh() {
        manucontactmassage.searchbyEmail();
        extentTest.log(LogStatus.PASS, "TCC.JC.0187 Admin Pilih dan Ketik di Dropdownlist by email di search");
    }


    @Then("TCC.JC.0187 Validasi  berhasil")
    public void Validasi_berhasil1(){
        Assert.assertEquals(manucontactmassage.getTextvalidasi(),"Data Contact Messages");
        extentTest.log(LogStatus.PASS, "TCC.JC.0187 Validasi  berhasil");
    }
//test ke 3
@When("TCC.JC.0188 Admin Pilih Data Contact by Nomor Telepon")
public void admin_Pilih_Select_Menu_by_tlp() {
    driver.navigate().back();
    driver.navigate().refresh();
    manucontactmassage.SelectByPhone();
    extentTest.log(LogStatus.PASS, "TCC.JC.0188 Admin Pilih Data Contact by Nomor Telepon");
}

    @And("TCC.JC.0188 Admin Pilih dan Ketik di Dropdownlist by tlp di search")
    public void admin_Pilih_dan_Ketik_di_Dropdownlist_by_tlp_di_searchh() {
        manucontactmassage.searchbyPhone();
        extentTest.log(LogStatus.PASS, "TCC.JC.0188 Admin Pilih dan Ketik di Dropdownlist by tlp di search");
    }


    @Then("TCC.JC.0188 Validasi  berhasil")
    public void Validasi_berhasil2(){
        Assert.assertEquals(manucontactmassage.getTextvalidasi(),"Data Contact Messages");
        extentTest.log(LogStatus.PASS, "TCC.JC.0188 Validasi  berhasil");
    }
//test

    @When("TCC.JC.0189 Admin Pilih Data Contact by Subjek")
    public void admin_Pilih_Select_Menu_by_subject() {
        driver.navigate().back();
        driver.navigate().refresh();
        manucontactmassage.SelectBySubject();
        extentTest.log(LogStatus.PASS, "TCC.JC.0189 Admin Pilih Data Contact by Subjek");
    }

    @And("TCC.JC.0189 Admin Pilih dan Ketik di Dropdownlist by subject di search")
    public void admin_Pilih_dan_Ketik_di_Dropdownlist_by_subject_di_searchh() {
        manucontactmassage.searchbySubject();
        extentTest.log(LogStatus.PASS, "TCC.JC.0188 Admin Pilih dan Ketik di Dropdownlist by subject di search");
    }


    @Then("TCC.JC.0189 Validasi  berhasil")
    public void Validasi_berhasil4(){
        Assert.assertEquals(manucontactmassage.getTextvalidasi(),"Data Contact Messages");
        extentTest.log(LogStatus.PASS, "TCC.JC.0189 Validasi  berhasil");
    }

    //tess
    @When("TCC.JC.0190 Admin Pilih Data Contact by Pesan")
    public void admin_Pilih_Select_Menu_by_pesan() {
        driver.navigate().back();
        driver.navigate().refresh();
        manucontactmassage.SelectByMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0190 Admin Pilih Data Contact by Pesan");
    }

    @And("TCC.JC.0190 Admin Pilih dan Ketik di Dropdownlist by pesan di search")
    public void admin_Pilih_dan_Ketik_di_Dropdownlist_by_pesan_di_searchh() {
        manucontactmassage.searchbyMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0190 Admin Pilih dan Ketik di Dropdownlist by pesan di search");
    }


    @Then("TCC.JC.0190 Validasi  berhasil")
    public void Validasi_berhasil5(){
        Assert.assertEquals(manucontactmassage.getTextvalidasi(),"Data Contact Messages");
        extentTest.log(LogStatus.PASS, "TCC.JC.0190 Validasi  berhasil");
    }

}