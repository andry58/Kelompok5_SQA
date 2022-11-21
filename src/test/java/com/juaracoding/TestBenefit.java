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


    // Klik Menu Home =====================================================================================================================
    @When("TCC.JC.081 User Klik Tombol Home")
    public void TCCJC081_User_Klik_Tombol_Home() {
        tambahBenefit.setbtnhome();
        extentTest.log(LogStatus.PASS, "TCC.JC.081 User Klik Tombol Home");
    }
    @Then ("TCC.JC.081 User Klik Tombol Benefit")
    public void TCCJC081_User_Klik_Tombol_Benefit() {
        Hooks.delay(1);
        tambahBenefit.setbtnenefit();
        extentTest.log(LogStatus.PASS,"TCC.JC.081 User Klik Tombol Benefit");
    }
  //  @Then("TCC.JC.081 Tampil Halaman Tambah Benefit")
  //  public void TCCJC081_Tampil_Halaman_Tambah_Benefit() {
   //     tambahBenefit.settextdatabenefit();
    //    extentTest.log(LogStatus.PASS,"TCC.JC.081 Tampil Halaman Tambah Benefit");
    //}


    // Tambah Benefit ======================================================================================================
    @When("User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit() {
        Hooks.delay(1);
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");
    }

    @And("TCC.JC.082 Input Data Benefit")
    public void TCCJC082_Input_Data_Benefit() {
        Hooks.delay(1);
        Assert.assertEquals(tambahBenefit.settextisibenefit(),"Tambah Benefit");
        //tambahBenefit.setjudulsatu("judulsatu");
        extentTest.log(LogStatus.PASS,"TCCJC082_Input_Data_Benefit");
    }

    @And("User input judul satu")
    public void user_input_judul_satu() {
        Hooks.delay(1);
        tambahBenefit.setjudulsatu("judulsatu");
        extentTest.log(LogStatus.PASS,"User input judul satu");
    }

    @And("User input deskripsi satu")
    public void user_input_deskripsi_satu() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsisatu("dessatu");
        extentTest.log(LogStatus.PASS,"User input deskripsi satu");
    }

    @And("User input judul dua")
    public void user_input_judul_dua() {
        Hooks.delay(1);
        tambahBenefit.setjuduldua("judulsatu");
        extentTest.log(LogStatus.PASS,"User input judul dua");
    }

    @And("User input deskripsi dua")
    public void user_input_deskripsi_dua() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsidua("desdua");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua");
    }

    @And("User input judul tiga")
    public void user_input_judul_tiga() {
        Hooks.delay(1);
        tambahBenefit.setjudultiga("judultiga");
        extentTest.log(LogStatus.PASS,"User input judul tiga");
    }

    @And("User input deskripsi tiga")
    public void user_input_deskripsi_tiga() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsitiga("desdua");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga");
    }

    @And("User input judul empat")
    public void user_input_judul_empat() {
        Hooks.delay(1);
        tambahBenefit.setjudulempat("judulsatu");
        extentTest.log(LogStatus.PASS,"User input judul empat");
    }

    @And("User input deskripsi empat")
    public void user_input_deskripsi_empat() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsiempat("judul1");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat");
    }

    @And("User input publish")
    public void user_input_publish() {
        Hooks.delay(1);
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish");
    }

    @Then("User click button simpan")
    public void user_click_button_simpan() {
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"User click button simpan");
    }


   // @Then("Muncul Pesan Data Tersimpan")
   // public void Muncul_Data_Tersimpan() {
   //     Assert.assertEquals(tambahBenefit.settextdatatersimpan(),"Data berhasil di tambah");
    //}

    // Tambah dengan angak dan huruf ===================================================================================
    @When("TCC.Juara.007 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_angkahuruf() {
        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("User input judul satu angka huruf")
    public void user_input_judul_satu_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.setjudulsatu("judul 11");
        extentTest.log(LogStatus.PASS,"User input judul satu angka huruf");
    }

    @And("User input deskripsi angka huruf")
    public void user_input_deskripsi_satu_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsisatu("deskripsi 11");
        extentTest.log(LogStatus.PASS,"User input deskripsi angka huruf");
    }

    @And("User input judul dua angka huruf")
    public void user_input_judul_dua_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.setjuduldua("judul dua 22");
        extentTest.log(LogStatus.PASS,"User input judul angka huruf");
    }

    @And("User input deskripsi dua angka huruf")
    public void user_input_deskripsi_dua_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsidua("desdua 22");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua angka huruf");
    }

    @And("User input judul tiga angka huruf")
    public void user_input_judul_tiga_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.setjudultiga("judul tiga 33");
        extentTest.log(LogStatus.PASS,"User input judul tiga angka huruf");
    }

    @And("User input deskripsi tiga angka huruf")
    public void user_input_deskripsi_tiga_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsitiga("desdua 33");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga angka huruf");
    }

    @And("User input judul empat angka huruf")
    public void user_input_judul_empat_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.setjudulempat("judul empat 33");
        extentTest.log(LogStatus.PASS,"User input judul empat angka huruf");
    }

    @And("User input deskripsi empat angka huruf")
    public void user_input_deskripsi_empat_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsiempat("judul empat 44");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat angka huruf");
    }

    @And("TCC.Juara.007 User input publish")
    public void user_input_publish_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"TCC.Juara.007 User input publish");
    }

    @Then("TCC.Juara.007 User click button simpan")
    public void user_click_button_simpan_angkahuruf() {
        Hooks.delay(1);
        tambahBenefit.clickButtonSimpan();
        extentTest.log(LogStatus.PASS,"TCC.Juara.007 User click button simpan");
    }


    //Tambah data Benefit Simbol ========================================================================================


    //@When("TCC.Juara.008 User go to web Tambah Benefit")
   // public void user_go_to_web_Tambah_Benefit_simbol() {
    //    driver.get(Constants.URL);
   //     extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

   // }
  // When TCC.Juara.008 User go to web Tambah Benefit

    @When("TCC.Juara.008 User go to web Tambah Benefit")
    public void user_go_to_web_Tambah_Benefit_simbol() {

        tambahBenefit.setbtntambahbenefit();
        extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("User input judul satu simbol")
    public void user_input_judul_satu_simbol() {
        Hooks.delay(1);
        tambahBenefit.setjudulsatu("judul @@");
        extentTest.log(LogStatus.PASS,"User input judul satu simbol");
    }

    @And("User input deskripsi simbol")
    public void user_input_deskripsi_satu_simbol() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsisatu("deskripsi @@");
        extentTest.log(LogStatus.PASS,"User input deskripsi simbol");
    }

    @And("User input judul dua simbol")
    public void user_input_judul_dua_simbol() {
        Hooks.delay(1);
        tambahBenefit.setjuduldua("judul dua @@");
        extentTest.log(LogStatus.PASS,"User input judul dua simbol");
    }

    @And("User input deskripsi dua simbol")
    public void user_input_deskripsi_dua_simbol() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsidua("desdua @@");
        extentTest.log(LogStatus.PASS,"User input deskripsi dua simbol");
    }

    @And("User input judul tiga simbol")
    public void user_input_judul_tiga_simbol() {
        Hooks.delay(1);
        tambahBenefit.setjudultiga("judul tiga @@");
        extentTest.log(LogStatus.PASS,"User input judul tiga simbol");
    }

    @And("User input deskripsi tiga simbol")
    public void user_input_deskripsi_tiga_simbol() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsitiga("desdua @@");
        extentTest.log(LogStatus.PASS,"User input deskripsi tiga simbol");
    }

    @And("User input judul empat simbol")
    public void user_input_judul_empat_simbol() {
        Hooks.delay(1);
        tambahBenefit.setjudulempat("judul empat @@");
        extentTest.log(LogStatus.PASS,"User input judul empat simbol");
    }

    @And("User input deskripsi empat simbol")
    public void user_input_deskripsi_empat_simbol() {
        Hooks.delay(1);
        tambahBenefit.setdeskripsiempat("judul empat @@");
        extentTest.log(LogStatus.PASS,"User input deskripsi empat simbol");
    }

    @And("TCC.Juara.008 User input publish")
    public void user_input_publish_simbol() {
        Hooks.delay(1);
        tambahBenefit.setpublish();
        extentTest.log(LogStatus.PASS,"User input publish simbol");
    }

    @Then("TCC.Juara.008 User click button simpan")
    public void user_click_button_simpan_simbol() {
        tambahBenefit.clickButtonSimpan();
        Assert.assertEquals(tambahBenefit.settextdatabenefit(), "Data Tidak Berhasil disimpan");
        extentTest.log(LogStatus.PASS,"User click button simpan simbol");
    }

}
