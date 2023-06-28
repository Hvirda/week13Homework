package com.tutorialsNinja.pages;

import com.tutorialsNinja.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class DesktopPage extends Utility {
    By sortZtoA=By.xpath("//select[@id='input-sort']");
    By sortAtoZ=By.xpath("//select[@id='input-sort']");
    By itemTxt=By.xpath("//h1[contains(text(),'HP LP3065')]");

    By item=By.linkText("HP LP3065");
    By calender=By.xpath("//button[@class='btn btn-default']/i[@class='fa fa-calendar']");
    By monthYear=By.xpath("//tr/th[@class='picker-switch']");
    By next=By.xpath("//th[@class='next']");
    By addbtn=By.xpath("//button[@id='button-cart']");
    By addedText=By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingTxt=By.xpath("//div[@class='alert alert-success alert-dismissible']/a[contains(text(),'shopping cart')]");
   By shoppingMsg=By.xpath("//div[@id='content']/h1");
   By productName=By.linkText("HP LP3065");
   By total=By.xpath("//li/table/tbody/tr/td[5]");
    public void setSortZtoA(String name){
        Reporter.log("sort z to a" +sortZtoA.toString()+"<br>");
        selectByVisibleTextFromDropDown(sortZtoA,name);
    }

    public void setSortAtoZ(String name){
        Reporter.log("sort a to z" +sortAtoZ.toString()+"<br>");
        selectByVisibleTextFromDropDown(sortAtoZ,name);
    }
    // Verify the Text "HP LP3065"
    public void clkItem(){
        clickOnElement(item);
    }
    public String getItemTxt(){
        Reporter.log("item text " +itemTxt.toString()+"<br>");
        return getTextFromElement(itemTxt);
    }
    //click on calender
    public void clkCalender(){
        clickOnElement(calender);
    }
    public void selectDate() {
        String day = "22";
        String month = "November";
        String year = "2013";
        while (true) {
            //get default month and year

            String monyear = getTextFromElement(monthYear);
            String arr[] = monyear.split(" ");
            String month1 = arr[0];
            String year1 = arr[1];

        if (month1.equalsIgnoreCase(month) && year1.equalsIgnoreCase(year)) {
            Reporter.log("month and year " +monyear.toString()+"<br>");
            break;
        } else {
            //to click on next
            clickOnElement(next);

        }

    }


    }
    public void addToCartBtn(){
        clickOnElement(addbtn);
    }
    public String getitemaddedmsg(){
        Reporter.log(addedText.toString()+"<br>");
        return getTextFromElement(addedText);
    }
    public void clkShoppinngCart(){
        clickOnElement(shoppingTxt);
    }
    public String getShoppingCartMsg(){
        Reporter.log(shoppingMsg.toString()+"<br>");
        return getTextFromElement(shoppingMsg);
    }
    public String getProductName(){
        Reporter.log("product name " +productName.toString()+"<br>");
        return getTextFromElement(productName);
    }
    public String getTotal(){
        Reporter.log("Total " +total.toString()+"<br>");
        return getTextFromElement(total);
    }

}
