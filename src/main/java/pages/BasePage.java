package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
   private WebDriver driver;
   private WebDriverWait wait;

   public WebDriver getDriver(){
       return driver;
   }
   public WebDriverWait getWait(){
       return wait;
   }

   public BasePage(WebDriver driver, WebDriverWait wait){
       this.driver=driver;
       this.wait=wait;
   }

}
