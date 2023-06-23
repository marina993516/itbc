package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement loginBtn;

    private WebElement errorMessage;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getUserNameField() {
        userNameField = getDriver().findElement(By.id("userName"));
        return userNameField;
    }

    public WebElement getPasswordField() {
        passwordField= getDriver().findElement(By.id("password"));
        return passwordField;
    }
    public WebElement getloginBtn(){
        loginBtn= getDriver().findElement(By.id("login"));
        return loginBtn;
    }

    public WebElement getErrorMessage() {
        errorMessage = getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        return errorMessage;
    }



    //metode
    public LoginPage enterUserName(String userName) {
        getUserNameField().sendKeys(userName);
        return this;
    }
    public LoginPage enterPassword(String password) {
        getPasswordField().sendKeys(password);
        return this;
    }
    public LoginPage clickloginBtn() {
        getloginBtn().click();
        return this;
    }

    public LoginPage open(){
        getDriver().get("https://demoqa.com/login");
        return this;
    }


}
