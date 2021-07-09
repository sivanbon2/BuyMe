package Pages;

import BaseClasses.BasePage;
import BaseClasses.BaseWebdriver;

import Locators.SenderAndReceiverInfoLocators;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class SenderAndReceiverInfo extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

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
        clickContinue();

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

    private void clickContinue()throws InterruptedException{
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SenderAndReceiverInfoLocators.CONTINUE_BUTTON));
        clickElement(SenderAndReceiverInfoLocators.CONTINUE_BUTTON);
    }

}
