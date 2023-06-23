package tests;

import org.testng.annotations.Test;

public class ProfileTest extends BaseTest{
    @Test
    public void  unsucessfullOpenedProfileUnloggedUser(){
        getProfilePage().open();
        getProfilePage().getNotLoggedMessage();
        assertEquals(getProfilePage().getNotLoggedMessage(),"Currently you are not logged into the Book Store application, please visit the login page to enter or register page to register yourself.");
    }
}
