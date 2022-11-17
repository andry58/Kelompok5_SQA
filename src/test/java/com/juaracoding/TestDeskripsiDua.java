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

public class TestDeskripsiDua {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestDeskripsiDua() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Tambah Benefit Judul Satu
    @When("TCC.JC.078 User go to web Tambah Benefit")
    public void user_go_to_web_tambah_benefit_tujuhdelapan() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.078 User input judul satu")
    public void user_input_judul_satu_tujuhdelapan() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.078 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhdelapan() {
        tambahBenefit.setdeskripsisatu("harusnya kosong");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.078 User input judul dua")
    public void user_input_judul_dua_tujuhdelapan() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.078 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhdelapan() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.078 User input judul tiga")
    public void user_input_judul_tiga_tujuhdelapan() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.078 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhdelapan() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.078 User input judul empat")
    public void user_input_judul_empat_tujuhdelapan() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.078 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhdelapan() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.078 User input publish")
    public void user_input_publish_tujuhdelapan() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.078 User click button simpan")
    public void user_click_button_simpan_tujuhdelapan() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


//==============================================================================================================
    // Tambah Benefit Judul Satu Angka Huruf

    @When("TCC.JC.079 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_tujuhsembilan() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.079 User input judul satu")
    public void user_input_judul_satu_tujuhsembilan() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.079 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhsembilan() {
        tambahBenefit.setdeskripsisatu("Deskripsi 123");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.079 User input judul dua")
    public void user_input_judul_dua_tujuhsembilan() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.079 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhsembilan() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.079 User input judul tiga")
    public void user_input_judul_tiga_tujuhsembilan() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.079 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhsembilan() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.079 User input judul empat")
    public void user_input_judul_empat_tujuhsembilan() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.079 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhsembilan() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.079 User input publish")
    public void user_input_publish_tujuhsembilan() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.079 User click button simpan")
    public void user_click_button_simpan_tujuhsembilan() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

//===============================================================================================================

    // Tambah Benefit Judul Satu SImbol

    @When("TCC.JC.080 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_delapanpuluh() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.080 User input judul satu")
    public void user_input_judul_satu_delapanpuluh() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.080 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapanpuluh() {
        tambahBenefit.setdeskripsisatu("Deskripsi @@@");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.080 User input judul dua")
    public void user_input_judul_dua_delapanpuluh() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.080 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapanpuluh() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.080 User input judul tiga")
    public void user_input_judul_tiga_delapanpuluh() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.080 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapanpuluh() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.080 User input judul empat")
    public void user_input_judul_empat_delapanpuluh() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.080 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapanpuluh() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.080 User input publish")
    public void user_input_publish_delapanpuluh() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.080 User click button simpan")
    public void user_click_button_simpan_delapanpuluh() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

}
