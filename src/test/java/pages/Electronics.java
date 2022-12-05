package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"gh-p-1\"]/a")
    private WebElement pathOne;
    @FindBy(xpath = "//*[@id=\"gh-shop-a\"]")
    private WebElement pathTwo;
    @FindBy(xpath = "//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[2]/a")
    private WebElement pathThree;
    @FindBy(xpath = "//*[@id=\"s0-27_1-9-0-1[0]-1-1-1\"]/div/h2[6]/strong")
    private WebElement pathFive;
    @FindBy(xpath = "//*[@id=\"s0-27_1-9-0-1[0]-1-1-1\"]/div/h2[3]/strong")
    private WebElement pathSix;
    @FindBy(xpath = "//*[@id=\"s0-27_1-9-0-1[0]-1-1-1\"]/div/h2[8]/strong")
    private WebElement pathSeven;

     public Electronics (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public Electronics dailyDeals () {
        pathOne.click();
        return  this;
    }

    public Electronics shopBy () {
        pathTwo.click();
        return  this;
    }

    public Electronics findElectronics () {
        pathThree.click();
        return  this;
    }

    public  Electronics egualsText () {
        Assert.assertEquals("TVs and Home Theaters", pathFive.getText());
        Assert.assertEquals("Smartphones and Smart Watches", pathSix.getText());
        Assert.assertEquals("More Ways to Save with eBay", pathSeven.getText());
        return this;
    }

}
