package com.example.selenium.tests.tests.webElements;

import com.example.selenium.core.BasePage;
import com.example.selenium.core.newDrivers.elementType.TooltipElement;
import com.example.selenium.pages.enums.PageSubURLsEnum;
import com.example.selenium.tests.testSuites.testType.TestsSelenium;
import com.example.core.tests.core.BaseTest;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

/**
 * Created by LKURZAJ on 08.03.2017.
 */
@Category(TestsSelenium.class)
public class TooltipTest extends BaseTest {

    private final static By tooltipSelector = By.cssSelector("div.ui-tooltip");
    private final static By inputTextSelector = By.cssSelector("input[id='age']");
    TooltipElement tooltipElement;

    @Test
    public void test(){
        // hover mouse on input text element
        BasePage.getAction().moveToElement(BasePage.getDriver().findDynamicElement(TooltipTest.inputTextSelector)).perform();
        this.tooltipElement = BasePage.getDriver().elementTooltip(TooltipTest.tooltipSelector);

        // check if tooltip is displayed
        assertTrue(this.tooltipElement.isDisplayed());

        // check if tooltip text contains appropriate expression
        assertTrue(this.tooltipElement.isTextContains("We ask for your age"));
    }

    @Override
    public void setUp() {
        BasePage.getDriver().get(PageSubURLsEnum.WWW_FONT_URL.subURL() + PageSubURLsEnum.TOOLTIP.subURL());
    }

    @Override
    public void tearDown() {
    }
}
