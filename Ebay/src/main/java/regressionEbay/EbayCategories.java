package regressionEbay;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCategories extends MobileAPI2 {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Categories button\"]")
    WebElement categories;
    @FindBy(xpath = "//android.widget.TextView[@text='Art']")
    WebElement art;
    @FindBy(xpath = "//android.widget.TextView[@text='Art Prints']")
    WebElement artprints;
    @FindBy(xpath = "//android.widget.Button[@text='FILTER']")
    WebElement filter;

    public void setCategories(){

        categories.click();
    }
    public void setArt(){
        art.click();
    }
    public void setArtprints(){
        artprints.click();
    }
    public void setFilter(){
    filter.click();
}
}