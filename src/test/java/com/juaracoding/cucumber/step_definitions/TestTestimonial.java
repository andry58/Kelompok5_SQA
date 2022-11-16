package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.pages.Testimonial;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTestimonial {


    WebDriver driver;
    private static ExtentTest extentTest;
    private Testimonial testimonial = new Testimonial();

    public TestTestimonial() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test case one
    @When("TCC.JC.008 User click menu Home")
    public void user_click_menus_Home() {
        testimonial.ClickSlideHome();
        extentTest.log(LogStatus.PASS, "TCC.JC.008 User click menu Home");


//		Hooks.delay(1);

    }

    @Then("TCC.JC.008 User on menu Testimonial")
    public void user_on_menu_Testimonial() {
        testimonial.ClickMenuTestimonial();
        extentTest.log(LogStatus.PASS, "TCC.JC.008 User on menu Testimonial");
    }

    //Test case two
    @When("TCC.JC.009 User click button add")
    public void user_click_button_add() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.009 User click button add");
    }

    @And("TCC.JC.009 User upload foto")
    public void user_upload_foto() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.009 User upload foto");
    }

    @And("TCC.JC.009 User enter Nama Peserta")
    public void user_enter_fullname() {
        testimonial.fullname("Andri Yansyah");
        extentTest.log(LogStatus.PASS, "TCC.JC.009 User enter Nama Peserta");
    }

    @And("TCC.JC.009 User select publish")
    public void user_select_publish() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.009 User select publish");
    }

    @And("TCC.JC.009 User enter isi Testimonial")
    public void user_enter_isi_Testimonial() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa");
        extentTest.log(LogStatus.PASS, "TCC.JC.009 User enter isi Testimonial");
    }

    @And("TCC.JC.009 User select rating")
    public void user_select_rating() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.009 User select rating");
    }

    @Then("TCC.JC.009 User click button save")
    public void user_click_button_save() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.009 User click button save");
    }


    //test case three
    @When("TCC.JC.010 User click button add")
    public void user_click_button_add1() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.010 User click button add");
    }

    @And("TCC.JC.010 User upload foto size maksimal 1 MB")
    public void user_upload_foto_size_maksimal_1_MB() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\2mb.Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.010 User upload foto size maksimal 1 MB");
    }

    @And("TCC.JC.010 User enter Nama Peserta")
    public void user_enter_fullname1() {
        testimonial.fullname("Andri Y");
        extentTest.log(LogStatus.PASS, "TCC.JC.010 User enter Nama Peserta");
    }

    @And("TCC.JC.010 User select publish")
    public void user_select_publish1() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.010 User select publish");
    }

    @And("TCC.JC.010 User enter isi Testimonial")
    public void user_enter_isi_Testimonial1() {
        testimonial.TxtIsiTestimonial("Mantul");
        extentTest.log(LogStatus.PASS, "TCC.JC.010 User enter isi Testimonial");
    }

    @And("TCC.JC.010 User select rating")
    public void user_select_rating1() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.010 User select rating");
    }

    @Then("TCC.JC.010 User click button save")
    public void user_click_button_save1() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.010 User click button save");
    }

//Tase case four

    @When("TCC.JC.011 User click button add")
    public void user_click_button_ad() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.011 User click button add");
    }

    @And("TCC.JC.011 User upload foto format selain gambar")
    public void user_upload_foto_format_selain_gambar() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\test.txt");
        extentTest.log(LogStatus.PASS, "TCC.JC.011 User upload foto format selain gambar");
    }

    @And("TCC.JC.011 User enter Nama Peserta")
    public void user_enter_fullname2() {
        testimonial.fullname("Andri Yu");
        extentTest.log(LogStatus.PASS, "TCC.JC.011 User enter Nama Peserta");
    }

    @And("TCC.JC.011 User select publish")
    public void user_select_publish2() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.011 User select publish");
    }

    @And("TCC.JC.011 User enter isi Testimonial")
    public void user_enter_isi_Testimonial2() {
        testimonial.TxtIsiTestimonial("Mantulngg");
        extentTest.log(LogStatus.PASS, "TCC.JC.011 User enter isi Testimonial");
    }

    @And("TCC.JC.011 User select rating")
    public void user_select_rating2() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.011 User select rating");
    }

    @Then("TCC.JC.011 User click button save")
    public void user_click_button_save2() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.011 User click button save");
    }

    //Tase case Five
    @When("TCC.JC.012 User click button add")
    public void user_click_button_add3() {
        driver.navigate().back();
        driver.navigate().back();
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.012 User click button add");
    }

    @And("TCC.JC.012 User Tidak upload foto")
    public void user_Tidak_Uploud_Foto() {
        extentTest.log(LogStatus.PASS, "TCC.JC.012 User Tidak upload foto");
    }

    @And("TCC.JC.012 User enter Nama Peserta")
    public void user_enter_fullname3() {
        testimonial.fullname("Andri Y1");
        extentTest.log(LogStatus.PASS, "TCC.JC.012 User enter Nama Peserta");
    }

    @And("TCC.JC.012 User select publish")
    public void user_select_publish3() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.012 User select publish");
    }

    @And("TCC.JC.012 User enter isi Testimonial")
    public void user_enter_isi_Testimonial3() {
        testimonial.TxtIsiTestimonial("Mantulrtrt");
        extentTest.log(LogStatus.PASS, "TCC.JC.012 User enter isi Testimonial");
    }

    @And("TCC.JC.012 User select rating")
    public void user_select_rating3() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.012 User select rating");
    }

    @Then("TCC.JC.012 User click button save")
    public void user_click_button_save3() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.012 User click button save");
    }

    //Test case Six
    @When("TCC.JC.013 User click button add")
    public void user_click_button_add4() {
        driver.navigate().back();
        driver.navigate().back();
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.013 User click button add");
    }

    @And("TCC.JC.013 User upload foto")
    public void user_upload_foto2() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.013 User upload foto");
    }

    @And("TCC.JC.013 User enter Nama Peserta menggunakan huruf")
    public void user_enter_fullnam() {
        testimonial.fullname("Andri Yansyah");
        extentTest.log(LogStatus.PASS, "TCC.JC.013 User enter Nama Peserta menggunakan huruf");
    }

    @And("TCC.JC.013 User select publish")
    public void user_select_publish4() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.013 User select publish");
    }

    @And("TCC.JC.013 User enter isi Testimonial")
    public void user_enter_isi_Testimonial4() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa");
        extentTest.log(LogStatus.PASS, "TCC.JC.013 User enter isi Testimonial");
    }

    @And("TCC.JC.013 User select rating")
    public void user_select_rating4() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.013 User select rating");
    }

    @Then("TCC.JC.013 User click button save")
    public void user_click_button_save4() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.013 User click button save");
    }

    //Test case Seven
    @When("TCC.JC.014 User click button add")
    public void user_click_button_add5() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.014 User click button add");
    }

    @And("TCC.JC.014 User upload foto")
    public void user_upload_foto5() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.014 User upload foto");
    }

    @And("TCC.JC.014 User enter Nama Peserta menggunakan simbol")
    public void user_enter_fullname5() {
        testimonial.fullname("Andri !!");
        extentTest.log(LogStatus.PASS, "TCC.JC.014 User enter Nama Peserta menggunakan simbol");
    }

    @And("TCC.JC.014 User select publish")
    public void user_select_publish5() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.014 User select publish");
    }

    @And("TCC.JC.014 User enter isi Testimonial")
    public void user_enter_isi_Testimonial5() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa");
        extentTest.log(LogStatus.PASS, "TCC.JC.014 User enter isi Testimonial");
    }

    @And("TCC.JC.014 User select rating")
    public void user_select_rating5() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.014 User select rating");
    }

    @Then("TCC.JC.014 User click button save")
    public void user_click_button_save5() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.014 User click button save");
    }

    //Test case Eight
    @When("TCC.JC.015 User click button add")
    public void user_click_button_add6() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.015 User click button add");
    }

    @And("TCC.JC.015 User upload foto")
    public void user_upload_foto6() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.015 User upload foto");
    }

    @And("TCC.JC.015 User enter Tidak Input Nama Peserta")
    public void user_enter_fullname6() {
        testimonial.fullname("");
        extentTest.log(LogStatus.PASS, "TCC.JC.015 User enter Tidak Input Nama Peserta");
    }

    @And("TCC.JC.015 User select publish")
    public void user_select_publish7() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.015 User select publish");
    }

    @And("TCC.JC.015 User enter isi Testimonial")
    public void user_enter_isi_Testimonial7() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa");
        extentTest.log(LogStatus.PASS, "TCC.JC.015 User enter isi Testimonial");
    }

    @And("TCC.JC.015 User select rating")
    public void user_select_rating7() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.015 User select rating");
    }

    @Then("TCC.JC.015 User click button save")
    public void user_click_button_save6() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.015 User click button save");
    }

    //test case nine
    @When("TCC.JC.016 User click button add")
    public void user_click_button_add7() {
        driver.navigate().back();
        driver.navigate().back();
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.016 User click button add");
    }

    @And("TCC.JC.016 User upload foto")
    public void user_upload_foto7() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.016 User upload foto");
    }

    @And("TCC.JC.016 User enter Nama Peserta")
    public void user_enter_fullname7() {
        testimonial.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.016 User enter Nama Peserta");
    }

    @And("TCC.JC.016 User select publish active")
    public void user_select_publish8() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.016 User select publish active");
    }

    @And("TCC.JC.016 User enter isi Testimonial")
    public void user_enter_isi_Testimonial8() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa");
        extentTest.log(LogStatus.PASS, "TCC.JC.016 User enter isi Testimonial");
    }

    @And("TCC.JC.016 User select rating")
    public void user_select_rating8() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.016 User select rating");
    }

    @Then("TCC.JC.016 User click button save")
    public void user_click_button_save8() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.016 User click button save");
    }

    //test case ten
    @When("TCC.JC.017 User click button add")
    public void user_click_button_add8() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.017 User click button add");
    }

    @And("TCC.JC.017 User upload foto")
    public void user_upload_foto8() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.017 User upload foto");
    }

    @And("TCC.JC.017 User enter Nama Peserta")
    public void user_enter_fullname8() {
        testimonial.fullname("Andri Yansyah");
        extentTest.log(LogStatus.PASS, "TCC.JC.017 User enter Nama Peserta");
    }

    @And("TCC.JC.017 User select publish No Active")
    public void user_select_publish9() {
        testimonial.SelectPublishnonactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.017 User select publish No Active");
    }

    @And("TCC.JC.017 User enter isi Testimonial")
    public void user_enter_isi_Testimonial9() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa");
        extentTest.log(LogStatus.PASS, "TCC.JC.017 User enter isi Testimonial");
    }

    @And("TCC.JC.017 User select rating")
    public void user_select_rating9() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.016 User select rating");
    }

    @Then("TCC.JC.017 User click button save")
    public void user_click_button_save9() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.017 User click button save");
    }

    //test case Eleven
    @When("TCC.JC.018 User click button add")
    public void user_click_button_add9() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.018 User click button add");
    }

    @And("TCC.JC.018 User upload foto")
    public void user_upload_foto9() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.018 User upload foto");
    }

    @And("TCC.JC.018 User enter Nama Peserta")
    public void user_enter_fullname9() {
        testimonial.fullname("Andri Yansyah");
        extentTest.log(LogStatus.PASS, "TCC.JC.018 User enter Nama Peserta");
    }

    @And("TCC.JC.018 User select publish Active")
    public void user_select_publish10() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.018 User select publish Active");
    }

    @And("TCC.JC.018 User enter isi Testimonial menggunakan huruf")
    public void user_enter_isi_Testimonial10() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa");
        extentTest.log(LogStatus.PASS, "TCC.JC.018 User enter isi Testimonial menggunakan huruf");
    }

    @And("TCC.JC.018 User select rating")
    public void user_select_rating10() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.018 User select rating");
    }

    @Then("TCC.JC.018 User click button save")
    public void user_click_button_save10() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.018 User click button save");
    }

    //Test case twelve
    @When("TCC.JC.019 User click button add")
    public void user_click_button_addd() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.019 User click button add");
    }

    @And("TCC.JC.019 User upload foto")
    public void user_upload_fotoo() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.019 User upload foto");
    }

    @And("TCC.JC.019 User enter Nama Peserta")
    public void user_enter_fullnamee() {
        testimonial.fullname("Andri Yansyah");
        extentTest.log(LogStatus.PASS, "TCC.JC.019 User enter Nama Peserta");
    }

    @And("TCC.JC.019 User select publish Active")
    public void user_select_publishh() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.019 User select publish Active");
    }

    @And("TCC.JC.019 User enter isi Testimonial menggunakan simbol")
    public void user_enter_isi_Testimoniall() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa***");
        extentTest.log(LogStatus.PASS, "TCC.JC.019 User enter isi Testimonial menggunakan simbol");
    }

    @And("TCC.JC.019 User select rating")
    public void user_select_ratings() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.019 User select rating");
    }

    @Then("TCC.JC.019 User click button save")
    public void user_click_button_savee() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.019 User click button save");
    }

    //test case threeten
    @When("TCC.JC.020 User click button add")
    public void user_click_button_ad7() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.020 User click button add");
    }

    @And("TCC.JC.020 User upload foto")
    public void user_upload_fotoo1() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.020 User upload foto");
    }

    @And("TCC.JC.020 User enter Nama Peserta")
    public void user_enter_fullnamee1() {
        testimonial.fullname("Andriya");
        extentTest.log(LogStatus.PASS, "TCC.JC.020 User enter Nama Peserta");
    }

    @And("TCC.JC.020 User select publish Active")
    public void user_select_publishh1() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.020 User select publish Active");
    }

    @And("TCC.JC.020 User enter Tidak Isi Testimonial")
    public void user_enter_isi_Testimoniall1() {
        testimonial.TxtIsiTestimonial("");
        extentTest.log(LogStatus.PASS, "TCC.JC.020 User enter Tidak Isi Testimonial");
    }

    @And("TCC.JC.020 User select rating")
    public void user_select_ratings1() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.020 User select rating");
    }

    @Then("TCC.JC.020 User click button save")
    public void user_click_button_savee1() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.020 User click button save");
    }

    //test case fourten
    @When("TCC.JC.021 User click button add")
    public void user_click_button_addd1() {
        driver.navigate().back();
        driver.navigate().back();
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.021 User click button add");
    }

    @And("TCC.JC.021 User upload foto")
    public void user_upload_fotoo2() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.021 User upload foto");
    }

    @And("TCC.JC.021 User enter Nama Peserta")
    public void user_enter_fullnamee2() {
        testimonial.fullname("Andri Yansyah");
        extentTest.log(LogStatus.PASS, "TCC.JC.021 User enter Nama Peserta");
    }

    @And("TCC.JC.021 User select publish Active")
    public void user_select_publishh2() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.021 User select publish Active");
    }

    @And("TCC.JC.021 User enter isi Testimonial")
    public void user_enter_isi_Testimoniall2() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa");
        extentTest.log(LogStatus.PASS, "TCC.JC.021 User enter isi Testimonial");
    }

    @And("TCC.JC.021 User select rating berdasarkan pilihan")
    public void user_select_ratings2() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.021 User select rating berdasarkan pilihan ");
    }

    @Then("TCC.JC.021 User click button save")
    public void user_click_button_savee2() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.021 User click button save");
    }

    //test case fiveten

    @When("TCC.JC.022 User click button add")
    public void user_click_button_addd2() {
        testimonial.clickBtnAdd();
        extentTest.log(LogStatus.PASS, "TCC.JC.022 User click button add");
    }

    @And("TCC.JC.022 User upload foto")
    public void user_upload_fotoo3() {
        testimonial.ChooseFile("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.022 User upload foto");
    }

    @And("TCC.JC.022 User enter Nama Peserta")
    public void user_enter_fullnamee3() {
        testimonial.fullname("Andri Yansyah");
        extentTest.log(LogStatus.PASS, "TCC.JC.022 User enter Nama Peserta");
    }

    @And("TCC.JC.022 User select publish Active")
    public void user_select_publishh3() {
        testimonial.SelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.022 User select publish Active");
    }

    @And("TCC.JC.022 User enter isi Testimonial")
    public void user_enter_isi_Testimoniall3() {
        testimonial.TxtIsiTestimonial("Sangat luar biasa");
        extentTest.log(LogStatus.PASS, "TCC.JC.022 User enter isi Testimonial");
    }

    @And("TCC.JC.022 User select rating berdasarkan pilihan")
    public void user_select_ratings3() {
        testimonial.Selectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.022 User select rating berdasarkan pilihan ");
    }

    @Then("TCC.JC.022 User click button save")
    public void user_click_button_savee3() {
        testimonial.clickBtnSave();
        extentTest.log(LogStatus.PASS, "TCC.JC.022 User click button save");
    }
    //Test Search Nama Peserta


    @When("TCC.JC.023 User input Search nama peserta")
    public void user_search_nama_peserta() {
        testimonial.searchNama();
        extentTest.log(LogStatus.PASS, "TCC.JC.023 User input Search nama peserta");
    }

    @Then("TCC.JC.023 User click nama peserta")
    public void user_click_nama_peserta() {
        testimonial.pilihnama();
        extentTest.log(LogStatus.PASS, "TCC.JC.023 User click nama peserta");
    }


    //Edit Testimonial
    //test case 1
  //  @When("TCC.JC.024 User input Search nama peserta")
   // public void user_search_nama_peserta1() {
      //  testimonial.searchNama();
       // extentTest.log(LogStatus.PASS, "TCC.JC.024 User input Search nama peserta");
   // }

  //  @And("TCC.JC.024 User click nama peserta")
      //  testimonial.pilihnama();
       // extentTest.log(LogStatus.PASS, "TCC.JC.024 User click nama peserta");
    //}
    @When("TCC.JC.024 User upload foto Ulang size maksimal 1 MB")
    public void user_upload_foto_ulang() {

        testimonial.Pilihulang("C:\\Users\\KPI\\Downloads\\image001 (1).Jpg");
        extentTest.log(LogStatus.PASS, "TCC.JC.024 User upload foto Ulang size maksimal 1 MB");
    }

    @And("TCC.JC.024 User Edit Nama Peserta")
    public void user_Edit_fullname() {

        testimonial.EditNamaPeserta("Andri Yansh");
        extentTest.log(LogStatus.PASS, "TCC.JC.024 User Edit Nama Peserta");
    }

    @And("TCC.JC.024 User Edit select publish Active")
    public void user_Edit_select_publish() {
        testimonial.EditSelectPublishactive();
        extentTest.log(LogStatus.PASS, "TCC.JC.024 User Edit select publish Active");
    }

    @And("TCC.JC.024 User Edit isi Testimonial")
    public void user_Edit_isi_Testimonial() {
        testimonial.EditTxtIsiTestimonial("SangJuara");
        extentTest.log(LogStatus.PASS, "TCC.JC.024 User Edit isi Testimonial");
    }

    @And("TCC.JC.024 User Edit select rating berdasarkan pilihan")
    public void user_Edit_select_rating() {
        testimonial.editSelectrating();
        extentTest.log(LogStatus.PASS, "TCC.JC.024 User Edit select rating berdasarkan pilihan ");
    }

    @Then("TCC.JC.024 User click button Simpan Edit")
    public void user_click_button_save_edit() {
        testimonial.clickBtnSimpanEdit();
        extentTest.log(LogStatus.PASS, "TCC.JC.024 User click button Simpan Edit");
    }


}