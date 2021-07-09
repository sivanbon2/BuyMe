package BaseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    // Click on Element by one of the locators
    public By clickElement(By locator) {
        getWebElement(locator).click();
        return locator;
    }

    // SendKeys(text) to one of the locators
    public By sendKeysToElement(By locator, String text) {
        getWebElement(locator).sendKeys(text);
        return locator;
    }

    //Get Element
    private WebElement getWebElement(By locator) {

        return BaseWebdriver.getDriverInstance().findElement(locator);
    }


}
