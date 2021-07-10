
import Pages.HomePage;
import Pages.PickBusiness;
import Pages.SenderAndReceiverInfo;
import Pages.SignUpPage;
import org.junit.Assert;
import org.junit.Test;

public class SignUpTest {
    @Test
    public void test01_signUp() {
        SignUpPage signUp = new SignUpPage();
        signUp.completeSignUp();
        Assert.assertEquals(signUp.getFirstName(),"Sivan");
        Assert.assertEquals(signUp.getPassword(),"Sivan12345");
        Assert.assertEquals(signUp.getPassword(),"Sivan12345");
        signUp.clickOnRegistrationButton();
    }

    @Test
    public void test02_homePage() {
        HomePage homePage = new HomePage();
        homePage.pickFromHome();
        assert homePage.getUrl().equals("https://buyme.co.il/search?budget=6&category=16&region=11");
    }

    @Test
    public void test03_pickBusiness() {
        PickBusiness pickb = new PickBusiness();
        pickb.pickABusiness();
        assert pickb.getUrl().equals("https://buyme.co.il/money/752649?price=590");

    }

    @Test
    public void test04_sendAndReceived() throws InterruptedException {
        SenderAndReceiverInfo sai = new SenderAndReceiverInfo();
        sai.receiver();
        Assert.assertEquals(sai.getReceiverName(),"Sivan");
        sai.senderAndReceiver();
        Assert.assertEquals(sai.getSenderName(),"Sivan ");
    }

}
