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


public class TestDeskripsiSatu {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestDeskripsiSatu() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Tambah Benefit Judul Satu
    @When("TCC.JC.072 User go to web Tambah Benefit")
    public void user_go_to_web_tambah_benefit_tujuhdua() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.072 User input judul satu")
    public void user_input_judul_satu_tujuhdua() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.072 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhdua() {
        tambahBenefit.setdeskripsisatu("harusnya kosong");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.072 User input judul dua")
    public void user_input_judul_dua_tujuhdua() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.072 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhdua() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.072 User input judul tiga")
    public void user_input_judul_tiga_tujuhdua() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.072 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhdua() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.072 User input judul empat")
    public void user_input_judul_empat_tujuhdua() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.072 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhdua() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.072 User input publish")
    public void user_input_publish_tujuhdua() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.072 User click button simpan")
    public void user_click_button_simpan_tujuhdua() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


//==============================================================================================================
    // Tambah Benefit Judul Satu Angka Huruf

    @When("TCC.JC.073 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_tujuhtiga() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.073 User input judul satu")
    public void user_input_judul_satu_tujuhtiga() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.073 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhtiga() {
        tambahBenefit.setdeskripsisatu("Deskripsi 123");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.073 User input judul dua")
    public void user_input_judul_dua_tujuhtiga() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.073 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhtiga() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.073 User input judul tiga")
    public void user_input_judul_tiga_tujuhtiga() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.073 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhtiga() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.073 User input judul empat")
    public void user_input_judul_empat_tujuhtiga() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.073 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhtiga() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.073 User input publish")
    public void user_input_publish_tujuhtiga() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.073 User click button simpan")
    public void user_click_button_simpan_tujuhtiga() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

//===============================================================================================================

    // Tambah Benefit Judul Satu SImbol

    @When("TCC.JC.074 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_tujuhempat() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.074 User input judul satu")
    public void user_input_judul_satu_tujuhempat() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.074 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhempat() {
        tambahBenefit.setdeskripsisatu("Deskripsi @@@");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.074 User input judul dua")
    public void user_input_judul_dua_tujuhempat() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.074 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhempat() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.074 User input judul tiga")
    public void user_input_judul_tiga_tujuhempat() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.074 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhempat() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.074 User input judul empat")
    public void user_input_judul_empat_tujuhempat() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.074 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhempat() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.074 User input publish")
    public void user_input_publish_tujuhempat() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.074 User click button simpan")
    public void user_click_button_simpan_tujuhempat() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

}
