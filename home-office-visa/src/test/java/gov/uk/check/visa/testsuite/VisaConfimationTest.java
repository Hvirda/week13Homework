package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VisaConfimationTest extends TestBase {
    StrartPage strartPage=new StrartPage();
    NationalityPage nationalityPage=new NationalityPage();
    ReasonForTravelPage reasonForTravelPage=new ReasonForTravelPage();
    DurationOfStayPage durationOfStayPage=new DurationOfStayPage();
    FamilyImmigrationStatusPage familyImmigrationStatusPage=new FamilyImmigrationStatusPage();
    By welcmtxt=By.xpath("//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']");
   By selectWork=By.id("response-1");
   By selectJob1=By.id("response-0");
   By welcmMsg=By.xpath("//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']");
   By selectJoin=By.id("response-4");


    public String getTxt(){
        Reporter.log("navigation message "+welcmtxt.toString()+"<br>");
        return   getTextFromElement(welcmtxt);
   }
   public void clkWork(){
       Reporter.log("select work from list "+selectWork.toString()+"<br>");
        clickOnElement(selectWork);
   }
   public void selectJob(){
       Reporter.log("select job "+selectJob1.toString()+"<br>");
        clickOnElement(selectJob1);
   }
   public String getWelcmMsg(){
       Reporter.log("welcome message "+welcmMsg.toString()+"<br>");
        return getTextFromElement(welcmMsg);
   }
   public void selectJoinFamily(){
        clickOnElement(selectJoin);
   }
    @Test(priority = 2)
    public void anAustralianCominToUKForTourism(){
        strartPage.clkCookies();
        strartPage.clkstart();
        nationalityPage.selectNationality("Australia");
        nationalityPage.clkContinue();
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        reasonForTravelPage.clkContinue();
        String actualtxt=getTxt();
        System.out.println(actualtxt);
        String expected="You will not need a visa to come to the UK";
        Assert.assertEquals(actualtxt,expected);
    }
    @Test(priority = 1)
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        strartPage.clkCookies();
        strartPage.clkstart();
        nationalityPage.selectNationality("Chile");
        nationalityPage.clkContinue();
        clkWork();
        reasonForTravelPage.clkContinue();
        durationOfStayPage.selectLengthOfStay("morethan6Month");
        durationOfStayPage.clkContinue();
        selectJob();
        durationOfStayPage.clkContinue();
        //verify  result 'You need a visa to work in health and care'
        String actualMsg=getWelcmMsg();
       // System.out.println(actualMsg);
        String expectedMsg="You need a visa to work in health and care";
        Assert.assertEquals(actualMsg,expectedMsg);

    }
    @Test(priority = 3)
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        strartPage.clkCookies();
        strartPage.clkstart();
        nationalityPage.selectNationality("India");
        nationalityPage.clkContinue();
        selectJoinFamily();
        reasonForTravelPage.clkContinue();
        familyImmigrationStatusPage.selectImmigrationStatus("yes");
        familyImmigrationStatusPage.clkFamilyContinue();
        //verify You’ll need a visa to join your family or partner in the UK' message
        String actualResult=getWelcmMsg();
        String expectedResult="You’ll need a visa to join your family or partner in the UK";
        Assert.assertEquals(actualResult,expectedResult);

    }


}
