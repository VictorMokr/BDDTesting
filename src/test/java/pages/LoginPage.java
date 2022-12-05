package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    private WebElement findForm;
    @FindBy(xpath = "//*[@id=\"createAccountSubmit\"]")
    private WebElement submitNew;
    @FindBy(xpath = "//*[@id=\"ap_customer_name\"]")
    private WebElement loginName;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    private WebElement mobile;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"ap_password_check\"]")
    private WebElement checkPassword;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement button;


    public LoginPage (ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public LoginPage openForm () {
        findForm.click();
        submitNew.click();
        return this;
    }

    public LoginPage fillName (String name) {
       loginName.sendKeys(name);
        return this;
    }

    public LoginPage fillEmail (String email) {
       mobile.sendKeys(email);
        return this;
    }

    public LoginPage fillPassword (String text) {
        password.sendKeys(text);
        return this;
    }

    public LoginPage checkPassword (String anotherText) {
        checkPassword.sendKeys(anotherText);
        return this;
    }
    public LoginPage submit () {
        button.click();
        return this;
    }


}

