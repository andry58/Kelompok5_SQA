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

public class TestJudulSatu {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestJudulSatu() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Tambah Benefit Judul Satu
    @When("TCC.Juara.009 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.Juara.009 User input judul satu")
    public void user_input_judul_satu() {
        tambahBenefit.setjudulsatu("judul satu");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("User input deskripsi jd satu")
    public void user_input_deskripsi_satu_satu() {
        tambahBenefit.setdeskripsisatu("input satu");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("User input judul dua jd satu")
    public void user_input_judul_dua_satu() {
        tambahBenefit.setjuduldua("input satu");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("User input deskripsi dua jd satu")
    public void user_input_deskripsi_dua_satu() {
        tambahBenefit.setdeskripsidua("input satu");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("User input judul tiga jd satu")
    public void user_input_judul_tiga_satu() {
        tambahBenefit.setjudultiga("input satu");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("User input deskripsi tiga jd satu")
    public void user_input_deskripsi_tiga_satu() {
        tambahBenefit.setdeskripsitiga("input satu");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("User input judul empat jd satu")
    public void user_input_judul_empat_satu() {
        tambahBenefit.setjudulempat("input satu");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("User input deskripsi empat jd satu")
    public void user_input_deskripsi_empat_satu() {
        tambahBenefit.setdeskripsiempat("input satu");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.Juara.009 User input publish")
    public void user_input_publish_satu() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.Juara.009 User click button simpan")
    public void user_click_button_simpan_satu() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


//==============================================================================================================
    // Tambah Benefit Judul Satu Angka Huruf

    @When("TCC.JC.070 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_tujuhpuluh() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.070 User input judul satu")
    public void user_input_judul_satu_tujuhpuluh() {
        tambahBenefit.setjudulsatu("Judul 123");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.070 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhpuluh() {
        tambahBenefit.setdeskripsisatu("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.070 User input judul dua")
    public void user_input_judul_dua_tujuhpuluh() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.070 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhpuluh() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.070 User input judul tiga")
    public void user_input_judul_tiga_tujuhpuluh() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.070 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhpuluh() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.070 User input judul empat")
    public void user_input_judul_empat_tujuhpuluh() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.070 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhpuluh() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.070 User input publish")
    public void user_input_publish_tujuhpuluh() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.070 User click button simpan")
    public void user_click_button_simpan_tujuhpuluh() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

//===============================================================================================================

    // Tambah Benefit Judul Satu SImbol

    @When("TCC.JC.071 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_tujuhsatu() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.071 User input judul satu")
    public void user_input_judul_satu_tujuhsatuh() {
        tambahBenefit.setjudulsatu("Judul @@@");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.071 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhsatu() {
        tambahBenefit.setdeskripsisatu("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.071 User input judul dua")
    public void user_input_judul_dua_tujuhsatu() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.071 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhsatu() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.071 User input judul tiga")
    public void user_input_judul_tiga_tujuhsatu() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.071 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhsatu() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.071 User input judul empat")
    public void user_input_judul_empat_tujuhsatu() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.071 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhsatu() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.071 User input publish")
    public void user_input_publish_tujuhsatu() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.071 User click button simpan")
    public void user_click_button_simpan_tujuhsatu() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }
}
