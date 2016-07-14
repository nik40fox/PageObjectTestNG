package tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
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

    @DataProvider
    @DataProvider(name = "emptyFieldsValusCombinations")
    public Object[][] createData1() {
        return new Object[][] {
                { "sdf","","dsf","" },
                { "sdf","sdf","dsf","sdfd" },
                
        };
    }


    @Test(dataProvider = "emptyFieldsValusCombinations")
    public void registrationAllEmptyFieldsCombinations(String first, String last, String email, String password){
        RegistrationPage registrationPageTest = new RegistrationPage();
        registrationPageTest.open();
        registrationPageTest.fillRegistrftionfform("","","","");
        registrationPageTest.clickJoinNowButton();
        Assert.assertEquals(registrationPageTest.gerAleartText(),"");
    }


}
