package pages;

import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    private WebElement input;
    @FindBy(xpath = "//*[@id=\"gh-btn\"]")
    private WebElement search;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div/span[2]/a[1]")
    private WebElement result;
    @FindBy(xpath = "/html/body/div[5]/div[1]/div/span[2]/a[1]")
    private WebElement result1;


    public Search (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public Search writeText(String text) {
        input.clear();
        input.sendKeys(text);
        search.click();
        return  this;
    }

    public Search findGoods() {
        search.click();
        return  this;
    }


    public Search equalsGoods (){
        Assert.assertEquals("computer monitor hdmi",result.getText());
       try {
           input.clear();
           input.sendKeys("monitor");
           Assert.assertEquals("monitor",result1.getText());
       } catch (ComparisonFailure failure) {
           System.out.println("Not equals");

       } finally {
           driver.quit();
       }

        return this;
       }

    }

