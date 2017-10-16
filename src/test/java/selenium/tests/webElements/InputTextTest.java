package com.example.selenium.tests.tests.webElements;

import com.example.selenium.core.BasePage;
import com.example.selenium.core.newDrivers.elementType.InputTextElement;
import com.example.selenium.pages.enums.PageSubURLsEnum;
import com.example.selenium.tests.testSuites.testType.TestsSelenium;
import com.example.core.tests.core.BaseTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by LKURZAJ on 03.03.2017.
 */
@Category(TestsSelenium.class)
public class InputTextTest extends BaseTest {

    private static By firstNameInputText = By.cssSelector("input[id='name_3_firstname']");

    @Test()
    public void testInputData(){
        InputTextElement inputElement = BasePage.getDriver().elementInputText(InputTextTest.firstNameInputText);

        // verify if input text is displayed
        assertTrue(inputElement.isDisplayed());

        // clear current text and verify (what to call getValue() or getText() depends on implementation)
        inputElement.clearInputText();
        assertEquals("",inputElement.getValue());

        // input some text into input text and verify value
        inputElement.setInputText("John");
        assertEquals("John",inputElement.getValue());
    }

    @Override
    public void setUp() {
        BasePage.getDriver().get(PageSubURLsEnum.WWW_FONT_URL.subURL() + PageSubURLsEnum.REGISTRATION.subURL());
        return;
    }

    @Override
    public void tearDown() {
        // TODO Auto-generated method stub
    }
}
