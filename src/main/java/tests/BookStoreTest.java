package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.BookStorePage;

public class BookStoreTest extends BaseTest{
    @Test
    public void verifyBookSearhByTitle()  {
        getBookStorePage().open()
                          .enterBookTitle("Git Pocket Guide");
        getBookStorePage().getSearchedBook().click();
        assertEquals(getBookStore().getIsbnFirstBook(),"9781449325862");

    }
}
