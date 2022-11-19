package com.juaracoding.cucumber.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/01.URL.feature",
                "src/main/resources/features/02.Login.feature",
                "src/main/resources/features/03.HalamanRincianBiaya.feature",
                "src/main/resources/features/04.ShortingRincianBiaya.feature",
                "src/main/resources/features/05.SearchRincianBiaya.feature",
                "src/main/resources/features/06.TambahRincianBiaya.feature"},
        glue = "com.juaracoding.cucumber.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
