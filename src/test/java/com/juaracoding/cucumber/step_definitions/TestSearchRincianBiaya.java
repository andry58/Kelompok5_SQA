package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.pages.SearchRincianBiaya;
import com.juaracoding.pages.ShortingRincianBiaya;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSearchRincianBiaya {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private SearchRincianBiaya search = new SearchRincianBiaya();

    public TestSearchRincianBiaya() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Search Data by Diskon
    @When("TCC.JC.041 Admin input Diskon yang ingin dicari")
    public void admin_klik_keyword_diskon() {
        search.searchInput("30");
        extentTest.log(LogStatus.PASS, "Admin input Diskon yang ingin dicari");
    }

    @And("TCC.JC.041 Admin klik keyword Diskon")
    public void admin_input_diskon_yang_dicari() {
        search.selectKeyword("diskon");
        extentTest.log(LogStatus.PASS, "Admin input diskon yang ingin dicari");
    }

    @Then("TCC.JC.041 Berhasil menampilkan data sesuai Diskon yang dicari")
    public void menampilkan_diskon_yang_dicari() {
        Assert.assertEquals(search.getTxtSearchDiskon(), "30%");
        extentTest.log(LogStatus.PASS, "Berhasil menampilkan data sesuai Diskon yang dicari");
    }

    // Search Data by Nama Program

    @When("TCC.JC.042 Admin input Nama Program yang ingin dicari")
    public void admin_klik_keyword_nama_program() {
        search.hapusSearch();
        search.searchInput("SQA Batch 6");
        extentTest.log(LogStatus.PASS, "Admin input Nama Program yang ingin dicari");
    }

    @And("TCC.JC.042 Admin klik keyword Nama Program")
    public void admin_input_nama_program_yang_dicari() {
        search.selectKeyword("nama_program");
        extentTest.log(LogStatus.PASS, "Admin klik keyword Nama Program");
    }

    @Then("TCC.JC.042 Berhasil menampilkan data sesuai Nama Program yang dicari")
    public void menampilkan_nama_program_yang_dicari() {
        Assert.assertEquals(search.getTxtSearchNamaProgram(), "SQA Batch 6");
        extentTest.log(LogStatus.PASS, "Berhasil menampilkan data sesuai Nama Program yang dicari");
    }

    // Search Data by Harga-Normal

    @When("TCC.JC.043 Admin input Harga-Normal yang ingin dicari")
    public void admin_klik_keyword_harga_normal() {
        search.hapusSearch();
        search.searchInput("5000000");
        extentTest.log(LogStatus.PASS, "Admin input Harga-Normal yang ingin dicari");
    }

    @And("TCC.JC.043 Admin klik keyword Harga-Normal")
    public void admin_input_harga_normal_yang_dicari() {
        search.selectKeyword("harga_normal");
        extentTest.log(LogStatus.PASS, "Admin klik keyword Harga-Normal");
    }

    @Then("TCC.JC.043 Berhasil menampilkan data sesuai Harga-Normal yang dicari")
    public void menampilkan_harga_normal_yang_dicari() {
        Assert.assertEquals(search.getTxtSearchHargaNormal(), "Rp 5.000.000");
        extentTest.log(LogStatus.PASS, "Berhasil menampilkan data sesuai Harga-Normal yang dicari");
    }

    // Search Data by Harga-Diskon

    @When("TCC.JC.044 Admin input Harga-Diskon yang ingin dicari")
    public void admin_klik_keyword_harga_diskon() {
        search.hapusSearch();
        search.searchInput("2000000");
        extentTest.log(LogStatus.PASS, "Admin input Harga-Diskon yang ingin dicari");
    }

    @And("TCC.JC.044 Admin klik keyword Harga-Diskon")
    public void admin_input_harga_diskon_yang_dicari() {
        search.selectKeyword("harga_nett");
        extentTest.log(LogStatus.PASS, "Admin klik keyword Harga-Diskon");
    }

    @Then("TCC.JC.044 Berhasil menampilkan data sesuai Harga-Diskon")
    public void menampilkan_harga_diskon_yang_dicari() {
        Assert.assertEquals(search.getTxtSearchHargaDiskon(), "Rp 2.000.000");
        extentTest.log(LogStatus.PASS, "Berhasil menampilkan data sesuai Harga-Diskon");
    }

}
