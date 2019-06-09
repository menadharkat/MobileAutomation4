package regressionEbay;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hamburger extends MobileAPI2 {

 @FindBy(id="com.ebay.mobile:id/home")
    WebElement hamburger;

 public void setHamburger(){

     hamburger.click();
     appiumDriver.scrollTo("help").click();

 }


}
