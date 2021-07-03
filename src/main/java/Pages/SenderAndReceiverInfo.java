package Pages;

import BaseClasses.BaseWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SenderAndReceiverInfo {

    private WebDriver driver;
    private WebDriverWait wait;

    public void senderAndReceiver(){


    }

    public SenderAndReceiverInfo(){
        this.driver = BaseWebdriver.getDriverInstance();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


}
