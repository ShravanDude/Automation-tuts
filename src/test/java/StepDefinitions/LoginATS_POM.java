package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginATS_POM {

	WebDriver driver = null;
	LoginPage login;

	@Given("user is on the browser")
	public void user_is_on_the_browser() {
		
		System.out.println("===================POM code==================");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome is opened successfully");

	}

	@And("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		driver.navigate().to("https://atsqa.fleetcor.com/UI/Login.aspx");
	}

	@When("user enter {string} and {string}")
	public void user_enter_username_and_password(String username,String password) {
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		//driver.findElement(By.id("txtUserName")).sendKeys(username);
		//driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@And("click on the submit button")
	public void click_on_the_submit_button() {
		LoginPage login = new LoginPage(driver);
		login.clickLoginbutton();
		//driver.findElement(By.className("btn-background")).click();
	}

	@Then("user navigated to home page.")
	public void user_navigated_to_home_page() {
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("succesfully login into ATS application");
		driver.quit();
	}


}
