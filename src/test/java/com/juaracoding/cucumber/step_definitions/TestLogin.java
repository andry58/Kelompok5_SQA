package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.Utils.Constants;
import com.juaracoding.pages.Login;
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
    private Login login = new Login();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test Case Invalid URL
    @When("TCC.JC.001 Admin enter invalid URL")
    public void admin_enter_invalid_url() {
        driver.get(Constants.INVALID_URL);
        extentTest.log(LogStatus.PASS, "Admin enter invalid URL");
    }

    @Then("TCC.JC.001 Admin gagal mengakses web, 404 file not found")
    public void admin_gagal_mengakses_web() {
        Assert.assertEquals(login.getTxtInvalidUrl(), "404 - File Not Found");
        extentTest.log(LogStatus.PASS, "Admin gagal mengakses web 404 file not found");
    }

    //Test Case Vlaid URL
    @When("TCC.JC.002 Admin enter valid URL")
    public void admin_enter_valid_url() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Admin enter valid URL");
    }

    @Then("TCC.JC.002 Admin berhasil mengakses web juara coding")
    public void admin_berhasil_mengakses_web() {
        Assert.assertEquals(login.getTxtValidUrl(), "Admin Login");
        extentTest.log(LogStatus.PASS, "Admin on web juara coding");
    }

    //Test Case null login
    @When("TCC.JC.003 Admin klik button sign-in null")
    public void admin_klik_button_signin_null() {
        login.clickBtnSignIn();
        extentTest.log(LogStatus.PASS, "AAdmin klik button signin null");
    }

    @Then("TCC.JC.003 Admin gagal login username dan passwor kosong")
    public void admin_gagal_login_null() {
        Assert.assertEquals(login.getTxtNull(), "username Atau Password Kosong");
        login.clickBtnOkNull();
        extentTest.log(LogStatus.PASS, "Admin gagal login username dan passwor kosong");
    }

    //Test Case Invalid login

    @When("TCC.JC.004 Admin input invalid username password")
    public void admin_input_invalid_username_password() {
        login.login("ucen@gmail.com", "ucen12");
        extentTest.log(LogStatus.PASS, "Admin input invalid username password");
    }

    @And("TCC.JC.004 Admin klik button sign-in invalid")
    public void admin_click_button_signin() {
        login.clickBtnSignIn();
        extentTest.log(LogStatus.PASS, "Admin click button signin invalid");
    }

    @Then("TCC.JC.004 Admin gagal login username Atau Password Salah")
    public void admin_invalid_credentials() {
        Assert.assertEquals(login.getTxtInvalidCredentials(), "Username Atau Password Salah");
        extentTest.log(LogStatus.PASS, "Admin gagal login username Atau Password Salah");
    }

    //Test Case Uppercase login
    @When("TCC.JC.005 Admin input Uppercase username dan password")
    public void admin_input_uppercase_username() {
        login.login("UCEN1315@GMAIL.COM", "a");
        extentTest.log(LogStatus.PASS, "Admin input username menggunakan (Uppercase) dan password");
    }

    @And("TCC.JC.005 Admin Klik button sign-in uppercase")
    public void admin_klik_button_signin_uppercase() {
        login.clickBtnSignIn();
        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in uppercase");
    }

    @Then("TCC.JC.005 Admin gagal login username atau password Salah")
    public void admin_gagal_login_dashboard_page() {
        Assert.assertEquals(login.getTxtInvalidCredentials(), "Username Atau Password Salah");
        extentTest.log(LogStatus.PASS, "Admin berhasil masuk ke web juara coding");
    }

    //Test Case Valid Login
    @When("TCC.JC.006 Admin berada di halaman login")
    public void admin_di_halaman_login() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Admin on login page");
    }
    @And("TCC.JC.006 Admin input username password valid")
    public void admin_input_username_password_valid() {
        login.login("ucen1315@gmail.com", "a");
        extentTest.log(LogStatus.PASS, "Admin input username password valid");
    }

    @And("TCC.JC.006 Admin Klik button sign-in valid")
    public void admin_klik_button_signin_valid() {
        login.clickBtnSignIn();
        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
    }

    @Then("TCC.JC.006 Admin berhasil login")
    public void admin_berhasil_login() {
        Assert.assertEquals(login.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "Admin valid credentials Admin berhasil login");
    }

    //Test Case Logout
    @When("TCC.JC.007 Admin klik button logout")
    public void admin_klik_button_logout() {
        login.clickBtnLogout();
        extentTest.log(LogStatus.PASS, "Admin klik button logout");
    }

    @Then("TCC.JC.007 Admin berhasil logout kembali ke halaman login")
    public void admin_berhasil_logout() {
        Assert.assertEquals(login.getTxtValidUrl(), "Admin Login");
        extentTest.log(LogStatus.PASS, "Admin berhasil logout kembali ke halaman login");
    }

}
