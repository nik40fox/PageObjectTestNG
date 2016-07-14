package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Nikolay on 14.07.2016.
 */
public class RegistrationPage {

    WebDriver driver = new FirefoxDriver();

    private WebElement firstNameField = driver.findElement(By.id("first-name"));
    private WebElement lastNameField = driver.findElement(By.id("last-name"));
    private WebElement emailField = driver.findElement(By.id("join-email"));
    private WebElement passwordField = driver.findElement(By.id("join-password"));
    private WebElement joinNowButton = driver.findElement(By.className("btn btn-primary join-btn"));

    public void fillRegistrftionfform (boolean submit, String firstName, String lastname, String email, String pasword){
            firstNameField.sendKeys(firstName);
            lastNameField.sendKeys(lastname);
            emailField.sendKeys(email);
            passwordField.sendKeys(pasword);
    }

    public void clickJoinNowButton(){
        joinNowButton.click();

    }


}
