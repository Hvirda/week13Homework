package Com.Parabank.pages;

import Com.Parabank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Bhavesh
 */
public class LoginPage extends Utility {


    By username=By.xpath("//div[1]/input[@class='input']");

    By pwd=By.xpath("//div[2]/input[@class='input']");

    By loginLink = By.xpath("//input[@class='button']");
    By errorMag = By.xpath("//h1");



    public void enterEmailId(String email) {
        Reporter.log("Enter email ID" +email.toString());
        sendTextToElement(username, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(pwd, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginLink);
    }

    public String getErrorMessage() {

        return getTextFromElement(errorMag);
    }


    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();

    }


}
