package Com.Parabank.pages;

import Com.Parabank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class HomePage extends Utility {


    By registerLink = By.xpath("//div[@id='loginPanel']/p[2]/a");

    public void clickOnRegisterLink(){
        Reporter.log("Click on Register Link" +registerLink.toString()+"<br>");
        clickOnElement(registerLink);
    }





}
