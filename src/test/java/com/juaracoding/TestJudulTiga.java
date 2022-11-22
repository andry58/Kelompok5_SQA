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

public class TestJudulTiga {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestJudulTiga() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Tambah Benefit Judul Tiga
    @When("TCC.JC.081 User go to web Tambah Benefit")
    public void user_go_to_web_tambah_benefit_delapansatu() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.081 User input judul satu")
    public void user_input_judul_satu_delapansatu() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.081 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapansatu() {
        tambahBenefit.setdeskripsisatu("harusnya kosong");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.081 User input judul dua")
    public void user_input_judul_dua_delapansatu() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.081 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapansatu() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.081 User input judul tiga")
    public void user_input_judul_tiga_delapansatu() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.081 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapansatu() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.081 User input judul empat")
    public void user_input_judul_empat_delapansatu() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.081 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapansatu() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.081 User input publish")
    public void user_input_publish_delapansatu() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.081 User click button simpan")
    public void user_click_button_simpan_delapansatu() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


//==============================================================================================================
    // Tambah Benefit Judul Tiga Angka Huruf

    @When("TCC.JC.082 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_delapandua() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.082 User input judul satu")
    public void user_input_judul_satu_delapandua() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.082 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapandua() {
        tambahBenefit.setdeskripsisatu("Deskripsi 123");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.082 User input judul dua")
    public void user_input_judul_dua_delapandua() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.082 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapandua() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.082 User input judul tiga")
    public void user_input_judul_tiga_delapandua() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.082 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapandua() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.082 User input judul empat")
    public void user_input_judul_empat_delapandua() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.082 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapandua() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.082 User input publish")
    public void user_input_publish_delapandua() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.082 User click button simpan")
    public void user_click_button_simpan_delapandua() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

//===============================================================================================================

    // Tambah Benefit Judul Satu SImbol

    @When("TCC.JC.083 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_delapantiga() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.083 User input judul satu")
    public void user_input_judul_satu_delapantiga() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.083 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapantiga() {
        tambahBenefit.setdeskripsisatu("Input Data");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.083 User input judul dua")
    public void user_input_judul_dua_delapantiga() {
        tambahBenefit.setjuduldua("Data Simbol @@@");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.083 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapantiga() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.083 User input judul tiga")
    public void user_input_judul_tiga_delapantiga() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.083 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapantiga() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.083 User input judul empat")
    public void user_input_judul_empat_delapantiga() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.083 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapantiga() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.083 User input publish")
    public void user_input_publish_delapantiga() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.083 User click button simpan")
    public void user_click_button_simpan_delapantiga() {
        tambahBenefit.clickButtonSimpan();
        Assert.assertEquals(tambahBenefit.settextdatabenefit(), "Data Tidak Berhasil disimpan");
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

}
