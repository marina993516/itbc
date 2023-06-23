package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage{

    private  WebElement userNameValue;
    private WebElement notLoggedMessage;
    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getUserNameValue() {
        userNameValue=getDriver().findElement(By.id("userName-value"));
        return userNameValue;
    }

    public WebElement getNotLoggedMessage() {
        notLoggedMessage=getDriver().findElement(By.id("notLoggin-wrapper"));
        return notLoggedMessage;
    }
    public ProfilePage readText(){
        getNotLoggedMessage().getText();
        return this;
    }

    public ProfilePage open(){
        getDriver().get("https://demoqa.com/profile");
        return this;
    }
}
