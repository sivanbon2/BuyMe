package Pages;

import BaseClasses.BasePage;
import BaseClasses.BaseWebdriver;
import Locators.HomeLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class HomePage extends BasePage  {
    private WebDriver driver;
    private WebDriverWait wait;

    public void pickFromHome(){
        pickPrice(6);
        pickArea(2);
        pickCategory(2);
        findMeGiftBtn();
    }

    public HomePage(){
        this.driver = BaseWebdriver.getDriverInstance();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void pickPrice(int index){
        wait.until(ExpectedConditions.elementToBeClickable(
                clickElement(HomeLocators.AMOUNT_DROPDOWN)));
        clickElement(HomeLocators.chooseFromDropDown(index));
    }
    private void pickArea(int index){
        wait.until(ExpectedConditions.elementToBeClickable(
                clickElement(HomeLocators.AREA_DROPDOWN)));
        clickElement(HomeLocators.chooseFromDropDown(index));
    }

    private void pickCategory(int index){
        wait.until(ExpectedConditions.elementToBeClickable(
                clickElement(HomeLocators.CATEGORY_DROPDOWN)));
        clickElement(HomeLocators.chooseFromDropDown(index));
    }

    private void findMeGiftBtn(){
        clickElement(HomeLocators.FIND_A_GIFT_BTN);
    }

    public String getUrl()  {
      return driver.getCurrentUrl();
    }

}