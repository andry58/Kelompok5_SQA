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

public class TestJudulEmpat {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestJudulEmpat() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Tambah Benefit Judul Empat
    @When("TCC.JC.087 User go to web Tambah Benefit")
    public void user_go_to_web_tambah_benefit_delapantujuh() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.087 User input judul satu")
    public void user_input_judul_satu_delapantujuh() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.087 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapantujuh() {
        tambahBenefit.setdeskripsisatu("harusnya kosong");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.087 User input judul dua")
    public void user_input_judul_dua_delapantujuh() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.087 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapantujuh() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.087 User input judul tiga")
    public void user_input_judul_tiga_delapantujuh() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.087 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapantujuh() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.087 User input judul empat")
    public void user_input_judul_empat_delapantujuh() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.087 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapantujuh() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.087 User input publish")
    public void user_input_publish_delapantujuh() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.087 User click button simpan")
    public void user_click_button_simpan_delapantujuh() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


//==============================================================================================================
    // Tambah Benefit Judul Empat Angka Huruf

    @When("TCC.JC.088 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_delapandelapan() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.088 User input judul satu")
    public void user_input_judul_satu_delapandelapan() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.088 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapandelapan() {
        tambahBenefit.setdeskripsisatu("Deskripsi 123");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.088 User input judul dua")
    public void user_input_judul_dua_delapandelapan() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.088 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapandelapan() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.088 User input judul tiga")
    public void user_input_judul_tiga_delapandelapan() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.088 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapandelapan() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.088 User input judul empat")
    public void user_input_judul_empat_delapandelapan() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.088 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapandelapan() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.088 User input publish")
    public void user_input_publish_delapandelapan() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.088 User click button simpan")
    public void user_click_button_simpan_delapandelapan() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

//===============================================================================================================

    // Tambah Benefit Judul Empat SImbol

    @When("TCC.JC.089 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_delapansembilan() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.089 User input judul satu")
    public void user_input_judul_satu_delapansembilan() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.089 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapansembilan() {
        tambahBenefit.setdeskripsisatu("Deskripsi @@@");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.089 User input judul dua")
    public void user_input_judul_dua_delapansembilan() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.089 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapansembilan() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.089 User input judul tiga")
    public void user_input_judul_tiga_delapansembilan() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.089 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapansembilan() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.089 User input judul empat")
    public void user_input_judul_empat_delapansembilan() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.089 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapansembilan() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.089 User input publish")
    public void user_input_publish_delapansembilan() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.089 User click button simpan")
    public void user_click_button_simpan_delapansembilan() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

}
