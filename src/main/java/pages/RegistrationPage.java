package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage{

    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement registrationBtn;
    private WebElement errorCapchaMsg;
    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFirstNameField() {
        firstNameField= getDriver().findElement(By.id("firstname"));
        return firstNameField;
    }

    public WebElement getLastNameField() {
        lastNameField=getDriver().findElement(By.id("lastname"));
        return lastNameField;
    }

    public WebElement getUserNameField() {
        userNameField=getDriver().findElement(By.id("userName"));
        return userNameField;
    }

    public WebElement getPasswordField() {
        passwordField=getDriver().findElement(By.id("password"));
        return passwordField;
    }

    public WebElement getRegistrationBtn() {
        registrationBtn=getDriver().findElement(By.id("register"));
        return registrationBtn;
    }

    public WebElement getErrorCapchaMsg() {
        errorCapchaMsg=getDriver().findElement(By.id("name"));
        return errorCapchaMsg;
    }

    public RegistrationPage enterFirstName(String firstName){
        getFirstNameField().sendKeys(firstName);
        return this;
    }
    public RegistrationPage enterLastName(String lastName){
        getLastNameField().sendKeys(lastName);
        return this;
    }
    public RegistrationPage enterUserName(String username){
        getUserNameField().sendKeys(username);
        return this;
    }
    public RegistrationPage enterPassword(String password){
        getPasswordField().sendKeys(password);
        return this;
    }
    public RegistrationPage clickRegistrationBtn() {
        getRegistrationBtn().click();
        return this;
    }
    public RegistrationPage open(){
        getDriver().get("https://demoqa.com/register");
        return this;
    }
}
