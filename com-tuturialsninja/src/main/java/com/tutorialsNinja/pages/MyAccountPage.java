package com.tutorialsNinja.pages;

import com.tutorialsNinja.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class MyAccountPage extends Utility {
    By myAccount=By.linkText("My Account");
    By register=By.linkText("Register");
    By registerTxt=By.xpath("//div[@id='content']/h1");
    By fname=By.id("input-firstname");
    public void clkMyAccount(){
        Reporter.log("my account"+myAccount.toString()+"<br>");
        clickOnElement(myAccount);
    }
    public void clkRegister(){
        Reporter.log("register "+register.toString()+"<br>");
        clickOnElement(register);
    }
    public String getRegisterText(){
        Reporter.log("verify register text "+registerTxt.toString()+"<br>");
        return getTextFromElement(registerTxt);
    }
    public void getfname(String name){
        Reporter.log("firstname" +fname.toString()+"<br>");
        sendTextToElement(fname,name);
    }
    By lname=By.id("input-lastname");
    public void getlname(String name) {
        Reporter.log("lastname" +lname.toString()+"<br>");
        sendTextToElement(lname,name);
    }
    By email=By.id("input-email");
    public void getEmail(String name) {
        Reporter.log("email " +email.toString()+"<br>");
        sendTextToElement(email,name);
    }
    By tphone=By.id("input-telephone");
    public void getTphone(String no) {
        Reporter.log("Telephone" +tphone.toString()+"<br>");
    sendTextToElement(tphone,no);
    }
    By pwd=By.id("input-password");
    public void getpwd(String name) {
        Reporter.log("password" +pwd.toString()+"<br>");
        sendTextToElement(pwd,name);
    }
    By cpwd=By.id("input-confirm");
    public void getcpwd(String name) {
        Reporter.log("cpwd" +cpwd.toString()+"<br>");
        sendTextToElement(cpwd,name);
    }
    By radio=By.xpath("//div/label[1]/input[@name='newsletter']");
    public void getRadio(){
        Reporter.log("Radio" +radio.toString()+"<br>");
        clickOnElement(radio);
    }
    By checkbox=By.xpath("//div/input[@type='checkbox']");
    public void clkCheckbx() {
        Reporter.log("checkbox" +checkbox.toString()+"<br>");
        clickOnElement(checkbox);
    }
    By con=By.xpath("//div/input[2]");
    public void clkcon() {
        Reporter.log("continue " +con.toString()+"<br>");
        clickOnElement(con);
    }
    //verify account created msg
    By msg=By.xpath("//div[@id='content']/h1");
    public String getMsg() {
        Reporter.log("message " +msg.toString()+"<br>");
        return getTextFromElement(msg);
    }
    By cntn=By.linkText("Continue");
    public void clkContn() {
    clickOnElement(cntn);
    }
    By myAccnt=By.linkText("My Account");
    public void clkMyAccnt() {
        Reporter.log("myAccount" +myAccnt.toString()+"<br>");
        clickOnElement(myAccnt);
    }
    By logout=By.linkText("Logout");
    public void clkLogout(){
        Reporter.log("logout " +logout.toString()+"<br>");
        clickOnElement(logout);
    }
    By logoutMsg=By.xpath("//div[@id='content']/h1");
    //verify logout msg
    public String getLogoutMsg(){
        Reporter.log("logout " +logout.toString()+"<br>");
        return getTextFromElement(logout);
    }
    By contnu=By.linkText("Continue");
    public void clkContnu(){
        clickOnElement(contnu);
    }


/*


    @Test
    public void  verifyThatUserShouldLoginAndLogoutSuccessfully(){
        WebElement myaccount3=driver.findElement(By.linkText("My Account"));
        myaccount3.click();

        selectMyAccount("Login");

        WebElement login=driver.findElement(By.id("input-email"));
        login.sendKeys("hh@gmail.com");


        WebElement pwd=driver.findElement(By.id("input-password"));
        pwd.sendKeys("hh@123");

        WebElement lg=driver.findElement(By.xpath("//input[@value='Login']"));
        lg.click();

        //verify my account text msg
        WebElement txt=driver.findElement(By.xpath("//h2[contains(text(),'My Account')]"));
        System.out.println(txt.getText());

        selectMyAccount("Logout");

        //verify logout msg
        WebElement log=driver.findElement(By.xpath("//h1[contains(text(),'Account Logout')]"));
        System.out.println(log.getText());

    } */
    }

