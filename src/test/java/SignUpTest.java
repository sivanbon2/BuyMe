
import BaseClasses.ReportUtils;
import Pages.HomePage;
import Pages.PickBusiness;
import Pages.SenderAndReceiverInfo;
import Pages.SignUpPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static BaseClasses.BaseWebdriver.takeScreenShot;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SignUpTest {

    ReportUtils reports = new ReportUtils();

    @Test
    public void test01signUp() {
        try {
            SignUpPage signUp = new SignUpPage();
            signUp.completeSignUp();
            Assert.assertEquals(signUp.getFirstName(), "Sivan");
            Assert.assertEquals(signUp.getPassword(), "Sivan12345");
            Assert.assertEquals(signUp.getPassword(), "Sivan12345");
            signUp.clickOnRegistrationButton();
            String timeNow = String.valueOf(System.currentTimeMillis());
            reports.test.pass("Details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }catch (Exception e) {
            e.printStackTrace();
            reports.test.log(Status.FAIL, "Registration Button was not clicked" + e.getMessage());
        }
    }

    @Test
    public void test02homePage() {
        try {
            HomePage homePage = new HomePage();
            homePage.pickFromHome();
            assert homePage.getUrl().equals("https://buyme.co.il/search?budget=6&category=16&region=11");
            String timeNow = String.valueOf(System.currentTimeMillis());
            reports.test.pass("Details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }catch (Exception e) {
            e.printStackTrace();
            reports.test.log(Status.FAIL, "Home Page URL was not found" + e.getMessage());
        }
    }

    @Test
    public void test03pickBusiness() {
        try {
            PickBusiness pickb = new PickBusiness();
            pickb.pickABusiness();
            assert pickb.getUrl().equals("https://buyme.co.il/money/752649?price=590");
            String timeNow = String.valueOf(System.currentTimeMillis());
            reports.test.pass("Details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }catch (Exception e) {
            e.printStackTrace();
            reports.test.log(Status.FAIL, "Pick Business URL was not found" + e.getMessage());
        }

    }

    @Test
    public void test04sendAndReceived() throws InterruptedException {
        try {
            SenderAndReceiverInfo sai = new SenderAndReceiverInfo();
            sai.receiver();
            Assert.assertEquals(sai.getReceiverName(), "Sivan");
            sai.senderAndReceiver();
            Assert.assertEquals(sai.getSenderName(), "Sivan ");
            String timeNow = String.valueOf(System.currentTimeMillis());
            reports.test.pass("Details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(timeNow)).build());
        }catch (Exception e) {
            e.printStackTrace();
            reports.test.log(Status.FAIL, "" + e.getMessage());
        }
    }

}
