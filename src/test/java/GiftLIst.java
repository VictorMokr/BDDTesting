import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GiftPage;


public class GiftLIst {

    private WebDriver driver;

    public static final String homepage = "https://www.amazon.com/registries?ref_=nav_cs_registry";

   private GiftPage giftPage;


   @Given("I go to Gift Card Page")
      public void i_go_to_gift_card_page() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        giftPage = new GiftPage((ChromeDriver) driver);
        driver.navigate().to(homepage);
        driver.manage().window().setSize(new Dimension(1130, 969));
    }

   @When("I click to Find Gift")
       public void i_click_to_find_gift(){
         giftPage.searchPage();
      }

    @And("I try to find Gift Card")
         public void i_try_to_find_gift_card() {
            giftPage.fillName("Victor")
                .chooseEvent()
                .chooseState()
                .choosePeriod();

    }
    @Then("I see result")
      public void i_see_result() {

         driver.quit();
    }

}
