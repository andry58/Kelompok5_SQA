package com.juaracoding;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
                "src/main/resources/Feature/01.Login.feature",
                "src/main/resources/Feature/02.TambahBenefit.feature",
                 "src/main/resources/Feature/03.EditBenefit.feature",
                "src/main/resources/Feature/04.TambahBlog.feature",
             //   "src/main/resources/Feature/05.EditBlog.feature"
        },
        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
