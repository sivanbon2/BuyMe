import BaseClasses.BuyConfig;
import Pages.HomePage;
import Pages.PickBusiness;
import Pages.SignUpPage;
import org.junit.Test;

public class SignUpTest {
    @Test
    public void test01_signUp() {
        SignUpPage signUp = new SignUpPage();
        signUp.completeSignUp();
      //assert signUp.getFirstName().isEmpty();
        //System.out.println(signUp.getFirstName());
//        assert signUp.getFirstName().equals("Sivan");
//        //assert signUp.getEmail().equals("sivanbon2+1@gmail.com");
//        assert signUp.getPassword().equals("Sivan12345");
//        assert signUp.getAutPassword().equals("Sivan12345");

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

}
