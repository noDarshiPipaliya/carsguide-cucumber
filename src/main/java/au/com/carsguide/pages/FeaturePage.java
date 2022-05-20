package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FeaturePage extends Utility {

    private static final Logger log = LogManager.getLogger(FeaturePage.class.getName());

    public FeaturePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H-white']/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement carsguidepage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement mousehoveronbuyandsell;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement clickonsearchcars;


    public void carsgudepage() {
        clickOnElement(carsguidepage);
    }

    public void setMousehoveronbuyandsell() {
        mouseHoverToElement(mousehoveronbuyandsell);
    }

    public void clickonsearchcars() {
        mouseHoverToElementAndClick(clickonsearchcars);
    }


}
