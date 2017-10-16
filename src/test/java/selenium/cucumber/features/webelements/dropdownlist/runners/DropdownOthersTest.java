package com.example.selenium.tests.cucumber.features.webelements.dropdownlist.runners;

import com.example.core.tests.core.BaseTest;
import com.example.selenium.core.BasePage;
import com.example.selenium.pages.enums.PageSubURLsEnum;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by LKURZAJ on 22.03.2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions( strict = true,
                features = "src/test/java/com/example/selenium/tests/cucumber/features/webelements/dropdownlist/gherkins/dropdownOthers.feature",
        glue = "com.example.selenium.tests.cucumber.features.webelements.dropdownlist.stepdefs",
                plugin = "json:target/report/webelements/dropdownlistOthers.json")
public class DropdownOthersTest extends BaseTest {

    @Override
    public void setUp() {
        BasePage.getDriver().get(PageSubURLsEnum.WWW_FONT_URL.subURL() + PageSubURLsEnum.REGISTRATION.subURL());
    }

    @Override
    public void tearDown() {}
}
