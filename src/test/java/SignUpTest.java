import Pages.SignUpPage;
import org.junit.Test;

public class SignUpTest {
    @Test
    public void test01(){
        SignUpPage signUp = new SignUpPage();
        signUp.signUp();
        signUp.getFirstName().equals("Sivan");
        signUp.getEmail().equals("sivanbon2+1@gmail.com");
        signUp.getPassword().equals("Sivan12345");
        signUp.getAutPassword().equals("Sivan12345");

    }
}
