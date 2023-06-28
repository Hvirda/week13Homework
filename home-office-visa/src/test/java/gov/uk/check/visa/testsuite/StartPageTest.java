package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import gov.uk.check.visa.pages.NationalityPage;
import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.StrartPage;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.Test;

public class StartPageTest extends TestBase {

    StrartPage strartPage=new StrartPage();
    NationalityPage nationalityPage=new NationalityPage();
    ReasonForTravelPage reasonForTravelPage=new ReasonForTravelPage();
    FamilyImmigrationStatusPage familyImmigrationStatusPage=new FamilyImmigrationStatusPage();
    @Test
    public void verifyAllPagesLocators(){
        strartPage.clkCookies();
        strartPage.clkstart();
        nationalityPage.selectNationality("India");
        nationalityPage.clkContinue();
       // System.out.println(nationalityPage.getResultTxt());
        nationalityPage.confirmMsg("Check if you need a UK visa");
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        reasonForTravelPage.clkContinue();
        familyImmigrationStatusPage.selectImmigrationStatus("yes");
        familyImmigrationStatusPage.clkFamilyContinue();
    }


}
