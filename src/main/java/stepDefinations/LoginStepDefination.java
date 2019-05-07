package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

    WebDriver driver;

    @Given("user is already on Login Page$")
    public void user_is_already_on_Login_Page(){
        System.setProperty("webdriver.chrome.driver", "/Users/chayanikaghosh/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.splashmath.com/");
    }
    @When("^title of login page is Splash Math$")
    public void title_of_login_page_is_Splash_Math() {
    	String title = driver.getTitle();
    	System.out.println(title);
    	Assert.assertEquals("Splash Math - Fun Math Practice for Grades K-5", title);
    }


    @Then("^user clicks on option button$")
    public void user_clicks_on_option_button() throws InterruptedException {
       driver.findElement(By.className("btn-navbar js-btn-navbar collapsed")).click();
       Thread.sleep(1000);
       driver.findElement(By.className("button button-orange flat signup-button hButton sign-in-btn js-click-signin")).click();

    }
    
//    @Then("^user clicks on Sign In button$")
//    public void user_clicks_on_Sign_In_button() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }  
//    
//    @Then("^user chooses Parent option$")
//    public void user_chooses_Parent_option() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//    
//    @Then("^user enters Email id and user enters password$")
//    public void user_enters_Email_id_and_user_enters_password() {
//        driver.findElement(By.name("email")).sendKeys("naveen");
//        driver.findElement(By.name("password")).sendKeys("test@123");
//        
//    }
//
//    @Then("^user clicks on Sign in button$")
//    public void user_clicks_on_Sign_in_button() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^user is on home page$")
//    public void user_is_on_home_page() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
}