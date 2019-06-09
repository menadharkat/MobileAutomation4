package regressionEbay;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayAccount extends MobileAPI2 {

    @FindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    WebElement SignIn;
    @FindBy(xpath = "//android.widget.Button[@text='CREATE AN ACCOUNT']")
    WebElement creataccount;
    @FindBy(xpath = "//android.widget.Button[@text='USE YOUR EMAIL']")
        WebElement UseEmail;



    public void setSignIn(){
        SignIn.click();
    }
    public void setCreataccount(){
        creataccount.click();
    }
    public void setUseEmail(){
        UseEmail.click();
    }
}
