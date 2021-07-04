package Pages;

import BaseClasses.BasePage;
import BaseClasses.BaseWebdriver;

import Locators.HomeLocators;
import Locators.SenderAndReceiverInfoLocators;
import Locators.SignUpLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SenderAndReceiverInfo extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public void senderAndReceiver(){
        buyMeGift();

    }

    public SenderAndReceiverInfo(){
        this.driver = BaseWebdriver.getDriverInstance();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void buyMeGift(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sendKeysToElement(SenderAndReceiverInfoLocators.RECEIVER_NAME, "Sivan")));

        wait.until(ExpectedConditions.elementToBeClickable(
                clickElement(SenderAndReceiverInfoLocators.EVENT_DROPDOWN))).click();
        wait.until(ExpectedConditions.elementToBeClickable(
        clickElement(SenderAndReceiverInfoLocators.EVENT(4))));
    }



}
