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

    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement joinNowButton;
    private WebElement AleartText;


    public void open(){
        driver.get("https://www.linkedin.com/");

    }

    public void findElements(){
        firstNameField = driver.findElement(By.id("first-name"));
        lastNameField = driver.findElement(By.id("last-name"));
        emailField = driver.findElement(By.id("join-email"));
        passwordField = driver.findElement(By.id("join-password"));
        joinNowButton = driver.findElement(By.className("btn btn-primary join-btn"));
        AleartText = driver.findElement(By.xpath(".//*[@id='pagekey-uno-reg-guest-home']/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/p/strong"));
    }

    /**
     * Fill registration form
     * @param firstName users firs name
     * @param lastname users last name
     * @param email users email
     * @param pasword users password
     */

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

    public void findFillAndSubmitRegistrationForn(String firstName, String lastname, String email, String pasword){
        findElements();
        fillRegistrftionfform(firstName, lastname, email, pasword);
        clickJoinNowButton();
    }
    public String gerAleartText(){
        return AleartText.getText();
    }



}
