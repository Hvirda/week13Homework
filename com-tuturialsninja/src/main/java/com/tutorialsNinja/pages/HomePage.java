package com.tutorialsNinja.pages;

import com.tutorialsNinja.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By desktops=By.xpath("//li[1]/a[@class='dropdown-toggle']");
    By allDesktoplink=By.xpath("//li[1]/div/a");
    By welcmTxt=By.xpath("//h2");

    By laptopsAndNotebooks=By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");
    By allLaptops=By.xpath("//div[@class='dropdown-menu']/a[contains(text(),'Show AllLaptops & Notebooks')]");
    By laptopTxt=By.xpath("//h2");

   //By myAccount=
  public void clickOnDesktop() {
      mouseHoverToElement(desktops);
      clickOnElement(allDesktoplink);
  }
  public String getTextDesktop(){
      Reporter.log("welcome text desktop " +welcmTxt.toString()+"<br>");
      return getTextFromElement(welcmTxt);
  }
  public void clkLaptopAndNotebook(){
      mouseHoverToElement(laptopsAndNotebooks);
      clickOnElement(allLaptops);
  }
  public String getTextLaptop(){
      Reporter.log("laptop text" +laptopTxt.toString()+"<br>");
      return getTextFromElement(laptopTxt);
  }
}
