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
    @Test
    public void setGetstartedTest(){
       home.setGetstarted();
       home.setCreateaccount();
       home.setUser("Jeff@selenium.com");
       home.setFirstname("Djafar");
       home.setLastname("Slimane");
       home.setUserphone("1234567890");
       home.setUserpassword("Jeff2020");
       home.setCreateaccountButton();
    }

}
