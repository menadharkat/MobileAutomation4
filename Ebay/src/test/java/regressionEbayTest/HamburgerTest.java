package regressionEbayTest;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionEbay.Hamburger;

public class HamburgerTest extends MobileAPI2 {
    Hamburger hambObj;


    @BeforeMethod
    public void init (){
        hambObj= PageFactory.initElements(appiumDriver,Hamburger.class);

    }
    @Test
    public void SethamburgerTest(){
        hambObj.setHamburger();

    }


}
