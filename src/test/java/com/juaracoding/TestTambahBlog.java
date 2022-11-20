package com.juaracoding;

import com.juaracoding.Utils.Constants;
import com.juaracoding.pages.BlogPages;
import com.juaracoding.pages.TambahBenefitPages;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTambahBlog {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private BlogPages tambahBlog = new BlogPages();

    public TestTambahBlog() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //Input Judul Blog  =========================================================================================================
    @When("TCC.JC.148 User go to web Tambah Blog")
    public void user_go_to_web_Tambah_Benefit() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.148 User input foto")
    public void TCCJC148_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.148 User input foto");
    }

    @And("TCC.JC.148 User input judul blog")
    public void TCCJC148_User_input_judul_blog() {
       tambahBlog.setjudublog("Tambah Judul 1");
        extentTest.log(LogStatus.PASS,"TCC.JC.148 User input judul blog");
    }

    @And("TCC.JC.148 User input publish")
    public void TCCJC148_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.148 User input publish");
    }

    @And("TCC.JC.148 User input set to home")
    public void TCCJC148_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.148 User input set to home");
    }

    @And("TCC.JC.148 User input content priview")
    public void TCCJC148_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("Content Priview 1");
        extentTest.log(LogStatus.PASS,"TCC.JC.148 User input content priview");
    }

    @And("TCC.JC.148 User input content")
    public void TCCJC148_User_input_content() {
       tambahBlog.setcontent("Content yang isinya akan dimasukan content satu");
        extentTest.log(LogStatus.PASS,"TCC.JC.148 User input content");
    }

    @Then("TCC.JC.148 User klik buton simpan")
    public void TCCJC148_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.148 User klik buton simpan");
    }

    //Kosongkan Judul Blog =========================================================================================================

    @When("TCC.JC.149 User go to web Tambah Blog")
    public void TCCJC149_User_gotoweb_Tambah_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.149 User input foto")
    public void TCCJC149_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.149 User input foto");
    }

    @And("TCC.JC.149 User input judul blog")
    public void TCCJC149_User_input_judul_blog() {
       tambahBlog.setjudublog("");
        extentTest.log(LogStatus.PASS,"TCC.JC.149 User input judul blog");
    }

    @And("TCC.JC.149 User input publish")
    public void TCCJC149_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.149 User input publish");
    }

    @And("TCC.JC.149 User input set to home")
    public void TCCJC149_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.149 User input set to home");
    }

    @And("TCC.JC.149 User input content priview")
    public void TCCJC149_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("Content Priview dua");
        extentTest.log(LogStatus.PASS,"TCC.JC.149 User input content priview");
    }

    @And("TCC.JC.149 User input content")
    public void TCCJC149_User_input_content() {
       tambahBlog.setcontent("Content yang isinya akan dimasukan content dua");
        extentTest.log(LogStatus.PASS,"TCC.JC.149 User input content");
    }

    @Then("TCC.JC.149 User klik buton simpan")
    public void TCCJC149_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.149 User klik buton simpan");
    }

    //Set Publish Active Blog =========================================================================================================

    @When("TCC.JC.150 User go to web Tambah Blog")
    public void TCCJC150_User_gotoweb_Tambah_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.150 User input foto")
    public void TCCJC150_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.150 User input foto");
    }

    @And("TCC.JC.150 User input judul blog")
    public void TCCJC150_User_input_judul_blog() {
       tambahBlog.setjudublog("Judul Blog dua");
        extentTest.log(LogStatus.PASS,"TCC.JC.150 User input judul blog");
    }

    @And("TCC.JC.150 User input publish")
    public void TCCJC150_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.150 User input publish");
    }

    @And("TCC.JC.150 User input set to home")
    public void TCCJC150_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.150 User input set to home");
    }

    @And("TCC.JC.150 User input content priview")
    public void TCCJC150_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("content priview");
        extentTest.log(LogStatus.PASS,"TCC.JC.150 User input content priview");
    }

    @And("TCC.JC.150 User input content")
    public void TCCJC150_User_input_content() {
       tambahBlog.setcontent("masukan content");
        extentTest.log(LogStatus.PASS,"TCC.JC.150 User input content");
    }

    @Then("TCC.JC.150 User klik buton simpan")
    public void TCCJC150_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.150 User klik buton simpan");
    }

    //Set Publish Noactive Blog =========================================================================================================

    @When("TCC.JC.151 User go to web Tambah Blog")
    public void TCCJC151_User_gotoweb_Tambah_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.151 User input foto")
    public void TCCJC151_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.150 User input foto");
    }

    @And("TCC.JC.151 User input judul blog")
    public void TCCJC151_User_input_judul_blog() {
       tambahBlog.setjudublog("");
        extentTest.log(LogStatus.PASS,"TCC.JC.151 User input judul blog");
    }

    @And("TCC.JC.151 User input publish")
    public void TCCJC151_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.151 User input publish");
    }

    @And("TCC.JC.151 User input set to home")
    public void TCCJC151_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.151 User input set to home");
    }

    @And("TCC.JC.151 User input content priview")
    public void TCCJC151_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("dessatu");
        extentTest.log(LogStatus.PASS,"TCC.JC.151 User input content priview");
    }

    @And("TCC.JC.151 User input content")
    public void TCCJC151_User_input_content() {
       tambahBlog.setcontent("Content yang isinya akan dimasukan content tiga");
        extentTest.log(LogStatus.PASS,"TCC.JC.151 User input content");
    }

    @Then("TCC.JC.151 User klik buton simpan")
    public void TCCJC151_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.151 User klik buton simpan");
    }

    //Set To Home Yes Blog =========================================================================================================

    @When("TCC.JC.152 User go to web Tambah Blog")
    public void TCCJC152_User_gotoweb_Tambah_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.152 User input foto")
    public void TCCJC152_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.152 User input foto");
    }

    @And("TCC.JC.152 User input judul blog")
    public void TCCJC152_User_input_judul_blog() {
       tambahBlog.setjudublog("Tambah Judul Blog Empat");
        extentTest.log(LogStatus.PASS,"TCC.JC.152 User input judul blog");
    }

    @And("TCC.JC.152 User input publish")
    public void TCCJC152_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.152 User input publish");
    }

    @And("TCC.JC.152 User input set to home")
    public void TCCJC152_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.152 User input set to home");
    }

    @And("TCC.JC.152 User input content priview")
    public void TCCJC152_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("Content Empat");
        extentTest.log(LogStatus.PASS,"TCC.JC.152 User input content priview");
    }

    @And("TCC.JC.152 User input content")
    public void TCCJC152_User_input_content() {
       tambahBlog.setcontent("Content yang isinya akan dimasukan content satu");
        extentTest.log(LogStatus.PASS,"TCC.JC.152 User input content");
    }

    @Then("TCC.JC.152 User klik buton simpan")
    public void TCCJC152_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.152 User klik buton simpan");
    }

    //Set To Home No Blog =========================================================================================================

    @When("TCC.JC.153 User go to web Tambah Blog")
    public void TCCJC153_User_gotoweb_Tambah_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.153 User input foto")
    public void TCCJC153_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.153 User input foto");
    }

    @And("TCC.JC.153 User input judul blog")
    public void TCCJC153_User_input_judul_blog() {
       tambahBlog.setjudublog("Judul Blog Lima");
        extentTest.log(LogStatus.PASS,"TCC.JC.153 User input judul blog");
    }

    @And("TCC.JC.153 User input publish")
    public void TCCJC153_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.153 User input publish");
    }

    @And("TCC.JC.153 User input set to home")
    public void TCCJC153_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.153 User input set to home");
    }

    @And("TCC.JC.153 User input content priview")
    public void TCCJC153_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("Content Lima");
        extentTest.log(LogStatus.PASS,"TCC.JC.153 User input content priview");
    }

    @And("TCC.JC.153 User input content")
    public void TCCJC153_User_input_content() {
       tambahBlog.setcontent("Content yang isinya akan dimasukan content Lima");
        extentTest.log(LogStatus.PASS,"TCC.JC.153 User input content");
    }

    @Then("TCC.JC.153 User klik buton simpan")
    public void TCCJC153_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.153 User klik buton simpan");
    }

    //Input Content Priview  Blog =========================================================================================================

    @When("TCC.JC.154 User go to web Tambah Blog")
    public void TCCJC154_User_gotoweb_Tambah_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.154 User input foto")
    public void TCCJC154_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.154 User input foto");
    }

    @And("TCC.JC.154 User input judul blog")
    public void TCCJC154_User_input_judul_blog() {
       tambahBlog.setjudublog("Judul Blog Enam");
        extentTest.log(LogStatus.PASS,"TCC.JC.154 User input judul blog");
    }

    @And("TCC.JC.154 User input publish")
    public void TCCJC154_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.154 User input publish");
    }

    @And("TCC.JC.154 User input set to home")
    public void TCCJC154_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.154 User input set to home");
    }

    @And("TCC.JC.154 User input content priview")
    public void TCCJC154_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("Content Yang Diinput");
        extentTest.log(LogStatus.PASS,"TCC.JC.154 User input content priview");
    }

    @And("TCC.JC.154 User input content")
    public void TCCJC154_User_input_content() {
       tambahBlog.setcontent("Content yang isinya akan dimasukan content Enam");
        extentTest.log(LogStatus.PASS,"TCC.JC.154 User input content");
    }

    @Then("TCC.JC.154 User klik buton simpan")
    public void TCCJC154_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.154 User klik buton simpan");
    }

    //Kosongkan Content Priview  Blog =========================================================================================================

    @When("TCC.JC.155 User go to web Tambah Blog")
    public void TCCJC155_User_gotoweb_Tambah_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.155 User input foto")
    public void TCCJC155_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.155 User input foto");
    }

    @And("TCC.JC.155 User input judul blog")
    public void TCCJC155_User_input_judul_blog() {
       tambahBlog.setjudublog("Judul Blog Tujuh");
        extentTest.log(LogStatus.PASS,"TCC.JC.155 User input judul blog");
    }

    @And("TCC.JC.155 User input publish")
    public void TCCJC155_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.155 User input publish");
    }

    @And("TCC.JC.155 User input set to home")
    public void TCCJC155_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.155 User input set to home");
    }

    @And("TCC.JC.155 User input content priview")
    public void TCCJC155_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("");
        extentTest.log(LogStatus.PASS,"TCC.JC.155 User input content priview");
    }

    @And("TCC.JC.155 User input content")
    public void TCCJC155_User_input_content() {
       tambahBlog.setcontent("Content yang isinya akan dimasukan content Tujuh");
        extentTest.log(LogStatus.PASS,"TCC.JC.155 User input content");
    }

    @Then("TCC.JC.155 User klik buton simpan")
    public void TCCJC155_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.155 User klik buton simpan");
    }

    //Input Content Blog =========================================================================================================

    @When("TCC.JC.156 User go to web Tambah Blog")
    public void TCCJC156_User_gotoweb_Tambah_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.156 User input foto")
    public void TCCJC156_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.156 User input foto");
    }

    @And("TCC.JC.156 User input judul blog")
    public void TCCJC156_User_input_judul_blog() {
       tambahBlog.setjudublog("Judul Delapan");
        extentTest.log(LogStatus.PASS,"TCC.JC.156 User input judul blog");
    }

    @And("TCC.JC.156 User input publish")
    public void TCCJC156_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.156 User input publish");
    }

    @And("TCC.JC.156 User input set to home")
    public void TCCJC156_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.156 User input set to home");
    }

    @And("TCC.JC.156 User input content priview")
    public void TCCJC156_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("Content Delapan");
        extentTest.log(LogStatus.PASS,"TCC.JC.156 User input content priview");
    }

    @And("TCC.JC.156 User input content")
    public void TCCJC156_User_input_content() {
       tambahBlog.setcontent("Content yang isinya akan dimasukan content Delapan");
        extentTest.log(LogStatus.PASS,"TCC.JC.156 User input content");
    }

    @Then("TCC.JC.156 User klik buton simpan")
    public void TCCJC156_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.156 User klik buton simpan");
    }


    //Kosongkan Content Blog =========================================================================================================

    @When("TCC.JC.157 User go to web Tambah Blog")
    public void TCCJC157_User_gotoweb_Tambah_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "User on menu Home");

    }

    @And("TCC.JC.157 User input foto")
    public void TCCJC157_User_input_foto() {
       tambahBlog.setFoto("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS,"TCC.JC.157 User input foto");
    }

    @And("TCC.JC.157 User input judul blog")
    public void TCCJC157_User_input_judul_blog() {
       tambahBlog.setjudublog("Judul Blog Sembilan");
        extentTest.log(LogStatus.PASS,"TCC.JC.157 User input judul blog");
    }

    @And("TCC.JC.157 User input publish")
    public void TCCJC157_User_input_publish() {
       tambahBlog.setpublishblog();
        extentTest.log(LogStatus.PASS,"TCC.JC.157 User input publish");
    }

    @And("TCC.JC.157 User input set to home")
    public void TCCJC157_User_input_settohome() {
       tambahBlog.setsettohome();
        extentTest.log(LogStatus.PASS,"TCC.JC.157 User input set to home");
    }

    @And("TCC.JC.157 User input content priview")
    public void TCCJC157_User_input_foto_content_priview() {
       tambahBlog.setcontentpriview("Content Sembilan");
        extentTest.log(LogStatus.PASS,"TCC.JC.157 User input content priview");
    }

    @And("TCC.JC.157 User input content")
    public void TCCJC157_User_input_content() {
       tambahBlog.setcontent("");
        extentTest.log(LogStatus.PASS,"TCC.JC.157 User input content");
    }

    @Then("TCC.JC.157 User klik buton simpan")
    public void TCCJC157_User_klik_buton_simpan() {
       tambahBlog.setbtnsimpan();
        extentTest.log(LogStatus.PASS,"TCC.JC.157 User klik buton simpan");
    }


}
