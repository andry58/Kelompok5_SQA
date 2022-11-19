package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.Utils.Constants;
import com.juaracoding.pages.Login;
import com.juaracoding.pages.Url;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestUrl {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private Url url = new Url();

    public TestUrl() {
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
        Assert.assertEquals(url.getTxtInvalidUrl(), "404 - File Not Found");
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
        Assert.assertEquals(url.getTxtValidUrl(), "Admin Login");
        extentTest.log(LogStatus.PASS, "Admin on web juara coding");
    }

}
