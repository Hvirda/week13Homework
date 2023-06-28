package uk.co.library.testsuite;

import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSreachTest extends TestBase {
    HomePage homePage=new HomePage();
    ResultPage resultPage=new ResultPage();

    @Test(dataProvider = "resultData", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                String resultText){

        homePage.setJobTitle(jobTitle);
        homePage.setLocation(location);
        homePage.setSelectMile(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.minSalary(salaryMin);
        homePage.maxSalary(salaryMax);
        homePage.setsalaryType(salaryType);
        homePage.setJobType(jobType);
        homePage.clkFind();
        //System.out.println(resultPage.getResultText());
        resultPage.verifyResult(resultText);

    }

}
