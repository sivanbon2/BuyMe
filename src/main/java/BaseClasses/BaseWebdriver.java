package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

//Singleton - Software design pattern that restricts the instantiation of a class to one "single" instance.
public class BaseWebdriver {
    private static WebDriver driver;

    public static WebDriver getDriverInstance(){
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://buyme.co.il/");
            driver.getCurrentUrl();

        }

        return driver;
    }
}
