import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Search;


public class FindGoods {

    private WebDriver driver;
    public static final String homepage = "https://www.ebay.com/";

    @Given("I go to Ebay")
    public void i_go_to_ebay() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(homepage);
    }
   @When("I find input fields")
    public void i_find_input_fields() {
       Search input = new Search(driver);
       input.writeText("Computer monitor");
    }
    @And("I write Computer monitor")
    public void i_write_computer_monitor() {
        Search search = new Search(driver);
        search.findGoods();
      }

    @Then("I check results")
    public void i_check_results() {
        Search result = new Search(driver);
        result.equalsGoods();
    }
}
