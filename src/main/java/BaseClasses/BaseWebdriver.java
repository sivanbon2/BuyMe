package BaseClasses;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;
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
        }

        return driver;
    }


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    public static String takeScreenShot(String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath + ".png";
    }

}
