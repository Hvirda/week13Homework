package com.tutorialsNinja.testsuite;

import com.tutorialsNinja.pages.HomePage;
import com.tutorialsNinja.pages.MyAccountPage;
import com.tutorialsNinja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTestPage extends TestBase {
    MyAccountPage myAccountPage=new MyAccountPage();
    HomePage homePage=new HomePage();
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        myAccountPage.clkMyAccount();
        myAccountPage.clkRegister();
        myAccountPage.getRegisterText();
        System.out.println( myAccountPage.getRegisterText());
        String actual= myAccountPage.getRegisterText();
        String expected="Register Account";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        myAccountPage.clkMyAccount();
        myAccountPage.clkRegister();
        myAccountPage.getfname("abc");
        myAccountPage.getlname("gfd");
        myAccountPage.getEmail("hmrb@gfd.com");
        myAccountPage.getTphone("7889342134");
        myAccountPage.getpwd("hh@123");
        myAccountPage.getcpwd("hh@123");
        myAccountPage.getRadio();
        myAccountPage.clkCheckbx();
        myAccountPage.clkcon();
        myAccountPage.getMsg();
        System.out.println( myAccountPage.getMsg());
        String actualMsg= myAccountPage.getMsg();
        String expectedMsg="Your Account Has Been Created!";
        Assert.assertEquals(actualMsg,expectedMsg);
        myAccountPage.clkContn();
        myAccountPage.clkMyAccnt();
        myAccountPage.clkLogout();
        myAccountPage.getLogoutMsg();
        System.out.println( myAccountPage.getLogoutMsg());
        String actuallgouMsg= myAccountPage.getLogoutMsg();
        String expectedlgoutMsg="Logout";
       Assert.assertEquals(actuallgouMsg,expectedlgoutMsg);
        myAccountPage.clkContnu();
    }
}
