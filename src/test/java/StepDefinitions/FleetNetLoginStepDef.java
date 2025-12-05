package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.*;

public class FleetNetLoginStepDef {

	WebDriver driver = null;

	@Given("user is on the chrome browser")
	public void user_is_on_the_chrome_browser() {


        ChromeOptions options = new ChromeOptions();
        // Accept self-signed/invalid certificates
        options.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(options);

	}

	@And("user is navigated to FleetNet login page")
	public void user_is_navigated_to_FleetNet_login_page() {
		driver.navigate().to("https://identityserverqa.fleetcor.com/account/signin?ReturnUrl=%2fissue%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttps%253a%252f%252ffleetnetproqa.com%252f%26wctx%3drm%253d0%2526id%253dpassive%2526ru%253d%25252f%26wct%3d2025-12-04T10%253a43%253a42Z&wa=wsignin1.0&wtrealm=https%3a%2f%2ffleetnetproqa.com%2f&wctx=rm%3d0%26id%3dpassive%26ru%3d%252f&wct=2025-12-04T10%3a43%3a42Z");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("UserName")).sendKeys("SU");
		driver.findElement(By.id("Password")).sendKeys("Test123#");
	}

	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should navigated to home page")
	public void user_should_navigated_to_home_page() {
		driver.getPageSource().contains("SU");
		//driver.quit();
	}




}
