package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.pages.MenuContactMassage;
import com.juaracoding.pages.Testimonial;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestMenucontactmassage {
    WebDriver driver;
    private static ExtentTest extentTest;
    private MenuContactMassage manucontactmassage = new MenuContactMassage();

    public TestMenucontactmassage() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test case one
    @When("TCC.JC.0185 Admin clik menu contact massage")
    public void Admin_click_menus_contact_massage() {
        manucontactmassage.ClickMenucontactmassges();
        extentTest.log(LogStatus.PASS, "TCC.JC.0185 Admin clik menu contact massage");
}


    }