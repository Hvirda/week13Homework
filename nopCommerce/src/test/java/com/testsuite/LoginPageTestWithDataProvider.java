package com.testsuite;

import com.pages.HomePage;
import com.pages.LoginPage;
import resources.testdata.TestData;
import com.testbase.TestBase;
import org.testng.annotations.Test;
//import resources.testdata.TestData;

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
