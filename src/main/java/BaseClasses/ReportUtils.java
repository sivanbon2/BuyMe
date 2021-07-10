package BaseClasses;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ReportUtils {

    // create ExtentReports and attach reporter(s)
    private static ExtentReports extent = new ExtentReports();
    // creates a toggle for the given test, adds all log events under it
    public static ExtentTest test = extent.createTest("myFirstTest", "sample dis");

    @BeforeClass
    public static void beforeClass(){
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent.html");
        extent.attachReporter(htmlReporter);
        test.log(Status.INFO, "before test method");
    }

    @AfterClass
    public static void tearDown() {
        extent.flush();

    }

}
