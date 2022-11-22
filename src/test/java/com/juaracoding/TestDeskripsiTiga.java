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

public class TestDeskripsiTiga {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestDeskripsiTiga() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Tambah Benefit Deskripsi Tiga
    @When("TCC.JC.084 User go to web Tambah Benefit")
    public void user_go_to_web_tambah_benefit_delapanempat() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.084 User input judul satu")
    public void user_input_judul_satu_delapanempat() {
        Hooks.delay(1);
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.084 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapanempat() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsisatu("harusnya kosong");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.084 User input judul dua")
    public void user_input_judul_dua_delapanempat() {
        Hooks.delay(1);
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.084 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapanempat() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.084 User input judul tiga")
    public void user_input_judul_tiga_delapanempat() {
        Hooks.delay(1);
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.084 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapanempat() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.084 User input judul empat")
    public void user_input_judul_empat_delapanempat() {
        Hooks.delay(1);
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.084 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapanempat() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.084 User input publish")
    public void user_input_publish_delapanempat() {
        Hooks.delay(1);
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.084 User click button simpan")
    public void user_click_button_simpan_delapanempat() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


//==============================================================================================================
    // Tambah Benefit Deskripsi Tiga Angka Huruf

    @When("TCC.JC.085 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_delapanlima() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.085 User input judul satu")
    public void user_input_judul_satu_delapanlima() {
        Hooks.delay(1);
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.085 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapanlima() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsisatu("Deskripsi 123");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.085 User input judul dua")
    public void user_input_judul_dua_delapanlima() {
        Hooks.delay(1);
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.085 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapanlima() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.085 User input judul tiga")
    public void user_input_judul_tiga_delapanlima() {
        Hooks.delay(1);
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.085 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapanlima() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.085 User input judul empat")
    public void user_input_judul_empat_delapanlima() {
        Hooks.delay(1);
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.085 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapanlima() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.085 User input publish")
    public void user_input_publish_delapanlima() {
        Hooks.delay(1);
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.085 User click button simpan")
    public void user_click_button_simpan_delapanlima() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

//===============================================================================================================

    // Tambah Benefit Desrkripsi Tiga SImbol

    @When("TCC.JC.086 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_delapanenam() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.086 User input judul satu")
    public void user_input_judul_satu_delapanenam() {
        Hooks.delay(1);
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.086 User input deskripsi satu")
    public void user_input_deskripsi_satu_delapanenam() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsisatu("Input Data");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.086 User input judul dua")
    public void user_input_judul_dua_delapanenam() {
        Hooks.delay(1);
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.086 User input deskripsi dua")
    public void user_input_deskripsi_dua_delapanenam() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.086 User input judul tiga")
    public void user_input_judul_tiga_delapanenam() {
        Hooks.delay(1);
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.086 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_delapanenam() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsitiga("Data Simbol @@@@");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.086 User input judul empat")
    public void user_input_judul_empat_delapanenam() {
        Hooks.delay(1);
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.086 User input deskripsi empat")
    public void user_input_deskripsi_empat_delapanenam() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.086 User input publish")
    public void user_input_publish_delapanenam() {
        Hooks.delay(1);
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.086 User click button simpan")
    public void user_click_button_simpan_delapanenam() {
        tambahBenefit.clickButtonSimpan();
        Assert.assertEquals(tambahBenefit.settextdatabenefit(), "Data Tidak Berhasil disimpan");
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

}
