package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {

    By sixMonth=By.id("response-0");
    By moreThanSixMonth=By.id("response-1");
    By continu=By.cssSelector("button[class='gem-c-button govuk-button gem-c-button--bottom-margin']");
    public void clkOnSixMonth(){
        Reporter.log("6 months"+sixMonth.toString()+"<br>");
        clickOnElement(sixMonth);
    }
    public void clkOnMoreThanSixMnth(){
        Reporter.log("more than 6 months"+moreThanSixMonth.toString()+"<br>");
        clickOnElement(moreThanSixMonth);
    }
    public void clkContinue(){

        clickOnElement(continu);
    }

    public void  selectLengthOfStay(String moreOrLess){
        String s1=sixMonth.toString();
        String s2=moreThanSixMonth.toString();
        switch (moreOrLess){
            case "6Month":
                s1.equals(moreOrLess);
                clkOnSixMonth();
                break;
            case "morethan6Month":
                s2.equals(moreOrLess);
                clkOnMoreThanSixMnth();
                break;

        }
    }
}

