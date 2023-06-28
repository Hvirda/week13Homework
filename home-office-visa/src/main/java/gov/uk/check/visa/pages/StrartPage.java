package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class StrartPage extends Utility {
    By acceptCookies=By.xpath("//div[@class='js-confirmation-buttons govuk-button-group']/button[1]");
    By startbtn=By.cssSelector("a[class='gem-c-button govuk-button govuk-button--start']");

    public void clkCookies(){
        clickOnElement(acceptCookies);
    }
    public void clkstart(){
        Reporter.log("click startbtn "+startbtn+"<br>");
        clickOnElement(startbtn);
    }

}
