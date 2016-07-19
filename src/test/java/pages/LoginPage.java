package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Nikolay on 19.07.2016.
 */
public class LoginPage {

    WebDriver driver = new FirefoxDriver();

    private WebElement loginEmailField;
    private WebElement loginPasswordField;
    private WebElement loginJoinButton;



    public void open(){
        driver.get("https://www.linkedin.com/");

    }

    public void findElements(){
        loginEmailField = driver.findElement(By.id("first-name"));
        loginPasswordField = driver.findElement(By.id("last-name"));
        loginJoinButton = driver.findElement(By.id("join-email"));

    }

    /**
     * Fill registration form
     * @param firstName users firs name
     * @param lastname users last name
     */

    public void fillRegistrftionfform (String email, String pasword){

        loginEmailField.sendKeys(email);
        loginPasswordField.sendKeys(pasword);
    }

    /**
     * Click on join button
     */
    public void clickJoinNowButton(){
        joinNowButton.click();

    }

    public void findFillAndSubmitRegistrationForn(String firstName, String lastname, String email, String pasword){
        findElements();
        fillRegistrftionfform(firstName, lastname, email, pasword);
        clickJoinNowButton();
    }
    public String gerAleartText(){
        return AleartText.getText();
    }

}
