package com.juaracoding;

import com.juaracoding.Utils.Constants;
import com.juaracoding.pages.TambahBenefitPages;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestBenefit {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestBenefit() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("User input judul satu")
    public void user_input_judul_satu() {
        tambahBenefit.setjudulsatu("judulsatu");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("User input deskripsi satu")
    public void user_input_deskripsi_satu() {
        tambahBenefit.setdeskripsisatu("dessatu");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("User input judul dua")
    public void user_input_judul_dua() {
        tambahBenefit.setjuduldua("judulsatu");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("User input deskripsi dua")
    public void user_input_deskripsi_dua() {
        tambahBenefit.setdeskripsidua("desdua");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("User input judul tiga")
    public void user_input_judul_tiga() {
        tambahBenefit.setjudultiga("judultiga");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("User input deskripsi tiga")
    public void user_input_deskripsi_tiga() {
        tambahBenefit.setdeskripsitiga("desdua");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("User input judul empat")
    public void user_input_judul_empat() {
        tambahBenefit.setjudulempat("judulsatu");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("User input deskripsi empat")
    public void user_input_deskripsi_empat() {
        tambahBenefit.setdeskripsiempat("desdua");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("User click button simpan")
    public void user_click_button_simpan() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


    @Then("Muncul Pesan Data Tersimpan")
    public void Muncul_Data_Tersimpan() {
        Assert.assertEquals(tambahBenefit.settextdatatersimpan(),"Data berhasil di tambah");
    }

}
