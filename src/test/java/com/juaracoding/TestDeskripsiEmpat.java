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

public class TestDeskripsiEmpat {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestDeskripsiEmpat() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Tambah Benefit Deskripsi Empat
    @When("TCC.JC.090 User go to web Tambah Benefit")
    public void user_go_to_web_tambah_benefit_sembilanpuluh() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.090 User input judul satu")
    public void user_input_judul_satu_sembilanpuluh() {
        Hooks.delay(1);
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.090 User input deskripsi satu")
    public void user_input_deskripsi_satu_sembilanpuluh() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsisatu("harusnya kosong");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.090 User input judul dua")
    public void user_input_judul_dua_sembilanpuluh() {
        Hooks.delay(1);
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.090 User input deskripsi dua")
    public void user_input_deskripsi_dua_sembilanpuluh() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.090 User input judul tiga")
    public void user_input_judul_tiga_sembilanpuluh() {
        Hooks.delay(1);
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.090 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_sembilanpuluh() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.090 User input judul empat")
    public void user_input_judul_empat_sembilanpuluh() {
        Hooks.delay(1);
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.090 User input deskripsi empat")
    public void user_input_deskripsi_empat_sembilanpuluh() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.090 User input publish")
    public void user_input_publish_sembilanpuluh() {
        Hooks.delay(1);
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.090 User click button simpan")
    public void user_click_button_simpan_sembilanpuluh() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


//==============================================================================================================
    // Tambah Benefit Deskripsi Empat Angka Huruf

    @When("TCC.JC.091 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_sembilansatu() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.091 User input judul satu")
    public void user_input_judul_satu_sembilansatu() {
        Hooks.delay(1);
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.091 User input deskripsi satu")
    public void user_input_deskripsi_satu_sembilansatu() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsisatu("Deskripsi 123");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.091 User input judul dua")
    public void user_input_judul_dua_sembilansatu() {
        Hooks.delay(1);
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.091 User input deskripsi dua")
    public void user_input_deskripsi_dua_sembilansatu() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.091 User input judul tiga")
    public void user_input_judul_tiga_sembilansatu() {
        Hooks.delay(1);
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.091 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_sembilansatu() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.091 User input judul empat")
    public void user_input_judul_empat_sembilansatu() {
        Hooks.delay(1);
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.091 User input deskripsi empat")
    public void user_input_deskripsi_empat_sembilansatu() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.091 User input publish")
    public void user_input_publish_sembilansatu() {
        Hooks.delay(1);
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.091 User click button simpan")
    public void user_click_button_simpan_sembilansatu() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

//===============================================================================================================

    // Tambah Benefit Deskripsi Empat SImbol

    @When("TCC.JC.092 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_sembilandua() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.092 User input judul satu")
    public void user_input_judul_satu_sembilandua() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.092 User input deskripsi satu")
    public void user_input_deskripsi_satu_sembilandua() {
        tambahBenefit.setdeskripsisatu("Deskripsi @@@");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.092 User input judul dua")
    public void user_input_judul_dua_sembilandua() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.092 User input deskripsi dua")
    public void user_input_deskripsi_dua_sembilandua() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.092 User input judul tiga")
    public void user_input_judul_tiga_sembilandua() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.092 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_sembilandua() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.092 User input judul empat")
    public void user_input_judul_empat_sembilandua() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.092 User input deskripsi empat")
    public void user_input_deskripsi_empat_sembilandua() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.092 User input publish")
    public void user_input_publish_sembilandua() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.092 User click button simpan")
    public void user_click_button_simpan_sembilandua() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

}
