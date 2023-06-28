package com.tutorialsNinja.testsuite;

import com.tutorialsNinja.pages.HomePage;
import com.tutorialsNinja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopAndNotebooksTest extends TestBase {
    HomePage homepage=new HomePage();
@Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homepage.clkLaptopAndNotebook();
        homepage.getTextLaptop();
        String actualTxt= homepage.getTextLaptop();
        String expectedTxt="Laptops & Notebooks";
        Assert.assertEquals(actualTxt,expectedTxt);
}

}
