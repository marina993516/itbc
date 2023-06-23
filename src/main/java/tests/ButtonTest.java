package tests;

import org.testng.annotations.Test;

public class ButtonTest extends BaseTest{

   @Test
   public void verifyClickabilityClickMeBtn(){
       getButtonsPage().open()
                       .getClickMeBtn().click();
      assertEquals(getButtonsPage().getConfirmationMessage(), "You have done a dynamic click");
    }
}
