package regressionEbayTest;

import base.MobileAPI2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class MobileAPITest extends MobileAPI2 {


    @Test(enabled = false)
    public void scrollTest(){
        clickByXpath("//android.widget.ImageButton[@index='0']");
        scrollByName("help");
    }
    //@Test
    public void scorllAndClickBynameTest(){
        clickByXpath("//android.widget.ImageButton[@index='0']");
        scrollAndClickByName("help");

    }
    //@Test
    public void scrollToElementTest(){
        scrollToElement(appiumDriver,"//android.widget.ImageButton[@index='0']");

    }
   // @Test
    public void TypeByXpathTest(){
        typeByXpath("//android.widget.TextView[@text='Search for anything']","SeleniumBooks");
    }
    @FindBy(xpath = "//android.widget.TextView[@text='SELLING']")
    WebElement selling;
    @Test
    public void methodsTest(){
        clickByXpathWebElement(selling);
       // clickByXpath(selling);
    }
}
