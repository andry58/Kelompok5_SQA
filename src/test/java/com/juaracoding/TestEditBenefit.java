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

public class TestEditBenefit {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages editBenefit = new TambahBenefitPages();

    public TestEditBenefit() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Edit Judul Satu ============================================================================================================
    @When("TCC.JC.110 User go to web Edit Benefit")
    public void TCCJC110_User_go_to_web_Edit_Benefit() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/benefit/data-benefit/edit/83");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.110 User edit judul satu")
    public void TCCJC110_User_edit_judul_satu() {
        editBenefit.setjudulsatuedit("Ganti Judul Satu");
        extentTest.log(LogStatus.PASS, "TCC.JC.110 User edit judul satu");
    }

    @And("TCC.JC.110 User edit deskripsi satu")
    public void TCCJC110_User_edit_deskripsi_satu() {
        editBenefit.setdeskripsisatuedit("Ganti Deskripsi Satu");
        extentTest.log(LogStatus.PASS, "TCC.JC.110 User edit deskripsi satu");
    }

    @And("TCC.JC.110 User edit judul dua")
    public void TCCJC110_User_edit_judul_dua() {
        editBenefit.setjudulduaedit("Ganti Judul Dua");
        extentTest.log(LogStatus.PASS, "TCC.JC.110 User edit judul dua");
    }

    @And("TCC.JC.110 User edit deskripsi dua")
    public void TCCJC110_User_edit_deskripsi_dua() {
        editBenefit.setdeskripsiduaedit("Ganti Deskripsi Dua");
        extentTest.log(LogStatus.PASS, "TCC.JC.110 User edit deskripsi dua");
    }

    @And("TCC.JC.110 User edit judul tiga")
    public void TCCJC110_User_edit_judul_tiga() {
        editBenefit.setjudultigaedit("Ganti Judul Tiga");
        extentTest.log(LogStatus.PASS, "TCC.JC.110 User edit judul tiga");
    }

    @And("TCC.JC.110 User edit deskripsi tiga")
    public void TCCJC110_User_edit_deskripsi_tiga() {
        editBenefit.setdeskripsitigaedit("Ganti Deskripsi Tiga");
        extentTest.log(LogStatus.PASS, "TCC.JC.110 User edit deskripsi tiga");
    }

    @And("TCC.JC.110 User edit judul empat")
    public void TCCJC110_User_edit_judul_empat() {
        editBenefit.setjudulempatedit("Ganti Judul Empat");
        extentTest.log(LogStatus.PASS, "TCC.JC.110 User edit judul empat");
    }

    @And("TCC.JC.110 User edit deskripsi empat")
    public void TCCJC110_User_edit_deskripsi_empat() {
        editBenefit.setdeskripsisatuedit("Ganti Deskripsi Empat");
        extentTest.log(LogStatus.PASS, "TCC.JC.110 User edit deskripsi empat");
    }

    @Then("TCC.JC.110 User click button edit")
    public void TCCJCC093_User_click_button_edit() {
        //driver.get(Constants.URL);
        editBenefit.kliksiempatedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.011 User click button edit");
    }

    //Edit Judul Satu Angka Huruf ===========================================================================================

    @When("TCC.JC.111 User go to web Edit Benefit")
    public void TCCJC011_User_go_to_web_Edit_Benefit() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/benefit/data-benefit/edit/83");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.111 User edit judul satu")
    public void TCCJC111_User_edit_judul_satu() {
        editBenefit.setjudulsatuedit("Ganti Judul 1");
        extentTest.log(LogStatus.PASS, "TCC.JC.111 User edit judul satu");
    }

    @And("TCC.JC.111 User edit deskripsi satu")
    public void TCCJC111_User_edit_deskripsi_satu() {
        editBenefit.setdeskripsisatuedit("Ganti Deskripsi 1");
        extentTest.log(LogStatus.PASS, "TCC.JC.111 User edit deskripsi satu");
    }

    @And("TCC.JC.111 User edit judul dua")
    public void TCCJC111_User_edit_judul_dua() {
        editBenefit.setjudulduaedit("Ganti Judul 2");
        extentTest.log(LogStatus.PASS, "TCC.JC.111 User edit judul dua");
    }

    @And("TCC.JC.111 User edit deskripsi dua")
    public void TCCJC111_User_edit_deskripsi_dua() {
        editBenefit.setdeskripsiduaedit("Ganti Deskripsi 2");
        extentTest.log(LogStatus.PASS, "TCC.JC.111 User edit deskripsi dua");
    }

    @And("TCC.JC.111 User edit judul tiga")
    public void TCCJC111_User_edit_judul_tiga() {
        editBenefit.setjudultigaedit("Ganti Judul 3");
        extentTest.log(LogStatus.PASS, "TCC.JC.111 User edit judul tiga");
    }

    @And("TCC.JC.111 User edit deskripsi tiga")
    public void TCCJC111_User_edit_deskripsi_tiga() {
        editBenefit.setdeskripsitigaedit("Ganti Deskripsi 3");
        extentTest.log(LogStatus.PASS, "TCC.JC.111 User edit deskripsi tiga");
    }

    @And("TCC.JC.111 User edit judul empat")
    public void TCCJC111_User_edit_judul_empat() {
        editBenefit.setjudulempatedit("Ganti Judul 4");
        extentTest.log(LogStatus.PASS, "TCC.JC.111 User edit judul empat");
    }

    @And("TCC.JC.111 User edit deskripsi empat")
    public void TCCJC111_User_edit_deskripsi_empat() {
        editBenefit.setdeskripsisatuedit("Ganti Deskripsi 4");
        extentTest.log(LogStatus.PASS, "TCC.JC.111 User edit deskripsi empat");
    }

    @Then("TCC.JC.111 User click button edit")
    public void TCCJCC111_User_click_button_edit() {
        //driver.get(Constants.URL);
        editBenefit.kliksiempatedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.111 User click button edit");
    }

    //Edit Judul Satu Simbol ===========================================================================================

    @When("TCC.JC.112 User go to web Edit Benefit")
    public void TCCJCC112_User_go_to_web_Edit_Benefit() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/benefit/data-benefit/edit/83");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JCC.112 User go to web Edit Benefit");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.112 User edit judul satu")
    public void TCCJC112_User_edit_judul_satu() {
        editBenefit.setjudulsatuedit("Ganti Judul 1 @@@");
        extentTest.log(LogStatus.PASS, "TCC.JC.112 User edit judul satu");
    }

    @And("TCC.JC.112 User edit deskripsi satu")
    public void TCCJC112_User_edit_deskripsi_satu() {
        editBenefit.setdeskripsisatuedit("Ganti Deskripsi 1 @@@");
        extentTest.log(LogStatus.PASS, "TCC.JC.112 User edit deskripsi satu");
    }

    @And("TCC.JC.112 User edit judul dua")
    public void TCCJC112_User_edit_judul_dua() {
        editBenefit.setjudulduaedit("Ganti Judul 2 @@@");
        extentTest.log(LogStatus.PASS, "TCC.JC.112 User edit judul dua");
    }

    @And("TCC.JC.112 User edit deskripsi dua")
    public void TCCJC112_User_edit_deskripsi_dua() {
        editBenefit.setdeskripsiduaedit("Ganti Deskripsi 2 @@@");
        extentTest.log(LogStatus.PASS, "TCC.JC.112 User edit deskripsi dua");
    }

    @And("TCC.JC.112 User edit judul tiga")
    public void TCCJC112_User_edit_judul_tiga() {
        editBenefit.setjudultigaedit("Ganti Judul 3 @@@");
        extentTest.log(LogStatus.PASS, "TCC.JC.112 User edit judul tiga");
    }

    @And("TCC.JC.112 User edit deskripsi tiga")
    public void TCCJC112_User_edit_deskripsi_tiga() {
        editBenefit.setdeskripsitigaedit("Ganti Deskripsi 3 @@@");
        extentTest.log(LogStatus.PASS, "TCC.JC.112 User edit deskripsi tiga");
    }

    @And("TCC.JC.112 User edit judul empat")
    public void TCCJC112_User_edit_judul_empat() {
        editBenefit.setjudulempatedit("Ganti Judul 4 @@@");
        extentTest.log(LogStatus.PASS, "TCC.JC.112 User edit judul empat");
    }

    @And("TCC.JC.112 User edit deskripsi empat")
    public void TCCJC112_User_edit_deskripsi_empat() {
        editBenefit.setdeskripsisatuedit("Ganti Deskripsi 4 @@@");
        extentTest.log(LogStatus.PASS, "TCC.JC.112 User edit deskripsi empat");
    }

    @Then("TCC.JC.112 User click button edit")
    public void TCCJCC112_User_click_button_edit() {
      //  driver.get(Constants.URL);
        editBenefit.kliksiempatedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.112 User click button edit");
    }


    //Edit Field Judul Satu =============================================================================================

    @When("TCC.JC.113 User go to web Edit Benefit")
    public void TCCJCC113_User_go_to_web_Edit_Benefit() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/benefit/data-benefit/edit/83");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JCC.113 User go to web Edit Benefit");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.113 User edit judul satu")
    public void TCCJC113_User_edit_judul_satu() {
        editBenefit.setjudulsatuedit("Ganti Hanya Field Judul Satu");
        extentTest.log(LogStatus.PASS, "TCC.JC.113 User edit judul satu");
    }

    @Then("TCC.JC.113 User click button edit")
    public void TCCJCC113_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editBenefit.kliksiempatedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.113 User click button edit");
    }

    //Edit Field Judul Satu Angka Huruf =============================================================================================

    @When("TCC.JC.114 User go to web Edit Benefit")
    public void TCCJCC114_User_go_to_web_Edit_Benefit() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/benefit/data-benefit/edit/83");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JCC.114 User go to web Edit Benefit");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.114 User edit judul satu")
    public void TCCJC114_User_edit_judul_satu() {
        editBenefit.setjudulsatuedit("Ganti Hanya Field Judul Satu 12345");
        extentTest.log(LogStatus.PASS, "TCC.JC.114 User edit judul satu");
    }

    @Then("TCC.JC.114 User click button edit")
    public void TCCJCC114_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editBenefit.kliksiempatedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.114 User click button edit");
    }

    //Edit Field Judul Satu Simbol =============================================================================================

    @When("TCC.JC.115 User go to web Edit Benefit")
    public void TCCJCC115_User_go_to_web_Edit_Benefit() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/benefit/data-benefit/edit/83");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JCC.115 User go to web Edit Benefit");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.115 User edit judul satu")
    public void TCCJC115_User_edit_judul_satu() {
        editBenefit.setjudulsatuedit("Ganti Hanya Field Judul Satu 12345");
        extentTest.log(LogStatus.PASS, "TCC.JC.115 User edit judul satu");
    }

    @Then("TCC.JC.115 User click button edit")
    public void TCCJCC115_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editBenefit.kliksiempatedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.115 User click button edit");
    }

}
