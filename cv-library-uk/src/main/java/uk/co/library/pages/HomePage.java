package uk.co.library.pages;

import org.testng.Reporter;
import uk.co.library.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By jobTitle = By.xpath("//input[@id='keywords']");
    By location = By.xpath("//input[@id='location']");
    By selectMile = By.xpath("//select[@id='distance']");
    By moreSearch= By.cssSelector("div.hp-search-more>#toggle-hp-search");

    By minSalary=By.xpath("//input[@id='salarymin']");
    By maxSalary=By.xpath("//input[@id='salarymax']");
    By salarytype=By.xpath("//select[@id='salarytype']");
    By jobType=By.xpath("//select[@id='tempperm']");
    By findJobs = By.xpath("//input[@id='hp-search-btn']");
    By welcmText=By.xpath("//h1");

    public void setJobTitle(String title) {
        sendTextToElement(jobTitle, title);
    }

    public void iframeHandle() throws InterruptedException {

        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }

    public void setLocation(String local) {
        Reporter.log("location "+location.toString()+"<br>");
        sendTextToElement(location, local);
    }

    public void setSelectMile(String mile) {
        selectByVisibleTextFromDropDown(selectMile, mile);
    }
    public void  clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearch);
    }

    public void minSalary(String salary){
        Reporter.log("min salary "+minSalary.toString()+"<br>");
        sendTextToElement(minSalary,salary);
    }
    public void maxSalary(String salary){
        Reporter.log("max salary "+maxSalary.toString()+"<br>");
        sendTextToElement(maxSalary,salary);
    }
    public void setsalaryType(String type){
        Reporter.log("salarytype "+salarytype.toString()+"<br>");
        selectByVisibleTextFromDropDown(salarytype,type);
    }
    public void setJobType(String jobtype){
        Reporter.log("jobtype "+jobtype.toString()+"<br>");
        selectByVisibleTextFromDropDown(jobType,jobtype);
    }
    public void clkFind(){
        Reporter.log("findjobs"+findJobs.toString()+"<br>");
        clickOnElement(findJobs);
    }
    public String getWelcmTxt(){
        Reporter.log("welcome text"+welcmText.toString()+"<br>");
        return getTextFromElement(welcmText);
    }

}
