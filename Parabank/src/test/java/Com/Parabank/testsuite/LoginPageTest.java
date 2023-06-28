package Com.Parabank.testsuite;

import Com.Parabank.pages.HomePage;
import Com.Parabank.pages.LoginPage;
import Com.Parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage= new LoginPage();

   @Test(priority = 4)
    public void verifyUserShouldNavigateToLoginPage() {
       loginPage.loginToApplication("DDK","DDD@123");

    }

    @Test(priority = 3)
    public void verifyErrorMessageWithInvalidCredentials() {

      loginPage.loginToApplication("aaa","aaa@123");
       String actualMessage =loginPage.getErrorMessage();
       String expectedmsg= "Error!";
        Assert.assertEquals(actualMessage,expectedmsg);
        System.out.println(actualMessage);

   }

}
