package regressionEbayTest;

import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionEbay.EbayHomepage;

public class EbayHomePageTest extends MobileAPI2 {
    EbayHomepage ebayObje;

    @BeforeMethod
    public void init() {
        ebayObje = PageFactory.initElements(appiumDriver, EbayHomepage.class);
    }

    @Test(enabled = false)
    public void setsellingTest(){
        ebayObje.setDeals();
    }
    @Test(enabled = false)
    public void setdealeTest(){
        ebayObje.setSelling();
    }
    @Test(enabled = false)
    public void setCategoriesTest(){
        ebayObje.setCategories();
    }
    @Test(enabled = false)
    public void setSavedTest(){
        ebayObje.setSaved();
    }
   //@Test
    public void setSearchitemTest(){
        ebayObje.setSearchitem("iphone9");
    }
    @Test(enabled = false)
    public void setHamburgerTest(){
        ebayObje.setHamburger();
    }
    @Test(enabled =false)
    public void setCarshoppingTest(){
        ebayObje.setCarshopping();
    }

    @Test(enabled = false)
    public void setRegisterTest(){
        ebayObje.setRegister();

    }
    @Test
    public void setSignInTest(){
        ebayObje.setSignIn();
    }
    @Test(enabled = false)
    public void setBrightDaysTest(){
        ebayObje.setBrightDays();
    }

   // @Test
    public void setTexttestTest(){
        ebayObje.setTexttest();
    }


}
