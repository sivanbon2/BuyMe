package BaseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BasePage {

    public By clickElement(By locator) {
        getWebElement(locator).click();
        return locator;
    }

    public By sendKeysToElement(By locator, String text) {
        getWebElement(locator).sendKeys(text);
        return locator;
    }

    private WebElement getWebElement(By locator) {
        return BaseWebdriver.getDriverInstance().findElement(locator);
    }

}
