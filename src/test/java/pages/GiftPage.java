package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftPage {

    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/nav/div/span/span[5]/a/span")
    private WebElement customGift;
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/nav/div/span/span[2]/a/span")
    private WebElement findGift;
    @FindBy(xpath = "//*[@id=\"wr-search-name-or-email\"]")
    private WebElement inputName;
    @FindBy(xpath = "//*[@id=\"gr-search-list-type-dropdown_1\"]")
    private WebElement dropEvent;
    @FindBy(xpath = "//*[@id=\"a-autoid-0-announce\"]")
    private WebElement findEvent;
    @FindBy(xpath = "//*[@id=\"a-autoid-1-announce\"]")
    private WebElement state;
    @FindBy(xpath = "//*[@id=\"gr-search-state-dropdown_5\"]")
    private WebElement stateFive;

    @FindBy(xpath = "//*[@id=\"a-autoid-2-announce\"]")
    private WebElement monthEvent;

   @FindBy(xpath ="//*[@id=\"gr-search-from-month-dropdown_3\"]")
   private WebElement monthEvent1;

   @FindBy(xpath ="//*[@id=\"a-autoid-3-announce\"]")
    private WebElement yearEvent;

    @FindBy(xpath ="//*[@id=\"gr-search-from-year-dropdown_2\"]")
    private WebElement yearEvent1;

    @FindBy(xpath ="//*[@id=\"a-autoid-4-announce\"]")
    private WebElement toMonth;

    @FindBy(xpath ="//*[@id=\"gr-search-to-month-dropdown_7\"]")
    private WebElement  toMonth1;

    @FindBy(xpath ="//*[@id=\"a-autoid-5-announce\"]")
    private WebElement toYear;

    @FindBy(xpath ="//*[@id=\"gr-search-to-year-dropdown_3\"]")
    private WebElement toYear1;
    @FindBy(xpath ="//*[@id=\"a-autoid-6\"]/span/input")
    private WebElement submit;





    public GiftPage (ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public GiftPage searchPage () {
        customGift.click();
        findGift.click();
        return this;
    }

    public GiftPage fillName (String name) {
       inputName.sendKeys(name);
        return this;
    }

    public GiftPage chooseEvent () {
        findEvent.click();
        dropEvent.click();
        return this;
    }

    public GiftPage chooseState () {
      state.click();
      stateFive.click();
      monthEvent.click();
      monthEvent1.click();
      yearEvent.click();
      yearEvent1.click();
      return this;
    }

    public GiftPage choosePeriod () {
      toMonth.click();
      toMonth1.click();
      toYear.click();
      toYear1.click();
      submit.click();
      return this;
    }


}
