import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Electronics;


public class MainTest {

    private WebDriver driver;

   public static final String homepage = "https://www.ebay.com/";


    @Given("I go to Homepage")
    public void i_go_to_ebay() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(homepage);
    }
   @When("I check Daily Deals")
    public void i_check_daily_deals() {
       Electronics electronics = new Electronics(driver);
         electronics.dailyDeals()
                 .shopBy()
                 .findElectronics()
                 .egualsText();
           }
    @Then("Quit from Ebay")
    public void quit_from_ebay() {
        driver.quit();
        driver=null;
    }

}
