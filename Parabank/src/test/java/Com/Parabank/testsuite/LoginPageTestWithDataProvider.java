package Com.Parabank.testsuite;

import Com.Parabank.pages.HomePage;
import Com.Parabank.pages.LoginPage;
import Com.Parabank.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Bhavesh
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    LoginPage loginPage= new LoginPage();



    @Test (dataProvider = "logindata", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
    //homePage.clickOnLoginLink();
    loginPage.loginToApplication(username,password);

    }

}
