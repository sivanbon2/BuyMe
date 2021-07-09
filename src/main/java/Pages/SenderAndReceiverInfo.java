package Pages;

import BaseClasses.BasePage;
import BaseClasses.BaseWebdriver;
import BaseClasses.BuyConfig;
import Locators.SenderAndReceiverInfoLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class SenderAndReceiverInfo extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    BuyConfig conf = new BuyConfig();

    public SenderAndReceiverInfo(){
        this.driver = BaseWebdriver.getDriverInstance();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void senderAndReceiver() throws InterruptedException {
        buyMeGift();

    }
    private void buyMeGift() throws InterruptedException {
        receiverName();
        chooseEvent();
        writeBlessing();
        uploadImage();
        Thread.sleep(3000);
        clickContinue();
        clickOnSendNow();
        sendByEmail();
    }


    private void receiverName(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sendKeysToElement(SenderAndReceiverInfoLocators.RECEIVER_NAME, "Sivan")));

    }

    private void chooseEvent(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SenderAndReceiverInfoLocators.EVENT_DROPDOWN));
        clickElement(SenderAndReceiverInfoLocators.EVENT_DROPDOWN);

        wait.until(ExpectedConditions.elementToBeClickable(SenderAndReceiverInfoLocators.EVENT(4)));
        clickElement(SenderAndReceiverInfoLocators.EVENT(4));

    }
    private void writeBlessing(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sendKeysToElement(SenderAndReceiverInfoLocators.BLESSING, " Mazal Tov ")));
    }

    private void uploadImage() {
        sendKeysToElement(SenderAndReceiverInfoLocators.UPLOAD_LOGO,"/Users/home/sivan.jpeg");

    }

    private void clickContinue(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(SenderAndReceiverInfoLocators.CONTINUE_BUTTON));
        clickElement(SenderAndReceiverInfoLocators.CONTINUE_BUTTON);
    }

    private void clickOnSendNow(){
        clickElement(SenderAndReceiverInfoLocators.SEND_NOW);

    }

    private void sendByEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(
               clickElement(SenderAndReceiverInfoLocators.BY_EMAIL)));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sendKeysToElement(SenderAndReceiverInfoLocators.EMAIL,conf.getSaltString() + "@gmail.com")));

    }

}
