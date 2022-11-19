package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.Utils.Constants;
import com.juaracoding.pages.ShortingRincianBiaya;
import com.juaracoding.pages.TambahRincianBiaya;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTambahRincianBiaya {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahRincianBiaya tambahRincianBiaya = new TambahRincianBiaya();

    public TestTambahRincianBiaya() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //Form Tambah Rincian Biaya

    @When("TCC.JC.045 Admin klik button tambah rincian biaya")
    public void admin_klik_button_tambah() {
        tambahRincianBiaya.clickBtnTambahRincianBiaya();
        extentTest.log(LogStatus.PASS, "Admin klik button tambah rincian biaya");

    }

    @Then("TCC.JC.045 Form tambah rincian biaya ditampilkan")
    public void form_tambah_rincian_biaya_ditampilkan() {
        Assert.assertEquals(tambahRincianBiaya.getTxtFormTambahRincianBiaya(), "Tambah Rincian Biaya");
        extentTest.log(LogStatus.PASS, "Form tambah rincian biaya ditampilkan");
    }

    // Admin Input Data Lengkap

    @When("TCC.JC.046 Admin input data lengkap")
    public void admin_input_data_lengkap() {
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "5000000",
                "30","","Bimbingan belajar dari nol","Grup belajar yang produktif",
                "Disalurkan bekerja", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data lengkap");
    }

    @And("TCC.JC.046 Admin select status publish lengkap")
    public void user_select_status_publish_lengkap() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish");
    }

    @And("TCC.JC.046 Admin klik button simpan")
    public void admin_klik_button_simpan_data_lengkap() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "admin klik button simpan");
    }

    @Then("TCC.JC.046 Data Berhasil di Tambah")
    public void data_berhasil_di_tambah_lengkap() {
        Assert.assertEquals(tambahRincianBiaya.getTxtDataBerhasilDisimpan(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "Data Berhasil disimpan");
    }

    // Admin Kosongkan Nama Program

    @When("TCC.JC.047 Admin input data kosongkan Nama Program")
    public void admin_input_data_kosongkan_nama_program() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("","2000000",
                "20","","Bimbingan belajar dari nol","Grup belajar yang produktif",
                "Disalurkan bekerja", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data kosongkan Nama Program");
    }

    @And("TCC.JC.047 Admin select status publish active atau inactive")
    public void user_select_status_publish_kosongkan_nama_program() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish active/inactive");
    }

    @And("TCC.JC.047 Admin klik button simpan")
    public void admin_klik_button_simpan_kosongkan_nama_program() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "Admin klik button simpan");
    }

    @Then("TCC.JC.047 Data gagal disimpan")
    public void data_gagal_di_simpan_kosongkan_nama_program() {
        Assert.assertEquals(tambahRincianBiaya.getTxtHarapIsiNamaProgram(),"Harap isi nama program");
        extentTest.log(LogStatus.PASS, "Menampilkan alert Harap isi nama program");
    }

    // Admin Kosongkan Harga Normal

    @When("TCC.JC.048 Admin input data Kosongkan Harga Normal")
    public void admin_input_data_kosongkan_harga_normal() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "",
                "20","","Bimbingan belajar dari nol","Grup belajar yang produktif",
                "Disalurkan bekerja", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data Kosongkan Harga Normal");
    }

    @And("TCC.JC.048 Admin select status publish active atau inactive")
    public void user_select_status_publish_kosongkan_harga_normal() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish active/inactive");
    }

    @And("TCC.JC.048 Admin klik button simpan")
    public void admin_klik_button_simpan_kosongkan_harga_normal() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "Admin klik button simpan");
    }

    @Then("TCC.JC.048 Data gagal disimpan")
    public void data_gagal_di_simpan_kosongkan_harga_normal() {
        Assert.assertEquals(tambahRincianBiaya.getTxtHarapIsiHargaProgram(),"Harap isi harga program");
        extentTest.log(LogStatus.PASS, "Menampilkan alert Harap isi harga program");
    }

    // Admin input Harga Normal menggunakan (Huruf)

    @When("TCC.JC.049 Admin input data Harga Normal menggunakan huruf")
    public void admin_input_data_harga_normal_huruf() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "satu juta",
                "20","","Bimbingan belajar dari nol","Grup belajar yang produktif",
                "Disalurkan bekerja", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data Harga Normal menggunakan huruf");
    }

    @And("TCC.JC.049 Admin select status publish active atau inactive")
    public void user_select_status_publish_harga_normal_huruf() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish active/inactive");
    }

    @And("TCC.JC.049 Admin klik button simpan")
    public void admin_klik_button_simpan_harga_normal_huruf() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "Admin klik button simpan");
    }

    @Then("TCC.JC.049 Data gagal disimpan")
    public void data_gagal_di_simpan_harga_normal_huruf() {
        Assert.assertEquals(tambahRincianBiaya.getTxtHarapIsiHargaProgram(),"Harap isi harga program");
        extentTest.log(LogStatus.PASS, "Gagal input harga normal menggunakan huruf data dianggap kosong");
    }

    // Admin Kosongkan Diskon

    @When("TCC.JC.050 Admin input data Kosongkan Diskon")
    public void admin_input_data_kosongkan_Diskon() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "2000000",
                "","","Bimbingan belajar dari nol","Grup belajar yang produktif",
                "Disalurkan bekerja", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data Kosongkan Diskon");
    }

    @And("TCC.JC.050 Admin select status publish active atau inactive")
    public void user_select_status_publish_kosongkan_diskon() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish active/inactive");
    }

    @And("TCC.JC.050 Admin klik button simpan")
    public void admin_klik_button_simpan_kosongkan_diskon() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "Admin klik button simpan");
    }

    @Then("TCC.JC.050 Data Berhasil di Tambah")
    public void data_gagal_di_simpan_kosongkan_diskon() {
        Assert.assertEquals(tambahRincianBiaya.getTxtDataBerhasilDisimpan(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "Data Berhasil disimpan");
    }

    // Admin input Diskon menggunakan (Huruf)

    @When("TCC.JC.051 Admin input data Diskon menggunakan huruf")
    public void admin_input_data_diskon_huruf() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 30", "1000000",
                "dua puluh","","Bimbingan belajar dari nol","Grup belajar yang produktif",
                "Disalurkan bekerja", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data Diskon menggunakan huruf (dua puluh)");
    }

    @And("TCC.JC.051 Admin select status publish active atau inactive")
    public void user_select_status_publish_diskon_huruf() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish active/inactive");
    }

    @And("TCC.JC.051 Admin klik button simpan")
    public void admin_klik_button_simpan_diskon_huruf() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "Admin klik button simpan");
    }

    @Then("TCC.JC.051 Data gagal disimpan")
    public void data_gagal_di_simpan_diskon_huruf() {
        tambahRincianBiaya.clickBtnHome();
        tambahRincianBiaya.clickBtnRincianBiaya();
        tambahRincianBiaya.searchInput("SQA Batch 30");
        Assert.assertEquals(tambahRincianBiaya.getTxtValidasiDiskon(),"%");
        tambahRincianBiaya.clickBtnTambahRincianBiaya();
        extentTest.log(LogStatus.PASS, "Inputan data Diskon dengan huruf tidak terbaca");
    }

    // Harga setelah diskon terisi otomatis

    @When("TCC.JC.052 Admin input data harga normal dan diskon")
    public void isi_data_harga_normal_dan_diskon() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("UI designer", "1000000",
                "50","","Mantap","",
                "", "", "");
        extentTest.log(LogStatus.PASS, "Admin input data harga normal dan diskon");
    }

    @And("TCC.JC.052 Admin select status publish active atau inactive")
    public void user_select_status_active_inactive_harga_diskon() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish active/inactive");
    }

    @And("TCC.JC.052 Admin klik button simpan")
    public void admin_klik_button_simpan_harga_diskon() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "Admin klik button simpan");
    }

    @Then("TCC.JC.052 Data Harga diskon terisi otomatis")
    public void harga_diskon_terisi_otomatis() {
        tambahRincianBiaya.clickBtnHome();
        tambahRincianBiaya.clickBtnRincianBiaya();
        tambahRincianBiaya.searchInput("UI designer");
        Assert.assertEquals(tambahRincianBiaya.getTxtHargaDiskon(), "Rp 500.000");
        tambahRincianBiaya.clickBtnTambahRincianBiaya();
        extentTest.log(LogStatus.PASS, "Harga diskon terisi otomatis tanpa di input");
    }

    //Kosongkan Keunggulan satu

    @When("TCC.JC.053 Admin input data Kosongkan keunggulan satu")
    public void admin_input_data_kosongkan_keunggulan_satu() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "800000",
                "20","","","Grup belajar yang produktif",
                "Disalurkan bekerja", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data Kosongkan Diskon");
    }

    @And("TCC.JC.053 Admin select status publish active atau inactive")
    public void user_select_status_publish_kosongkan_keunggulan_satu() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish active/inactive");
    }

    @And("TCC.JC.053 Admin klik button simpan")
    public void admin_klik_button_simpan_kosongkan_keunggulan_satu() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "Admin klik button simpan");
    }

    @Then("TCC.JC.053 Data gagal disimpan")
    public void data_gagal_di_simpan_kosongkan_keunggulan() {
        Assert.assertEquals(tambahRincianBiaya.getTxtIsiKeunggulan(), "Harap isi keunggulan program");
        extentTest.log(LogStatus.PASS, "Data Data gagal disimpan");
    }

    //Kosongkan Keunggulan dua

    @When("TCC.JC.054 Admin input data Kosongkan keunggulan dua")
    public void admin_input_kosongkan_keunggulan_dua() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "5000000",
                "30","","Bimbingan belajar dari nol","",
                "Disalurkan bekerja", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data lengkap");
    }

    @And("TCC.JC.054 Admin select status publish active atau inactive")
    public void user_select_status_publish_kosongkan_keunggulan_dua() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish");
    }

    @And("TCC.JC.054 Admin klik button simpan")
    public void admin_klik_button_simpan_data_keunggulan_dua() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "admin klik button simpan");
    }

    @Then("TCC.JC.054 Data berhasil ditambahkan")
    public void data_berhasil_di_tambah_keunggulan_dua() {
        Assert.assertEquals(tambahRincianBiaya.getTxtDataBerhasilDisimpan(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "Data Berhasil disimpan");
    }

    //Kosongkan Keunggulan ketiga

    @When("TCC.JC.055 Admin input data Kosongkan keunggulan tiga")
    public void admin_input_kosongkan_keunggulan_ketiga() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "5000000",
                "30","","Bimbingan belajar dari nol","Disalurkan bekerja",
                "", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data lengkap");
    }

    @And("TCC.JC.055 Admin select status publish active atau inactive")
    public void admin_select_status_publish_kosongkan_keunggulan_tiga() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish");
    }

    @And("TCC.JC.055 Admin klik button simpan")
    public void admin_klik_button_simpan_data_keunggulan_tiga() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "admin klik button simpan");
    }

    @Then("TCC.JC.055 Data berhasil ditambahkan")
    public void data_berhasil_di_tambah_keunggulan_tiga() {
        Assert.assertEquals(tambahRincianBiaya.getTxtDataBerhasilDisimpan(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "Data Berhasil disimpan");
    }

    //Kosongkan Keunggulan keempat

    @When("TCC.JC.056 Admin input data Kosongkan keunggulan empat")
    public void admin_input_kosongkan_keunggulan_empat() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "5000000",
                "30","","Bimbingan belajar dari nol","Disalurkan bekerja",
                "Lebih hemat 30%", "", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data lengkap");
    }

    @And("TCC.JC.056 Admin select status publish active atau inactive")
    public void user_select_status_publish_kosongkan_keunggulan_empat() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish");
    }

    @And("TCC.JC.056 Admin klik button simpan")
    public void admin_klik_button_simpan_data_keunggulan_empat() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "admin klik button simpan");
    }

    @Then("TCC.JC.056 Data berhasil ditambahkan")
    public void data_berhasil_di_tambah_keunggulan_empat() {
        Assert.assertEquals(tambahRincianBiaya.getTxtDataBerhasilDisimpan(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "Data Berhasil disimpan");
    }

    //Kosongkan Keunggulan Lima

    @When("TCC.JC.057 Admin input data Kosongkan keunggulan lima")
    public void admin_input_kosongkan_keunggulan_keempat() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "5000000",
                "30","","Bimbingan belajar dari nol","Disalurkan bekerja",
                "Grup alumni untuk sharing", "Lebih hemat 30%", "");
        extentTest.log(LogStatus.PASS, "Admin input data lengkap");
    }

    @And("TCC.JC.057 Admin select status publish active atau inactive")
    public void user_select_status_publish_kosongkan_keunggulan_lima() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish");
    }

    @And("TCC.JC.057 Admin klik button simpan")
    public void admin_klik_button_simpan_data_keunggulan_lima() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "admin klik button simpan");
    }

    @Then("TCC.JC.057 Data berhasil ditambahkan")
    public void data_berhasil_di_tambah_keunggulan_lima() {
        Assert.assertEquals(tambahRincianBiaya.getTxtDataBerhasilDisimpan(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "Data Berhasil disimpan");
    }

    //Status publish Active

    @When("TCC.JC.058 Admin input data")
    public void admin_input_data_publish_active() {
        tambahRincianBiaya.clearData();
        tambahRincianBiaya.rincianBiaya("SQA Batch 29", "5000000",
                "30","","Bimbingan belajar dari nol","Grup belajar yang produktif",
                "Disalurkan bekerja", "Lebih hemat 30%", "Grup alumni untuk sharing");
        extentTest.log(LogStatus.PASS, "Admin input data lengkap");
    }

    @And("TCC.JC.058 Admin select status publish Active")
    public void user_select_status_publish_active() {
        tambahRincianBiaya.choosePublish("1");
        extentTest.log(LogStatus.PASS, "Admin select status publish");
    }

    @And("TCC.JC.058 Admin klik button simpan")
    public void admin_klik_button_simpan_data_publish_active() {
        tambahRincianBiaya.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "admin klik button simpan");
    }

    @Then("TCC.JC.058 Data berhasil disimpan")
    public void data_berhasil_di_publish() {
        Assert.assertEquals(tambahRincianBiaya.getTxtDataBerhasilDisimpan(), "Data berhasil di tambah");
        extentTest.log(LogStatus.PASS, "Data berhasil disimpan");
    }

    @And("TCC.JC.058 Rincian biaya berhasil dipublish")
    public void admin_cek_web_rician_biaya() {
        driver.get(Constants.PUBLISH_URL);
        Assert.assertEquals(tambahRincianBiaya.getTextContentPublish(), "SQA Batch 29");
        extentTest.log(LogStatus.PASS, "Admin cek di web rincian biaya berhasil dipublish");
    }

}
