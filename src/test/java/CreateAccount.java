import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class CreateAccount {

    private WebDriver driver;

    public static final String homepage = "https://www.amazon.com/";

   private LoginPage loginPage;


    @Given("I go to Amazon")
    public void i_go_to_amazon () {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage((ChromeDriver) driver);
        driver.navigate().to(homepage);

    }
    @When("I go to Create account")
    public void i_go_to_create_account() {
        loginPage.openForm();
    }
    @And("I fill form Your name")
    public void i_fill_form_your_name() {
        loginPage.fillName("Yaroslav");
    }

    @And("I fill form Email")
    public void i_fill_form_email() {
        loginPage.fillEmail("yaroslav19512@mail.ru");
    }

    @And("I fill form Password")
    public void i_fill_form_password() {
       loginPage.fillPassword("AS123456789");
    }

    @And("I fill form re-Password")
    public void i_fill_form_re_password() {
        loginPage.checkPassword("AS123456789");
    }

    @When("I click button Continue")
    public void i_click_button_continue() {
         loginPage.submit();
    }

    @Then("I see approval of registration")
    public void i_see_approval_of_registration() {
        driver.quit();
        driver=null;

    }
}
