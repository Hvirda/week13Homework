package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {
    By reasonForTravelList=By.id("response-0");
    By continu=By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']");
    public void selectReasonForVisit(String reason){
        Reporter.log("reson for traveling "+reasonForTravelList+"<br>");
        clickOnElement(reasonForTravelList);
    }
    public void clkContinue(){
        Reporter.log("continue btn "+continu+"<br>");
        clickOnElement(continu);
    }
}
