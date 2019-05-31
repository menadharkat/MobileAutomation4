package regression;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetHome extends MobileAPI2 {

    @FindBy(xpath = "//android.widget.Button[@text='get started']")
    WebElement getstarted;
    @FindBy(xpath = "//android.widget.Button[@text='Create account']")
    WebElement createaccount;
    @FindBy(xpath = "//android.widget.EditText[@index='1']")
    WebElement user;
    @FindBy(id = "firstname")
    WebElement userfirstname;
    @FindBy(id = "lastname")
    WebElement userlastname;
    @FindBy(id = "phone")
    WebElement userphone;
    @FindBy(id = "password")
    WebElement userpassword;
    @FindBy(xpath = "//android.widget.Button[@text='Create account']")
    WebElement createaccountButton;

    public void setGetstarted(){
        getstarted.click();
    }
    public void setCreateaccount(){
        createaccount.click();
    }
    public void setUser(String email){
        user.sendKeys(email);
    }
    public void setFirstname(String first){
        userfirstname.sendKeys(first);
    }
    public void setLastname(String last){
       userlastname.sendKeys(last);
    }
    public void setUserphone(String number){
        userphone.sendKeys(number);
    }
    public void setUserpassword(String pass){
        userpassword.sendKeys(pass);
    }
    public void setCreateaccountButton(){
        createaccountButton.click();
    }
}
