package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

/**
 * Tests for user registration
 */
public class RegistrationTests {

    @Test
    public void emptyRegistrationTest(){
        RegistrationPage registrationPageTest = new RegistrationPage();
        registrationPageTest.open();
        registrationPageTest.fillRegistrftionfform("","","","");
        registrationPageTest.clickJoinNowButton();
        Assert.assertEquals(registrationPageTest.gerAleartText(),"");



    }


}
