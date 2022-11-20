package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.pages.ContactMassage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestContactMassage {

    WebDriver driver;
    private static ExtentTest extentTest;
    private ContactMassage contactMassage = new ContactMassage();

    public TestContactMassage() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.JC.0169 Display form Web Juara coding")
    public void user_click_menus_Home() {
        driver.get("https://dev.ptdika.com/web_jc_v2/");
        extentTest.log(LogStatus.PASS, "TCC.JC.0169 Display form Web Juara coding");

    }

    @Then("TCC.JC.0169 clik menu Contact")
    public void user_clik_menu_Contact() {
      contactMassage.ClickContact();
        extentTest.log(LogStatus.PASS, "TCC.JC.0169 clik menu Contact");
    }

    //tas case 1

    @When("TCC.JC.0170 Input Full Name Menggunakan huruf")
    public void user_Input_Nama_Lengkap_Menggunakan_huruf() {
        contactMassage.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0170 Input Full Name Menggunakan huruf");
    }


    @And("TCC.JC.0170 Input Email")
    public void user_Input_Email() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0170 Input Email");
    }

    @And("TCC.JC.0170 Input Nomor Telepon")
    public void user_Input_Nomor_Telepon() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0170 Input Nomor Telepon");
    }

    @And("TCC.JC.0170 Input Subjek")
    public void user_Input_Subjek() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0170 Input Subjek");
    }

    @And("TCC.JC.0170  Input Massage")
    public void user_Input_Massage() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0170  Input Massage");
    }


    @And("TCC.JC.0170 clik Sand Massage")
    public void user_clik_Sand_Massage() {
       contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0170 clik Sand Massage");
    }
    @Then("TCC.JC.0170 Data contact berhasil disimpan")
    public void Data_contact_berhasil_disimpan(){
        Assert.assertEquals(contactMassage.getTextStatus(),"Thank You for contact us");
        extentTest.log(LogStatus.PASS, "TCC.JC.0170 Data contact berhasil disimpan");
    }

//tas case 2
@When("TCC.JC.0171 Input Full Name Menggunakan simbol")
public void user_Input_Full_Name_Menggunakan_simbol() {
    contactMassage.fullname("Andri Yan>>");
    extentTest.log(LogStatus.PASS, "TCC.JC.0171 Input Full Name Menggunakan simbol");
}


    @And("TCC.JC.0171 Input Email")
    public void user_Input_Email1() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0171 Input Email");
    }

    @And("TCC.JC.0171 Input Nomor Telepon")
    public void user_Input_Nomor_Telepon1() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0171 Input Nomor Telepon");
    }

    @And("TCC.JC.0171 Input Subjek")
    public void user_Input_Subjek1() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0171 Input Subjek");
    }

    @And("TCC.JC.0171  Input Massage")
    public void user_Input_Massage1() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0171  Input Massage");
    }

    @And("TCC.JC.0171 clik Sand Massage")
    public void user_clik_Sand_Massage1() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0171 clik Sand Massage");
    }
    @Then("TCC.JC.0171 Data contact tidak berhasil disimpan")
    public void Data_contact_tidak_berhasil_disimpan(){
        Assert.assertEquals(contactMassage.getTextStatustidakberhasil(),"Karakter (<|>|'|\") tidak diizinkan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0171 Data contact berhasil disimpan");
    }
//tas case 3

@When("TCC.JC.0172 Tidak Input Full Name")
public void user_Tidak_Input_Full_Name() {
driver.navigate().back();
driver.navigate().refresh();
    contactMassage.fullname("");
    extentTest.log(LogStatus.PASS, "TCC.JC.0172 Tidak Input Full Name");
}


    @And("TCC.JC.0172 Input Email")
    public void user_Input_Email2() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0172 Input Email");
    }

    @And("TCC.JC.0172 Input Nomor Telepon")
    public void user_Input_Nomor_Telepon2() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0172 Input Nomor Telepon");
    }

    @And("TCC.JC.0172 Input Subjek")
    public void user_Input_Subjek2() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0172 Input Subjek");
    }

    @And("TCC.JC.0172  Input Massage")
    public void user_Input_Massage2() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0172  Input Massage");
    }

    @And("TCC.JC.0172 clik Sand Massage")
    public void user_clik_Sand_Massage2() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0172 clik Sand Massage");
    }
    @Then("TCC.JC.0172 Data contact tidak berhasil disimpan")
    public void Data_contact_tidak_berhasil_disimpan2(){
        Assert.assertEquals(contactMassage.getTextStatustidakberhasil(),"The name field is required.");
        extentTest.log(LogStatus.PASS, "TCC.JC.0172 Data contact berhasil disimpan");
    }

//tas case 4

    @When("TCC.JC.0173 Input Full Name")
    public void user_Input_Full_Name() {
        driver.navigate().back();
        driver.navigate().refresh();
        contactMassage.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0173 Input Full Name");
    }


    @And("TCC.JC.0173 Input Alamat Email")
    public void user_Input_Alamat_Email() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0173 Input Email");
    }

    @And("TCC.JC.0173 Input Nomor Telepon")
    public void user_Input_Nomor_Telepon3() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0173 Input Nomor Telepon");
    }

    @And("TCC.JC.0173 Input Subjek")
    public void user_Input_Subjek3() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0173 Input Subjek");
    }

    @And("TCC.JC.0173  Input Massage")
    public void user_Input_Massage3() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0173  Input Massage");
    }

    @And("TCC.JC.0173 clik Sand Massage")
    public void user_clik_Sand_Massage3() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0173 clik Sand Massage");
    }
    @Then("TCC.JC.0173 Data contact berhasil disimpan")
    public void Data_contact_berhasil_disimpan3(){
        Assert.assertEquals(contactMassage.getTextStatus(),"Thank You for contact us");
        extentTest.log(LogStatus.PASS, "TCC.JC.0173 Data contact berhasil disimpan");
    }

//tas case 5
@When("TCC.JC.0174 Input Full Name")
public void user_Input_Full_Name1() {
    driver.navigate().back();
    driver.navigate().refresh();
    contactMassage.fullname("Andri Yan");
    extentTest.log(LogStatus.PASS, "TCC.JC.0174 Input Full Name");
}


    @And("TCC.JC.0174 Tidak Input Alamat Email")
    public void user_Tidak_Input_Alamat_Email() {
        contactMassage.email("");
        extentTest.log(LogStatus.PASS, "TCC.JC.0174 Input Email");
    }

    @And("TCC.JC.0174 Input Nomor Telepon")
    public void user_Input_Nomor_Telepon4() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0174 Input Nomor Telepon");
    }

    @And("TCC.JC.0174 Input Subjek")
    public void user_Input_Subjek4() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0174 Input Subjek");
    }

    @And("TCC.JC.0174 Input Massage")
    public void user_Input_Massage5() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0174 Input Massage");
    }

    @And("TCC.JC.0174 clik Sand Massage")
    public void user_clik_Sand_Massage4() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0174 clik Sand Massage");
    }
    @Then("TCC.JC.0174 Data contact tidak berhasil disimpan")
    public void Data_contact_tidak_berhasil_disimpan5(){
        Assert.assertEquals(contactMassage.getTextStatusEmailtidakberhasil(),"The email field is required.");
        extentTest.log(LogStatus.PASS, "TCC.JC.0174 Data contact berhasil disimpan");
    }

//tes case 6
@When("TCC.JC.0175 Input Full Name")
public void user_Input_Full_Name2() {
    driver.navigate().back();
    driver.navigate().refresh();
    contactMassage.fullname("Andri Yan");
    extentTest.log(LogStatus.PASS, "TCC.JC.0175 Input Full Name");
}


    @And("TCC.JC.0175 Input Alamat Email")
    public void user_Input_Alamat_Email1() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0175 Input Email");
    }

    @And("TCC.JC.0175 Input Nomor Telepon")
    public void user_Input_Nomor_Telepon5() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0175 Input Nomor Telepon");
    }

    @And("TCC.JC.0175 Input Subjek")
    public void user_Input_Subjek5() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0175 Input Subjek");
    }

    @And("TCC.JC.0175 Input Massage")
    public void user_Input_Massage4() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0175 Input Massage");
    }

    @And("TCC.JC.0175 clik Sand Massage")
    public void user_clik_Sand_Massage5() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0175 clik Sand Massage");
    }
    @Then("TCC.JC.0175 Data contact berhasil disimpan")
    public void Data_contact_berhasil_disimpan6(){
        Assert.assertEquals(contactMassage.getTextStatus(),"Thank You for contact us");
        extentTest.log(LogStatus.PASS, "TCC.JC.0175 Data contact berhasil disimpan");
    }

    //tes case 7

    @When("TCC.JC.0176 Input Full Name")
    public void user_Input_Full_Name3() {
        driver.navigate().back();
        driver.navigate().refresh();
        contactMassage.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0176 Input Full Name");
    }


    @And("TCC.JC.0176 Input Alamat Email")
    public void user_Input_Alamat_Email2() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0176 Input Email");
    }

    @And("TCC.JC.0176 Input Nomor Telepon menggunakan huruf")
    public void user_Input_Nomor_Telepon_menggunakan_huruf() {
        contactMassage.Phone("sdsfsfsf");
        extentTest.log(LogStatus.PASS, "TCC.JC.0176 Input Nomor Telepon");
    }

    @And("TCC.JC.0176 Input Subjek")
    public void user_Input_Subjek6() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0176 Input Subjek");
    }

    @And("TCC.JC.0176 Input Massage")
    public void user_Input_Massage6() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0176 Input Massage");
    }

    @And("TCC.JC.0176 clik Sand Massage")
    public void user_clik_Sand_Massagee6() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0176 clik Sand Massage");
    }
    @Then("TCC.JC.0176 Data contact berhasil disimpan")
    public void Data_contact_berhasil_disimpan9(){
        Assert.assertEquals(contactMassage.getTextStatus(),"Thank You for contact us");
        extentTest.log(LogStatus.PASS, "TCC.JC.0176 Data contact berhasil disimpan");
    }



    //tes case 8

    @When("TCC.JC.0177 Input Full Name")
    public void user_Input_Full_Name4() {
        driver.navigate().back();
        driver.navigate().refresh();
        contactMassage.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0177 Input Full Name");
    }


    @And("TCC.JC.0177 Input Alamat Email")
    public void user_Input_Alamat_Email3() {

        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0177 Input Email");
    }

    @And("TCC.JC.0177 Tidak Input Nomor Telepon")
    public void user_Tidak_Input_Nomor_Telepon() {
        contactMassage.Phone("");
        extentTest.log(LogStatus.PASS, "TCC.JC.0177 Tidak Input Nomor Telepon");
    }

    @And("TCC.JC.0177 Input Subjek")
    public void user_Input_Subjek7() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0177 Input Subjek");
    }

    @And("TCC.JC.0177 Input Massage")
    public void user_Input_Massage7() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0177 Input Massage");
    }

    @And("TCC.JC.0177 clik Sand Massage")
    public void user_clik_Sand_Massage7() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0177 clik Sand Massage");
    }
    @Then("TCC.JC.0177 Data contact tidak berhasil disimpan")
    public void Data_contact_tidak_berhasil_disimpan7(){
        Assert.assertEquals(contactMassage.getTextStatustidakberhasilphone(),"The phone field is required.");
        extentTest.log(LogStatus.PASS, "TCC.JC.0177 Data contact berhasil disimpan");
    }


//tes case 9

    @When("TCC.JC.0178 Input Full Name")
    public void user_Input_Full_Name8() {
        driver.navigate().back();
        driver.navigate().refresh();
        contactMassage.fullname("Andri Ya");
        extentTest.log(LogStatus.PASS, "TCC.JC.0178 Input Full Name");
    }


    @And("TCC.JC.0178 Input Alamat Email")
    public void user_Input_Alamat_Email8() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0178 Input Email");
    }

    @And("TCC.JC.0178 Input Nomor Telepon")
    public void user_Input_Nomor_Telepon8() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0178 Input Nomor Telepon");
    }


    @And("TCC.JC.0178 Input Subjek")
    public void user_Input_Subjek8() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0178 Input Subjek");
    }

    @And("TCC.JC.0178 Input Massage")
    public void user_Input_Massage8() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0178 Input Massage");
    }

    @And("TCC.JC.0178 clik Sand Massage")
    public void user_clik_Sand_Massage8() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0178 clik Sand Massage");
    }
    @Then("TCC.JC.0178 Data contact berhasil disimpan")
    public void Data_contact_berhasil_disimpan8(){
        Assert.assertEquals(contactMassage.getTextStatus(),"Thank You for contact us");
        extentTest.log(LogStatus.PASS, "TCC.JC.0178 Data contact berhasil disimpan");
    }


    //tes case 10

    @When("TCC.JC.0179 Input Full Name")
    public void user_Input_Full_Name9() {
        contactMassage.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0179 Input Full Name");
    }


    @And("TCC.JC.0179 Input Alamat Email")
    public void user_Input_Alamat_Email9() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0179 Input Email");
    }

    @And("TCC.JC.0179 Input Nomor Telepon")
    public void user_Input_Nomor_Telepon9() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0179 Input Nomor Telepon");
    }


    @And("TCC.JC.0179 Input Subject menggunakan menggunakan simbol")
    public void user_Input_Subject_menggunakan_menggunakan_simbol() {
        contactMassage.subject("Pendaftaran>>");
        extentTest.log(LogStatus.PASS, "TCC.JC.0179 Input Subject menggunakan menggunakan simbol");
    }

    @And("TCC.JC.0179 Input Massage")
    public void user_Input_Massage9() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0179 Input Massage");
    }


    @And("TCC.JC.0179 clik Sand Massage")
    public void user_clik_Sand_Massage9() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0179 clik Sand Massage");
    }
    @Then("TCC.JC.0179 Data contact tidak berhasil disimpan")
    public void Data_contact_tidak_berhasil_disimpan9(){
        Assert.assertEquals(contactMassage.getTextStatustidakberhasilsubject(),"Karakter (<|>|'|\") tidak diizinkan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0179 Data contact berhasil disimpan");
    }
//tes case 11

    @When("TCC.JC.0180 Input Full Name")
    public void user_Input_Full_Namee() {
        driver.navigate().back();
        driver.navigate().refresh();
        contactMassage.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0180 Input Full Name");
    }


    @And("TCC.JC.0180 Input Alamat Email")
    public void user_Input_Alamat_Emaill() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0180 Input Email");
    }

    @And("TCC.JC.0180 Input Nomor Telepon")
    public void user_Input_Nomor_Teleponn() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0180 Input Nomor Telepon");
    }


    @And("TCC.JC.0180 Tidak Input Subject")
    public void user_Tidak_Input_Subject() {
        contactMassage.subject("");
        extentTest.log(LogStatus.PASS, "TCC.JC.0180 Tidak Input Subject");
    }

    @And("TCC.JC.0180 Input Massage")
    public void user_Input_Massagee() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0180 Input Massage");
    }

    @And("TCC.JC.0180 clik Sand Massage")
    public void user_clik_Sand_Massagee() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0180 clik Sand Massage");
    }
    @Then("TCC.JC.0180 Data contact tidak berhasil disimpan")
    public void Data_contact_tidak_berhasil_disimpann(){
        Assert.assertEquals(contactMassage.getTextStatustidakberhasilsubject(),"The subject field is required.") ;
        extentTest.log(LogStatus.PASS, "TCC.JC.0180 Data contact berhasil disimpan");
    }

    //tes case 12

    @When("TCC.JC.0181 Input Full Name")
    public void user_Input_Full_Namee1() {
        driver.navigate().back();
        driver.navigate().refresh();
        contactMassage.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0181 Input Full Name");
    }


    @And("TCC.JC.0181 Input Alamat Email")
    public void user_Input_Alamat_Emaill1() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0181 Input Email");
    }

    @And("TCC.JC.0181 Input Nomor Telepon")
    public void user_Input_Nomor_Teleponn1() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0181 Input Nomor Telepon");
    }


    @And("TCC.JC.0181 Input Subjek")
    public void user_Input_Subjek9() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0181 Input Subjek");
    }


    @And("TCC.JC.0181 Input Massage")
    public void user_Input_Massagee1() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0181 Input Massage");
    }

    @And("TCC.JC.0181 clik Sand Massage")
    public void user_clik_Sand_Massagee1() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0181 clik Sand Massage");
    }
    @Then("TCC.JC.0181 Data contact berhasil disimpan")
    public void Data_contact_berhasil_disimpann(){
        Assert.assertEquals(contactMassage.getTextStatus(),"Thank You for contact us");
        extentTest.log(LogStatus.PASS, "TCC.JC.0181 Data contact berhasil disimpan");
    }


    //tes cas 13
    @When("TCC.JC.0182 Input Full Name")
    public void user_Input_Full_Namee2() {
        driver.navigate().back();
        driver.navigate().refresh();
        contactMassage.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0182 Input Full Name");
    }


    @And("TCC.JC.0182 Input Alamat Email")
    public void user_Input_Alamat_Emaill2() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0182 Input Email");
    }

    @And("TCC.JC.0182 Input Nomor Telepon")
    public void user_Input_Nomor_Teleponn2() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0182 Input Nomor Telepon");
    }


    @And("TCC.JC.0182 Input Subjek")
    public void user_Input_Subjekk() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0182 Input Subjek");
    }


    @And("TCC.JC.0182 Input  Massage  menggunakan simbol")
    public void user_Input_Massage_menggunakan_simbol1() {
        contactMassage.TxtMassage("Ingin mendaftar!!");
        extentTest.log(LogStatus.PASS, "TCC.JC.0182 Input Massage");
    }

    @And("TCC.JC.0182 clik Sand Massage")
    public void user_clik_Sand_Massagee2() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0182 clik Sand Massage");
    }
    @Then("TCC.JC.0182 Data contact berhasil disimpan")
    public void Data_contact_berhasil_disimpann1(){
        Assert.assertEquals(contactMassage.getTextStatus(),"Thank You for contact us");
        extentTest.log(LogStatus.PASS, "TCC.JC.0182 Data contact berhasil disimpan");
    }


//tes case 14

    @When("TCC.JC.0183 Input Full Name")
    public void user_Input_Full_Namee3() {
        driver.navigate().back();
        driver.navigate().refresh();
        contactMassage.fullname("Andri Yn");
        extentTest.log(LogStatus.PASS, "TCC.JC.0183 Input Full Name");
    }


    @And("TCC.JC.0183 Input Alamat Email")
    public void user_Input_Alamat_Emaill3() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0183 Input Email");
    }

    @And("TCC.JC.0183 Input Nomor Telepon")
    public void user_Input_Nomor_Teleponn3() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0183 Input Nomor Telepon");
    }


    @And("TCC.JC.0183 Input Subjek")
    public void user_Input_Subjekk1() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0183 Input Subjek");
    }


    @And("TCC.JC.0183 Tidak Input  Massage")
    public void user_Tidak_Input_Massage() {
        contactMassage.TxtMassage("");
        extentTest.log(LogStatus.PASS, "TCC.JC.0183 Input Massage");
    }

    @And("TCC.JC.0183 clik Sand Massage")
    public void user_clik_Sand_Massagee3() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0183 clik Sand Massage");
    }
    @Then("TCC.JC.0183 Data contact berhasil disimpan")
    public void Data_contact_berhasil_disimpann3(){
        Assert.assertEquals(contactMassage.getTextStatus(),"Thank You for contact us");
        extentTest.log(LogStatus.PASS, "TCC.JC.0183 Data contact berhasil disimpan");
    }


//tes case 15

    @When("TCC.JC.0184 Input Full Name")
    public void user_Input_Full_Namee4() {
        driver.navigate().back();
        driver.navigate().refresh();
        contactMassage.fullname("Andri Yan");
        extentTest.log(LogStatus.PASS, "TCC.JC.0184 Input Full Name");
    }


    @And("TCC.JC.0184 Input Alamat Email")
    public void user_Input_Alamat_Emaill4() {
        contactMassage.email("Andri933@gmail.com");
        extentTest.log(LogStatus.PASS, "TCC.JC.0184 Input Email");
    }

    @And("TCC.JC.0184 Input Nomor Telepon")
    public void user_Input_Nomor_Teleponn4() {
        contactMassage.Phone("088944234234");
        extentTest.log(LogStatus.PASS, "TCC.JC.0184 Input Nomor Telepon");
    }


    @And("TCC.JC.0184 Input Subjek")
    public void user_Input_Subjekk4() {
        contactMassage.subject("Pendaftaran");
        extentTest.log(LogStatus.PASS, "TCC.JC.0184 Input Subjek");
    }


    @And("TCC.JC.0184 Input Massage")
    public void user_Input_Massagee2() {
        contactMassage.TxtMassage("Ingin mendaftar");
        extentTest.log(LogStatus.PASS, "TCC.JC.0184 Input Massage");
    }

    @And("TCC.JC.0184 clik Sand Massage")
    public void user_clik_Sand_Massagee4() {
        contactMassage.clickBtnMassage();
        extentTest.log(LogStatus.PASS, "TCC.JC.0184 clik Sand Massage");
    }
    @Then("TCC.JC.0184 Data contact berhasil disimpan")
    public void Data_contact_berhasil_disimpann4(){
        Assert.assertEquals(contactMassage.getTextStatus(),"Thank You for contact us");
        extentTest.log(LogStatus.PASS, "TCC.JC.0184 Data contact berhasil disimpan");
    }

}
