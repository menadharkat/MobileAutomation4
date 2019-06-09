package regressionEbayTest;

import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regressionEbay.EbayCategories;

public class EbayCategoriesTest extends MobileAPI2 {

    EbayCategories ebaycategories;

    @BeforeMethod
    public void init(){
        ebaycategories = PageFactory.initElements(appiumDriver, EbayCategories.class);
    }
    @Test(priority = 1)
    public void setCategoriesTest(){
        ebaycategories.setCategories();
    }
    @Test(priority = 2)
    public void setArtTest(){
        ebaycategories.setCategories();
        ebaycategories.setArt();
    }
    @Test(priority = 3)
    public void setArtpostersTest(){
        ebaycategories.setCategories();
        ebaycategories.setArt();
        ebaycategories.setArtprints();
    }
    @Test(priority = 4)
    public void setFilterTest(){
        ebaycategories.setCategories();
        ebaycategories.setArt();
        ebaycategories.setArtprints();
        ebaycategories.setFilter();
    }
}

