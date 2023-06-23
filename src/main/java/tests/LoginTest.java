package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void verifySucceessfulLoginWithValidData()  {
        getLoginPage().open()
                .enterUserName("marina@test")
                .enterPassword("Test!123")
                .clickloginBtn();
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("userName-value"))).isDisplayed();
        assertVisibilityOfElement(getProfilePage().getUserNameValue());
    }
    @Test
    public void verifyUnsuccessfulLoginWithUnregistedUser(){
        getLoginPage().open()
                .enterUserName("Test")
                .enterPassword("Test!888")
                .clickloginBtn();
        assertEquals(getLoginPage().getErrorMessage(),"Invalid username or password!");
    }

}
