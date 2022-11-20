package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.pages.EditTestimonial;
import com.juaracoding.pages.Testimonial;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestEditTestimonial {
    WebDriver driver;
    private static ExtentTest extentTest;
    private EditTestimonial editTestimonial = new EditTestimonial();

    public TestEditTestimonial() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //Test Search Nama Peserta


    @When("TCC.JC.023 Admin input Search nama peserta")
    public void admin_search_nama_peserta() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/testimonial");
        editTestimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.023 Admin input Search nama peserta");
    }

    @Then("TCC.JC.023 Admin click nama peserta")
    public void admin_click_nama_peserta() {
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.023 Admin click nama peserta");
    }


    //edit
    @When("TCC.JC.024 Admin upload foto Ulang size maksimal 1 MB")
    public void admin_upload_foto_ulang() {
        editTestimonial.Pilihulang("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.024 Admin upload foto Ulang size maksimal 1 MB");
    }

    @And("TCC.JC.024 Admin click button Simpan Edit")
    public void admin_click_button_save_edit1() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.024 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.024 Data Edit Testimonial berhasil disimpan")
    public void Data_contact_berhasil_disimpan(){
        Assert.assertEquals(editTestimonial.getTextberhasil(),"Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.024 Data Edit Testimonial berhasil disimpan");
    }

    //Tase case 2
    @When("TCC.JC.025 Admin input Search nama peserta")
    public void admin_search_nama_peserta1() {

        editTestimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.025 Admin input Search nama peserta");
    }

    @When("TCC.JC.025 Admin click nama peserta")
    public void admin_click_nama_peserta1() {
       editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.025 Admin click nama peserta");
    }

    @And("TCC.JC.025 Admin Tidak Edit Uploud Foto")
    public void admin_Tidak_edit_Uploud_Foto1() {
        extentTest.log(LogStatus.PASS, "TCC.JC.025 Admin Tidak Edit Uploud Foto");
    }
    @And("TCC.JC.025 Admin click button Simpan Edit")
    public void admin_click_button_save_edit() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.025 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.025 Data Edit Testimonial berhasil disimpan")
    public void Data_contact_berhasil_disimpan5(){
        Assert.assertEquals(editTestimonial.getTextberhasil(),"Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.025 Data Edit Testimonial berhasil disimpan");
    }

    //Tese case 3
    @When("TCC.JC.026 Admin input Search nama peserta")
    public void admin_search_nama_pesertaa() {

        editTestimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.026 Admin input Search nama peserta");
    }
    @And("TCC.JC.026 Admin click nama peserta")
    public void admin_click_nama_peserta2() {
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.026 Admin click nama peserta");
    }

    @And("TCC.JC.026 Admin Edit nama lengkap menggunakan huruf")
    public void admin_Edit_nama_lengkap_menggunakan_huruf() {
        editTestimonial.EditNamaPeserta("Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.026 Admin Edit nama lengkap menggunakan huruf");
    }

    @And("TCC.JC.026 Admin click button Simpan Edit")
    public void admin_click_button_save_edi6() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.026 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.026 Data Edit Testimonial berhasil disimpan")
    public void Data_contact_berhasil_disimpan6(){
        Assert.assertEquals(editTestimonial.getTextberhasil(),"Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.026 Data Edit Testimonial berhasil disimpan");
    }

    //tase case 4

    @When("TCC.JC.027 Admin input Search nama peserta")
    public void admin_search_nama_peserta3() {
        editTestimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.027 Admin input Search nama peserta");
    }

    @And("TCC.JC.027 Admin click nama peserta")
    public void admin_click_nama_peserta3() {
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.027 Admin click nama peserta");
    }

    @And("TCC.JC.027 Admin Edit nama Peserta menggunakan simbol")
    public void admin_Edit_nama_lengkap_menggunakan_simbol() {
        editTestimonial.EditNamaPeserta("Andriy>>");
        extentTest.log(LogStatus.PASS, "TCC.JC.027 Admin Edit nama lengkap menggunakan huruf");
    }
    @And("TCC.JC.027 Admin click button Simpan Edit")
    public void admin_click_button_save_edi7() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.026 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.027 Data Edit Testimonial Tidak berhasil")
    public void Data_edit_testimonial_tidak_berhasil_disimpan7(){
        Assert.assertEquals(editTestimonial.getTexttidakberhasilnama(),"Karakter (<|>|'|\") tidak diizinkan");
        extentTest.log(LogStatus.PASS, "TCC.JC.027 Data Edit Testimonial Tidak berhasil");
    }

    //tase case 5


    @When("TCC.JC.028 Admin click nama peserta")
    public void admin_click_nama_peserta4() {
        driver.navigate().back();
        driver.navigate().back();
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.028 Admin click nama peserta");
    }


    @And("TCC.JC.028 Admin Tidak Edit Nama Peserta")
    public void admin_Tidak_Edit_nama_Peserta() {
        extentTest.log(LogStatus.PASS, "TCC.JC.028 Admin Tidak Edit Nama Peserta");
    }


    @And("TCC.JC.028 Admin click button Simpan Edit")
    public void admin_click_button_save_edi8() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.028 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.028 Data Edit Testimonial berhasil disimpan")
    public void Data_contact_berhasil_disimpan8(){
        Assert.assertEquals(editTestimonial.getTextberhasil(),"Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.028 Data Edit Testimonial berhasil disimpan");
    }

    //tes case 6

    @When("TCC.JC.029 Admin input Search nama peserta")
    public void admin_search_nama_peserta5() {
        editTestimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.029 Admin input Search nama peserta");
    }

    @And("TCC.JC.029 Admin click nama peserta")
    public void admin_click_nama_peserta5() {
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.029 Admin click nama peserta");
    }


    @And("TCC.JC.029 Admin Edit Select Publish berdasarkan pilihan Active")
    public void admin_Edit_Select_Publish_berdasarkan_pilihan_Active() {
        editTestimonial.EditSelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.029 Admin Edit Select Publish berdasarkan pilihan Active");
    }
    @And("TCC.JC.029 Admin click button Simpan Edit")
    public void admin_click_button_save_edi9() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.029 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.029 Data Edit Testimonial berhasil disimpan")
    public void Data_contact_berhasil_disimpan9(){
        Assert.assertEquals(editTestimonial.getTextberhasil(),"Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.029 Data Edit Testimonial berhasil disimpan");
    }

    //tase case 7
    @When("TCC.JC.030 Admin input Search nama peserta")
    public void admin_search_nama_peserta6() {

        editTestimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.030 Admin input Search nama peserta");
    }

    @And("TCC.JC.030 Admin click nama peserta")
    public void admin_click_nama_peserta6() {
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.030 Admin click nama peserta");
    }

    @And("TCC.JC.030 Admin Edit  Select Publish berdasarkan pilihan No Active")
    public void admin_Edit_Select_Publish_berdasarkan_pilihan_noActive() {
        editTestimonial.EditSelectPublishnonactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.030 Admin Edit  Select Publish berdasarkan pilihan No Active");
    }

    @And("TCC.JC.030 Admin click button Simpan Edit")
    public void admin_click_button_save_ediit() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.030 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.030 Data Edit Testimonial berhasil disimpan")
    public void Data_contact_berhasil_disimpann(){
        Assert.assertEquals(editTestimonial.getTextberhasil(),"Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.030 Data Edit Testimonial berhasil disimpan");
    }


    //Tas case 8
    @When("TCC.JC.031 Admin input Search nama peserta")
    public void admin_search_nama_peserta7() {
        editTestimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.031 Admin input Search nama peserta");
    }

    @And("TCC.JC.031 Admin click nama peserta")
    public void admin_click_nama_peserta7() {
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.031 Admin click nama peserta");
    }

    @And("TCC.JC.031 Admin Edit  Isi Testimonial  menggunakan huruf")
    public void admin_Edit_Isi_Testimonial_menggunakan_huruf() {
        editTestimonial.EditTxtIsiTestimonial("Jadi yang terbaik");
        extentTest.log(LogStatus.PASS, "TCC.JC.031 Admin Edit  Isi Testimonial  menggunakan huruf");
    }

    @And("TCC.JC.031 Admin click button Simpan Edit")
    public void admin_click_button_save_ediit1() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.031 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.031 Data Edit Testimonial berhasil disimpan")
    public void Data_contact_berhasil_disimpann1(){
        Assert.assertEquals(editTestimonial.getTextberhasil(),"Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.031 Data Edit Testimonial berhasil disimpan");
    }

//Tase case 9

    @When("TCC.JC.032 Admin input Search nama peserta")
    public void admin_search_nama_peserta8() {
        editTestimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.032 Admin input Search nama peserta");
    }

    @And("TCC.JC.032 Admin click nama peserta")
    public void admin_click_nama_peserta8() {
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.032 Admin click nama peserta");
    }

    @And("TCC.JC.032 Admin Edit  Isi Testimonial menggunakan simbol")
    public void admin_Edit_Isi_Testimonial_menggunakan_simbol() {
        editTestimonial.EditTxtIsiTestimonial("Jadi yang terbaik>>");
        extentTest.log(LogStatus.PASS, "TCC.JC.032 Admin Edit  Isi Testimonial menggunakan simbol");
    }

    @And("TCC.JC.032 Admin click button Simpan Edit")
    public void admin_click_button_save_editt() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.032 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.032 Data Edit Testimonial Tidak berhasil")
    public void Data_edit_testimonial_tidak_berhasil_disimpan8(){
        Assert.assertEquals(editTestimonial.getTextidakberhasilisi(),"Karakter (<|>|'|\") tidak diizinkan");
        extentTest.log(LogStatus.PASS, "TCC.JC.032 Data Edit Testimonial Tidak berhasil");
    }
    //tase csae 10



    @When("TCC.JC.033 Admin click nama peserta")
    public void admin_click_nama_peserta9() {
        driver.navigate().back();
        driver.navigate().back();
        editTestimonial .pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.033 Admin click nama peserta");
    }

    @And("TCC.JC.033 Admin Tidak Edit Isi Testimonial")
    public void admin_Tidak_Edit_Isi_Testimonial() {
        editTestimonial.EditTxtIsiTestimonial("");
        extentTest.log(LogStatus.PASS, "TCC.JC.033 Admin Tidak Edit Isi Testimonial");
    }

    @And("TCC.JC.033 Admin click button Simpan Edit")
    public void admin_click_button_save_editt3() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.033 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.033 Data Edit Testimonial Tidak berhasil")
    public void Data_edit_testimonial_tidak_berhasil_disimpan3(){
        Assert.assertEquals(editTestimonial.getTextidakberhasilisi(),"Harap isi content testimonial");
        extentTest.log(LogStatus.PASS, "TCC.JC.033 Data Edit Testimonial Tidak berhasil");
    }
//tase cse 11

    @When("TCC.JC.034 Admin click nama peserta")
    public void admin_click_nama_peserta10() {
        driver.navigate().back();
        driver.navigate().back();
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.034 Admin click nama peserta");
    }

    @And("TCC.JC.034 Admin Edit  Select Rating berdasarkan pilihan")
    public void admin_Edit_Select_Rating_berdasarkan_pilihan() {
        editTestimonial.EditTxtIsiTestimonial("4");
        extentTest.log(LogStatus.PASS, "TCC.JC.034 Admin Edit  Select Rating berdasarkan pilihan");
    }

    @And("TCC.JC.034 Admin click button Simpan Edit")
    public void admin_click_button_save_ediit4() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.034 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.034 Data Edit Testimonial berhasil disimpan")
    public void Data_contact_berhasil_disimpann4(){
        Assert.assertEquals(editTestimonial.getTextberhasil(),"Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.034 Data Edit Testimonial berhasil disimpan");
    }

    //Tase case 12

    @When("TCC.JC.035 Admin input Search nama peserta")
    public void admin_search_nama_peserta11() {
        editTestimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.035 Admin input Search nama peserta");
    }

    @And("TCC.JC.035 Admin click nama peserta")
    public void admin_click_nama_peserta11() {
        editTestimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.035 Admin click nama peserta");
    }

    @And("TCC.JC.035 Admin upload foto Ulang size maksimal 1 MB")
    public void admin_upload_foto_ulang1() {
        editTestimonial.Pilihulang("C:\\Users\\KPI\\Downloads\\2mb.Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.035 Admin upload foto Ulang size maksimal 1 MB");
    }

    @And("TCC.JC.035 Admin Edit nama lengkap menggunakan huruf")
    public void admin_Edit_nama_lengkap_menggunakan_huruf1() {
        editTestimonial.EditNamaPeserta("Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.035 Admin Edit nama lengkap menggunakan huruf");
    }

    @And("TCC.JC.035 Admin Edit Select Publish berdasarkan pilihan Active")
    public void admin_Edit_Select_Publish_berdasarkan_pilihan_Active1() {
        editTestimonial.EditSelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.035 Admin Edit Select Publish berdasarkan pilihan Active");
    }
    @And("TCC.JC.035 Admin Edit  Isi Testimonial  menggunakan huruf")
    public void admin_Edit_Isi_Testimonial_menggunakan_huruf1() {
        editTestimonial.EditTxtIsiTestimonial("Jadi yang terbaik");
        extentTest.log(LogStatus.PASS, "TCC.JC.035 Admin Edit  Isi Testimonial  menggunakan huruf");
    }
    @And("TCC.JC.035 Admin Edit  Select Rating berdasarkan pilihan")
    public void admin_Edit_Select_Rating_berdasarkan_pilihan1() {
        editTestimonial.editSelectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.035 Admin Edit  Select Rating berdasarkan pilihan");
    }

    @And("TCC.JC.035 Admin click button Simpan Edit")
    public void admin_click_button_save_ediit5() {
        editTestimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.035 Admin click button Simpan Edit");
    }

    @Then("TCC.JC.035 Data Edit Testimonial berhasil disimpan")
    public void Data_contact_berhasil_disimpann5(){
        Assert.assertEquals(editTestimonial.getTextberhasil(),"Andriy");
        extentTest.log(LogStatus.PASS, "TCC.JC.035 Data Edit Testimonial berhasil disimpan");
    }


}
