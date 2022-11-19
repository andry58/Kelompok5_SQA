package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.pages.ShortingRincianBiaya;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestShortingRincianBiaya {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private ShortingRincianBiaya shorting = new ShortingRincianBiaya();

    public TestShortingRincianBiaya() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Shorting Data by Diskon
    @When("TCC.JC.037 Admin klik shorting data by Diskon")
    public void shorting_data_by_diskon() {
        shorting.setShortingData("diskon");
        extentTest.log(LogStatus.PASS, "Admin klik shorting data by Diskon");
    }

    @Then("TCC.JC.037 List data diurutkan secara ascending berdasarkan Diskon")
    public void list_data_diurutkan_berdasarkan_diskon() {
        Assert.assertEquals(shorting.getTxtShortingDiskon(), "%");
        extentTest.log(LogStatus.PASS, "List data diurutkan secara ascending berdasarkan Nama Program");
    }

    // Shorting Data by Nama Program
    @When("TCC.JC.038 Admin klik shorting data by Nama Program")
    public void shorting_data_by_nama_program() {
        shorting.setShortingData("nama_program");
        extentTest.log(LogStatus.PASS, "Admin klik shorting data by Nama Program");
    }

    @Then("TCC.JC.038 List data diurutkan secara ascending berdasarkan Nama Program")
    public void list_data_diurutkan_berdasarkan_nama_program() {
        Assert.assertEquals(shorting.getTxtShortingNamaProgram(), "adasdas");
        extentTest.log(LogStatus.PASS, "List data diurutkan secara ascending berdasarkan Nama Program");
    }

    //Shorting Data by Harga-Normal

    @When("TCC.JC.039 Admin klik shorting data by Harga-Normal")
    public void shorting_data_by_harga_normal() {
        shorting.setShortingData("harga_normal");
        extentTest.log(LogStatus.PASS, "Admin klik shorting data by Harga-Normal");
    }

    @Then("TCC.JC.039 List data diurutkan secara ascending berdasarkan Harga-Normal")
    public void list_data_diurutkan_berdasarkan_harga_normal() {
        Assert.assertEquals(shorting.getTxtShortingHargaNormal(), "Rp 12");
        extentTest.log(LogStatus.PASS, "List data diurutkan secara ascending berdasarkan Harga-Normal");
    }

    //Shorting Data by Harga-Diskon

    @When("TCC.JC.040 Admin klik shorting data by Harga Setelah Harga-Diskon")
    public void shorting_data_by_harga_diskon() {
        shorting.setShortingData("harga_nett");
        extentTest.log(LogStatus.PASS, "Admin klik shorting data by Harga-Normal");
    }

    @Then("TCC.JC.040 List data diurutkan secara ascending berdasarkan Harga-Diskon")
    public void list_data_diurutkan_berdasarkan_harga_diskon() {
        Assert.assertEquals(shorting.getTxtShortingHargaDiskon(), "Rp 11");
        extentTest.log(LogStatus.PASS, "List data diurutkan secara ascending berdasarkan Harga-Normal");
    }


}
