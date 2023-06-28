package com.pages;

import com.utility.Utility;
import org.openqa.selenium.By;


public class HomePage extends Utility {

    By computer=By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[@href='/computers']");

    By electronics=By.xpath("//ul[@class='top-menu notmobile']/li[2]/a[@href='/electronics']");



    public void clickOnComputerLink(){
       mouseHoverToElement(computer);
    }
    public void clickOnElectronics(){
        mouseHoverToElement(electronics);
    }





}
