package regressionTest;

import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.TargetHome;

public class TargetHomeTest extends MobileAPI2 {

    TargetHome home;
    @BeforeMethod
    public void init(){
        home = PageFactory.initElements(appiumDriver, TargetHome.class);
    }
    @Test(enabled = false)
    public void setGetstartedTest(){
       home.setGetstarted();
       home.setCreateaccount();
       home.setUser("menadharkat@gmail.com");
       home.setFirstname("menad");
       home.setLastname("harkat");
       home.setUserphone("piit123");
       home.setUserpassword("pnt123");
       home.setCreateaccountButton();
    }

    @Test
    public void setGuestTest(){
        home.setGetstarted();
        home.setGuest();
        home.setStores();
        home.setAllow();
        home.setZipcode("112213");


    }

}
