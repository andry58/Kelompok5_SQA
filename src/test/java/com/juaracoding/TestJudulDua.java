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

public class TestJudulDua {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestJudulDua() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Tambah Benefit Judul Dua
    @When("TCC.JC.075 User go to web Tambah Benefit")
    public void user_go_to_web_tambah_benefit_tujuhlima() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.075 User input judul satu")
    public void user_input_judul_satu_tujuhlima() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.075 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhlima() {
        tambahBenefit.setdeskripsisatu("harusnya kosong");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.075 User input judul dua")
    public void user_input_judul_dua_tujuhlima() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.075 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhlima() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.075 User input judul tiga")
    public void user_input_judul_tiga_tujuhlima() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.075 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhlima() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.075 User input judul empat")
    public void user_input_judul_empat_tujuhlima() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.075 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhlima() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.075 User input publish")
    public void user_input_publish_tujuhlima() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.075 User click button simpan")
    public void user_click_button_simpan_tujuhlima() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


//==============================================================================================================
    // Tambah Benefit Judul Dua Angka Huruf

    @When("TCC.JC.076 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_tujuhenam() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.076 User input judul satu")
    public void user_input_judul_satu_tujuhenam() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.076 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhenam() {
        tambahBenefit.setdeskripsisatu("Deskripsi 123");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.076 User input judul dua")
    public void user_input_judul_dua_tujuhenam() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.076 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhenam() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.076 User input judul tiga")
    public void user_input_judul_tiga_tujuhenam() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.076 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhenam() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.076 User input judul empat")
    public void user_input_judul_empat_tujuhenam() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.076 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhenam() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.076 User input publish")
    public void user_input_publish_tujuhenam() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.076 User click button simpan")
    public void user_click_button_simpan_tujuhenam() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

//===============================================================================================================

    // Tambah Benefit Judul Dua SImbol

    @When("TCC.JC.077 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_tujuhempat() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.077 User input judul satu")
    public void user_input_judul_satu_tujuhempat() {
        tambahBenefit.setjudulsatu("input data");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("TCC.JC.077 User input deskripsi satu")
    public void user_input_deskripsi_satu_tujuhempat() {
        tambahBenefit.setdeskripsisatu("Deskripsi @@@");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("TCC.JC.077 User input judul dua")
    public void user_input_judul_dua_tujuhempat() {
        tambahBenefit.setjuduldua("input data");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("TCC.JC.077 User input deskripsi dua")
    public void user_input_deskripsi_dua_tujuhempat() {
        tambahBenefit.setdeskripsidua("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("TCC.JC.077 User input judul tiga")
    public void user_input_judul_tiga_tujuhempat() {
        tambahBenefit.setjudultiga("input data");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("TCC.JC.077 User input deskripsi tiga")
    public void user_input_deskripsi_tiga_tujuhempat() {
        tambahBenefit.setdeskripsitiga("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("TCC.JC.077 User input judul empat")
    public void user_input_judul_empat_tujuhempat() {
        tambahBenefit.setjudulempat("input data");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("TCC.JC.077 User input deskripsi empat")
    public void user_input_deskripsi_empat_tujuhempat() {
        tambahBenefit.setdeskripsiempat("input data");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("TCC.JC.077 User input publish")
    public void user_input_publish_tujuhempat() {
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("TCC.JC.077 User click button simpan")
    public void user_click_button_simpan_tujuhempat() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }

}
