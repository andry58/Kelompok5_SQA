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

public class TestEditBlog {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private BlogPages editblog = new BlogPages();

    public TestEditBlog() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //Edit Foto Blog ========================================================================================================================================================================

    @When("TCC.JC.160 User go to web Edit Blog")
    public void TCCJC160_User_go_to_web_Edit_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/edit/483");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.160 User go to web Edit Blog");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.160 User edit foto blog")
    public void TCCJC160_User_edit_foto_blog() {
        editblog.setFotoedit("D:\\buatmagang2.PNG");
        extentTest.log(LogStatus.PASS, "TCC.JC.160 User edit foto blog");
    }

    @Then("TCC.JC.160 User click button edit blog")
    public void TCCJCC160_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editblog.setbtnsimpanedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.160 User click button edit blog");
    }

    //Edit Judul Blog ========================================================================================================================================================================

    @When("TCC.JC.161 User go to web Edit Blog")
    public void TCCJC161_User_go_to_web_Edit_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/edit/483");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.161 User go to web Edit Blog");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.161 User edit judul blog")
    public void TCCJC161_User_edit_judul_blog() {
        editblog.setjudublogedit("Ganti Judul Blog");
        extentTest.log(LogStatus.PASS, "TCC.JC.161 User edit foto blog");
    }

  @Then("TCC.JC.161 User click button edit blog")
  public void TCCJCC161_User_click_button_edit() {
        //  driver.get(Constants.URL);editblog.setbtnsimpanedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.161 User click button edit blog");
   }

    //Edit Publish Active Blog ========================================================================================================================================================================

    @When("TCC.JC.162 User go to web Edit Blog")
    public void TCCJC162_User_go_to_web_Edit_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/edit/483");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.162 User go to web Edit Blog");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.162 User edit Active blog")
    public void TCCJC162_User_edit_Active_blog() {
        editblog.setpublishblogedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.162 User edit foto blog");
    }

    @Then("TCC.JC.162 User click button edit blog")
    public void TCCJCC162_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editblog.setbtnsimpanedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.162 User click button edit blog");
    }

    //Edit Publish No Active Blog ========================================================================================================================================================================

    @When("TCC.JC.163 User go to web Edit Blog")
    public void TCCJC163_User_go_to_web_Edit_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/edit/483");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.163 User go to web Edit Blog");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.163 User edit Noactive blog")
    public void TCCJC163_User_edit_Noactive_blog() {
        editblog.setpublishblogedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.163 User edit foto blog");
    }

    @Then("TCC.JC.163 User click button edit blog")
    public void TCCJCC163_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editblog.setbtnsimpanedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.162 163 click button edit blog");
    }

    //Edit Settohome Yes Blog ========================================================================================================================================================================

    @When("TCC.JC.164 User go to web Edit Blog")
    public void TCCJC164_User_go_to_web_Edit_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/edit/483");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.164 User go to web Edit Blog");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.164 User edit Noactive blog")
    public void TCCJC164_User_settohome_yes_blog() {
        editblog.setsettohomeedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.164 User edit foto blog");
    }

    @Then("TCC.JC.164 User click button edit blog")
    public void TCCJCC164_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editblog.setbtnsimpanedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.164 click button edit blog");
    }

    //Edit Settohome No Blog ========================================================================================================================================================================

    @When("TCC.JC.165 User go to web Edit Blog")
    public void TCCJC165_User_go_to_web_Edit_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/edit/483");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.164 User go to web Edit Blog");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.165 User edit Noactive blog")
    public void TCCJC165_User_settohome_yes_blog() {
        editblog.setsettohomeedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.165 User edit foto blog");
    }

    @Then("TCC.JC.165 User click button edit blog")
    public void TCCJCC165_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editblog.setbtnsimpanedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.165 click button edit blog");
    }

    //Edit Content Priview Blog ========================================================================================================================================================================

    @When("TCC.JC.166 User go to web Edit Blog")
    public void TCCJC166_User_go_to_web_Edit_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/edit/483");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.166 User go to web Edit Blog");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.166 User edit Noactive blog")
    public void TCCJC166_User_settohome_yes_blog() {
        editblog.setcontentpriviewedit("Ganti Content Priview");
        extentTest.log(LogStatus.PASS, "TCC.JC.166 User edit foto blog");
    }

    @Then("TCC.JC.166 User click button edit blog")
    public void TCCJCC166_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editblog.setbtnsimpanedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.166 click button edit blog");
    }

    //Edit Content Blog ========================================================================================================================================================================

    @When("TCC.JC.167 User go to web Edit Blog")
    public void TCCJC167_User_go_to_web_Edit_Blog() {
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/blogs/edit/483");
        //editBenefit.setbuttonedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.167 User go to web Edit Blog");

        //driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to web Tambah Benefit");

    }

    @And("TCC.JC.167 User edit Content blog")
    public void TCCJC167_User_content_blog() {
        editblog.setcontentedit("Ganti content yang dimana isinya nanti akan diganti");
        extentTest.log(LogStatus.PASS, "TCC.JC.167 User edit foto blog");
    }

    @Then("TCC.JC.167 User click button edit blog")
    public void TCCJCC167_User_click_button_edit() {
        //  driver.get(Constants.URL);
        editblog.setbtnsimpanedit();
        extentTest.log(LogStatus.PASS, "TCC.JC.167 click button edit blog");
    }
}
