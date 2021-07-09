package Locators;

import org.openqa.selenium.By;

public class SenderAndReceiverInfoLocators {
    public static final By RECEIVER = new By.ByCssSelector("input.selected");
    public static final By RECEIVER_NAME = new By.ByXPath("//label[@id=\"friendName\"]/input");
    public static final By EVENT_DROPDOWN = new By.ByXPath("//div[@class=\"input-label-wrapper\"]/div/span");
    public static final By BLESSING = new By.ByXPath("//textarea");
    public static final By UPLOAD_LOGO = new By.ByXPath("//input[@type=\"file\"]");

    public static final By CONTINUE_BUTTON = new By.ByXPath("//button[@class=\"ember-view bm-btn no-reverse main xl stretch\"]");
    public static final By SEND_NOW = new By.ByXPath("//div[@class='ember-view button button-now selected']");
    public static final By BY_EMAIL = new By.ByXPath("");
    public static final By EMAIL_ADDRESS = new By.ByXPath("");
    public static final By SENDER = new By.ByXPath("");

    public static By EVENT(int index) {
        return new By.ByXPath("//div[@class=\"dropdown\"]/ul/li["+index+"]");



    }

    ////
}
