package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    By statusYes=By.id("response-0");
    By statusNo=By.id("response-1");
    By continu=By.cssSelector("button[class='gem-c-button govuk-button gem-c-button--bottom-margin']");
    public void clkYes(){
        Reporter.log("click on yes "+statusYes+"<br>");
        clickOnElement(statusYes);
    }
    public void clkNo(){
        Reporter.log("click on no "+statusNo+"<br>");
        clickOnElement(statusNo);
    }
    public void clkFamilyContinue(){
        Reporter.log("click on continue "+continu+"<br>");
        clickOnElement(continu);
    }

    public void selectImmigrationStatus(String status){
        String s1=statusYes.toString();
        String s2=statusNo.toString();
        switch (status){
            case "yes":
                s1.equals(status);
                clkYes();
                break;
            case "no":
                s2.equals(status);
                clkNo();
                break;

        }
    }
}
