package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SplashMathLoginStepDefination {

	 WebDriver driver;
	
	 @Given("^user is already on Splash Math Login Page$")
	 public void user_is_already_on_Splash_Math_Login_Page()  {
		 System.setProperty("webdriver.chrome.driver","/Users/chayanikaghosh/Downloads/chromedriver2");
		 System.out.print("chrome driver");
		 driver = new ChromeDriver();
		 driver.get("https://www.splashmath.com/");
	 }

	 @When("^title of login page is Splash Math$")
	 public void title_of_login_page_is_Splash_Math() {
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("Splash Math - Fun Math Practice for Kindergarten to Grade 5", title);
		 
	 }

	 @Then("^user clicks on option button$")
	 public void user_clicks_on_option_button() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/ul/li[6]/a")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[1]/div[2]/ul/li[2]/a/img")).click();
		 Thread.sleep(5000);
		 System.out.println("Login form launched");
	 }

	 @Then("^user clicks on Sign In button$")
	 public void user_clicks_on_Sign_In_button() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("chayanika@yopmail.com");
		 driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("test@123");
		 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		 Thread.sleep(30000);

	 }

	 @Then("^user chooses Parent option$")
	 public void user_chooses_Parent_option() throws InterruptedException  {
		 String title = driver.getTitle();
		 Assert.assertEquals("Parent Dashboard", title);
		 WebElement element =  driver.findElement(By.xpath("//p[text()='Parent']"));
		 System.out.println(element);
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 System.out.println("executor");
		 executor.executeScript("arguments[0].click();", element);

		 
		 
	 }
	 @Then("^user is lands on home page$")
	 public void user_is_lands_on_home_page() throws InterruptedException {

		 Thread.sleep(30000);
		 driver.findElement(By.xpath("//a[@class='logo pull-left']/img[1]")).isDisplayed();
	 }
	 
	 @Then("^Close the current browser$")
	public void close_the_current_browser() {
		driver.quit();
	}
}
