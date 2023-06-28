package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class NationalityPage extends Utility {
        By nationality=By.xpath("//select[@id='response']");
        By continuebtn=By.xpath("//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']");
        public void selectNationality(String nation){
            Reporter.log("naionality"+nationality.toString()+"<br>");
            selectByVisibleTextFromDropDown(nationality,nation);
        }
        public void clkContinue(){

            Reporter.log("click continue"+continuebtn.toString()+"<br>");clickOnElement(continuebtn);
        }
    By resultTxt=By.xpath("//span[@class='govuk-caption-l']");
    public String getResultTxt(){
        Reporter.log("result text "+resultTxt.toString()+"<br>");
        return getTextFromElement(resultTxt);
    }
    public void confirmMsg(String expectedMsg){
        Reporter.log("Message "+expectedMsg.toString()+"<br>");
        String actualMsg=getResultTxt();
        Assert.assertTrue(actualMsg.equalsIgnoreCase(expectedMsg));
    }

}
