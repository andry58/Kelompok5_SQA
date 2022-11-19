package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.pages.HalamanRincianBiaya;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHalamanRincianBiaya {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private HalamanRincianBiaya rincianBiaya = new HalamanRincianBiaya();

    public TestHalamanRincianBiaya() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Halaman Rincian Biaya

    @When("TCC.JC.035 Admin klik button menu home")
    public void admin_klik_button_menu_home() {
        rincianBiaya.clickBtnHome();
        extentTest.log(LogStatus.PASS, "Admin klik button menu home");
    }

    @And("TCC.JC.035 Admin klik button menu rincian biaya")
    public void admin_klik_button_rincian_biaya() {
        rincianBiaya.clickBtnRincianBiaya();
        extentTest.log(LogStatus.PASS, "Admin klik button menu rincian biaya");
    }

    @Then("TCC.JC.035 Halaman rincian biaya ditampilkan")
    public void admin_invalid_credentials() {
        Assert.assertEquals(rincianBiaya.getTxtRincianBiaya(), "Data Rincian Biaya");
        extentTest.log(LogStatus.PASS, "Halaman Rincian Biaya ditampilkan");
    }

}
