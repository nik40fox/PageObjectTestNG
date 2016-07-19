package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegistrationPage;

/**
 * Tests for user registration
 */
public class RegistrationTests {
    WebDriver driver = new FirefoxDriver();

    @Test
    public void emptyRegistrationTest(){
        RegistrationPage registrationPageTest = new RegistrationPage();
        registrationPageTest.findFillAndSubmitRegistrationForn(driver,"","","","");
        Assert.assertEquals(registrationPageTest.gerAleartText(),"Укажите имя");
    }


    @DataProvider(name = "emptyFieldsValusCombinations")
    public Object[][] createData1() {
        return new Object[][] {
                { "sdf","","dsf","" },
                { "sdf","sdf","dsf","sdfd" },

        };
    }


    @Test(dataProvider = "emptyFieldsValuesCombinations")
    public void registrationAllEmptyFieldsCombinations(String first, String last, String email, String password){
        RegistrationPage registrationPageTest = new RegistrationPage();
        registrationPageTest.open(driver);
        registrationPageTest.fillRegistrftionfform("","","","");
        registrationPageTest.clickJoinNowButton();
        Assert.assertEquals(registrationPageTest.gerAleartText(),"");
    }


}
