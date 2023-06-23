package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest{
    @Test
    public void verifyUnsuccessfulLogin(){
        getRegistrationPage().open()
                .enterFirstName("Marina")
                .enterLastName("Petrovic")
                .enterUserName("Marina123")
                .enterPassword("Test!1");
        scrollDown(300);
        getRegistrationPage().clickRegistrationBtn();
        Assert.assertTrue(getRegistrationPage().getErrorCapchaMsg().getText().equals("Please verify reCaptcha to register!"));

    }
}
