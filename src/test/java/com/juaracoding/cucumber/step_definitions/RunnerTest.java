package com.juaracoding.cucumber.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/Feature/01.URL.feature",
                "src/main/resources/Feature/01.Login.feature",
               // "src/main/resources/Feature/03.Testimonial.feature",
                //"src/main/resources/Feature/03.TestimonialEdit.feature",
               "src/main/resources/Feature/08.ContactMassage.feature"},
               //"src/main/resources/Feature/08.MenuContactmassages.feature",

        glue = "com.juaracoding.cucumber.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
