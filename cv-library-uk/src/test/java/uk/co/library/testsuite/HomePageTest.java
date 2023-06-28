package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.testbase.TestBase;

public class HomePageTest extends TestBase {
    HomePage homePage=new HomePage();
    @Test
    public void verifyLocators() throws InterruptedException {
        homePage.iframeHandle();
        homePage.setJobTitle("Test Engineer");
        homePage.setLocation("London");
        homePage.setSelectMile("35 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.minSalary("30000");
        homePage.maxSalary("40000");
        homePage.setsalaryType("Per annum");
        homePage.setJobType("Permanent");
        homePage.clkFind();
        Thread.sleep(2000);
        homePage.getWelcmTxt();
        System.out.println(homePage.getWelcmTxt());
        String actualMsg= homePage.getWelcmTxt();
        String ExpectedMsg="Permanent Test Engineer jobs in London";
        Assert.assertEquals(actualMsg,ExpectedMsg);
    }



}
