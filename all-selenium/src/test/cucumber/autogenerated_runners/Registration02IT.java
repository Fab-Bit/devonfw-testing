package com.example.selenium.tests.cucumber.autogenerated_runners;

import org.junit.runner.RunWith;
import com.example.core.tests.core.BaseTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = false,
        features = {"C:/Repo/selenium_workshop/src/test/java/com/example/selenium/tests/cucumber/common/features/registration.feature:7"},
        plugin = {"json:C:/Repo/selenium_workshop/target/cucumber-parallel/2.json", "ru.yandex.qatools.allure.cucumberjvm.AllureReporter:C:/Repo/selenium_workshop/target/cucumber-parallel/2", "junit:C:/Repo/selenium_workshop/test-output/junitreports/2.xml"},
        monochrome = false,
        glue = {"com.example.selenium.tests.cucumber.common.stepdefs"})
public class Registration02IT extends BaseTest {
    @Override
    public void setUp() {}

    @Override
    public void tearDown() {}
}