package BaseClasses;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

//Singleton - Software design pattern that restricts the instantiation of a class to one "single" instance.
public class BaseWebdriver {
    private static WebDriver driver;

    @BeforeClass
    public static WebDriver getDriverInstance(){
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://buyme.co.il/");
            Actions act = new Actions(driver);
        }

        return driver;
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
