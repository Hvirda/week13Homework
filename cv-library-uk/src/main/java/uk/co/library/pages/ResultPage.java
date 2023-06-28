package uk.co.library.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility
{
    By resultTxt=By.xpath("//h1[@class='search-header__title']");
    public String getResultText(){

        return getTextFromElement(resultTxt);
    }
    public void verifyResult(String expected){
        String actualTxt=getResultText();
        Assert.assertTrue(actualTxt.equalsIgnoreCase(expected));
    }
}
