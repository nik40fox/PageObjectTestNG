package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * PageObject for registration page
 * Created by Nikolay on 14.07.2016.
 */
public class RegistrationPage {

    WebDriver driver = new FirefoxDriver();

    private WebElement firstNameField = driver.findElement(By.id("first-name"));
    private WebElement lastNameField = driver.findElement(By.id("last-name"));
    private WebElement emailField = driver.findElement(By.id("join-email"));
    private WebElement passwordField = driver.findElement(By.id("join-password"));
    private WebElement joinNowButton = driver.findElement(By.className("btn btn-primary join-btn"));
    private WebElement AleartText = driver.findElement(By.cssSelector(".hidden>p>strong"));

    /**
     * Fill registration form
     * @param firstName users firs name
     * @param lastname users last name
     * @param email users email
     * @param pasword users password
     */

    public void open(){
        driver.get("https://www.linkedin.com/");
    }

    public void fillRegistrftionfform (String firstName, String lastname, String email, String pasword){
            firstNameField.sendKeys(firstName);
            lastNameField.sendKeys(lastname);
            emailField.sendKeys(email);
            passwordField.sendKeys(pasword);
    }

    /**
     * Click on join button
     */
    public void clickJoinNowButton(){
        joinNowButton.click();

    }

    public void fillAndSubmitRegistrationForn(String firstName, String lastname, String email, String pasword){
        fillRegistrftionfform(firstName, lastname, email, pasword);
        clickJoinNowButton();
    }
    public String gerAleartText(){
        return AleartText.getText();
    }



}
