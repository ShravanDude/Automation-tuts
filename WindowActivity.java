import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.WebDriver;


public class WindowActivity {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().fullscreen();
		driver.get("https://www.google.com/");
		//driver.close();
		Thread.sleep(1000);
		driver.navigate().to("https://www.linkedin.com/in/shravankumar252/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p/button[.=' Sign in ']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("shravandude130@gmail.com");
		driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("Chintu@130");
		driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
		System.out.println("shravan");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
