package Com.Parabank.pages;

import Com.Parabank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    By registerLink = By.xpath("//div[@id='loginPanel']/p[2]/a");
    By welcomeText = By.xpath("//h2");
    By firstName=By.xpath("//input[@id='customer.firstName']");
    By lastName=By.xpath("//input[@id='customer.lastName']");
    By address=By.xpath("//input[@id='customer.address.street']");
    By city=By.xpath("//input[@id='customer.address.city']");
    By state=By.xpath("//input[@id='customer.address.state']");
    By zipcode=By.xpath("//input[@id='customer.address.zipCode']");
    By phoneNumber=By.xpath("//input[@id='customer.phoneNumber']");
    By ssn=By.xpath("//input[@id='customer.ssn']");
    By username=By.xpath("//input[@id='customer.username']");
    By password=By.xpath("//input[@id='customer.password']");
    By repeatpwd=By.xpath("//input[@id='repeatedPassword']");
    By submit=By.xpath("//div[3]/input[@class='button']");

    By uname=(By.xpath("//div[1]/input[@class='input']"));
    By pwd=(By.xpath("//div[2]/input[@class='input']"));
    By loginbtn=(By.xpath("//div/input[@class='button']"));
    By logout=(By.xpath("//div[@id='leftPanel']//li[8]/a"));
    By welcommsg=(By.xpath("//div[@id='rightPanel']/p"));




    public void clickOnRegisterLink(){
        Reporter.log("Click on Register Link" +registerLink.toString()+"<br>");
        clickOnElement(registerLink);
    }
    public String getWelcomeText() {

        Reporter.log("get welcome text" +welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
//fill register form field
    public void getfName(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(firstName, name);
    }
    public void getlName(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(lastName, name);
    }

    public void getaddress(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(address, name);
    }

    public void getCity(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(city, name);
    }

    public void getState(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(state, name);
    }

    public void getZipcode(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(zipcode, name);
    }

    public void getPhoneNumber(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(phoneNumber, name);
    }

    public void getSSN(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(ssn, name);
    }

    public void getusername(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(username, name);
    }
    public void getpwd(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(password, name);
    }

    public void getrepeatpwd(String name) {
        Reporter.log("Enter Firstname" +name.toString());
        sendTextToElement(repeatpwd, name);
    }

    public void clicksubmit() {

        clickOnElement(submit);
    }

    public String getwelcmmsg(){

       return getTextFromElement(welcommsg);
    }
    public void getuname(String name){
        Reporter.log("enter uname"+name.toString());
        sendTextToElement(uname,name);
    }
    public  void getPaswrd(String name){
        Reporter.log("enter uname"+name.toString());
        sendTextToElement(pwd,name);
    }
    public void login(){
        clickOnElement(loginbtn);
    }
    public void logout(){
        clickOnElement(logout);
    }

}
