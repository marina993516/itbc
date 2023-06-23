package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage loginPage;
    private RegistrationPage registrationPage;
    private BookStorePage bookStore;
    private ProfilePage profilePage;
    private JavascriptExecutor js;
    private ButtonsPage buttonsPage;
    private BookStorePage bookStorePage;
//    public IndexPage indexPage;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

//    public IndexPage getIndexPage() {
//        return indexPage;
//    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public RegistrationPage getRegistrationPage() {
        return registrationPage;
    }

    public BookStorePage getBookStore() {
        return bookStore;
    }

    public ProfilePage getProfilePage() {
        return profilePage;
    }
    public JavascriptExecutor getJs() {
        return js;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public BookStorePage getBookStorePage() {
        return bookStorePage;
    }



    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/milanvelickovic/Downloads/chromedriver_mac_arm64/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        loginPage = new LoginPage(driver, wait);
        registrationPage = new RegistrationPage(driver, wait);
        bookStore = new BookStorePage(driver, wait);
        js = (JavascriptExecutor) driver;
        buttonsPage=new ButtonsPage(driver,wait);
        bookStorePage=new BookStorePage(driver,wait);
        profilePage=new ProfilePage(driver,wait);



    }

    @BeforeMethod
    public void beforeEachTest() {
        getDriver().manage().window().maximize();
    }

    @AfterClass
    public void cleanUp() {
        getDriver().close();
    }

    public void assertVisibilityOfElement(WebElement element) {
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }

    public void assertEquals(WebElement element, String text) {
        Assert.assertEquals(((WebElement) this.getWait().until(ExpectedConditions.visibilityOf(element))).getText(), text);
    }

    public void scrollDown(int numberOfPixels) {
        getJs().executeScript("window.scrollBy(0," + numberOfPixels + ")", "");
    }



}



