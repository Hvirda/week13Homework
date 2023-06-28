package com.tutorialsNinja.testsuite;

import com.tutorialsNinja.pages.HomePage;
import com.tutorialsNinja.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Bhavesh
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    //LoginPage loginPage= new LoginPage();



    @Test (dataProvider = "logindata", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
  //  homePage.clickOnLoginLink();
 //   loginPage.loginToApplication(username,password);

    }

}
