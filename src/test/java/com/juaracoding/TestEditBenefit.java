package com.juaracoding;

import com.juaracoding.Utils.Constants;
import com.juaracoding.pages.TambahBenefitPages;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestEditBenefit {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahBenefitPages tambahBenefit = new TambahBenefitPages();

    public TestEditBenefit() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }



}
