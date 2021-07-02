package Pages;

import BaseClasses.BasePage;
import BaseClasses.BaseWebdriver;
import Locators.SignUpLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage extends BasePage {
    private WebDriver driver;
    private WebDriverWait wait;


    public void signUp(){
        clickOnSignUp();
        fillSignUpFields();
    }

    public SignUpPage(){
        this.driver = BaseWebdriver.getDriverInstance();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void clickOnSignUp(){
        driver.findElements(SignUpLocators.NAVBARBUTTONS);
        wait.until(ExpectedConditions.elementToBeClickable(
                clickElement(SignUpLocators.ENTERANDREGISTRATION)));
        wait.until(ExpectedConditions.elementToBeClickable(
                clickElement(SignUpLocators.REGISTRATION)));
    }

    private void fillSignUpFields(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sendKeysToElement(SignUpLocators.FULLNAME, "Sivan")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sendKeysToElement(SignUpLocators.EMAIL, "sivanbon2+1@gmail.com")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sendKeysToElement(SignUpLocators.PASSWORD, "Sivan12345")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sendKeysToElement(SignUpLocators.PASSWORDAUTHENTICATION, "Sivan12345")));
    }

    public String getFirstName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpLocators.FULLNAME)).getText();
    }
    public String getEmail(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpLocators.EMAIL)).getText();
    }

    public String getPassword(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpLocators.PASSWORD)).getText();
    }

    public String getAutPassword(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpLocators.PASSWORDAUTHENTICATION)).getText();
    }

}
