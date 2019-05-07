package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class LoginStepDefination {

    WebDriver driver;

    @Given("user is already on Login Page$")
    public void user_is_already_on_Login_Page(){
        System.setProperty("webdriver.chrome.driver", "/Users/chayanikaghosh/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://freecrm.com/");
    }
}
