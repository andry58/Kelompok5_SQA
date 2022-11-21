package com.juaracoding;

import com.juaracoding.Utils.Constants;
import com.juaracoding.pages.Login;
import com.juaracoding.pages.LoginPages;
import com.juaracoding.pages.TambahBenefitPages;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPages Login = new LoginPages();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.JC.006 Admin berada di halaman login")
    public void admin_di_halaman_login() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Admin on login page");
    }
    @And("TCC.JC.006 Admin input username password valid")
    public void admin_input_username_password_valid() {
        Login.login("ucen1315@gmail.com", "a");
        extentTest.log(LogStatus.PASS, "Admin input username password valid");
    }

    @And("TCC.JC.006 Admin Klik button sign-in valid")
    public void admin_klik_button_signin_valid() {
        Login.clickBtnSignIn();
        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
    }

    @Then("TCC.JC.006 Admin berhasil login")
    public void admin_berhasil_login() {
        Assert.assertEquals(Login.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "Admin valid credentials Admin berhasil login");
    }



}
