package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage{
    private WebElement clickMeBtn;
    private WebElement confirmationMessage;
    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement getClickMeBtn() {
        clickMeBtn=getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
        return clickMeBtn;
    }

    public WebElement getConfirmationMessage() {
        confirmationMessage=getDriver().findElement(By.id("dynamicClickMessage"));
        return confirmationMessage;
    }

    public void clickClickMeBtn(){
        getClickMeBtn().click();
    }
    public ButtonsPage open(){
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }
}
