package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookStorePage extends BasePage{

    private WebElement searchField;
    private List<WebElement> booksList;
    private WebElement searchedBook;
    private WebElement isbntBook;
    public BookStorePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    private WebElement getSearchField(){
        searchField=getDriver().findElement(By.id("searchBox"));
        return searchField;
    }

    public WebElement getIsbnFirstBook() {
        isbntBook=getDriver().findElement(By.cssSelector("#userName-value"));
        return isbntBook;
    }

    public WebElement getSearchedBook() {
        searchedBook=getDriver().findElement(By.xpath("//span[@class='mr-2']"));
        return searchedBook;
    }

    public BookStorePage enterBookTitle(String text){
        getSearchField().sendKeys(text);
        return this;
    }
    public BookStorePage clickSearhedBook(){
        searchedBook.click();
        return this;
    }

    public BookStorePage open(){
        getDriver().get("https://demoqa.com/books");
        return this;
    }
}
